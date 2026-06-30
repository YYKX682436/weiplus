package lf3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399852d = 0;

    public f(lf3.g gVar, lf3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399852d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399852d;
        this.f399852d = i17 + 1;
        if (i17 == 0) {
            return lf3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
