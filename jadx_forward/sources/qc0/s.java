package qc0;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442972d = 0;

    public s(qc0.t tVar, qc0.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442972d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442972d;
        this.f442972d = i17 + 1;
        if (i17 == 0) {
            return pc0.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
