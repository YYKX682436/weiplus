package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.da f164727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f164729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 f164730h;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 q0Var, android.app.Activity activity, com.p314xaae8f345.mm.ui.da daVar, java.lang.String str, boolean z17) {
        this.f164730h = q0Var;
        this.f164726d = activity;
        this.f164727e = daVar;
        this.f164728f = str;
        this.f164729g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f164726d;
        nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.o0(this));
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f164728f;
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("scene_from", 19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 q0Var = this.f164730h;
        intent.putExtra("Retr_Compress_Type", q0Var.f164741d);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("wxaInfo", q0Var.f164742e);
        intent.putExtra("weAppSourceUserName", q0Var.f164743f);
        intent.putExtra("Select_Conv_User", q0Var.f164744g);
        if (this.f164729g) {
            ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Bi(intent, q0Var.f164740c);
        }
        java.lang.String mo48798x74292566 = q0Var.f164738a.mo48798x74292566();
        java.lang.String mo14683xad58292c = q0Var.f164738a.t3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? q0Var.f164738a.t3().x0().m52169xfdaa7672().mo14683xad58292c() : "";
        intent.putExtra("shareImageCurrentAppId", mo48798x74292566);
        intent.putExtra("shareImageCurrentPath", mo14683xad58292c);
        intent.putExtra("shareImageSrc", q0Var.f164745h);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(str));
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, q0Var.f164746i.f164758g);
    }
}
