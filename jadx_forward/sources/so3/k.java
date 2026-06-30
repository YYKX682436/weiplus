package so3;

/* loaded from: classes.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492287d = 0;

    public k(so3.l lVar, so3.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492287d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492287d;
        this.f492287d = i17 + 1;
        if (i17 == 0) {
            return so3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
