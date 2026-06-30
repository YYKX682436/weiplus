package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f83301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.t0 f83302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83303h;

    public x0(android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, com.tencent.mm.ui.da daVar, com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var, com.tencent.mm.plugin.appbrand.y yVar) {
        this.f83299d = activity;
        this.f83300e = a1Var;
        this.f83301f = daVar;
        this.f83302g = t0Var;
        this.f83303h = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f83299d;
        nf.g a17 = nf.g.a(activity);
        com.tencent.mm.ui.da daVar = this.f83301f;
        com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var = this.f83300e;
        a17.f(new com.tencent.mm.plugin.appbrand.jsapi.share.w0(a1Var, daVar));
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.jsapi.share.t0 t0Var = this.f83302g;
        intent.putExtra("Retr_File_Name", t0Var.f83239g);
        intent.putExtra("scene_from", 19);
        intent.putExtra("Retr_Compress_Type", t0Var.f83238f);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("wxaInfo", t0Var.f83240h);
        com.tencent.mm.plugin.appbrand.y yVar = this.f83303h;
        intent.putExtra("KSendWording", yVar.getF147807d().getResources().getString(com.tencent.mm.R.string.a4x));
        if (yVar.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = yVar.getRuntime().x0().getCurrentPage();
            intent.putExtra("shareImageCurrentPath", currentPage != null ? currentPage.getCurrentUrl() : null);
        }
        intent.putExtra("shareImageCurrentAppId", yVar.getAppId());
        intent.putExtra("shareImageSrc", t0Var.f83239g);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(t0Var.f83239g));
        intent.putExtra("Select_Conv_User", t0Var.f83236d);
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, a1Var.f83107g);
    }
}
