package bt3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105761d = 0;

    public e(bt3.f fVar, bt3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105761d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105761d;
        this.f105761d = i17 + 1;
        if (i17 == 0) {
            return bt3.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
