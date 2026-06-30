package dk5;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316261d = 0;

    public m(dk5.n nVar, dk5.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316261d;
        this.f316261d = i17 + 1;
        if (i17 == 0) {
            return dk5.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
