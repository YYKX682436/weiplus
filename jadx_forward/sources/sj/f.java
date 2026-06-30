package sj;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489869d = 0;

    public f(sj.g gVar, sj.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489869d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489869d;
        this.f489869d = i17 + 1;
        if (i17 == 0) {
            return sj.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
