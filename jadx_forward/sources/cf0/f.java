package cf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122375d = 0;

    public f(cf0.g gVar, cf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122375d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122375d;
        this.f122375d = i17 + 1;
        if (i17 == 0) {
            return cf0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
