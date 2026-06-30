package gk0;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353952d = 0;

    public d0(gk0.e0 e0Var, gk0.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353952d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353952d;
        this.f353952d = i17 + 1;
        if (i17 == 0) {
            return h83.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
