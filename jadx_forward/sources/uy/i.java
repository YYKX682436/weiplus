package uy;

/* loaded from: classes8.dex */
public class i extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.util.Set set = gc5.b.f351999x;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.G == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked, openFile ballInfo:%s", c12886x91aa2b6d);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        long j17 = gc5.b.f352001z + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gc5.b.f352001z = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            gm0.j1.i();
            gc5.b.f352000y = gm0.j1.u().l();
        }
        if (!gc5.b.f352000y) {
            db5.t7.k(context, null);
            return;
        }
        boolean z17 = c12886x91aa2b6d.G.getBoolean("ifAppAttachDownloadUI");
        java.lang.String string = c12886x91aa2b6d.G.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        if (!com.p314xaae8f345.mm.vfs.w6.j(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageFloatBallHelper", "handleBallInfoClicked() %s not exist", string);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.u("");
            u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfe));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(c12886x91aa2b6d);
            return;
        }
        if (!z17) {
            java.lang.String string2 = c12886x91aa2b6d.G.getString("fileExt");
            java.lang.String string3 = c12886x91aa2b6d.G.getString("appId");
            java.lang.String string4 = c12886x91aa2b6d.G.getString("processName");
            boolean z18 = c12886x91aa2b6d.G.getBoolean("showMenu");
            ((d73.i) i95.n0.c(d73.i.class)).Ja(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc.m65045xfd44f917(c12886x91aa2b6d));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(string, string2, 9);
                return;
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).v7(context, string, string2, string3, z18, string4);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        qp1.m.b(intent, c12886x91aa2b6d.G, gc5.b.f351999x);
        intent.getExtras().putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 9);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/floatball/FilesPageFloatBallHelper", "handleBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
