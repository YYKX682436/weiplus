package yk;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f544289d = 0;

    public q(yk.r rVar, yk.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f544289d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f544289d;
        this.f544289d = i17 + 1;
        if (i17 == 0) {
            return yk.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
