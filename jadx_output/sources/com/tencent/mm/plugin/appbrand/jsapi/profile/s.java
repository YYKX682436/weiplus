package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f82822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82825h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82826i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.y f82827m;

    public s(com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar, java.lang.String str, boolean z17, int i17, int i18, com.tencent.mm.plugin.appbrand.e9 e9Var, int i19) {
        this.f82827m = yVar;
        this.f82821d = str;
        this.f82822e = z17;
        this.f82823f = i17;
        this.f82824g = i18;
        this.f82825h = e9Var;
        this.f82826i = i19;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putString(dm.i4.COL_USERNAME, this.f82821d);
        if (this.f82822e) {
            bundle.putInt("wxaTradeCommentScore", this.f82823f);
        }
        int i17 = this.f82824g;
        if (i17 > 0) {
            bundle.putInt("certificationImageType", i17);
        }
        int i18 = this.f82826i;
        com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar = this.f82827m;
        yVar.getClass();
        java.lang.String string = bundle.getString(dm.i4.COL_USERNAME);
        java.lang.String string2 = bundle.getString("nickname");
        java.lang.String string3 = bundle.getString("brandIconURL");
        java.lang.String string4 = bundle.getString("appId");
        int i19 = bundle.getInt("wxaTradeCommentScore", 0);
        java.lang.String string5 = bundle.getString("registerBody");
        int i27 = bundle.getInt("certificationImageType", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("desc", "");
        hashMap.put("type", 1);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, string2);
        hashMap.put("img_url", string3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 3);
        intent.putExtra("appbrand_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 5);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.AppBrandData(string, null, string3, string3, string2, string2, 1));
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82825h;
        android.app.Activity r07 = e9Var.getRuntime().r0();
        com.tencent.mm.plugin.appbrand.jsapi.profile.u uVar = new com.tencent.mm.plugin.appbrand.jsapi.profile.u(yVar, string4, string2, string3, e9Var, i18, r07, string, bundle, i19, string5, i27);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.profile.v(yVar, uVar));
        s05.d dVar = new s05.d();
        dVar.Q(1);
        dVar.R(c01.od.c(string, ""));
        dVar.U(c01.od.c(string3, ""));
        dVar.V(i19);
        dVar.L(string5);
        dVar.F(i27);
        dVar.T(c01.od.c(string3, ""));
        v05.b bVar = new v05.b();
        int i28 = bVar.f368365d;
        bVar.set(i28 + 6, 33);
        bVar.set(i28 + 2, c01.od.c(string2, ""));
        java.lang.String c17 = c01.od.c(string, "");
        int i29 = bVar.f432315e;
        bVar.set(i29 + 11, c17);
        bVar.set(i29 + 12, c01.od.c(string2, ""));
        bVar.set(i29 + 39, dVar);
        nb5.b bVar2 = new nb5.b();
        bVar2.l(bVar);
        n13.r rVar = new n13.r();
        rVar.f334118b = 1;
        rVar.f334121e = false;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(r07, bVar2, rVar);
    }
}
