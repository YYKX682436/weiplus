package sx;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495031d = 0;

    public f(sx.g gVar, sx.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495031d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495031d;
        this.f495031d = i17 + 1;
        if (i17 == 0) {
            return rx.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
