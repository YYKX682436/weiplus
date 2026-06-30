package h13;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359690d = 0;

    public r(h13.s sVar, h13.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359690d;
        this.f359690d = i17 + 1;
        if (i17 == 0) {
            return h13.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
