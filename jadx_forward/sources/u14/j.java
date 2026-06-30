package u14;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f505316d = 0;

    public j(u14.k kVar, u14.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f505316d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f505316d;
        this.f505316d = i17 + 1;
        if (i17 == 0) {
            return u14.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
