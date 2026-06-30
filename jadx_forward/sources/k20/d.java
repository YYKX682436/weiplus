package k20;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385002d = 0;

    public d(k20.e eVar, k20.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385002d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385002d;
        this.f385002d = i17 + 1;
        if (i17 == 0) {
            return k20.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
