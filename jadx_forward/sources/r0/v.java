package r0;

/* loaded from: classes14.dex */
public abstract class v implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f449525d;

    /* renamed from: e, reason: collision with root package name */
    public int f449526e;

    /* renamed from: f, reason: collision with root package name */
    public int f449527f;

    public v() {
        r0.u uVar = r0.u.f449520e;
        this.f449525d = r0.u.f449520e.f449524d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449527f < this.f449526e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
