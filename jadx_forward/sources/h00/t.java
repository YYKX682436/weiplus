package h00;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359364d = 0;

    public t(h00.u uVar, h00.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359364d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359364d;
        this.f359364d = i17 + 1;
        if (i17 == 0) {
            return h00.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
