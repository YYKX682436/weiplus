package bt3;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105903d = 0;

    public q(bt3.r rVar, bt3.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105903d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105903d;
        this.f105903d = i17 + 1;
        if (i17 == 0) {
            return bt3.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
