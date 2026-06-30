package o95;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425270d = 0;

    public b(o95.c cVar, o95.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425270d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425270d;
        this.f425270d = i17 + 1;
        if (i17 == 0) {
            return o95.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
