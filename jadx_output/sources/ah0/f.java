package ah0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4739d = 0;

    public f(ah0.g gVar, ah0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4739d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4739d;
        this.f4739d = i17 + 1;
        if (i17 == 0) {
            return ah0.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
