package cg4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f41160d = 0;

    public f(cg4.g gVar, cg4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41160d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f41160d;
        this.f41160d = i17 + 1;
        if (i17 == 0) {
            return cg4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
