package oz;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431681d = 0;

    public d(oz.e eVar, oz.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431681d;
        this.f431681d = i17 + 1;
        if (i17 == 0) {
            return oz.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
