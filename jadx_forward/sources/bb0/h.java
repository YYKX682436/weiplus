package bb0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f100265d = 0;

    public h(bb0.i iVar, bb0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f100265d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f100265d;
        this.f100265d = i17 + 1;
        if (i17 == 0) {
            return bb0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
