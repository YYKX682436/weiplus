package qc0;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442925d = 0;

    public k(qc0.l lVar, qc0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442925d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442925d;
        this.f442925d = i17 + 1;
        if (i17 == 0) {
            return pc0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
