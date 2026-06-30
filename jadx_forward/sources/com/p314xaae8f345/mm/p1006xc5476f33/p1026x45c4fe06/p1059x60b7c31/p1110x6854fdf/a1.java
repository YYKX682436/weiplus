package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34785x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34786x24728b = "shareImageMessageToSpecificContact";

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s0 f164639h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s0(null);

    /* renamed from: g, reason: collision with root package name */
    public final int f164640g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, data is null");
            yVar.a(i17, o("fail:data is null"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0(this, jSONObject, yVar);
        java.lang.String str2 = t0Var.f164766a;
        boolean z17 = str2.length() == 0;
        java.lang.String str3 = t0Var.f164770e;
        if (z17) {
            str = "fail:imagePath is null";
        } else {
            if (t0Var.f164769d.length() == 0) {
                if (str3.length() == 0) {
                    str = "fail:openId and chatroomUsername is null";
                }
            }
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", str);
            yVar.a(i17, o(str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke params:" + t0Var);
        if (!(t0Var.f164769d.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o5.b(yVar, str2, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u0(yVar, i17, this, t0Var));
            return;
        }
        r45.q46 q46Var = new r45.q46();
        q46Var.f465211d = yVar.mo48798x74292566();
        q46Var.f465212e = str3;
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 1961;
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/share_transid";
        lVar2.f152197a = q46Var;
        lVar2.f152198b = new r45.r46();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z0(yVar, i17, this, t0Var));
    }
}
