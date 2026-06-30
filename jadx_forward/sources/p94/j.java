package p94;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434436d = 0;

    public j(p94.k kVar, p94.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434436d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434436d;
        this.f434436d = i17 + 1;
        if (i17 == 0) {
            return p34.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
