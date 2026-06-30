package ps;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439583d = 0;

    public b(ps.c cVar, ps.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439583d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439583d;
        this.f439583d = i17 + 1;
        if (i17 == 0) {
            return os.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
