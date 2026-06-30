package e34;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f329105d = 0;

    public j(e34.k kVar, e34.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f329105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f329105d;
        this.f329105d = i17 + 1;
        if (i17 == 0) {
            return e34.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
