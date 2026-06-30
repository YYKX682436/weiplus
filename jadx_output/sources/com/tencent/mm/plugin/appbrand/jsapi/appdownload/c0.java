package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class c0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.e0 f78945f;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.e0 e0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f78945f = e0Var;
        this.f78943d = e9Var;
        this.f78944e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        int i17 = this.f78944e;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78943d;
        if (iPCString == null || iPCString.f68406d == null) {
            e9Var.a(i17, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("result", new org.json.JSONArray(iPCString.f68406d));
        } catch (org.json.JSONException unused) {
        }
        e9Var.a(i17, this.f78945f.p("ok", hashMap));
    }
}
