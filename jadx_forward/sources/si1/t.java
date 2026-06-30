package si1;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489823d = 0;

    public t(si1.u uVar, si1.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489823d;
        this.f489823d = i17 + 1;
        if (i17 == 0) {
            return si1.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
