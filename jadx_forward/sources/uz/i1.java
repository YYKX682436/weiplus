package uz;

/* loaded from: classes6.dex */
public class i1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513592d = 0;

    public i1(uz.j1 j1Var, uz.h1 h1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513592d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513592d;
        this.f513592d = i17 + 1;
        if (i17 == 0) {
            return uz.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
