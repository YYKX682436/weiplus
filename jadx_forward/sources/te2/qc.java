package te2;

/* loaded from: classes9.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.qc f499897a = new te2.qc();

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e());
        sb6.append("gamewelfaretaskminiapphelper/");
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        byte[] bytes = a17.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            com.p314xaae8f345.mm.vfs.w6.u(sb7);
        }
        return sb7 + "/snapshot";
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String path, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, yz5.l lVar) {
        java.lang.String str;
        android.graphics.Bitmap d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameWelfareTaskMiniAppHelper", "#goMiniApp appId=" + appId + " path=" + path + " version=" + i17 + " extraData=" + gVar);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                try {
                    android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                    d17 = uj5.g.d(decorView, decorView.getWidth(), decorView.getHeight(), false, android.graphics.Bitmap.Config.RGB_565);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GameWelfareTaskMiniAppHelper", th6, "getSnapShot err", new java.lang.Object[0]);
                }
                if (d17 != null) {
                    str = a();
                    if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        com.p314xaae8f345.mm.vfs.w6.h(str);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398547b = appId;
                    b1Var.f398555f = path;
                    b1Var.f398549c = i17;
                    b1Var.f398561i = new te2.nc(gVar);
                    b1Var.H = k91.z3.TRANSPARENT;
                    k91.y3 y3Var = k91.y3.DISABLED;
                    b1Var.S = y3Var;
                    b1Var.T = y3Var;
                    b1Var.U = true;
                    b1Var.f398557g = true;
                    b1Var.f398565k = 1205;
                    b1Var.I = str;
                    b1Var.K = true;
                    b1Var.f398571p = new te2.oc(lVar);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
                }
            }
        }
        str = "";
        l81.b1 b1Var2 = new l81.b1();
        b1Var2.f398547b = appId;
        b1Var2.f398555f = path;
        b1Var2.f398549c = i17;
        b1Var2.f398561i = new te2.nc(gVar);
        b1Var2.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var2 = k91.y3.DISABLED;
        b1Var2.S = y3Var2;
        b1Var2.T = y3Var2;
        b1Var2.U = true;
        b1Var2.f398557g = true;
        b1Var2.f398565k = 1205;
        b1Var2.I = str;
        b1Var2.K = true;
        b1Var2.f398571p = new te2.oc(lVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var2);
    }
}
