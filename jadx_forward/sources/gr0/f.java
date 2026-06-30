package gr0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356247d = 0;

    public f(gr0.g gVar, gr0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356247d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356247d;
        this.f356247d = i17 + 1;
        if (i17 == 0) {
            return gr0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
