package ob0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425512d = 0;

    public y(ob0.z zVar, ob0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425512d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425512d;
        this.f425512d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
