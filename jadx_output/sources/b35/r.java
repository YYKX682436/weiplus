package b35;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17747d = 0;

    public r(b35.s sVar, b35.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17747d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17747d;
        this.f17747d = i17 + 1;
        if (i17 == 0) {
            return b35.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
