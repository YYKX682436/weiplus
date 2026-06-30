package h45;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360476d = 0;

    public f(h45.g gVar, h45.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360476d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360476d;
        this.f360476d = i17 + 1;
        if (i17 == 0) {
            return li3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
