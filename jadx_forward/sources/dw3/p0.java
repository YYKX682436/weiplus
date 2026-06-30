package dw3;

/* loaded from: classes10.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f325786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f325788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f325789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f325790i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f325791m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f325792n;

    public p0(yz5.l lVar, boolean z17, java.lang.String str, java.util.List list, int i17, java.util.List list2, dw3.l0 l0Var, android.app.Activity activity) {
        this.f325785d = lVar;
        this.f325786e = z17;
        this.f325787f = str;
        this.f325788g = list;
        this.f325789h = i17;
        this.f325790i = list2;
        this.f325791m = l0Var;
        this.f325792n = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.l lVar = this.f325785d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        boolean z17 = this.f325786e;
        android.app.Activity context = this.f325792n;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f325816a;
            u0Var.h(context, u0Var.c(this.f325787f, this.f325788g, this.f325789h, this.f325790i, this.f325791m.a()));
            return;
        }
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
}
