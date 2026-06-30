package bv4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24739d = 0;

    public h(bv4.i iVar, bv4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24739d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24739d;
        this.f24739d = i17 + 1;
        if (i17 == 0) {
            return bv4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
