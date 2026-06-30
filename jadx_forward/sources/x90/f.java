package x90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f534146d = 0;

    public f(x90.g gVar, x90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f534146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f534146d;
        this.f534146d = i17 + 1;
        if (i17 == 0) {
            return x90.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
