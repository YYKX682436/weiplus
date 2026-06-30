package ki4;

/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ki4.g0 f389665a = new ki4.g0();

    public final l81.b1 a(java.lang.String str) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = "gh_390359b3fd13@app";
        b1Var.f398565k = 1209;
        b1Var.f398549c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.b(bm5.h0.RepairerConfig_TextStatus_UsePreviewMiniApp_Int, 0), 1) ? 2 : 0;
        b1Var.f398555f = "pages/detail/detail.html";
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        b1Var.U = true;
        b1Var.I = str;
        return b1Var;
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2, hi4.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        context.toString();
        java.lang.String str3 = "";
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                try {
                    android.view.View decorView = abstractActivityC21394xb3d2c0cf.getWindow().getDecorView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                    android.graphics.Bitmap d17 = uj5.g.d(decorView, decorView.getWidth(), decorView.getHeight(), false, android.graphics.Bitmap.Config.RGB_565);
                    if (d17 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(lp0.b.e());
                        sb6.append("textstatus/");
                        java.lang.String k17 = gm0.j1.b().k();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
                        byte[] bytes = k17.getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        sb6.append(kk.k.g(bytes));
                        java.lang.String sb7 = sb6.toString();
                        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                            com.p314xaae8f345.mm.vfs.w6.u(sb7);
                        }
                        java.lang.String str4 = sb7 + "/snapshot";
                        if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                            com.p314xaae8f345.mm.vfs.w6.h(str4);
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
                        str3 = str4;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusMiniAppService", th6, "getSnapShot err", new java.lang.Object[0]);
                }
            }
        }
        l81.b1 a17 = a(str3);
        a17.f398561i = new ki4.d0(str, eVar, str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, a17);
    }

    public final void c(android.content.Context context, java.util.List list, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        context.toString();
        java.util.Objects.toString(list);
        l81.b1 a17 = a("");
        a17.f398561i = new ki4.f0(list, str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).ij(a17, new ki4.e0());
    }
}
