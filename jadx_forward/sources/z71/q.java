package z71;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552073d = 0;

    public q(z71.r rVar, z71.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552073d;
        this.f552073d = i17 + 1;
        if (i17 == 0) {
            return z71.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
