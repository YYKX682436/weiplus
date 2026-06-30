package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class q extends com.tencent.mm.plugin.appbrand.jsapi.u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f82842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f82845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f82846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f82847h;

    public q(com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, android.os.Looper looper) {
        this.f82847h = mVar;
        this.f82841b = str;
        this.f82842c = k0Var;
        this.f82843d = str2;
        this.f82844e = i17;
        this.f82845f = c0Var;
        this.f82846g = looper;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.j
    public void a() {
        java.lang.String o17;
        if (android.text.TextUtils.isEmpty(this.f83499a)) {
            android.os.Looper looper = this.f82846g;
            if (looper != null && looper != android.os.Looper.myLooper()) {
                com.tencent.mm.plugin.appbrand.jsapi.Cif cif = this.f82847h.f81583p;
                int i17 = this.f82844e;
                synchronized (cif) {
                    if (!cif.f81317b) {
                        cif.f81318c.put(i17, java.lang.System.currentTimeMillis());
                    }
                }
                new android.os.Handler(this.f82846g).post(new com.tencent.mm.plugin.appbrand.jsapi.p(this, this));
                return;
            }
            boolean c17 = this.f82847h.c(this.f82842c.k(), this.f82845f);
            if (!c17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invoke handler.proceed() log[%s] api[%s], callbackId[%d], component not running", this.f82847h.b0(), this.f82842c, java.lang.Integer.valueOf(this.f82844e));
            }
            if (c17) {
                try {
                    org.json.JSONObject c07 = com.tencent.mm.plugin.appbrand.jsapi.m.c0(this.f82847h, this.f82841b);
                    try {
                        org.json.JSONObject c08 = !android.text.TextUtils.isEmpty(this.f82843d) ? com.tencent.mm.plugin.appbrand.jsapi.m.c0(this.f82847h, this.f82843d.trim()) : null;
                        if (c07 != null && c07.optBoolean("noCallback", false)) {
                            this.f82847h.f81588u.put(java.lang.Integer.valueOf(this.f82844e), java.lang.Boolean.TRUE);
                        }
                        o17 = c07 == null ? this.f82842c.o("fail:invalid data") : this.f82847h.r0(this.f82842c, c07, c08, this.f82844e, this.f82845f);
                        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f82847h;
                        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f82842c;
                        java.lang.String str = this.f82841b;
                        java.lang.String str2 = this.f82843d;
                        int i18 = this.f82844e;
                        com.tencent.mm.plugin.appbrand.jsapi.k kVar = mVar.f81578h;
                        if (kVar != null) {
                            kVar.a(k0Var, str, str2, i18, o17);
                        }
                    } catch (java.lang.OutOfMemoryError e17) {
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = this.f82842c.k();
                        java.lang.String str3 = this.f82843d;
                        objArr[1] = java.lang.Integer.valueOf((str3 != null ? str3 : "").length());
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parsePrivateDataStr, api[%s], privateData.length[%d]", objArr);
                        throw e17;
                    }
                } catch (java.lang.OutOfMemoryError e18) {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = this.f82842c.k();
                    java.lang.String str4 = this.f82841b;
                    objArr2[1] = java.lang.Integer.valueOf((str4 != null ? str4 : "").length());
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parseDataStr oom, api[%s], data_length[%d]", objArr2);
                    throw e18;
                }
            } else {
                o17 = this.f82842c.o("fail:interrupted");
            }
            if (android.text.TextUtils.isEmpty(o17)) {
                return;
            }
            this.f83499a = o17;
            if (this.f82842c instanceof com.tencent.mm.plugin.appbrand.jsapi.a1) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.m mVar2 = this.f82847h;
            com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = this.f82845f;
            if (c0Var == null) {
                c0Var = mVar2.getJsRuntime();
            }
            mVar2.d0(this.f82844e, o17, c0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.j
    public void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.f83499a) && !android.text.TextUtils.isEmpty(str)) {
            this.f83499a = str;
            if (this.f82842c instanceof com.tencent.mm.plugin.appbrand.jsapi.a1) {
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f82847h;
            com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = this.f82845f;
            if (c0Var == null) {
                c0Var = mVar.getJsRuntime();
            }
            mVar.d0(this.f82844e, str, c0Var);
        }
    }
}
