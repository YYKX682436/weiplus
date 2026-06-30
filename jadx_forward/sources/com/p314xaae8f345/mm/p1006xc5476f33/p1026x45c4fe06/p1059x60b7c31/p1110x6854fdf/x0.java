package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 f164833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.da f164834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 f164835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164836h;

    public x0(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var, com.p314xaae8f345.mm.ui.da daVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        this.f164832d = activity;
        this.f164833e = a1Var;
        this.f164834f = daVar;
        this.f164835g = t0Var;
        this.f164836h = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f164832d;
        nf.g a17 = nf.g.a(activity);
        com.p314xaae8f345.mm.ui.da daVar = this.f164834f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var = this.f164833e;
        a17.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w0(a1Var, daVar));
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var = this.f164835g;
        intent.putExtra("Retr_File_Name", t0Var.f164772g);
        intent.putExtra("scene_from", 19);
        intent.putExtra("Retr_Compress_Type", t0Var.f164771f);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("wxaInfo", t0Var.f164773h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164836h;
        intent.putExtra("KSendWording", yVar.getF229340d().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4x));
        if (yVar.mo32091x9a3f0ba2() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = yVar.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
            intent.putExtra("shareImageCurrentPath", m52169xfdaa7672 != null ? m52169xfdaa7672.mo14683xad58292c() : null);
        }
        intent.putExtra("shareImageCurrentAppId", yVar.mo48798x74292566());
        intent.putExtra("shareImageSrc", t0Var.f164772g);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(t0Var.f164772g));
        intent.putExtra("Select_Conv_User", t0Var.f164769d);
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, a1Var.f164640g);
    }
}
