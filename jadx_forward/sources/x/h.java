package x;

/* loaded from: classes15.dex */
public final class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f532358d;

    /* renamed from: e, reason: collision with root package name */
    public int f532359e;

    /* renamed from: f, reason: collision with root package name */
    public int f532360f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f532361g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x.m f532362h;

    public h(x.m mVar, int i17) {
        this.f532362h = mVar;
        this.f532358d = i17;
        this.f532359e = mVar.d();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532360f < this.f532359e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object b17 = this.f532362h.b(this.f532360f, this.f532358d);
        this.f532360f++;
        this.f532361g = true;
        return b17;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f532361g) {
            throw new java.lang.IllegalStateException();
        }
        int i17 = this.f532360f - 1;
        this.f532360f = i17;
        this.f532359e--;
        this.f532361g = false;
        this.f532362h.h(i17);
    }
}
