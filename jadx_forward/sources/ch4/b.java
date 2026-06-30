package ch4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f123043d = 0;

    public b(ch4.c cVar, ch4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f123043d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f123043d;
        this.f123043d = i17 + 1;
        if (i17 == 0) {
            return ch4.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
