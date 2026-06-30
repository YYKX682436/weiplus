package i63;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f370531d = 0;

    public f(i63.g gVar, i63.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f370531d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f370531d;
        this.f370531d = i17 + 1;
        if (i17 == 0) {
            return i63.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
