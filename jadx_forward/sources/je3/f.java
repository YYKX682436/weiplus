package je3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380828d = 0;

    public f(je3.g gVar, je3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380828d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380828d;
        this.f380828d = i17 + 1;
        if (i17 == 0) {
            return je3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
