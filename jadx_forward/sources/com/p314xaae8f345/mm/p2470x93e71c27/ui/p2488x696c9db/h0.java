package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes9.dex */
public class h0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273198b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f273199c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273200d;

    /* renamed from: e, reason: collision with root package name */
    public int f273201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273202f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f273203g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273204h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273205i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f273206j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f273207k = false;

    /* renamed from: l, reason: collision with root package name */
    public z05.e f273208l = null;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
        h0Var.f273198b = this.f273198b;
        h0Var.f273199c = this.f273199c;
        h0Var.f273200d = this.f273200d;
        h0Var.f273201e = this.f273201e;
        h0Var.f273202f = this.f273202f;
        h0Var.f273203g = this.f273203g;
        h0Var.f273204h = this.f273204h;
        h0Var.f273205i = this.f273205i;
        h0Var.f273207k = this.f273207k;
        h0Var.f273206j = this.f273206j;
        h0Var.f273208l = this.f273208l;
        ot0.q qVar = this.f430014a;
        if (qVar != null) {
            qVar.E2 = this.f273205i ? 1 : 0;
        }
        return h0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<liteapp>");
        sb6.append("<id>");
        sb6.append(this.f273198b);
        sb6.append("</id>");
        sb6.append("<path>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273199c));
        sb6.append("</path>");
        sb6.append("<query>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273200d));
        sb6.append("</query>");
        if (this.f273201e > 0) {
            sb6.append("<source>");
            sb6.append(this.f273201e);
            sb6.append("</source>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273202f)) {
            sb6.append("<minversion>");
            sb6.append(this.f273202f);
            sb6.append("</minversion>");
        }
        sb6.append("<istransparent>");
        sb6.append(this.f273203g ? 1 : 0);
        sb6.append("</istransparent>");
        sb6.append("<hideicon>");
        sb6.append(this.f273204h ? 1 : 0);
        sb6.append("</hideicon>");
        sb6.append("<forbidforward>");
        sb6.append(this.f273205i ? 1 : 0);
        sb6.append("</forbidforward>");
        if (this.f273208l != null) {
            sb6.append("<oldImageCDNInfo>");
            sb6.append("<cdnthumburl>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273208l.o()));
            sb6.append("</cdnthumburl>");
            sb6.append("<cdnthumbmd5>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273208l.n()));
            sb6.append("</cdnthumbmd5>");
            sb6.append("<cdnthumblength>");
            sb6.append(this.f273208l.l());
            sb6.append("</cdnthumblength>");
            sb6.append("<cdnthumbwidth>");
            sb6.append(this.f273208l.p());
            sb6.append("</cdnthumbwidth>");
            sb6.append("<cdnthumbheight>");
            sb6.append(this.f273208l.k());
            sb6.append("</cdnthumbheight>");
            sb6.append("<cdnthumbaeskey>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273208l.j()));
            sb6.append("</cdnthumbaeskey>");
            sb6.append("</oldImageCDNInfo>");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273206j)) {
            sb6.append("<imageConf>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273206j));
            sb6.append("</imageConf>");
        }
        sb6.append("</liteapp>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map.get(".msg.appmsg.liteapp") != null) {
            this.f273198b = (java.lang.String) map.get(".msg.appmsg.liteapp.id");
            this.f273199c = (java.lang.String) map.get(".msg.appmsg.liteapp.path");
            this.f273200d = (java.lang.String) map.get(".msg.appmsg.liteapp.query");
            this.f273201e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.source"), 0);
            this.f273202f = (java.lang.String) map.get(".msg.appmsg.liteapp.minversion");
            this.f273203g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.istransparent"), 0) == 1;
            this.f273204h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.hideicon"), 0) == 1;
            this.f273205i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.forbidforward"), 0) == 1;
            if (map.containsKey(".msg.appmsg.liteapp.oldImageCDNInfo")) {
                z05.e eVar = new z05.e();
                this.f273208l = eVar;
                eVar.u((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumburl"));
                this.f273208l.t((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbmd5"));
                this.f273208l.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumblength"), 0));
                this.f273208l.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbwidth"), 0));
                this.f273208l.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbheight"), 0));
                this.f273208l.q((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbaeskey"));
            }
            this.f273206j = (java.lang.String) map.get(".msg.appmsg.liteapp.imageConf");
            this.f273207k = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5);
            qVar.E2 = this.f273205i ? 1 : 0;
        }
    }
}
