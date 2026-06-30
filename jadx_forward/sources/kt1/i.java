package kt1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393480d = 0;

    public i(kt1.j jVar, kt1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393480d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393480d;
        this.f393480d = i17 + 1;
        if (i17 == 0) {
            return kt1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
