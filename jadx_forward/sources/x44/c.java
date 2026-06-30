package x44;

/* loaded from: classes4.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.g f533326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533331i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f533332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f533333n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f533334o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f533335p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533336q;

    public c(x44.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, boolean z17, int i17, boolean z18, java.lang.String str6) {
        this.f533326d = gVar;
        this.f533327e = str;
        this.f533328f = str2;
        this.f533329g = str3;
        this.f533330h = str4;
        this.f533331i = str5;
        this.f533332m = j17;
        this.f533333n = z17;
        this.f533334o = i17;
        this.f533335p = z18;
        this.f533336q = str6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$1");
        dialogInterface.dismiss();
        x44.g gVar = this.f533326d;
        java.lang.String appId = this.f533327e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "$appId");
        java.lang.String pkg = this.f533328f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkg, "$pkg");
        java.lang.String md52 = this.f533329g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(md52, "$md5");
        java.lang.String url = this.f533330h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "$url");
        java.lang.String filename = this.f533331i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filename, "$filename");
        long j17 = this.f533332m;
        boolean z17 = this.f533333n;
        int i18 = this.f533334o;
        boolean z18 = this.f533335p;
        java.lang.String wxAppId = this.f533336q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxAppId, "$wxAppId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        long p17 = gVar.p(appId, pkg, md52, url, filename, j17, z17, i18, z18, wxAppId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66865x76d1ec5a, p17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        x44.g gVar2 = this.f533326d;
        gVar2.m(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        gVar2.b(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$1");
    }
}
