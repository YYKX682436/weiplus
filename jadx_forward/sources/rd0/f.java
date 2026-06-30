package rd0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475738d = 0;

    public f(rd0.g gVar, rd0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475738d;
        this.f475738d = i17 + 1;
        if (i17 == 0) {
            return qg5.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
