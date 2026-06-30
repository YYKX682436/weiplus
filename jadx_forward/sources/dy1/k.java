package dy1;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326100d = 0;

    public k(dy1.l lVar, dy1.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326100d;
        this.f326100d = i17 + 1;
        if (i17 == 0) {
            return jz1.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
