package v43;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514773d = 0;

    public j(v43.k kVar, v43.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514773d;
        this.f514773d = i17 + 1;
        if (i17 == 0) {
            return v43.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
