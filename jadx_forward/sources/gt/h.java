package gt;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356759d = 0;

    public h(gt.i iVar, gt.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356759d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356759d;
        this.f356759d = i17 + 1;
        if (i17 == 0) {
            return gt.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
