package dw3;

/* loaded from: classes10.dex */
public final class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f325804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f325805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f325808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f325809m;

    public s0(yz5.l lVar, boolean z17, android.app.Activity activity, yz5.l lVar2, java.lang.String str, int i17, dw3.l0 l0Var) {
        this.f325803d = lVar;
        this.f325804e = z17;
        this.f325805f = activity;
        this.f325806g = lVar2;
        this.f325807h = str;
        this.f325808i = i17;
        this.f325809m = l0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.l lVar = this.f325803d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        if (this.f325804e) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new dw3.r0(this.f325806g, this.f325807h, this.f325808i, this.f325809m, this.f325805f, null), 3, null);
        } else {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1101");
            android.app.Activity context = this.f325805f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        dw3.u0.a(dw3.u0.f325816a, 1);
    }
}
