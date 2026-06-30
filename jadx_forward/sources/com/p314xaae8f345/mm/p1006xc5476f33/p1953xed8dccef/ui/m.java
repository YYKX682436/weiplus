package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes12.dex */
public class m implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n f234847a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n nVar) {
        this.f234847a = nVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n nVar = this.f234847a;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592 activityC16811x11add592 = nVar.f234850d;
            activityC16811x11add592.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", "");
            intent.putExtra("Retr_Msg_Type", 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16811x11add592.T6())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallGalleryUI", "url is null or nil");
                return;
            }
            intent.putExtra("Retr_File_Name", activityC16811x11add592.T6());
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            j45.l.u(activityC16811x11add592, ".ui.transmit.MsgRetransmitUI", intent, null);
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592 activityC16811x11add5922 = nVar.f234850d;
            java.lang.String T6 = activityC16811x11add5922.T6();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallGalleryUI", "save error.");
                return;
            } else {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(T6, activityC16811x11add5922, null);
                return;
            }
        }
        if (i17 != 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592 activityC16811x11add5923 = nVar.f234850d;
        java.lang.String T62 = activityC16811x11add5923.T6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T62)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallGalleryUI", "file path invalid");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T62);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", T62, 9);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.h0(2);
            gp0Var.A0(T62);
            gp0Var.e0(kk.k.g((gp0Var.toString() + 2 + java.lang.System.currentTimeMillis()).getBytes()));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 27;
            z9Var.f90066f = gp0Var;
            c5432x35bb364f.e();
            java.lang.String str = c5432x35bb364f.f135777h.f87670d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(T62, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, str, true);
            gp0Var.B0(str);
            jq0Var.e(c01.z1.r());
            jq0Var.j(c01.z1.r());
            jq0Var.g(9);
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            bq0Var.f452497f.add(gp0Var);
            c4Var.f87851d = gp0Var.f456937d;
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 2;
        }
        c4Var.f87860m = 4;
        c4Var.f87856i = activityC16811x11add5923;
        c5303xc75d2f73.e();
    }
}
