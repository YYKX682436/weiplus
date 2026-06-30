package ht;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366172d = 0;

    public d(ht.e eVar, ht.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366172d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366172d;
        this.f366172d = i17 + 1;
        if (i17 == 0) {
            return ht.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
