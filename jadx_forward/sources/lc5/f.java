package lc5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399544d = 0;

    public f(lc5.g gVar, lc5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399544d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399544d;
        this.f399544d = i17 + 1;
        if (i17 == 0) {
            return lc5.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
