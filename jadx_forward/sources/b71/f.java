package b71;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99722d = 0;

    public f(b71.g gVar, b71.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99722d;
        this.f99722d = i17 + 1;
        if (i17 == 0) {
            return b71.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
