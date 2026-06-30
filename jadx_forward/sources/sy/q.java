package sy;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495350d = 0;

    public q(sy.r rVar, sy.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495350d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495350d;
        this.f495350d = i17 + 1;
        if (i17 == 0) {
            return sy.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
