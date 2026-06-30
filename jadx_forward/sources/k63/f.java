package k63;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386072d = 0;

    public f(k63.g gVar, k63.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386072d;
        this.f386072d = i17 + 1;
        if (i17 == 0) {
            return k63.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
