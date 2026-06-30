package gm;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354669d = 0;

    public e(gm.f fVar, gm.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354669d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354669d;
        this.f354669d = i17 + 1;
        if (i17 == 0) {
            return gm.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
