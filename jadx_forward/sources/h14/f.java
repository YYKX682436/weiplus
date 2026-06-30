package h14;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359711d = 0;

    public f(h14.g gVar, h14.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359711d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359711d;
        this.f359711d = i17 + 1;
        if (i17 == 0) {
            return h14.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
