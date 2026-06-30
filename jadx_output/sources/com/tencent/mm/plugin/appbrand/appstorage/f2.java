package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76171a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f76172b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f76173c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f76174d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsruntime.v f76175e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.t0 f76176f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Collection f76177g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f76178h = new java.util.concurrent.ConcurrentHashMap();

    static {
        new com.tencent.mm.plugin.appbrand.appstorage.c2();
    }

    public f2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appstorage.t0 t0Var) {
        this.f76171a = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o() + "/";
        this.f76172b = str2;
        this.f76173c = str3;
        this.f76176f = t0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.tencent.mm.plugin.appbrand.appstorage.e2(this, null));
        this.f76177g = java.util.Collections.unmodifiableCollection(linkedList);
    }

    public java.nio.ByteBuffer a(java.lang.String str) {
        if (this.f76175e == null) {
            if (this.f76174d == null) {
                com.tencent.mm.plugin.appbrand.appstorage.t0 t0Var = this.f76176f;
                if (t0Var != null) {
                    this.f76174d = ((com.tencent.mm.plugin.appbrand.jsapi.file.k2) t0Var).f81088a.C0();
                }
                if (this.f76174d == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "service is null");
                    return null;
                }
            }
            this.f76175e = (com.tencent.mm.plugin.appbrand.jsruntime.v) this.f76174d.getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class);
        }
        com.tencent.mm.plugin.appbrand.jsruntime.v vVar = this.f76175e;
        if (vVar != null && vVar.H() != null) {
            return this.f76175e.H().a(str);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f76175e == null);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "getBuffer failed, mBufferAddon == null?: [%b]", objArr);
        return null;
    }
}
