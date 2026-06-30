package ss3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493535d = 0;

    public f(ss3.g gVar, ss3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493535d;
        this.f493535d = i17 + 1;
        if (i17 == 0) {
            return ss3.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
