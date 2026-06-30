package k65;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386146d = 0;

    public f(k65.g gVar, k65.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386146d;
        this.f386146d = i17 + 1;
        if (i17 == 0) {
            return fm.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
