package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class q7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164396i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f164397m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x7 f164398n;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x7 x7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        this.f164398n = x7Var;
        this.f164391d = e9Var;
        this.f164392e = str;
        this.f164393f = str2;
        this.f164394g = str3;
        this.f164395h = str4;
        this.f164396i = str5;
        this.f164397m = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f164397m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x7 x7Var = this.f164398n;
        x7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164391d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p7(x7Var, e9Var));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", this.f164392e);
            jSONObject.put("taskUrl", this.f164393f);
            jSONObject.put("taskName", this.f164394g);
            jSONObject.put("fileMd5", this.f164395h);
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, this.f164396i);
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11923xf5bbf56b(x7Var, e9Var, i18, jSONObject).d();
            e9Var.a(i18, x7Var.o("ok:user downloaded app"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, download app fail", e17);
            e9Var.a(i18, x7Var.o("fail:download app fail"));
        }
    }
}
