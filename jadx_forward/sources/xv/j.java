package xv;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538890d = 0;

    public j(xv.k kVar, xv.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538890d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538890d;
        this.f538890d = i17 + 1;
        if (i17 == 0) {
            return wv.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
