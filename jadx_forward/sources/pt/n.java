package pt;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439706d = 0;

    public n(pt.o oVar, pt.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439706d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439706d;
        this.f439706d = i17 + 1;
        if (i17 == 0) {
            return ez.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
