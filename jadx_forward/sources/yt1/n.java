package yt1;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f546811d = 0;

    public n(yt1.o oVar, yt1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f546811d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f546811d;
        this.f546811d = i17 + 1;
        if (i17 == 0) {
            return yt1.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
