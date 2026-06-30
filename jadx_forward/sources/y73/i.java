package y73;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541256d = 0;

    public i(y73.j jVar, y73.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541256d;
        this.f541256d = i17 + 1;
        if (i17 == 0) {
            return y73.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
