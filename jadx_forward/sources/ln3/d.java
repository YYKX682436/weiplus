package ln3;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401429d = 0;

    public d(ln3.e eVar, ln3.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401429d;
        this.f401429d = i17 + 1;
        if (i17 == 0) {
            return ln3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
