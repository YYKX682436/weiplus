package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f164359i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y f164360m;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar, java.lang.String str, boolean z17, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i19) {
        this.f164360m = yVar;
        this.f164354d = str;
        this.f164355e = z17;
        this.f164356f = i17;
        this.f164357g = i18;
        this.f164358h = e9Var;
        this.f164359i = i19;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putString(dm.i4.f66875xa013b0d5, this.f164354d);
        if (this.f164355e) {
            bundle.putInt("wxaTradeCommentScore", this.f164356f);
        }
        int i17 = this.f164357g;
        if (i17 > 0) {
            bundle.putInt("certificationImageType", i17);
        }
        int i18 = this.f164359i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar = this.f164360m;
        yVar.getClass();
        java.lang.String string = bundle.getString(dm.i4.f66875xa013b0d5);
        java.lang.String string2 = bundle.getString("nickname");
        java.lang.String string3 = bundle.getString("brandIconURL");
        java.lang.String string4 = bundle.getString("appId");
        int i19 = bundle.getInt("wxaTradeCommentScore", 0);
        java.lang.String string5 = bundle.getString("registerBody");
        int i27 = bundle.getInt("certificationImageType", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("desc", "");
        hashMap.put("type", 1);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, string2);
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
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21008x40c862d0(string, null, string3, string3, string2, string2, 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164358h;
        android.app.Activity r07 = e9Var.mo32091x9a3f0ba2().r0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.u(yVar, string4, string2, string3, e9Var, i18, r07, string, bundle, i19, string5, i27);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.v(yVar, uVar));
        s05.d dVar = new s05.d();
        dVar.Q(1);
        dVar.R(c01.od.c(string, ""));
        dVar.U(c01.od.c(string3, ""));
        dVar.V(i19);
        dVar.L(string5);
        dVar.F(i27);
        dVar.T(c01.od.c(string3, ""));
        v05.b bVar = new v05.b();
        int i28 = bVar.f449898d;
        bVar.set(i28 + 6, 33);
        bVar.set(i28 + 2, c01.od.c(string2, ""));
        java.lang.String c17 = c01.od.c(string, "");
        int i29 = bVar.f513848e;
        bVar.set(i29 + 11, c17);
        bVar.set(i29 + 12, c01.od.c(string2, ""));
        bVar.set(i29 + 39, dVar);
        nb5.b bVar2 = new nb5.b();
        bVar2.l(bVar);
        n13.r rVar = new n13.r();
        rVar.f415651b = 1;
        rVar.f415654e = false;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(r07, bVar2, rVar);
    }
}
