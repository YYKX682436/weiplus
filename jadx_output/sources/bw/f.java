package bw;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24767d = 0;

    public f(bw.g gVar, bw.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24767d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24767d;
        this.f24767d = i17 + 1;
        if (i17 == 0) {
            return zv.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
