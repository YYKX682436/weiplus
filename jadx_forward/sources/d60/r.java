package d60;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308213d = 0;

    public r(d60.s sVar, d60.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308213d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308213d;
        this.f308213d = i17 + 1;
        if (i17 == 0) {
            return d60.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
