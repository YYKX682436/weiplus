package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes4.dex */
public final class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6 f156852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f156853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f156854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f156855e;

    public w0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6 j6Var, int i17, java.lang.String str2, android.content.Context context) {
        this.f156851a = str;
        this.f156852b = j6Var;
        this.f156853c = i17;
        this.f156854d = str2;
        this.f156855e = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6 j6Var = this.f156852b;
        if (v5Var == null) {
            if (j6Var != null) {
                j6Var.mo52612x57429edc(-2, "Invalid wxaAttributes");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f156851a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().C1(v5Var);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("finish_direct", true);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("enableAnimation", true);
        intent.putExtra("app_brand_chatting_from_scene_new", this.f156853c);
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = this.f156854d;
        z5Var.f387399d = str;
        z5Var.f387403h = 0;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("showMessageCard", false);
        android.content.Context context = this.f156855e;
        android.app.Activity a18 = q75.a.a(context);
        if (a18 == null) {
            intent.addFlags(268435456);
        }
        if (a18 != null) {
            context = a18;
        } else if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.u(context, ".ui.chatting.AppBrandServiceChattingUI", intent, null);
        if (j6Var != null) {
            j6Var.mo52612x57429edc(0, null);
        }
    }
}
