package m40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404935d = 0;

    public f(m40.g gVar, m40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404935d;
        this.f404935d = i17 + 1;
        if (i17 == 0) {
            return j40.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
