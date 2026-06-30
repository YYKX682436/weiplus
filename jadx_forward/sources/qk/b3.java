package qk;

/* loaded from: classes6.dex */
public class b3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445554d = 0;

    public b3(qk.c3 c3Var, qk.a3 a3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445554d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445554d;
        this.f445554d = i17 + 1;
        if (i17 == 0) {
            return ef0.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
