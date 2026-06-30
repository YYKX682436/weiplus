package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f163647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 f163651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f163652i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f163653m;

    public w5(android.app.Activity activity, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var, int i17, boolean z17) {
        this.f163647d = activity;
        this.f163648e = str;
        this.f163649f = yVar;
        this.f163650g = jSONObject;
        this.f163651h = y5Var;
        this.f163652i = i17;
        this.f163653m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf.g.a(this.f163647d).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v5(this.f163651h, this.f163649f, this.f163652i, this.f163653m, this.f163648e));
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.K(), "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, tempOutputPath: ".concat(o17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(this.f163648e, o17);
        b17.F = 294;
        boolean z17 = false;
        b17.f237221z = false;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f237210o = c10402x5bc41468;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = this.f163649f.mo32091x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo32091x9a3f0ba2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2).e3()) {
            org.json.JSONObject jSONObject = this.f163650g;
            if (jSONObject != null && jSONObject.optBoolean("supportUndo", false)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "supportUndo, updatePhotoEditProvider");
                ((fu3.f) ((qc0.f1) i95.n0.c(qc0.f1.class))).getClass();
                fu3.e.f348413a.b(b17);
            }
        }
        ut3.m.f512715a.e(this.f163647d, this.f163651h.f163690g, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 1);
    }
}
