package sn3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f491665d = 0;

    public b(sn3.c cVar, sn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f491665d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f491665d;
        this.f491665d = i17 + 1;
        if (i17 == 0) {
            return sn3.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
