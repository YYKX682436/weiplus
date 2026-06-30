package gu;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357130d = 0;

    public b(gu.c cVar, gu.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357130d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357130d;
        this.f357130d = i17 + 1;
        if (i17 == 0) {
            return ju.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
