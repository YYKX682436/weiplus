package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
class CaptureResultImageMatcher {
    private static final int INVALID_TIMESTAMP = -1;
    androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener mImageReferenceListener;
    private final java.lang.Object mLock = new java.lang.Object();
    private final android.util.LongSparseArray<java.util.List<android.hardware.camera2.TotalCaptureResult>> mPendingCaptureResults = new android.util.LongSparseArray<>();
    java.util.Map<android.hardware.camera2.TotalCaptureResult, java.lang.Integer> mCaptureStageIdMap = new java.util.HashMap();
    private final android.util.LongSparseArray<java.util.List<androidx.camera.extensions.internal.sessionprocessor.ImageReference>> mPendingImages = new android.util.LongSparseArray<>();

    /* loaded from: classes14.dex */
    public interface ImageReferenceListener {
        void onImageReferenceIncoming(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17);
    }

    private <T> void addToList(android.util.LongSparseArray<java.util.List<T>> longSparseArray, long j17, T t17) {
        java.util.List<T> list = longSparseArray.get(j17);
        if (list == null) {
            list = new java.util.ArrayList<>();
            longSparseArray.put(j17, list);
        }
        list.add(t17);
    }

    private long getTimeStampFromCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Long l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
        if (l17 != null) {
            return l17.longValue();
        }
        return -1L;
    }

    private void matchImages() {
        androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference;
        android.hardware.camera2.TotalCaptureResult totalCaptureResult;
        synchronized (this.mLock) {
            int size = this.mPendingCaptureResults.size() - 1;
            while (true) {
                imageReference = null;
                if (size < 0) {
                    totalCaptureResult = null;
                    break;
                }
                java.util.List<android.hardware.camera2.TotalCaptureResult> valueAt = this.mPendingCaptureResults.valueAt(size);
                if (!valueAt.isEmpty()) {
                    totalCaptureResult = valueAt.get(0);
                    long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                    m3.h.e(timeStampFromCaptureResult == this.mPendingCaptureResults.keyAt(size), null);
                    java.util.List<androidx.camera.extensions.internal.sessionprocessor.ImageReference> list = this.mPendingImages.get(timeStampFromCaptureResult);
                    if (list != null && !list.isEmpty()) {
                        imageReference = list.get(0);
                        removeFromList(this.mPendingImages, timeStampFromCaptureResult, imageReference);
                        valueAt.remove(totalCaptureResult);
                        if (valueAt.isEmpty()) {
                            this.mPendingCaptureResults.removeAt(size);
                        }
                    }
                }
                size--;
            }
            removeStaleData();
        }
        if (imageReference == null || totalCaptureResult == null) {
            return;
        }
        notifyImage(imageReference, totalCaptureResult);
    }

    private void notifyImage(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener imageReferenceListener;
        java.lang.Integer num;
        synchronized (this.mLock) {
            imageReferenceListener = this.mImageReferenceListener;
            if (imageReferenceListener != null) {
                num = this.mCaptureStageIdMap.get(totalCaptureResult);
            } else {
                imageReference.decrement();
                imageReferenceListener = null;
                num = null;
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.onImageReferenceIncoming(imageReference, totalCaptureResult, num.intValue());
        }
    }

    private <T> void removeFromList(android.util.LongSparseArray<java.util.List<T>> longSparseArray, long j17, T t17) {
        java.util.List<T> list = longSparseArray.get(j17);
        if (list != null) {
            list.remove(t17);
            if (list.isEmpty()) {
                longSparseArray.remove(j17);
            }
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            if (this.mPendingImages.size() != 0 && this.mPendingCaptureResults.size() != 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(this.mPendingImages.keyAt(0));
                java.lang.Long valueOf2 = java.lang.Long.valueOf(this.mPendingCaptureResults.keyAt(0));
                m3.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                        if (this.mPendingImages.keyAt(size) < valueOf2.longValue()) {
                            java.util.Iterator<androidx.camera.extensions.internal.sessionprocessor.ImageReference> it = this.mPendingImages.valueAt(size).iterator();
                            while (it.hasNext()) {
                                it.next().decrement();
                            }
                            this.mPendingImages.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.mPendingCaptureResults.size() - 1; size2 >= 0; size2--) {
                        if (this.mPendingCaptureResults.keyAt(size2) < valueOf.longValue()) {
                            this.mPendingCaptureResults.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    public void captureResultIncoming(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        captureResultIncoming(totalCaptureResult, 0);
    }

    public void clear() {
        synchronized (this.mLock) {
            this.mPendingCaptureResults.clear();
            for (int i17 = 0; i17 < this.mPendingImages.size(); i17++) {
                java.util.Iterator<androidx.camera.extensions.internal.sessionprocessor.ImageReference> it = this.mPendingImages.get(this.mPendingImages.keyAt(i17)).iterator();
                while (it.hasNext()) {
                    it.next().decrement();
                }
            }
            this.mPendingImages.clear();
            this.mCaptureStageIdMap.clear();
        }
    }

    public void clearImageReferenceListener() {
        synchronized (this.mLock) {
            this.mImageReferenceListener = null;
        }
    }

    public void imageIncoming(androidx.camera.extensions.internal.sessionprocessor.ImageReference imageReference) {
        synchronized (this.mLock) {
            addToList(this.mPendingImages, imageReference.get().getTimestamp(), imageReference);
        }
        matchImages();
    }

    public void setImageReferenceListener(androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener imageReferenceListener) {
        synchronized (this.mLock) {
            this.mImageReferenceListener = imageReferenceListener;
        }
    }

    public void captureResultIncoming(android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.mLock) {
            long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
            if (timeStampFromCaptureResult == -1) {
                return;
            }
            addToList(this.mPendingCaptureResults, timeStampFromCaptureResult, totalCaptureResult);
            this.mCaptureStageIdMap.put(totalCaptureResult, java.lang.Integer.valueOf(i17));
            matchImages();
        }
    }
}
