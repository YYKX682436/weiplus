package as1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13430d = 0;

    public d(as1.e eVar, as1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13430d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13430d;
        this.f13430d = i17 + 1;
        if (i17 == 0) {
            return as1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
