package hs3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366104d = 0;

    public f(hs3.g gVar, hs3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366104d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366104d;
        this.f366104d = i17 + 1;
        if (i17 == 0) {
            return hs3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
