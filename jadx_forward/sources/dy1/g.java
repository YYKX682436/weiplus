package dy1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326097d = 0;

    public g(dy1.h hVar, dy1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326097d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326097d;
        this.f326097d = i17 + 1;
        if (i17 == 0) {
            return zy1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
