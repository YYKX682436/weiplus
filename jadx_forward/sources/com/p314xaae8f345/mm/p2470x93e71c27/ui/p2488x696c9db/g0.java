package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes9.dex */
public class g0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f273163b;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f273166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273167f;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f273171j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f273172k;

    /* renamed from: c, reason: collision with root package name */
    public int f273164c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f273165d = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f273168g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f273169h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f273170i = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0();
        g0Var.f273163b = this.f273163b;
        g0Var.f273164c = this.f273164c;
        g0Var.f273172k = this.f273172k;
        g0Var.f273165d = this.f273165d;
        g0Var.f273166e = this.f273166e;
        g0Var.f273167f = this.f273167f;
        g0Var.f273168g = this.f273168g;
        g0Var.f273169h = this.f273169h;
        g0Var.f273170i = this.f273170i;
        g0Var.f273171j = this.f273171j;
        return g0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<gameshare>");
        sb6.append("<liteappext>");
        sb6.append("<liteappbizdata>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273163b));
        sb6.append("</liteappbizdata>");
        sb6.append("<priority>");
        sb6.append(this.f273164c);
        sb6.append("</priority>");
        sb6.append("</liteappext>");
        sb6.append("<appbrandext>");
        sb6.append("<litegameinfo>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273172k));
        sb6.append("</litegameinfo>");
        sb6.append("<priority>");
        sb6.append(this.f273165d);
        sb6.append("</priority>");
        sb6.append("</appbrandext>");
        sb6.append("<gameshareid>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273166e));
        sb6.append("</gameshareid>");
        sb6.append("<sharedata>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273167f));
        sb6.append("</sharedata>");
        sb6.append("<isvideo>");
        sb6.append(this.f273168g);
        sb6.append("</isvideo>");
        sb6.append("<duration>");
        sb6.append(this.f273169h);
        sb6.append("</duration>");
        sb6.append("<isexposed>");
        sb6.append(this.f273170i);
        sb6.append("</isexposed>");
        sb6.append("<readtext>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f273171j));
        sb6.append("</readtext>");
        sb6.append("</gameshare>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f273163b = (java.lang.String) map.get(".msg.appmsg.gameshare.liteappext.liteappbizdata");
        this.f273164c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.liteappext.priority"), 0);
        this.f273172k = (java.lang.String) map.get(".msg.appmsg.gameshare.appbrandext.litegameinfo");
        this.f273165d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.appbrandext.priority"), -1);
        this.f273166e = (java.lang.String) map.get(".msg.appmsg.gameshare.gameshareid");
        this.f273167f = (java.lang.String) map.get(".msg.appmsg.gameshare.sharedata");
        this.f273168g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.isvideo"), 0);
        this.f273169h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.duration"), 0);
        this.f273170i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.gameshare.isexposed"), 0);
        this.f273171j = (java.lang.String) map.get(".msg.appmsg.gameshare.readtext");
    }
}
