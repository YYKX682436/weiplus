package ht1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366328d = 0;

    public j(ht1.k kVar, ht1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366328d;
        this.f366328d = i17 + 1;
        if (i17 == 0) {
            return ht1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
