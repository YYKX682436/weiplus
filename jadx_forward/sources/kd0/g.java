package kd0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388172d = 0;

    public g(kd0.h hVar, kd0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388172d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388172d;
        this.f388172d = i17 + 1;
        if (i17 == 0) {
            return jd0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
