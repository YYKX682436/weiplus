package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes7.dex */
public class j0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273254b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f273255c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f273257e;

    /* renamed from: f, reason: collision with root package name */
    public int f273258f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f273259g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f273260h = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j0 j0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j0();
        j0Var.f273254b = this.f273254b;
        j0Var.f273255c = this.f273255c;
        j0Var.f273256d = this.f273256d;
        j0Var.f273257e = this.f273257e;
        j0Var.f273258f = this.f273258f;
        j0Var.f273259g = this.f273259g;
        j0Var.f273260h = this.f273260h;
        return j0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<wxgamecard>");
        sb6.append("<framesetname>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273255c));
        sb6.append("</framesetname>");
        sb6.append("<mbcarddata>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273254b));
        sb6.append("</mbcarddata>");
        sb6.append("<minpkgversion>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273256d));
        sb6.append("</minpkgversion>");
        sb6.append("<clientextinfo>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273257e));
        sb6.append("</clientextinfo>");
        sb6.append("<mbcardheight>");
        sb6.append(this.f273258f);
        sb6.append("</mbcardheight>");
        sb6.append("<isoldversion>");
        sb6.append(this.f273259g);
        sb6.append("</isoldversion>");
        sb6.append("</wxgamecard>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f273254b = (java.lang.String) map.get(".msg.appmsg.wxgamecard.mbcarddata");
        this.f273255c = (java.lang.String) map.get(".msg.appmsg.wxgamecard.framesetname");
        this.f273256d = (java.lang.String) map.get(".msg.appmsg.wxgamecard.minpkgversion");
        this.f273257e = (java.lang.String) map.get(".msg.appmsg.wxgamecard.clientextinfo");
        this.f273258f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wxgamecard.mbcardheight"), 0);
        this.f273259g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.wxgamecard.isoldversion"), 0);
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273257e)) {
                return;
            }
            this.f273260h = new org.json.JSONObject(this.f273257e).optInt("msgtype", 0);
        } catch (org.json.JSONException unused) {
        }
    }
}
