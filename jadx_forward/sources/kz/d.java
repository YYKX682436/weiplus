package kz;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395173d = 0;

    public d(kz.e eVar, kz.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395173d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395173d;
        this.f395173d = i17 + 1;
        if (i17 == 0) {
            return kz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
