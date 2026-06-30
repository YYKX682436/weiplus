package r43;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f451063d = 0;

    public j(r43.k kVar, r43.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f451063d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f451063d;
        this.f451063d = i17 + 1;
        if (i17 == 0) {
            return r43.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
