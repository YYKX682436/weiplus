package vr4;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f521323d = 0;

    public p(vr4.q qVar, vr4.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f521323d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f521323d;
        this.f521323d = i17 + 1;
        if (i17 == 0) {
            return vr4.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
