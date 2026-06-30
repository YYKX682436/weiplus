package kt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393406d = 0;

    public j(kt.k kVar, kt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393406d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393406d;
        this.f393406d = i17 + 1;
        if (i17 == 0) {
            return kt.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
