package q80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442214d = 0;

    public f(q80.g gVar, q80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442214d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442214d;
        this.f442214d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.t1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
