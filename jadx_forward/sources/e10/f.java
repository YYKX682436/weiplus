package e10;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f327866d = 0;

    public f(e10.g gVar, e10.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f327866d;
        this.f327866d = i17 + 1;
        if (i17 == 0) {
            return e10.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
