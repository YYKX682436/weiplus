package jz3;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384329d = 0;

    public m(jz3.n nVar, jz3.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384329d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384329d;
        this.f384329d = i17 + 1;
        if (i17 == 0) {
            return jz3.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
