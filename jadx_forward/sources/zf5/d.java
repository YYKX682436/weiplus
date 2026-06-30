package zf5;

/* loaded from: classes.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554244d = 0;

    public d(zf5.e eVar, zf5.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554244d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554244d;
        this.f554244d = i17 + 1;
        if (i17 == 0) {
            return zf5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
