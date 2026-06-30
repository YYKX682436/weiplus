package kb3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387767d = 0;

    public f(kb3.g gVar, kb3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387767d;
        this.f387767d = i17 + 1;
        if (i17 == 0) {
            return kb3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
