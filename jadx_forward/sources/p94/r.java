package p94;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434442d = 0;

    public r(p94.s sVar, p94.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434442d;
        this.f434442d = i17 + 1;
        if (i17 == 0) {
            return n34.q4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
