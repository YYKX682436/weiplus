package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.p1972x3608ae;

/* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy */
/* loaded from: classes8.dex */
public class BinderC16929xaaa42de1 extends k55.b {

    /* renamed from: f, reason: collision with root package name */
    public final hs3.j f236340f;

    /* renamed from: g, reason: collision with root package name */
    public final hs3.j f236341g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 f236342h;

    public BinderC16929xaaa42de1(k55.k kVar, hs3.j jVar) {
        super(kVar);
        this.f236342h = new ns3.a(this);
        this.f236340f = jVar;
        this.f236341g = new ns3.b(this);
    }

    @k55.m
    /* renamed from: cancel */
    public void m67754xae7a2e7a(long j17) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new ns3.d(this, j17));
    }

    @k55.m
    /* renamed from: downloadQQMailApp */
    public long m67755x4c304722(java.lang.String str, java.lang.String str2) {
        try {
            java.net.URL url = new java.net.URL(str);
            new java.net.URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
            return -1L;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReadMailProxy", e17, "", new java.lang.Object[0]);
            return -1L;
        }
    }

    @k55.m
    public long get(java.lang.String str, java.util.Map map, android.os.Bundle bundle) {
        hs3.k kVar = new hs3.k();
        kVar.f366113a = bundle.getBoolean("qqmail_httpoptions_expired");
        kVar.f366114b = bundle.getBoolean("qqmail_httpoptions_needcache");
        kVar.f366115c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().g(str, 0, map, null, kVar, this.f236341g);
    }

    @k55.m
    /* renamed from: getBindUin */
    public java.lang.String m67756x37599ea7() {
        return new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null))).m143587x9616526c();
    }

    @k55.m
    /* renamed from: getMailAppDownloadProgress */
    public double m67757x31558ba9(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long j18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(j17).f178501n;
        if (j18 <= 0) {
            return 0.0d;
        }
        return (r5.f178500m * 1.0d) / j18;
    }

    @k55.m
    /* renamed from: getMailAppDownloadStatus */
    public java.lang.Integer m67758xdb2ac86e(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(j17).f178496f);
    }

    @k55.m
    /* renamed from: getMailAppEnterUlAndroid */
    public java.lang.String m67759x8e978db4() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
    }

    @k55.m
    /* renamed from: getMailAppRedirectUrlAndroid */
    public java.lang.String m67760x50dc4ed0() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppRedirectUrAndroid");
    }

    @k55.m
    /* renamed from: getUneradMailCountFromConfig */
    public java.lang.Object m67761xa0970225() {
        return gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QQMAIL_UNREAD_COUNT_INT, -1);
    }

    @k55.m
    /* renamed from: getUnreadMailCount */
    public void m67762x7d428873() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 u6Var = this.f236342h;
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.RunnableC19751x67bbe5f(u6Var), "QQMailUnreadHelper");
    }

    @k55.m
    /* renamed from: getUserBindEmail */
    public java.lang.String m67763xf98f5a1e() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @k55.m
    /* renamed from: isSDCardAvailable */
    public boolean m67764xe8158c5e() {
        return gm0.j1.u().l();
    }

    @k55.l
    /* renamed from: onComplete */
    public void m67765x815f5438() {
        hs3.j jVar = this.f236340f;
        if (jVar != null) {
            jVar.a();
        }
    }

    @k55.l
    /* renamed from: onError */
    public void m67766xaf8aa769(int i17, java.lang.String str) {
        hs3.j jVar = this.f236340f;
        if (jVar != null) {
            jVar.b(i17, str);
        }
    }

    @k55.l
    /* renamed from: onReady */
    public boolean m67767xb03baf04() {
        hs3.j jVar = this.f236340f;
        if (jVar == null) {
            return true;
        }
        return jVar.c();
    }

    @k55.l
    /* renamed from: onSuccess */
    public void m67768xe05b4124(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        hs3.j jVar = this.f236340f;
        if (jVar != null) {
            jVar.d(str, map);
        }
    }

    @k55.m
    /* renamed from: post */
    public long m67769x3498a0(java.lang.String str, java.util.Map map, android.os.Bundle bundle) {
        hs3.k kVar = new hs3.k();
        kVar.f366113a = bundle.getBoolean("qqmail_httpoptions_expired");
        kVar.f366114b = bundle.getBoolean("qqmail_httpoptions_needcache");
        kVar.f366115c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().g(str, 1, map, null, kVar, this.f236341g);
    }

    @k55.m
    /* renamed from: removeDownloadQQMailAppTask */
    public int m67770x1f5121a3(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(j17);
    }

    @k55.m
    /* renamed from: reportKvState */
    public void m67771xb56e3212(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18));
    }

    @k55.m
    /* renamed from: reportKvStates */
    public void m67772xf85810a1(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @k55.m
    /* renamed from: showMailAppRecommend */
    public java.lang.Integer m67773x2816900f() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b == 1) {
            return 0;
        }
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "ShowMailAppRecommend"), 0));
    }

    public BinderC16929xaaa42de1(k55.k kVar, hs3.j jVar, os3.z4 z4Var) {
        super(kVar);
        this.f236342h = new ns3.a(this);
        this.f236340f = jVar;
        this.f236341g = new ns3.c(this);
    }
}
