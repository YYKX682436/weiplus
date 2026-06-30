package fc4;

/* loaded from: classes10.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f342717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc4.p f342719f;

    public m(boolean z17, java.lang.String str, fc4.p pVar) {
        this.f342717d = z17;
        this.f342718e = str;
        this.f342719f = pVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$1");
        boolean z17 = this.f342717d;
        fc4.p pVar = this.f342719f;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f325816a;
            u0Var.h(pVar.m80379x76847179(), u0Var.e("moments", this.f342718e, dw3.j0.f325751a.b()));
        } else {
            android.app.Activity context = pVar.m80379x76847179();
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
        pVar.m158354x19263085().onBackPressed();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        java.lang.String str = pVar.f342730i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        s0Var.e(str, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$1");
    }
}
