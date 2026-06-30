package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher */
/* loaded from: classes14.dex */
class C1024x77c901da {

    /* renamed from: INVALID_TIMESTAMP */
    private static final int f2562x21d7908e = -1;

    /* renamed from: mImageReferenceListener */
    p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener f2564xa5e2f1d1;

    /* renamed from: mLock */
    private final java.lang.Object f2565x6243b38 = new java.lang.Object();

    /* renamed from: mPendingCaptureResults */
    private final android.util.LongSparseArray<java.util.List<android.hardware.camera2.TotalCaptureResult>> f2566x89f978da = new android.util.LongSparseArray<>();

    /* renamed from: mCaptureStageIdMap */
    java.util.Map<android.hardware.camera2.TotalCaptureResult, java.lang.Integer> f2563xd4e00cdc = new java.util.HashMap();

    /* renamed from: mPendingImages */
    private final android.util.LongSparseArray<java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850>> f2567x62a03382 = new android.util.LongSparseArray<>();

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher$ImageReferenceListener */
    /* loaded from: classes14.dex */
    public interface ImageReferenceListener {
        /* renamed from: onImageReferenceIncoming */
        void mo6845xea0cb135(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17);
    }

    /* renamed from: addToList */
    private <T> void m6833x16a25ba(android.util.LongSparseArray<java.util.List<T>> longSparseArray, long j17, T t17) {
        java.util.List<T> list = longSparseArray.get(j17);
        if (list == null) {
            list = new java.util.ArrayList<>();
            longSparseArray.put(j17, list);
        }
        list.add(t17);
    }

    /* renamed from: getTimeStampFromCaptureResult */
    private long m6834xed0c2919(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        java.lang.Long l17 = (java.lang.Long) totalCaptureResult.get(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
        if (l17 != null) {
            return l17.longValue();
        }
        return -1L;
    }

    /* renamed from: matchImages */
    private void m6835x5092209d() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850;
        android.hardware.camera2.TotalCaptureResult totalCaptureResult;
        synchronized (this.f2565x6243b38) {
            int size = this.f2566x89f978da.size() - 1;
            while (true) {
                interfaceC1027x69a2d850 = null;
                if (size < 0) {
                    totalCaptureResult = null;
                    break;
                }
                java.util.List<android.hardware.camera2.TotalCaptureResult> valueAt = this.f2566x89f978da.valueAt(size);
                if (!valueAt.isEmpty()) {
                    totalCaptureResult = valueAt.get(0);
                    long m6834xed0c2919 = m6834xed0c2919(totalCaptureResult);
                    m3.h.e(m6834xed0c2919 == this.f2566x89f978da.keyAt(size), null);
                    java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850> list = this.f2567x62a03382.get(m6834xed0c2919);
                    if (list != null && !list.isEmpty()) {
                        interfaceC1027x69a2d850 = list.get(0);
                        m6837x56c2f00c(this.f2567x62a03382, m6834xed0c2919, interfaceC1027x69a2d850);
                        valueAt.remove(totalCaptureResult);
                        if (valueAt.isEmpty()) {
                            this.f2566x89f978da.removeAt(size);
                        }
                    }
                }
                size--;
            }
            m6838xf3da2ebf();
        }
        if (interfaceC1027x69a2d850 == null || totalCaptureResult == null) {
            return;
        }
        m6836x96e84792(interfaceC1027x69a2d850, totalCaptureResult);
    }

    /* renamed from: notifyImage */
    private void m6836x96e84792(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener imageReferenceListener;
        java.lang.Integer num;
        synchronized (this.f2565x6243b38) {
            imageReferenceListener = this.f2564xa5e2f1d1;
            if (imageReferenceListener != null) {
                num = this.f2563xd4e00cdc.get(totalCaptureResult);
            } else {
                interfaceC1027x69a2d850.mo6848x23e5cc93();
                imageReferenceListener = null;
                num = null;
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.mo6845xea0cb135(interfaceC1027x69a2d850, totalCaptureResult, num.intValue());
        }
    }

    /* renamed from: removeFromList */
    private <T> void m6837x56c2f00c(android.util.LongSparseArray<java.util.List<T>> longSparseArray, long j17, T t17) {
        java.util.List<T> list = longSparseArray.get(j17);
        if (list != null) {
            list.remove(t17);
            if (list.isEmpty()) {
                longSparseArray.remove(j17);
            }
        }
    }

    /* renamed from: removeStaleData */
    private void m6838xf3da2ebf() {
        synchronized (this.f2565x6243b38) {
            if (this.f2567x62a03382.size() != 0 && this.f2566x89f978da.size() != 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(this.f2567x62a03382.keyAt(0));
                java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f2566x89f978da.keyAt(0));
                m3.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f2567x62a03382.size() - 1; size >= 0; size--) {
                        if (this.f2567x62a03382.keyAt(size) < valueOf2.longValue()) {
                            java.util.Iterator<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850> it = this.f2567x62a03382.valueAt(size).iterator();
                            while (it.hasNext()) {
                                it.next().mo6848x23e5cc93();
                            }
                            this.f2567x62a03382.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f2566x89f978da.size() - 1; size2 >= 0; size2--) {
                        if (this.f2566x89f978da.keyAt(size2) < valueOf.longValue()) {
                            this.f2566x89f978da.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: captureResultIncoming */
    public void m6839xafb61849(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        m6840xafb61849(totalCaptureResult, 0);
    }

    /* renamed from: clear */
    public void m6841x5a5b64d() {
        synchronized (this.f2565x6243b38) {
            this.f2566x89f978da.clear();
            for (int i17 = 0; i17 < this.f2567x62a03382.size(); i17++) {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850> it = this.f2567x62a03382.get(this.f2567x62a03382.keyAt(i17)).iterator();
                while (it.hasNext()) {
                    it.next().mo6848x23e5cc93();
                }
            }
            this.f2567x62a03382.clear();
            this.f2563xd4e00cdc.clear();
        }
    }

    /* renamed from: clearImageReferenceListener */
    public void m6842xae88ffb1() {
        synchronized (this.f2565x6243b38) {
            this.f2564xa5e2f1d1 = null;
        }
    }

    /* renamed from: imageIncoming */
    public void m6843x56f77aa1(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1027x69a2d850 interfaceC1027x69a2d850) {
        synchronized (this.f2565x6243b38) {
            m6833x16a25ba(this.f2567x62a03382, interfaceC1027x69a2d850.get().getTimestamp(), interfaceC1027x69a2d850);
        }
        m6835x5092209d();
    }

    /* renamed from: setImageReferenceListener */
    public void m6844x7b8e1806(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1024x77c901da.ImageReferenceListener imageReferenceListener) {
        synchronized (this.f2565x6243b38) {
            this.f2564xa5e2f1d1 = imageReferenceListener;
        }
    }

    /* renamed from: captureResultIncoming */
    public void m6840xafb61849(android.hardware.camera2.TotalCaptureResult totalCaptureResult, int i17) {
        synchronized (this.f2565x6243b38) {
            long m6834xed0c2919 = m6834xed0c2919(totalCaptureResult);
            if (m6834xed0c2919 == -1) {
                return;
            }
            m6833x16a25ba(this.f2566x89f978da, m6834xed0c2919, totalCaptureResult);
            this.f2563xd4e00cdc.put(totalCaptureResult, java.lang.Integer.valueOf(i17));
            m6835x5092209d();
        }
    }
}
