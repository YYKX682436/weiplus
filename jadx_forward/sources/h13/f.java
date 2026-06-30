package h13;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359658d = 0;

    public f(h13.g gVar, h13.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359658d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359658d;
        this.f359658d = i17 + 1;
        if (i17 == 0) {
            return h13.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
