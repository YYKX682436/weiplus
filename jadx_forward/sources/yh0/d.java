package yh0;

/* loaded from: classes.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543896d = 0;

    public d(yh0.e eVar, yh0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543896d;
        this.f543896d = i17 + 1;
        if (i17 == 0) {
            return yh0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
