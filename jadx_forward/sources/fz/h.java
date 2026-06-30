package fz;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348805d = 0;

    public h(fz.i iVar, fz.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348805d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348805d;
        this.f348805d = i17 + 1;
        if (i17 == 0) {
            return fz.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
