package ur;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f511811d = 0;

    public i(ur.j jVar, ur.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f511811d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f511811d;
        this.f511811d = i17 + 1;
        if (i17 == 0) {
            return xu4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
