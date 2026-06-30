package ik1;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f373370d = 0;

    public q(ik1.r rVar, ik1.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f373370d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f373370d;
        this.f373370d = i17 + 1;
        if (i17 == 0) {
            return ik1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
