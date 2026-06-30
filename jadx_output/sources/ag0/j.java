package ag0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4677d = 0;

    public j(ag0.k kVar, ag0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4677d;
        this.f4677d = i17 + 1;
        if (i17 == 0) {
            return ag0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
