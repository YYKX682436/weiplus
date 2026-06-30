package dd0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f310450d = 0;

    public j(dd0.k kVar, dd0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f310450d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f310450d;
        this.f310450d = i17 + 1;
        if (i17 == 0) {
            return dd0.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
