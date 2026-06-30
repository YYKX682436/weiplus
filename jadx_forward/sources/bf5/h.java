package bf5;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101259d = 0;

    public h(bf5.i iVar, bf5.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101259d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101259d;
        this.f101259d = i17 + 1;
        if (i17 == 0) {
            return bf5.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
