package ah0;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4777d = 0;

    public r(ah0.s sVar, ah0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4777d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4777d;
        this.f4777d = i17 + 1;
        if (i17 == 0) {
            return ah0.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
