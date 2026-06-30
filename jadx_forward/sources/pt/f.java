package pt;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439698d = 0;

    public f(pt.g gVar, pt.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439698d;
        this.f439698d = i17 + 1;
        if (i17 == 0) {
            return ot.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
