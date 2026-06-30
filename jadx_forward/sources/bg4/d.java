package bg4;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102261d = 0;

    public d(bg4.e eVar, bg4.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102261d;
        this.f102261d = i17 + 1;
        if (i17 == 0) {
            return bg4.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
