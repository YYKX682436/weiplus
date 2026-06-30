package iv;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f376590d = 0;

    public d(iv.e eVar, iv.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f376590d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f376590d;
        this.f376590d = i17 + 1;
        if (i17 == 0) {
            return iv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
