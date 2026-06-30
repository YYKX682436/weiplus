package h63;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360760d = 0;

    public f(h63.g gVar, h63.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360760d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360760d;
        this.f360760d = i17 + 1;
        if (i17 == 0) {
            return h63.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
