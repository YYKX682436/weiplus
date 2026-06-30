package qc0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442954d = 0;

    public o(qc0.p pVar, qc0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442954d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442954d;
        this.f442954d = i17 + 1;
        if (i17 == 0) {
            return pc0.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
