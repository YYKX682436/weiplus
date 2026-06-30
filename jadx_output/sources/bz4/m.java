package bz4;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36830d = 0;

    public m(bz4.n nVar, bz4.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36830d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36830d;
        this.f36830d = i17 + 1;
        if (i17 == 0) {
            return bz4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
