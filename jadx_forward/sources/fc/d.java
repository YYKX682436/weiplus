package fc;

/* loaded from: classes16.dex */
public final class d implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f342439d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f342440e;

    /* renamed from: f, reason: collision with root package name */
    public final int f342441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc.k f342442g;

    public d(fc.k kVar, java.lang.Object obj, java.lang.Object obj2, int i17) {
        this.f342442g = kVar;
        this.f342439d = obj;
        this.f342440e = obj2;
        this.f342441f = i17;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f342439d;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f342440e;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f342442g.f342449p;
        int i17 = this.f342441f;
        java.lang.Object obj2 = objArr[i17];
        java.lang.Object obj3 = this.f342440e;
        if (obj2 != obj3) {
            throw new java.util.ConcurrentModificationException();
        }
        objArr[i17] = obj;
        this.f342440e = obj;
        return obj3;
    }
}
