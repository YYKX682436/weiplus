package hs;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366068d = 0;

    public o(hs.p pVar, hs.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366068d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366068d;
        this.f366068d = i17 + 1;
        if (i17 == 0) {
            return hs.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
