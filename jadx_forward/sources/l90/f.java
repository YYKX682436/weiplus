package l90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398788d = 0;

    public f(l90.g gVar, l90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398788d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398788d;
        this.f398788d = i17 + 1;
        if (i17 == 0) {
            return k90.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
