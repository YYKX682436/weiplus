package hh5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363012d = 0;

    public b(hh5.c cVar, hh5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363012d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363012d;
        this.f363012d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.c9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
