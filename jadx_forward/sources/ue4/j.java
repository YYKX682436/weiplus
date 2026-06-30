package ue4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f508444d = 0;

    public j(ue4.k kVar, ue4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f508444d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f508444d;
        this.f508444d = i17 + 1;
        if (i17 == 0) {
            return ue4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
