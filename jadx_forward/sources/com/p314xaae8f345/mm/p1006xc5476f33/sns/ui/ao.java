package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes10.dex */
public class ao implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f249311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.co f249312e;

    public ao(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.co coVar, boolean z17) {
        this.f249312e = coVar;
        this.f249311d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$1");
        boolean z17 = this.f249311d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.co coVar = this.f249312e;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f325816a;
            u0Var.h(coVar.f249672e.mo55332x76847179(), u0Var.e("moments", coVar.f249671d, dw3.j0.f325751a.b()));
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = coVar.f249672e.mo55332x76847179();
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1106");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        coVar.f249672e.l7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = coVar.f249672e.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        s0Var.e(str, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$1");
    }
}
