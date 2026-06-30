package ml2;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f409115d = 0;

    public j(ml2.k kVar, ml2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f409115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f409115d;
        this.f409115d = i17 + 1;
        if (i17 == 0) {
            return ml2.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
