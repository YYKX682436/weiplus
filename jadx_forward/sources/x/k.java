package x;

/* loaded from: classes14.dex */
public final class k implements java.util.Iterator, java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f532365d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.m f532368g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f532367f = false;

    /* renamed from: e, reason: collision with root package name */
    public int f532366e = -1;

    public k(x.m mVar) {
        this.f532368g = mVar;
        this.f532365d = mVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!this.f532367f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i17 = this.f532366e;
        x.m mVar = this.f532368g;
        java.lang.Object b17 = mVar.b(i17, 0);
        if (!(key == b17 || (key != null && key.equals(b17)))) {
            return false;
        }
        java.lang.Object value = entry.getValue();
        java.lang.Object b18 = mVar.b(this.f532366e, 1);
        return value == b18 || (value != null && value.equals(b18));
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        if (!this.f532367f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f532368g.b(this.f532366e, 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        if (!this.f532367f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f532368g.b(this.f532366e, 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532366e < this.f532365d;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        if (!this.f532367f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i17 = this.f532366e;
        x.m mVar = this.f532368g;
        java.lang.Object b17 = mVar.b(i17, 0);
        java.lang.Object b18 = mVar.b(this.f532366e, 1);
        return (b17 == null ? 0 : b17.hashCode()) ^ (b18 != null ? b18.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f532366e++;
        this.f532367f = true;
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f532367f) {
            throw new java.lang.IllegalStateException();
        }
        this.f532368g.h(this.f532366e);
        this.f532366e--;
        this.f532365d--;
        this.f532367f = false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        if (this.f532367f) {
            return this.f532368g.i(this.f532366e, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* renamed from: toString */
    public java.lang.String m174747x9616526c() {
        return getKey() + "=" + getValue();
    }
}
