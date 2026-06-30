package gc0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351768d = 0;

    public p(gc0.q qVar, gc0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351768d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351768d;
        this.f351768d = i17 + 1;
        if (i17 == 0) {
            return gc0.h3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
