package ha0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361284d = 0;

    public f(ha0.g gVar, ha0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361284d;
        this.f361284d = i17 + 1;
        if (i17 == 0) {
            return ha0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
