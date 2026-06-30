package b35;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17738d = 0;

    public f(b35.g gVar, b35.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17738d;
        this.f17738d = i17 + 1;
        if (i17 == 0) {
            return b35.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
