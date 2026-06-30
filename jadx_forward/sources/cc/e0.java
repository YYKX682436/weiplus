package cc;

/* loaded from: classes14.dex */
public abstract class e0 extends java.util.AbstractMap {

    /* renamed from: d, reason: collision with root package name */
    public transient java.util.Set f121900d;

    /* renamed from: e, reason: collision with root package name */
    public transient java.util.Collection f121901e;

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        java.util.Set set = this.f121900d;
        if (set != null) {
            return set;
        }
        cc.c cVar = new cc.c((cc.e) this);
        this.f121900d = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        java.util.Collection collection = this.f121901e;
        if (collection != null) {
            return collection;
        }
        cc.g0 g0Var = new cc.g0(this);
        this.f121901e = g0Var;
        return g0Var;
    }
}
