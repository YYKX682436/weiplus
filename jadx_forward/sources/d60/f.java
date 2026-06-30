package d60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308195d = 0;

    public f(d60.g gVar, d60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308195d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308195d;
        this.f308195d = i17 + 1;
        if (i17 == 0) {
            return d60.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
