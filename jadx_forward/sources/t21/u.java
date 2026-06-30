package t21;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496491d = 0;

    public u(t21.v vVar, t21.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496491d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496491d;
        this.f496491d = i17 + 1;
        if (i17 == 0) {
            return t21.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
