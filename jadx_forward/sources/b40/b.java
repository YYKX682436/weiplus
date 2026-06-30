package b40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99308d = 0;

    public b(b40.c cVar, b40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99308d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99308d;
        this.f99308d = i17 + 1;
        if (i17 == 0) {
            return b40.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
