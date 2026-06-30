package el4;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335561d = 0;

    public u(el4.v vVar, el4.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335561d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335561d;
        this.f335561d = i17 + 1;
        if (i17 == 0) {
            return el4.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
