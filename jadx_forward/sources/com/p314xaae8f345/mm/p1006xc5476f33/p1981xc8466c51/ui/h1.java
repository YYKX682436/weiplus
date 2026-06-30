package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i1 f236948d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i1 i1Var) {
        this.f236948d = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ec5.a aVar;
        com.p314xaae8f345.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        int i18 = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i1 i1Var = this.f236948d;
        if (itemId != 0) {
            if (itemId == 1 && i1Var.f236952d.f236836y != null) {
                ((d73.i) i95.n0.c(d73.i.class)).f6(i1Var.f236952d.f236836y);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = i1Var.f236952d;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.H;
        if (activityC16969x3ace7680.T6() == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace76802 = i1Var.f236952d;
            java.lang.String t17 = bt3.g2.t(activityC16969x3ace76802.f236833v, activityC16969x3ace76802.f236831t, activityC16969x3ace76802.f236830s, 1);
            if (!com.p314xaae8f345.mm.vfs.w6.j(t17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace76803 = i1Var.f236952d;
                dp.a.m125854x26a183b(activityC16969x3ace76803, activityC16969x3ace76803.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccu), 1).show();
                return;
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(t17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                j17 = m17.f294766c;
            }
            if (j17 > com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace76804 = i1Var.f236952d;
                dp.a.m125854x26a183b(activityC16969x3ace76804, activityC16969x3ace76804.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccv), 1).show();
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace76805 = i1Var.f236952d;
        activityC16969x3ace76805.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        if (activityC16969x3ace76805.T6() == 15) {
            intent.putExtra("image_path", activityC16969x3ace76805.U6());
            jd5.c cVar = new jd5.c();
            cVar.r(bt3.g2.t(activityC16969x3ace76805.f236833v, activityC16969x3ace76805.f236831t, activityC16969x3ace76805.f236830s, 1));
            cVar.q(activityC16969x3ace76805.f236833v.f456981y);
            cVar.o(activityC16969x3ace76805.U6());
            i18 = 11;
            aVar = cVar;
        } else if (activityC16969x3ace76805.T6() == 4) {
            intent.putExtra("image_path", activityC16969x3ace76805.U6());
            jd5.c cVar2 = new jd5.c();
            cVar2.r(bt3.g2.t(activityC16969x3ace76805.f236833v, activityC16969x3ace76805.f236831t, activityC16969x3ace76805.f236830s, 1));
            cVar2.q(activityC16969x3ace76805.f236833v.f456981y);
            cVar2.o(activityC16969x3ace76805.U6());
            aVar = cVar2;
        } else {
            intent.putExtra("desc_title", activityC16969x3ace76805.f236833v.f456937d);
            ec5.a aVar2 = new ec5.a();
            e35.g.f329123a.a(activityC16969x3ace76805.f236833v.f456937d, 202);
            aVar2.l(bt3.g2.t(activityC16969x3ace76805.f236833v, activityC16969x3ace76805.f236831t, activityC16969x3ace76805.f236830s, 1));
            n13.v vVar = n13.v.f415673a;
            r45.gp0 gp0Var = activityC16969x3ace76805.f236833v;
            aVar2.k(vVar.b(gp0Var.f456937d, gp0Var.K, gp0Var.R));
            i18 = 3;
            aVar = aVar2;
        }
        intent.putExtra("Retr_Msg_Type", i18);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC16969x3ace76805, aVar, n13.r.a(1001));
    }
}
