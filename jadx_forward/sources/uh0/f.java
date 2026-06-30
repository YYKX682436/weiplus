package uh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f509259d = 0;

    public f(uh0.g gVar, uh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f509259d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f509259d;
        this.f509259d = i17 + 1;
        if (i17 == 0) {
            return th0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
