package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class w8 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f165252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y8 f165255d;

    public w8(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y8 y8Var) {
        this.f165252a = activity;
        this.f165253b = d0Var;
        this.f165254c = i17;
        this.f165255d = y8Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        nf.g.a(this.f165252a).f418117c.remove(this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult, requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", resultData exists: ");
        sb6.append(intent != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y8.f165472g != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y8 y8Var = this.f165255d;
        int i19 = this.f165254c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165253b;
        if (-1 != i18) {
            y8Var.getClass();
            java.util.Map k17 = kz5.c1.k(new jz5.l("resultCode", "C0405001"), new jz5.l("resultDesc", "数据处理异常"));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(k17 instanceof java.util.HashMap)) {
                k17 = new java.util.HashMap(k17);
            }
            k17.put("errno", 0);
            d0Var.a(i19, y8Var.t("ok", k17));
            return true;
        }
        if (intent == null) {
            y8Var.getClass();
            java.util.Map k18 = kz5.c1.k(new jz5.l("resultCode", "C0412003"), new jz5.l("resultDesc", "用户已取消"));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(k18 instanceof java.util.HashMap)) {
                k18 = new java.util.HashMap(k18);
            }
            k18.put("errno", 0);
            d0Var.a(i19, y8Var.t("ok", k18));
            return true;
        }
        java.util.Map k19 = kz5.c1.k(new jz5.l("resultCode", intent.getStringExtra("resultCode")), new jz5.l("resultDesc", intent.getStringExtra("resultDesc")), new jz5.l("idCardAuthData", intent.getStringExtra("idCardAuthData")), new jz5.l("certPwdData", intent.getStringExtra("certPwdData")));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "onResult, returnData: " + k19);
        y8Var.getClass();
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(k19 instanceof java.util.HashMap)) {
            k19 = new java.util.HashMap(k19);
        }
        k19.put("errno", 0);
        d0Var.a(i19, y8Var.t("ok", k19));
        return true;
    }
}
