package du1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325000d = 0;

    public i(du1.j jVar, du1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325000d;
        this.f325000d = i17 + 1;
        if (i17 == 0) {
            return du1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
