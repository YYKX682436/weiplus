package xj;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f536281d = 0;

    public f(xj.g gVar, xj.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f536281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f536281d;
        this.f536281d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
