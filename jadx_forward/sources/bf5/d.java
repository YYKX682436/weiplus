package bf5;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101256d = 0;

    public d(bf5.e eVar, bf5.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101256d;
        this.f101256d = i17 + 1;
        if (i17 == 0) {
            return bf5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
