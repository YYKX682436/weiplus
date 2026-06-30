package gb3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351547d = 0;

    public f(gb3.g gVar, gb3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351547d;
        this.f351547d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
