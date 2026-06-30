package tg0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500632d = 0;

    public p(tg0.q qVar, tg0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500632d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500632d;
        this.f500632d = i17 + 1;
        if (i17 == 0) {
            return yg0.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
