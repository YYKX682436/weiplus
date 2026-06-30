package kv;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394178d = 0;

    public v(kv.w wVar, kv.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394178d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394178d;
        this.f394178d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
