package fo;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346328d = 0;

    public u(fo.v vVar, fo.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346328d;
        this.f346328d = i17 + 1;
        if (i17 == 0) {
            return fo.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
