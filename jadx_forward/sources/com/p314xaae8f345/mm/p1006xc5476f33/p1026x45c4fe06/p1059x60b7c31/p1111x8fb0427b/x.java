package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.y f164971g;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.y yVar) {
        this.f164968d = c0Var;
        this.f164969e = i17;
        this.f164970f = i18;
        this.f164971g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164968d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n) c0Var.t3().f167705i2.b();
        java.lang.String str = c0Var.t3().u0().f128810w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 b17 = nVar.b(this.f164969e, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.y yVar = this.f164971g;
        int i17 = this.f164970f;
        if (b17 != null && b17.f165870e == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fetchedData", b17.f165869d);
            yVar.getClass();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            c0Var.a(i17, yVar.t("ok", hashMap));
            return;
        }
        yVar.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, yVar.u(str3, jSONObject));
    }
}
