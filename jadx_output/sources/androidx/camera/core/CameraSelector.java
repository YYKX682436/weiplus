package androidx.camera.core;

/* loaded from: classes14.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;
    private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;
    private final java.lang.String mPhysicalCameraId;
    public static final androidx.camera.core.CameraSelector DEFAULT_FRONT_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(0).build();
    public static final androidx.camera.core.CameraSelector DEFAULT_BACK_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(1).build();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LensFacing {
    }

    public CameraSelector(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> linkedHashSet, java.lang.String str) {
        this.mCameraFilterSet = linkedHashSet;
        this.mPhysicalCameraId = str;
    }

    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.List<androidx.camera.core.CameraInfo> arrayList = new java.util.ArrayList<>(list);
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.mCameraFilterSet.iterator();
        while (it.hasNext()) {
            arrayList = it.next().filter(java.util.Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public java.util.LinkedHashSet<androidx.camera.core.CameraFilter> getCameraFilterSet() {
        return this.mCameraFilterSet;
    }

    public java.lang.Integer getLensFacing() {
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.mCameraFilterSet.iterator();
        java.lang.Integer num = null;
        while (it.hasNext()) {
            androidx.camera.core.CameraFilter next = it.next();
            if (next instanceof androidx.camera.core.impl.LensFacingCameraFilter) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((androidx.camera.core.impl.LensFacingCameraFilter) next).getLensFacing());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new java.lang.IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public java.lang.String getPhysicalCameraId() {
        return this.mPhysicalCameraId;
    }

    public androidx.camera.core.impl.CameraInternal select(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet) {
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = filter(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.lang.IllegalArgumentException("No available camera can be found");
    }

    /* loaded from: classes14.dex */
    public static final class Builder {
        private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;
        private java.lang.String mPhysicalCameraId;

        public Builder() {
            this.mCameraFilterSet = new java.util.LinkedHashSet<>();
        }

        public static androidx.camera.core.CameraSelector.Builder fromSelector(androidx.camera.core.CameraSelector cameraSelector) {
            return new androidx.camera.core.CameraSelector.Builder(cameraSelector.getCameraFilterSet());
        }

        public androidx.camera.core.CameraSelector.Builder addCameraFilter(androidx.camera.core.CameraFilter cameraFilter) {
            this.mCameraFilterSet.add(cameraFilter);
            return this;
        }

        public androidx.camera.core.CameraSelector build() {
            return new androidx.camera.core.CameraSelector(this.mCameraFilterSet, this.mPhysicalCameraId);
        }

        public androidx.camera.core.CameraSelector.Builder requireLensFacing(int i17) {
            m3.h.e(i17 != -1, "The specified lens facing is invalid.");
            this.mCameraFilterSet.add(new androidx.camera.core.impl.LensFacingCameraFilter(i17));
            return this;
        }

        public androidx.camera.core.CameraSelector.Builder setPhysicalCameraId(java.lang.String str) {
            this.mPhysicalCameraId = str;
            return this;
        }

        private Builder(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> linkedHashSet) {
            this.mCameraFilterSet = new java.util.LinkedHashSet<>(linkedHashSet);
        }
    }

    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> filter(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        java.util.List<androidx.camera.core.CameraInfo> filter = filter(arrayList);
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet2 = new java.util.LinkedHashSet<>();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it6 = linkedHashSet.iterator();
        while (it6.hasNext()) {
            androidx.camera.core.impl.CameraInternal next = it6.next();
            if (filter.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }
}
