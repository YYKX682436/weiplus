package ky1;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f395020a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f395021b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f395022c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f395023d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f395024e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f395025f;

    public b(ky1.a aVar) {
    }

    public ky1.c a() {
        return new ky1.c(this.f395020a, this.f395021b, this.f395022c, this.f395023d, this.f395024e, this.f395025f, null);
    }

    public ky1.b b(java.util.Map map) {
        if (map != null && map.size() > 0) {
            ((java.util.HashMap) this.f395023d).putAll(map);
        }
        return this;
    }

    public ky1.b c(java.util.List list) {
        if (list != null && list.size() > 0) {
            ((java.util.ArrayList) this.f395024e).addAll(list);
        }
        return this;
    }
}
