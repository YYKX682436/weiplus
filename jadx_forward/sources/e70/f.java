package e70;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331379d = 0;

    public f(e70.g gVar, e70.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331379d;
        this.f331379d = i17 + 1;
        if (i17 == 0) {
            return u71.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
