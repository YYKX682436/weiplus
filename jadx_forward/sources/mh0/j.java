package mh0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407819d = 0;

    public j(mh0.k kVar, mh0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407819d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407819d;
        this.f407819d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
