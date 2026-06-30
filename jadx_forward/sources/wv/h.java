package wv;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f531408d = 0;

    public h(wv.i iVar, wv.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f531408d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f531408d;
        this.f531408d = i17 + 1;
        if (i17 == 0) {
            return wv.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
