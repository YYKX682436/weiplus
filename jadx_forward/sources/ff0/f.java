package ff0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343119d = 0;

    public f(ff0.g gVar, ff0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343119d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343119d;
        this.f343119d = i17 + 1;
        if (i17 == 0) {
            return dl4.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
