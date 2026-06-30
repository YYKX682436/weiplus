package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public final class w0 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j6 f75319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f75322e;

    public w0(java.lang.String str, com.tencent.mm.plugin.appbrand.service.j6 j6Var, int i17, java.lang.String str2, android.content.Context context) {
        this.f75318a = str;
        this.f75319b = j6Var;
        this.f75320c = i17;
        this.f75321d = str2;
        this.f75322e = context;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.service.j6 j6Var = this.f75319b;
        if (v5Var == null) {
            if (j6Var != null) {
                j6Var.onResult(-2, "Invalid wxaAttributes");
                return;
            }
            return;
        }
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f75318a;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mm.plugin.appbrand.app.r9.ij().C1(v5Var);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("finish_direct", true);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("enableAnimation", true);
        intent.putExtra("app_brand_chatting_from_scene_new", this.f75320c);
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = this.f75321d;
        z5Var.f305866d = str;
        z5Var.f305870h = 0;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("showMessageCard", false);
        android.content.Context context = this.f75322e;
        android.app.Activity a18 = q75.a.a(context);
        if (a18 == null) {
            intent.addFlags(268435456);
        }
        if (a18 != null) {
            context = a18;
        } else if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.u(context, ".ui.chatting.AppBrandServiceChattingUI", intent, null);
        if (j6Var != null) {
            j6Var.onResult(0, null);
        }
    }
}
