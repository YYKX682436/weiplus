package ib3;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371727d = 0;

    public j(ib3.k kVar, ib3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371727d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371727d;
        this.f371727d = i17 + 1;
        if (i17 == 0) {
            return ib3.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
