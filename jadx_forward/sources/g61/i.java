package g61;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350592d = 0;

    public i(g61.j jVar, g61.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350592d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350592d;
        this.f350592d = i17 + 1;
        if (i17 == 0) {
            return g61.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
