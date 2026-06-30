package qc0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442914d = 0;

    public g(qc0.h hVar, qc0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442914d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442914d;
        this.f442914d = i17 + 1;
        if (i17 == 0) {
            return eg2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
