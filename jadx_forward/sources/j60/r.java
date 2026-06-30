package j60;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379391d = 0;

    public r(j60.s sVar, j60.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379391d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379391d;
        this.f379391d = i17 + 1;
        if (i17 == 0) {
            return j60.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
