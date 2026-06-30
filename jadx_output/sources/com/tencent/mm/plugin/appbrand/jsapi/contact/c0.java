package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 145;
    public static final java.lang.String NAME = "enterContact";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f80530g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f80531h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f80532i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f80533m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f80534n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f80535o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f80536p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80537q;

    /* renamed from: r, reason: collision with root package name */
    public final int f80538r = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.service.c0)) {
            if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                D((com.tencent.mm.plugin.appbrand.page.n7) lVar, lVar, jSONObject, i17);
                return;
            } else {
                lVar.a(i17, o("fail:internal error invalid js component"));
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        if (V0 != null) {
            D(V0, c0Var, jSONObject, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "enterChatting fail, pageView is null");
            c0Var.a(i17, o("fail:current page do not exist"));
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask();
        java.lang.String str2 = n7Var.getRuntime().u0().f47278x;
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = n7Var.getAppId();
        z5Var.f305866d = str2;
        z5Var.f305867e = appBrandSysConfigWC.f305841d;
        z5Var.f305868f = appBrandSysConfigWC.f305843f;
        z5Var.f305870h = appBrandSysConfigWC.f305852r.f75399d;
        z5Var.f305869g = appBrandSysConfigWC.f305852r.pkgVersion;
        z5Var.f305871i = appBrandSysConfigWC.f305852r.f75372md5;
        z5Var.f305872j = 5;
        z5Var.f305873k = n7Var.X1();
        z5Var.f305874l = com.tencent.mm.plugin.appbrand.v9.b(n7Var.getAppId());
        java.lang.String str3 = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str2 = str;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            str2 = "";
        }
        jsApiChattingTask.f80486h = str2;
        java.lang.String str4 = appBrandSysConfigWC.f305841d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            } else {
                str3 = str4;
            }
        }
        jsApiChattingTask.f80487i = str3;
        jsApiChattingTask.f80484f = this.f80530g;
        jsApiChattingTask.f80488m = new com.tencent.mm.plugin.appbrand.jsapi.contact.a0(this, jsApiChattingTask, z5Var, n7Var, b0Var);
        jsApiChattingTask.d();
    }

    public void D(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.contact.w(this, lVar, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "enterChatting fail, data is null");
            wVar.a(false, "fail:invalid data", null);
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        if (E0 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "enterChatting fail, config is null");
            wVar.a(false, "fail:config is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        this.f80530g = optString;
        if (optString.length() > 1024) {
            this.f80530g = this.f80530g.substring(0, 1024);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
        }
        this.f80531h = jSONObject.optString("businessId");
        java.lang.String optString2 = jSONObject.optString("sendMessageTitle");
        this.f80532i = optString2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f80532i = n7Var.J1();
        }
        java.lang.String optString3 = jSONObject.optString("sendMessagePath");
        this.f80533m = optString3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            java.lang.String Y1 = n7Var.Y1();
            this.f80533m = Y1;
            if (Y1.length() > 1024) {
                this.f80533m = this.f80533m.substring(0, 1024);
            }
        }
        this.f80534n = jSONObject.optString("sendMessageImg");
        this.f80535o = jSONObject.optBoolean("showMessageCard", false);
        this.f80537q = com.tencent.mm.sdk.platformtools.t8.K0(this.f80534n);
        this.f80536p = com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(n7Var, this.f80534n, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f80531h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
            C(n7Var, E0, "", wVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
        java.lang.String str = n7Var.getRuntime().u0().f47278x;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "doCgiAndEnterChatting username is null, err");
            wVar.a(false, "fail:config is null", null);
            return;
        }
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = new r45.po3();
        lVar2.f70665b = new r45.qo3();
        lVar2.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
        lVar2.f70667d = 1303;
        lVar2.f70668e = 0;
        lVar2.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar2.a();
        r45.po3 po3Var = (r45.po3) a17.f70710a.f70684a;
        po3Var.f383251d = str;
        po3Var.f383252e = this.f80531h;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.appbrand.jsapi.contact.y(this, wVar, n7Var, E0));
    }
}
