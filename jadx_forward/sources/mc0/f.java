package mc0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407106d = 0;

    public f(mc0.g gVar, mc0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407106d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407106d;
        this.f407106d = i17 + 1;
        if (i17 == 0) {
            return zs3.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
