package b92;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100009d = 0;

    public m(b92.n nVar, b92.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100009d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100009d;
        this.f100009d = i17 + 1;
        if (i17 == 0) {
            return b92.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
