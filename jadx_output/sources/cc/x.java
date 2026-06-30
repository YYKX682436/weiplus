package cc;

/* loaded from: classes8.dex */
public final class x extends cc.s implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f40405d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f40406e;

    public x(java.lang.Object obj, java.lang.Object obj2) {
        this.f40405d = obj;
        this.f40406e = obj2;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f40405d;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f40406e;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
