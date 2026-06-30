package yv;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547474d = 0;

    public j(yv.k kVar, yv.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547474d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547474d;
        this.f547474d = i17 + 1;
        if (i17 == 0) {
            return yv.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
