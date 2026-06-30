package p34;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433210d = 0;

    public d(p34.e eVar, p34.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433210d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433210d;
        this.f433210d = i17 + 1;
        if (i17 == 0) {
            return p34.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
