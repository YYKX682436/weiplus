package vc;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516399d = 0;

    public b(vc.c cVar, vc.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516399d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516399d;
        this.f516399d = i17 + 1;
        if (i17 == 0) {
            return vc.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
