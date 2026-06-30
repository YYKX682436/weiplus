package ob0;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425442d = 0;

    public i(ob0.j jVar, ob0.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425442d;
        this.f425442d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
