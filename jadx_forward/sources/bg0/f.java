package bg0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f101386d = 0;

    public f(bg0.g gVar, bg0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f101386d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f101386d;
        this.f101386d = i17 + 1;
        if (i17 == 0) {
            return b92.v2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
