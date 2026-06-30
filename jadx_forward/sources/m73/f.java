package m73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406030d = 0;

    public f(m73.g gVar, m73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406030d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406030d;
        this.f406030d = i17 + 1;
        if (i17 == 0) {
            return m73.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
