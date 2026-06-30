package kd0;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388192d = 0;

    public k(kd0.l lVar, kd0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388192d;
        this.f388192d = i17 + 1;
        if (i17 == 0) {
            return jd0.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
