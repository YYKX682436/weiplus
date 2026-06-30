package ss3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493541d = 0;

    public j(ss3.k kVar, ss3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493541d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493541d;
        this.f493541d = i17 + 1;
        if (i17 == 0) {
            return ss3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
