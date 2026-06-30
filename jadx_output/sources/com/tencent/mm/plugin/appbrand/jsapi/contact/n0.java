package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 550;
    public static final java.lang.String NAME = "privateEnterContact";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f80576g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f80577h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f80578i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f80579m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f80580n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f80581o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f80582p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f80583q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f80584r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f80585s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f80586t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f80587u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f80588v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f80589w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f80590x;

    /* renamed from: y, reason: collision with root package name */
    public final int f80591y = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.service.c0)) {
            if (lVar instanceof com.tencent.mm.plugin.appbrand.page.n7) {
                C((com.tencent.mm.plugin.appbrand.page.n7) lVar, lVar, jSONObject, i17);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact not support");
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        if (V0 != null) {
            C(V0, c0Var, jSONObject, i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, pageView is null");
            c0Var.a(i17, o("fail:current page do not exist"));
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.f0 f0Var = new com.tencent.mm.plugin.appbrand.jsapi.contact.f0(this, lVar, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, data is null");
            f0Var.a(false, "fail:invalid data", null);
            return;
        }
        if (n7Var.getRuntime().E0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, config is null");
            f0Var.a(false, "fail:config is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        this.f80576g = optString;
        if (optString.length() > 1024) {
            this.f80576g = this.f80576g.substring(0, 1024);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact sessionFrom length is large than 1024!");
        }
        java.lang.String optString2 = jSONObject.optString("appId");
        this.f80577h = optString2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            f0Var.a(false, "fail:appId is null", null);
            return;
        }
        this.f80578i = jSONObject.optString("userName");
        java.lang.String optString3 = jSONObject.optString("contactUsername");
        this.f80582p = optString3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            optString3 = "";
        } else if (!optString3.endsWith("@app")) {
            optString3 = optString3.concat("@app");
        }
        this.f80582p = optString3;
        this.f80579m = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f80580n = jSONObject.optString("subTitle");
        this.f80581o = jSONObject.optString("headimgUrl");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f80578i)) {
            com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask();
            jsApiChattingTask.f80486h = this.f80578i;
            jsApiChattingTask.f80484f = this.f80576g;
            jsApiChattingTask.f80488m = new com.tencent.mm.plugin.appbrand.jsapi.contact.h0(this, jsApiChattingTask, n7Var, f0Var);
            jsApiChattingTask.d();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f80582p)) {
            return;
        }
        this.f80584r = jSONObject.optString("businessId");
        this.f80585s = jSONObject.optString("sendMessageTitle");
        this.f80586t = jSONObject.optString("sendMessagePath");
        this.f80587u = jSONObject.optString("sendMessageImg");
        this.f80588v = jSONObject.optBoolean("showMessageCard", false);
        this.f80590x = com.tencent.mm.sdk.platformtools.t8.K0(this.f80587u);
        this.f80589w = com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(n7Var, this.f80587u, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f80582p)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "doCgiAndEnterChatting username is null, err");
            f0Var.a(false, "fail:config is null", null);
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
        po3Var.f383251d = this.f80582p;
        po3Var.f383252e = this.f80584r;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.appbrand.jsapi.contact.j0(this, f0Var, n7Var));
    }
}
