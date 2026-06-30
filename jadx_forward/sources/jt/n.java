package jt;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f383115d = 0;

    public n(jt.o oVar, jt.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f383115d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f383115d;
        this.f383115d = i17 + 1;
        if (i17 == 0) {
            return ht.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
