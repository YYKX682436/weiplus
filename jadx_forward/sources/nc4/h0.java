package nc4;

/* loaded from: classes10.dex */
public final class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f417685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f417686f;

    public h0(yz5.l lVar, boolean z17, android.app.Activity activity) {
        this.f417684d = lVar;
        this.f417685e = z17;
        this.f417686f = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$2");
        this.f417684d.mo146xb9724478(java.lang.Boolean.TRUE);
        boolean z17 = this.f417685e;
        android.app.Activity context = this.f417686f;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f325816a;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_phoneix_video_duration, 30);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Ni);
            u0Var.h(context, u0Var.d("moments", Ni, ""));
        } else {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1101");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance$handleSelect$2");
    }
}
