package ph0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435830d = 0;

    public b(ph0.c cVar, ph0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435830d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435830d;
        this.f435830d = i17 + 1;
        if (i17 == 0) {
            return nh0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
