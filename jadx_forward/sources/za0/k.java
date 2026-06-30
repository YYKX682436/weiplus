package za0;

@j95.b
/* loaded from: classes11.dex */
public class k extends i95.w implements ab0.b0, ab0.z, ab0.c0 {
    public ab0.e0 Ai() {
        return ((i41.l) i95.n0.c(i41.l.class)).Ui();
    }

    public void Bi(r45.b50 b50Var) {
        int i17 = b50Var.f452063d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.o.f230234a;
        if (i17 != 400) {
            if (i17 == 402) {
                r45.nc0 nc0Var = new r45.nc0();
                try {
                    nc0Var.mo11468x92b714fd(b50Var.f452064e.f453374f.f273689a);
                    boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20208x3c52dcee()) == 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact user:%s isDelContactDelConv：%s", nc0Var.f462773d, java.lang.Boolean.valueOf(z17));
                    oVar.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(nc0Var.f462773d, true));
                    if (z17) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(nc0Var.f462773d);
                    }
                    c01.e2.G0(nc0Var.f462773d);
                    return;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact error:%s", e17);
                    return;
                }
            }
            if (i17 == 403) {
                try {
                    r45.uz4 uz4Var = new r45.uz4();
                    uz4Var.mo11468x92b714fd(b50Var.f452064e.f453374f.f273689a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact %s", uz4Var.f469289d);
                    t41.c.c(uz4Var, -1, uz4Var.f469290e);
                    return;
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact error:%s", e18);
                    return;
                }
            }
            if (i17 == 404) {
                r45.a05 a05Var = new r45.a05();
                try {
                    a05Var.mo11468x92b714fd(b50Var.f452064e.f453374f.f273689a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact %s", a05Var.f451114d);
                    gm0.j1.n().f354821b.g(new l41.x(a05Var.f451114d, "", ""));
                    return;
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact error:%s", e19);
                    return;
                }
            }
            return;
        }
        r45.a05 a05Var2 = new r45.a05();
        try {
            a05Var2.mo11468x92b714fd(b50Var.f452064e.f453374f.f273689a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact %s", a05Var2.f451114d);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 a17 = l41.j0.a(a05Var2);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a17.d1(), true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, type2:%s, wordingId:%s, typeInConv:%s, type2InConv:%s isMute:%s", a17.d1(), a17.P0(), a17.w0(), java.lang.Integer.valueOf(a17.m43619x2fa78b11()), java.lang.Integer.valueOf(a17.I), a17.Q0(), a17.J1, java.lang.Integer.valueOf(a17.I1), java.lang.Integer.valueOf(a17.m124896xfb85f7b0()), java.lang.Long.valueOf(a17.c1()), a17.G0(), java.lang.Boolean.valueOf(a17.z2()), java.lang.Boolean.valueOf(a17.A2()), java.lang.Boolean.valueOf(c01.e2.P(a17)));
            if ((n17 == null || n17.r2() || !a17.r2()) ? false : true) {
                oVar.b(a17);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(a17);
            if (a17.r2()) {
                java.lang.String d17 = a17.d1();
                com.p314xaae8f345.mm.p2621x8fb0427b.o7 o7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.o7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
                if (o7Var != null) {
                    boolean k17 = o7Var.k1(d17, 1);
                    if (!k17) {
                        k17 = o7Var.k1(a17.J0(), 1);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact, update state(ADDED) FMessageConversation, ret = " + k17);
                }
            }
            if (!a17.w2()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(a17.d1());
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(a17.d1())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Openim.NetsceneOpenIMSync", "openim_processModContact is already placeTop");
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(a17.d1());
            }
            ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).bj(a17.d1(), n17);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(a05Var2.f451127t, a05Var2.f451129v, 0);
            l41.j0.c(a05Var2);
            l41.j0.e(a05Var2);
            l41.j0.d(a05Var2);
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(a17.d1());
            if (z07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                return;
            }
            java.lang.String str = z07.f66692x4854b29d;
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d18 = a17.d1();
            ((np.h) e4Var).getClass();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.t(d18, str));
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).y0(a17.d1());
            a17.n1(z07.f66692x4854b29d);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(a17);
        } catch (java.io.IOException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact error:%s", e27);
        }
    }

    public ab0.a Di(android.content.Context context, java.lang.String str, int i17, byte[] bArr, java.lang.String str2, boolean z17, ab0.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        cb0.e eVar = new cb0.e(context, str, i17, bArr, str2, z17, f0Var);
        eVar.d();
        return eVar;
    }

    public ab0.d0 wi() {
        return ((i41.l) i95.n0.c(i41.l.class)).Ri();
    }
}
