package ty4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f504671d = 0;

    public f(ty4.g gVar, ty4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f504671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f504671d;
        this.f504671d = i17 + 1;
        if (i17 == 0) {
            return ty4.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
