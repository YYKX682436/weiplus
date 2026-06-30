package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f83194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f83196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q0 f83197h;

    public p0(com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var, android.app.Activity activity, com.tencent.mm.ui.da daVar, java.lang.String str, boolean z17) {
        this.f83197h = q0Var;
        this.f83193d = activity;
        this.f83194e = daVar;
        this.f83195f = str;
        this.f83196g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f83193d;
        nf.g.a(activity).f(new com.tencent.mm.plugin.appbrand.jsapi.share.o0(this));
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f83195f;
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("scene_from", 19);
        com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var = this.f83197h;
        intent.putExtra("Retr_Compress_Type", q0Var.f83208d);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("wxaInfo", q0Var.f83209e);
        intent.putExtra("weAppSourceUserName", q0Var.f83210f);
        intent.putExtra("Select_Conv_User", q0Var.f83211g);
        if (this.f83196g) {
            ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Bi(intent, q0Var.f83207c);
        }
        java.lang.String appId = q0Var.f83205a.getAppId();
        java.lang.String currentUrl = q0Var.f83205a.t3() instanceof com.tencent.mm.plugin.appbrand.o6 ? q0Var.f83205a.t3().x0().getCurrentPage().getCurrentUrl() : "";
        intent.putExtra("shareImageCurrentAppId", appId);
        intent.putExtra("shareImageCurrentPath", currentUrl);
        intent.putExtra("shareImageSrc", q0Var.f83212h);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(str));
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, q0Var.f83213i.f83225g);
    }
}
