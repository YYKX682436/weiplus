package ka0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387513d = 0;

    public n(ka0.o oVar, ka0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387513d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387513d;
        this.f387513d = i17 + 1;
        if (i17 == 0) {
            return ja0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
