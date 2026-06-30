package ia0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371419d = 0;

    public f(ia0.g gVar, ia0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371419d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371419d;
        this.f371419d = i17 + 1;
        if (i17 == 0) {
            return ia0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
