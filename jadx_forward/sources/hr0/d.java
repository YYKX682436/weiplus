package hr0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364823d = 0;

    public d(hr0.e eVar, hr0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364823d;
        this.f364823d = i17 + 1;
        if (i17 == 0) {
            return hr0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
