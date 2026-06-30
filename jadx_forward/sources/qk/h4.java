package qk;

/* loaded from: classes6.dex */
public class h4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445680d = 0;

    public h4(qk.i4 i4Var, qk.g4 g4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445680d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445680d;
        this.f445680d = i17 + 1;
        if (i17 == 0) {
            return rk4.z4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
