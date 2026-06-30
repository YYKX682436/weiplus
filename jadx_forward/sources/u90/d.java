package u90;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f507328d = 0;

    public d(u90.e eVar, u90.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f507328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f507328d;
        this.f507328d = i17 + 1;
        if (i17 == 0) {
            return u90.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
