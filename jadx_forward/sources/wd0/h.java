package wd0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526254d = 0;

    public h(wd0.i iVar, wd0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526254d;
        this.f526254d = i17 + 1;
        if (i17 == 0) {
            return vd0.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
