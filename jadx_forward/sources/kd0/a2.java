package kd0;

/* loaded from: classes6.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388136d = 0;

    public a2(kd0.b2 b2Var, kd0.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388136d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388136d;
        this.f388136d = i17 + 1;
        if (i17 == 0) {
            return jd0.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
