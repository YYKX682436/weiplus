package gk0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353991d = 0;

    public z(gk0.a0 a0Var, gk0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353991d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353991d;
        this.f353991d = i17 + 1;
        if (i17 == 0) {
            return rx.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
