package h14;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359735d = 0;

    public r(h14.s sVar, h14.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359735d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359735d;
        this.f359735d = i17 + 1;
        if (i17 == 0) {
            return h14.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
