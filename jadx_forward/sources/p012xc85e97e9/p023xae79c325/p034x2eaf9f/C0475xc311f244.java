package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraSelector */
/* loaded from: classes14.dex */
public final class C0475xc311f244 {

    /* renamed from: LENS_FACING_BACK */
    public static final int f858xf761b46b = 1;

    /* renamed from: LENS_FACING_EXTERNAL */
    public static final int f859x6272a94f = 2;

    /* renamed from: LENS_FACING_FRONT */
    public static final int f860xf5151f05 = 0;

    /* renamed from: LENS_FACING_UNKNOWN */
    public static final int f861x16bb2226 = -1;

    /* renamed from: mCameraFilterSet */
    private final java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> f862xdc066bf8;

    /* renamed from: mPhysicalCameraId */
    private final java.lang.String f863x11acdfa4;

    /* renamed from: DEFAULT_FRONT_CAMERA */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 f857xeb9de779 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder().m4288xb57049bd(0).m4287x59bc66e();

    /* renamed from: DEFAULT_BACK_CAMERA */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 f856xb0a64c5f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder().m4288xb57049bd(1).m4287x59bc66e();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraSelector$LensFacing */
    /* loaded from: classes6.dex */
    public @interface LensFacing {
    }

    public C0475xc311f244(java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> linkedHashSet, java.lang.String str) {
        this.f862xdc066bf8 = linkedHashSet;
        this.f863x11acdfa4 = str;
    }

    /* renamed from: filter */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> m4280xb408cb78(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> list) {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> arrayList = new java.util.ArrayList<>(list);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> it = this.f862xdc066bf8.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo4272xb408cb78(java.util.Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: getCameraFilterSet */
    public java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> m4281xf0ba0def() {
        return this.f862xdc066bf8;
    }

    /* renamed from: getLensFacing */
    public java.lang.Integer m4282x5f62de6e() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> it = this.f862xdc066bf8.iterator();
        java.lang.Integer num = null;
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d next = it.next();
            if (next instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0721xf927fdb5) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0721xf927fdb5) next).m5499x5f62de6e());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new java.lang.IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: getPhysicalCameraId */
    public java.lang.String m4283x936d7c8d() {
        return this.f863x11acdfa4;
    }

    /* renamed from: select */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4284xc9ff34fc(java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> linkedHashSet) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> it = m4279xb408cb78(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.lang.IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: androidx.camera.core.CameraSelector$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder {

        /* renamed from: mCameraFilterSet */
        private final java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> f864xdc066bf8;

        /* renamed from: mPhysicalCameraId */
        private java.lang.String f865x11acdfa4;

        public Builder() {
            this.f864xdc066bf8 = new java.util.LinkedHashSet<>();
        }

        /* renamed from: fromSelector */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4285xb67b25a9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder(c0475xc311f244.m4281xf0ba0def());
        }

        /* renamed from: addCameraFilter */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4286x2d4fae3e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d interfaceC0471xbb5b1f1d) {
            this.f864xdc066bf8.add(interfaceC0471xbb5b1f1d);
            return this;
        }

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m4287x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244(this.f864xdc066bf8, this.f865x11acdfa4);
        }

        /* renamed from: requireLensFacing */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4288xb57049bd(int i17) {
            m3.h.e(i17 != -1, "The specified lens facing is invalid.");
            this.f864xdc066bf8.add(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0721xf927fdb5(i17));
            return this;
        }

        /* renamed from: setPhysicalCameraId */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4289x376a1199(java.lang.String str) {
            this.f865x11acdfa4 = str;
            return this;
        }

        private Builder(java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> linkedHashSet) {
            this.f864xdc066bf8 = new java.util.LinkedHashSet<>(linkedHashSet);
        }
    }

    /* renamed from: filter */
    public java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> m4279xb408cb78(java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> linkedHashSet) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo4253x764d3969());
        }
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> m4280xb408cb78 = m4280xb408cb78(arrayList);
        java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> linkedHashSet2 = new java.util.LinkedHashSet<>();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> it6 = linkedHashSet.iterator();
        while (it6.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 next = it6.next();
            if (m4280xb408cb78.contains(next.mo4253x764d3969())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }
}
