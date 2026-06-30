package oe2;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426309d = 0;

    public j(oe2.k kVar, oe2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426309d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426309d;
        this.f426309d = i17 + 1;
        if (i17 == 0) {
            return oe2.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
