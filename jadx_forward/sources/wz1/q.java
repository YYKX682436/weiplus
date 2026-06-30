package wz1;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532299d = 0;

    public q(wz1.r rVar, wz1.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532299d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532299d;
        this.f532299d = i17 + 1;
        if (i17 == 0) {
            return wz1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
