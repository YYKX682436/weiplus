package u14;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f505313d = 0;

    public f(u14.g gVar, u14.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f505313d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f505313d;
        this.f505313d = i17 + 1;
        if (i17 == 0) {
            return u14.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
