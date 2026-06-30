package jy4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384068d = 0;

    public j(jy4.k kVar, jy4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384068d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384068d;
        this.f384068d = i17 + 1;
        if (i17 == 0) {
            return jy4.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
