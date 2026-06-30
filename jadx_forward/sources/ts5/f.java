package ts5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f503268d = 0;

    public f(ts5.g gVar, ts5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f503268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f503268d;
        this.f503268d = i17 + 1;
        if (i17 == 0) {
            return nu2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
