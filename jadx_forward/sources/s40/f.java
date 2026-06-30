package s40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f484429d = 0;

    public f(s40.g gVar, s40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f484429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f484429d;
        this.f484429d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
