package ab0;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f84236d = 0;

    public k(ab0.l lVar, ab0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84236d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f84236d;
        this.f84236d = i17 + 1;
        if (i17 == 0) {
            return za0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
