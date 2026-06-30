package j40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379131d = 0;

    public j(j40.k kVar, j40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379131d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379131d;
        this.f379131d = i17 + 1;
        if (i17 == 0) {
            return j40.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
