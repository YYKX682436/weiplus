package dk5;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316356d = 0;

    public q(dk5.r rVar, dk5.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316356d;
        this.f316356d = i17 + 1;
        if (i17 == 0) {
            return dk5.d6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
