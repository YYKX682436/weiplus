package lp3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401818d = 0;

    public f(lp3.g gVar, lp3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401818d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401818d;
        this.f401818d = i17 + 1;
        if (i17 == 0) {
            return lp3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
