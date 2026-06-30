package wx2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532112d = 0;

    public f(wx2.g gVar, wx2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532112d;
        this.f532112d = i17 + 1;
        if (i17 == 0) {
            return wx2.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
