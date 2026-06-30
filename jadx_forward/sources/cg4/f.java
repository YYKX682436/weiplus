package cg4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122693d = 0;

    public f(cg4.g gVar, cg4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122693d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122693d;
        this.f122693d = i17 + 1;
        if (i17 == 0) {
            return cg4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
