package bx1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f117836d = 0;

    public j(bx1.k kVar, bx1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f117836d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f117836d;
        this.f117836d = i17 + 1;
        if (i17 == 0) {
            return kq3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
