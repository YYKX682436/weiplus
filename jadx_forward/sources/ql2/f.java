package ql2;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f446046d = 0;

    public f(ql2.g gVar, ql2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f446046d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f446046d;
        this.f446046d = i17 + 1;
        if (i17 == 0) {
            return ql2.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
