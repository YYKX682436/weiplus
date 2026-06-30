package gz0;

/* loaded from: classes10.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f359223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f359227h;

    public n(boolean z17, java.lang.String str, int i17, java.lang.String str2, android.content.Context context) {
        this.f359223d = z17;
        this.f359224e = str;
        this.f359225f = i17;
        this.f359226g = str2;
        this.f359227h = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dx1.f fVar = dx1.g.f326022a;
        fVar.i("SnsPublishProcess", "ifEgExit", 1);
        boolean z17 = this.f359223d;
        android.content.Context context = this.f359227h;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f325816a;
            u0Var.h(context, u0Var.d(this.f359224e, this.f359225f, this.f359226g));
            fVar.i("SnsTemplate", "goToMJAppResult", 1);
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        java.lang.String downloadUrl = Zi.concat("1101");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
        gw4.f fVar2 = new gw4.f(context);
        fVar2.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar2, null);
        fVar.i("SnsTemplate", "goToMJAppResult", 2);
    }
}
