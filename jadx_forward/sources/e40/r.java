package e40;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f329158d = 0;

    public r(e40.s sVar, e40.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f329158d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f329158d;
        this.f329158d = i17 + 1;
        if (i17 == 0) {
            return d40.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
