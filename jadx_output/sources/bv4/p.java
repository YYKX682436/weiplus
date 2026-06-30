package bv4;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24745d = 0;

    public p(bv4.q qVar, bv4.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24745d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24745d;
        this.f24745d = i17 + 1;
        if (i17 == 0) {
            return bv4.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
