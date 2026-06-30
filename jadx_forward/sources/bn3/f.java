package bn3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f104447d = 0;

    public f(bn3.g gVar, bn3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f104447d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f104447d;
        this.f104447d = i17 + 1;
        if (i17 == 0) {
            return bn3.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
