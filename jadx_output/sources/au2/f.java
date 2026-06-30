package au2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f14067d = 0;

    public f(au2.g gVar, au2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14067d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f14067d;
        this.f14067d = i17 + 1;
        if (i17 == 0) {
            return au2.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
