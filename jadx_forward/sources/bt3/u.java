package bt3;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f105951d = 0;

    public u(bt3.v vVar, bt3.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f105951d;
        this.f105951d = i17 + 1;
        if (i17 == 0) {
            return bt3.v2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
