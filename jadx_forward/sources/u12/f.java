package u12;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f505268d = 0;

    public f(u12.g gVar, u12.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f505268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f505268d;
        this.f505268d = i17 + 1;
        if (i17 == 0) {
            return u12.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
