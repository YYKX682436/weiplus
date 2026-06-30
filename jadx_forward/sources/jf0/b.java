package jf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380877d = 0;

    public b(jf0.c cVar, jf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380877d;
        this.f380877d = i17 + 1;
        if (i17 == 0) {
            return jf0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
