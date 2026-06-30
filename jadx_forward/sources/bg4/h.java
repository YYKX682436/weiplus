package bg4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f102264d = 0;

    public h(bg4.i iVar, bg4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102264d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f102264d;
        this.f102264d = i17 + 1;
        if (i17 == 0) {
            return bg4.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
