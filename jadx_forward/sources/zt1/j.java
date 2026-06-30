package zt1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f557095d = 0;

    public j(zt1.k kVar, zt1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f557095d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f557095d;
        this.f557095d = i17 + 1;
        if (i17 == 0) {
            return zt1.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
