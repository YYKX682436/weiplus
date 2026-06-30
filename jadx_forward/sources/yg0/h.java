package yg0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543718d = 0;

    public h(yg0.i iVar, yg0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543718d;
        this.f543718d = i17 + 1;
        if (i17 == 0) {
            return yg0.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
