package oo3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428717d = 0;

    public b(oo3.c cVar, oo3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428717d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428717d;
        this.f428717d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
