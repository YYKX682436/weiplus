package jy4;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384071d = 0;

    public n(jy4.o oVar, jy4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384071d;
        this.f384071d = i17 + 1;
        if (i17 == 0) {
            return jy4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
