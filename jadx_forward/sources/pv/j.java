package pv;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440025d = 0;

    public j(pv.k kVar, pv.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440025d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440025d;
        this.f440025d = i17 + 1;
        if (i17 == 0) {
            return ov.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
