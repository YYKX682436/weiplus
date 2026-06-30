package bb0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100280d = 0;

    public p(bb0.q qVar, bb0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100280d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100280d;
        this.f100280d = i17 + 1;
        if (i17 == 0) {
            return bb0.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
