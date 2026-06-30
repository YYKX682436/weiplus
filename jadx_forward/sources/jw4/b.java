package jw4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f383870d = 0;

    public b(jw4.c cVar, jw4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f383870d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f383870d;
        this.f383870d = i17 + 1;
        if (i17 == 0) {
            return jw4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
