package u50;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506301d = 0;

    public r(u50.s sVar, u50.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506301d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506301d;
        this.f506301d = i17 + 1;
        if (i17 == 0) {
            return s50.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
