package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public final class g0 {

    /* renamed from: array */
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> f72714x58c7259;

    public g0(int i17) {
        this.f72714x58c7259 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i17);
    }

    public final int a() {
        return this.f72714x58c7259.length();
    }

    public final java.lang.Object b(int i17) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.f72714x58c7259;
        if (i17 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i17);
        }
        return null;
    }

    public final void c(int i17, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.f72714x58c7259;
        int length = atomicReferenceArray.length();
        if (i17 < length) {
            atomicReferenceArray.set(i17, obj);
            return;
        }
        int i18 = i17 + 1;
        int i19 = length * 2;
        if (i18 < i19) {
            i18 = i19;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i18);
        for (int i27 = 0; i27 < length; i27++) {
            atomicReferenceArray2.set(i27, atomicReferenceArray.get(i27));
        }
        atomicReferenceArray2.set(i17, obj);
        this.f72714x58c7259 = atomicReferenceArray2;
    }
}
