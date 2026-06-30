package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f162413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f162414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g8 f162416g;

    public f8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g8 g8Var) {
        this.f162413d = c11510xdd90c2f2;
        this.f162414e = yVar;
        this.f162415f = i17;
        this.f162416g = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) this.f162413d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rd) o6Var.f553277d2.b()).f169299c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n2.a(o6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g8 g8Var = this.f162416g;
        g8Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f162414e.a(this.f162415f, g8Var.u(str, jSONObject));
    }
}
