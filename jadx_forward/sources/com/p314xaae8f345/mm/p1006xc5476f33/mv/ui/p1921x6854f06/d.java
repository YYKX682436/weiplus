package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes10.dex */
public class d implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232472a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232472a = activityC16662x5873ebce;
    }

    @Override // db5.c1
    public void e(int i17) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232472a;
        if (i17 == 0) {
            r45.hf2 a17 = activityC16662x5873ebce.E.a(activityC16662x5873ebce.mo55332x76847179());
            ot0.q qVar = new ot0.q();
            qVar.f430199i = 76;
            qVar.f430187f = a17.m75945x2fec8307(0);
            qVar.f430191g = a17.m75945x2fec8307(1);
            qVar.Z = a17.m75945x2fec8307(12);
            qVar.f430207k = a17.m75945x2fec8307(4) != null ? a17.m75945x2fec8307(4) : "";
            qVar.f430211l = "";
            qVar.V = a17.m75945x2fec8307(2) != null ? a17.m75945x2fec8307(2) : "";
            qVar.W = "";
            qVar.f430179d = "wx5aa333606550dfd5";
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
            i0Var.f273223b = a17.m75945x2fec8307(8);
            i0Var.f273224c = a17.m75945x2fec8307(6);
            i0Var.f273237p = a17.m75945x2fec8307(18);
            i0Var.f273227f = a17.m75945x2fec8307(8);
            i0Var.f273223b = a17.m75945x2fec8307(8);
            i0Var.f273224c = a17.m75945x2fec8307(6);
            i0Var.f273229h = a17.m75945x2fec8307(1);
            i0Var.f273230i = a17.m75945x2fec8307(7);
            i0Var.f273231j = a17.m75945x2fec8307(9);
            i0Var.f273232k = java.lang.String.valueOf(a17.m75942xfb822ef2(11));
            i0Var.f273233l = a17.m75945x2fec8307(13);
            i0Var.f273235n = a17.m75939xb282bd08(14);
            i0Var.f273234m = a17.m75945x2fec8307(12);
            i0Var.f273236o = ((r45.if2) a17.m75936x14adae67(17)) != null ? ((r45.if2) a17.m75936x14adae67(17)).m75945x2fec8307(0) : "";
            i0Var.f273238q = "wx485a97c844086dc9";
            qVar.f(i0Var);
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", u17);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232473a;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232474b.f141854q = 0L;
            d0Var.a(254);
            j45.l.v(activityC16662x5873ebce.mo55332x76847179(), ".ui.transmit.MsgRetransmitUI", intent, 1);
            return;
        }
        if (i17 != 1) {
            return;
        }
        r45.hf2 a18 = activityC16662x5873ebce.E.a(activityC16662x5873ebce.mo55332x76847179());
        r45.xs4 xs4Var = new r45.xs4();
        b21.r rVar = activityC16662x5873ebce.f232440m;
        xs4Var.set(4, a18.m75945x2fec8307(1));
        xs4Var.set(5, a18.m75945x2fec8307(7));
        xs4Var.set(7, a18.m75945x2fec8307(9));
        xs4Var.set(8, java.lang.Long.valueOf(a18.m75942xfb822ef2(11)));
        xs4Var.set(9, a18.m75945x2fec8307(13));
        xs4Var.set(10, java.lang.Integer.valueOf(a18.m75939xb282bd08(14)));
        xs4Var.set(6, a18.m75945x2fec8307(12));
        xs4Var.set(12, ((r45.if2) a18.m75936x14adae67(17)) != null ? ((r45.if2) a18.m75936x14adae67(17)).m75945x2fec8307(0) : "");
        xs4Var.set(11, a18.m75945x2fec8307(18));
        xs4Var.set(17, "wx485a97c844086dc9");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0 d0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232473a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232474b.f141854q = 0L;
        d0Var2.a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16662x5873ebce.mo55332x76847179();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423();
        c11288x597a4423.f33185x324c710a = rVar.f98887p;
        c11288x597a4423.f33182xc58aab80 = rVar.f98885n;
        java.lang.String str = rVar.f98886o;
        c11288x597a4423.f33184xc6370d0b = str;
        c11288x597a4423.f33183xead55f01 = str;
        c11288x597a4423.f33186x239f8b5 = a18.m75945x2fec8307(8);
        c11288x597a4423.f33187x1478a44a = a18.m75945x2fec8307(6);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11288x597a4423;
        c11286x34a5504.f33130x6942258 = a18.m75945x2fec8307(0);
        c11286x34a5504.f33121x993583fc = rVar.f98882h;
        c11286x34a5504.f33125x9b39409a = a18.m75945x2fec8307(12) != null ? a18.m75945x2fec8307(12) : "";
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        java.lang.String f17 = ll3.j2.f(rVar);
        if (f17 == null || !com.p314xaae8f345.mm.vfs.w6.j(f17)) {
            bitmap = null;
        } else {
            java.lang.Float valueOf = java.lang.Float.valueOf(mo55332x76847179.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561400hg));
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(f17, valueOf.intValue(), valueOf.intValue(), 0.0f);
        }
        if (bitmap != null) {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a(bitmap, true);
        } else {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.ar6 : com.p314xaae8f345.mm.R.C30861xcebc809e.ar7), true);
        }
        android.content.Intent intent2 = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f33049x38eb0007 = c11286x34a5504;
        req.mo48427x792022dd(bundle);
        intent2.putExtra("Ksnsupload_timeline", bundle);
        intent2.putExtra("Ksnsupload_musicid", rVar.f98879e);
        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        if (((kt.c) i0Var2).bj(ll3.j2.d(rVar))) {
            intent2.putExtra("Ksnsupload_appid", "wx5aa333606550dfd5");
        }
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        intent2.putExtra("Ksnsupload_appname", ll3.j2.e(rVar));
        java.lang.String a19 = c01.n2.a("music_player");
        c01.n2.d().c(a19, true).i("prePublishId", "music_player");
        intent2.putExtra("reportSessionId", a19);
        intent2.putExtra("Ksnsupload_music_share_object_xml", ((m21.r) ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).wi(xs4Var)).a());
        intent2.putExtra("Ksnsupload_type", 25);
        intent2.putExtra("need_result", true);
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC16662x5873ebce.mo53059x9d6db74d(), ".plugin.sns.ui.SnsUploadUI", intent2, 1, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.e(activityC16662x5873ebce));
    }
}
