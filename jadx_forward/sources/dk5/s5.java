package dk5;

@j95.b
/* loaded from: classes9.dex */
public class s5 extends i95.w implements tg3.a1 {
    public void Ai(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3) {
        Bi(str, bArr, str2, str3, null, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g, "", false);
    }

    public void Bi(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, java.lang.String str5, boolean z17) {
        java.lang.String str6;
        java.lang.String str7;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sendAppMsg: args error, toUser is null");
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "send: parse app msg content return null");
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "content.attachid %s", v17.f430227p);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p)) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(v17.f430227p, -1L);
            if (V != -1) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(V, dVar);
                if (dVar.f72763xa3c65b86 != V) {
                    dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
                    if (dVar == null || !dVar.f68105x2c1f0acb.equals(v17.f430227p)) {
                        dVar = null;
                    }
                    if (dVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "appAttachInfo1  %s", v17.f430227p);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "appAttachInfo2  %s : %s : %s", v17.f430227p, java.lang.Long.valueOf(dVar.f72763xa3c65b86), dVar.f68099xfeae815);
                    }
                }
            } else {
                dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
                if (dVar == null || !dVar.f68105x2c1f0acb.equals(v17.f430227p)) {
                    dVar = null;
                }
                if (dVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "appAttachInfo3  %s", v17.f430227p);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "appAttachInfo4  %s : %s : %s", v17.f430227p, java.lang.Long.valueOf(dVar.f72763xa3c65b86), dVar.f68099xfeae815);
                }
            }
        }
        if (dVar == null || (str7 = dVar.f68099xfeae815) == null || str7.equals("")) {
            str6 = "";
        } else {
            str6 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(c01.d9.b().d(), v17.n(), v17.f430223o);
            com.p314xaae8f345.mm.vfs.w6.c(dVar.f68099xfeae815, str6);
            java.lang.String str8 = dVar.f68099xfeae815;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "copy from src %s to dest %s size: %s", str8, str6, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str8)));
        }
        ot0.q i17 = ot0.q.i(v17);
        i17.f430239s = 3;
        ot0.a aVar = (ot0.a) i17.y(ot0.a.class);
        if (aVar != null) {
            aVar.K = false;
            aVar.R = str5 != null ? str5 : "";
        }
        zy2.i iVar = (zy2.i) i17.y(zy2.i.class);
        if (iVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f558944b.m75945x2fec8307(0))) {
            r45.gv2 gv2Var = new r45.gv2();
            gv2Var.set(0, java.lang.Boolean.valueOf(z17));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16564xb55e1d5.a())) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(c16564xb55e1d5.a())) {
                    gv2Var.set(3, 3);
                } else {
                    gv2Var.set(3, 2);
                }
            }
            iVar.f558944b.set(30, gv2Var);
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(i17, v17.f430179d, v17.H, str, str6, bArr, str3, "", str4, c16564xb55e1d5).second;
        if (obj != null) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str, (java.lang.Long) obj);
        }
    }

    public void Di(java.lang.String str, java.lang.String str2, boolean z17, r45.kl klVar) {
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20529x1dde7b04()) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard through legacy method");
            Ni(str, str2, z17, klVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "Send ContactCard through new method");
        try {
            iz.e eVar = (iz.e) i95.n0.c(iz.e.class);
            if (eVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendMsgMgr", "IContactCardMsgFeatureService is NULL! Service not registered, fallback to legacy");
                Ni(str, str2, z17, klVar);
                return;
            }
            if (z17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                hz.m mVar = new hz.m(str2, str);
                if (klVar != null) {
                    mVar.f367769d = klVar.mo14344x5f01b1f6();
                }
                hz.d dVar = (hz.d) eVar;
                dVar.aj(dVar.Zi(mVar));
                return;
            }
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str2.split(","));
            byte[] mo14344x5f01b1f6 = klVar != null ? klVar.mo14344x5f01b1f6() : null;
            for (int i17 = 0; i17 < P1.size(); i17++) {
                hz.m mVar2 = new hz.m((java.lang.String) P1.get(i17), str);
                if (mo14344x5f01b1f6 != null) {
                    mVar2.f367769d = mo14344x5f01b1f6;
                }
                hz.d dVar2 = (hz.d) eVar;
                dVar2.aj(dVar2.Zi(mVar2));
            }
        } catch (java.lang.Exception e17) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendMsgMgr", "New method Contactcard Exception: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public final void Ni(java.lang.String str, final java.lang.String str2, boolean z17, r45.kl klVar) {
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str, klVar);
            if (w11.t1.a(str2)) {
                w11.r1 a17 = w11.s1.a(str2);
                a17.g(str2);
                a17.e(b17);
                a17.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a17.c(new yz5.l() { // from class: dk5.s5$$a
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str2, (java.lang.Long) obj);
                        return null;
                    }
                });
                return;
            }
            w11.r1 a18 = w11.s1.a(str2);
            a18.g(str2);
            a18.e(b17);
            a18.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
            a18.f523664f = 0;
            a18.f523667i = 4;
            w11.n1 a19 = a18.a();
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a19);
            a19.a();
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str2.split(","));
        java.lang.String b18 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str, klVar);
        for (int i17 = 0; i17 < P1.size(); i17++) {
            final java.lang.String str3 = (java.lang.String) P1.get(i17);
            if (w11.t1.a(str3)) {
                w11.r1 a27 = w11.s1.a(str3);
                a27.g(str3);
                a27.e(b18);
                a27.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a27.c(new yz5.l() { // from class: dk5.s5$$b
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str3, (java.lang.Long) obj);
                        return null;
                    }
                });
            } else {
                w11.r1 a28 = w11.s1.a(str3);
                a28.g(str3);
                a28.e(b18);
                a28.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a28.f523664f = 0;
                a28.f523667i = 4;
                w11.n1 a29 = a28.a();
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a29);
                a29.a();
            }
        }
    }

    public final void Ri(java.lang.String str, final java.lang.String str2, java.lang.String str3, boolean z17) {
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (w11.t1.a(str2)) {
                w11.r1 a17 = w11.s1.a(str2);
                a17.g(str2);
                a17.e(str3);
                a17.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a17.c(new yz5.l() { // from class: dk5.s5$$d
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str2, (java.lang.Long) obj);
                        return null;
                    }
                });
                return;
            }
            w11.r1 a18 = w11.s1.a(str2);
            a18.g(str2);
            a18.e(str3);
            a18.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
            a18.f523664f = 0;
            a18.f523667i = 4;
            w11.n1 a19 = a18.a();
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a19);
            a19.a();
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str2.split(","));
        for (int i17 = 0; i17 < P1.size(); i17++) {
            final java.lang.String str4 = (java.lang.String) P1.get(i17);
            if (w11.t1.a(str4)) {
                w11.r1 a27 = w11.s1.a(str4);
                a27.g(str4);
                a27.e(str3);
                a27.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a27.c(new yz5.l() { // from class: dk5.s5$$e
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str4, (java.lang.Long) obj);
                        return null;
                    }
                });
            } else {
                w11.r1 a28 = w11.s1.a(str4);
                a28.g(str4);
                a28.e(str3);
                a28.h(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 66 : 42);
                a28.f523664f = 0;
                a28.f523667i = 4;
                w11.n1 a29 = a28.a();
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a29);
                a29.a();
            }
        }
    }

    public void Ui(java.lang.String str, java.lang.String str2) {
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str2.split(","));
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(str);
        if (P1.size() > 0) {
            java.lang.String str3 = (java.lang.String) P1.get(0);
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str3);
            if (P1.size() != 1 || !R4 || a17 == null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it.next();
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar = c5990xd50ae361.f136285g;
                    mtVar.f88895a = str4;
                    mtVar.f88896b = str;
                    mtVar.f88897c = c01.e2.C(str4);
                    mtVar.f88898d = 0;
                    c5990xd50ae361.e();
                }
                return;
            }
            if (w11.t1.a(str3)) {
                w11.r1 a18 = w11.s1.a(str3);
                a18.e(str);
                a18.h(c01.e2.C(str3));
                a18.f523664f = 1;
                a18.f523666h = a17;
                a18.b();
                return;
            }
            w11.r1 a19 = w11.s1.a(str3);
            a19.g(str3);
            a19.e(str);
            a19.h(c01.e2.C(str3));
            a19.f523664f = 1;
            a19.f523666h = a17;
            a19.f523667i = 5;
            a19.a().a();
        }
    }

    public void Vi(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, c01.h7 h7Var) {
        Zi(context, str, str2, i17, str3, str4, h7Var, null);
    }

    public void Zi(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, c01.h7 h7Var, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8) {
        aj(context, str, str2, i17, str3, str4, h7Var, c11131x285e79f8, null);
    }

    public final boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object obj;
        if (!r01.z.m(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "transfer photo account name card to %s", str2);
        ot0.q v17 = ot0.q.v(str3);
        if (v17 != null) {
            android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(v17, "", "", str2, "", null);
            if (I.first != null && (obj = I.second) != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str2, (java.lang.Long) obj);
                return true;
            }
        }
        return false;
    }

    public void aj(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, c01.h7 h7Var, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8, com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256) {
        p15.r rVar;
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", str, str2);
            return;
        }
        if (!c01.d9.b().E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dk5.x5(this, context));
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        i0Var.f386189o = h7Var;
        if (c11126xa77ef256 != null) {
            p15.m mVar = new p15.m();
            mVar.n(c11126xa77ef256.f152791d);
            mVar.l(c11126xa77ef256.f152792e);
            i0Var.f386186l = mVar;
        }
        if (c11131x285e79f8 != null) {
            java.lang.String str5 = c11131x285e79f8.f152806d;
            if (str5.length() == 0) {
                rVar = null;
            } else {
                rVar = new p15.r();
                rVar.l(str5);
                rVar.n(c11131x285e79f8.f152807e);
            }
            i0Var.f386191q = rVar;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            i0Var.f386192r = "";
        }
        java.lang.String r17 = c01.z1.r();
        r70.g gVar = new r70.g(str2, i17, r17 == null ? "" : r17, str, i0Var);
        gVar.f474641j = "msg_mgr_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        c01.sc.d().a(c01.sc.f118993c, null);
    }

    public void b(java.lang.String str, java.lang.String str2, boolean z17, r45.kl klVar) {
        if (!r01.z.m(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "not photo account type");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "send photo account name card to chatting");
        if (z17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            a(str, str2, com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str, klVar));
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str2.split(","));
        java.lang.String b17 = com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(str, klVar);
        for (int i17 = 0; i17 < P1.size(); i17++) {
            a(str, (java.lang.String) P1.get(i17), b17);
        }
    }

    public void bj(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, c01.h7 h7Var) {
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", str, str2);
            return;
        }
        if (!c01.d9.b().E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dk5.w5(this, context));
            return;
        }
        c01.z1.r();
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 4;
        i0Var.f386189o = h7Var;
        i0Var.f386184j = str3;
        java.lang.String r17 = c01.z1.r();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        r70.g gVar = new r70.g(str2, i17, r17 == null ? "" : r17, str == null ? "" : str, i0Var);
        gVar.f474641j = "msg_mgr_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        c01.sc.d().a(c01.sc.f118993c, null);
    }

    public void cj(android.content.Context context, java.lang.String str, java.lang.String str2, c01.h7 h7Var, c01.f7 f7Var) {
        k70.i0 i0Var = new k70.i0();
        i0Var.f386189o = h7Var;
        i0Var.f386190p = f7Var;
        int i17 = (f7Var == null || !f7Var.y()) ? 0 : 1;
        java.lang.String r17 = c01.z1.r();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        r70.g gVar = new r70.g(str2, i17, r17 == null ? "" : r17, str == null ? "" : str, i0Var);
        gVar.f474641j = "send_img_from_fav_data";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
    }

    public void fj(java.lang.String str, java.lang.String str2, int i17, int i18) {
        hj(str, str2, i17, i18, 0L, "", "", "");
    }

    public final void hj(final java.lang.String str, java.lang.String str2, int i17, int i18, long j17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int i19;
        int i27;
        java.util.HashMap hashMap;
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "send msg args error, toUser[%s] content[%s]", str, str2);
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        java.lang.String str6 = null;
        int i28 = 1;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(str2);
            if (a17 != null) {
                i27 = 5;
                hashMap = a17;
                i19 = 1;
            } else {
                i27 = 4;
                hashMap = a17;
                i19 = i18;
            }
        } else {
            i19 = i18;
            i27 = 4;
            hashMap = null;
        }
        if (w11.t1.a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "use ppc send Msg");
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(i17);
            a18.f523664f = i19;
            a18.f523666h = hashMap;
            c01.h7 h7Var = new c01.h7();
            h7Var.f118760b = j17;
            h7Var.f118762d = str3;
            a18.f(h7Var);
            a18.f523673o = str5;
            a18.f523671m = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4);
            a18.f523672n = str4;
            a18.c(new yz5.l() { // from class: dk5.s5$$c
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str, (java.lang.Long) obj);
                    return null;
                }
            });
            return;
        }
        if (!android.text.TextUtils.isEmpty(str3) && j17 > 0) {
            px.a aVar = (px.a) ((qx.d0) i95.n0.c(qx.d0.class));
            aVar.getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str) && str3 != null && j17 > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str3, j17);
                if (qi3.m.c(k17)) {
                    java.lang.String wi6 = aVar.wi(k17);
                    if (!r26.n0.N(wi6)) {
                        str6 = wi6;
                    }
                }
            }
            if (str6 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "sendMsg: claw user forwarding, converting to text summary");
                w11.r1 a19 = w11.s1.a(str);
                a19.g(str);
                a19.e(str6);
                a19.h(i28);
                a19.f523664f = i19;
                a19.f523666h = hashMap;
                a19.f523667i = i27;
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f118760b = j17;
                h7Var2.f118762d = str3;
                a19.f(h7Var2);
                a19.f523673o = str5;
                w11.n1 a27 = a19.a();
                a27.a();
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a27);
            }
        }
        str6 = str2;
        i28 = i17;
        w11.r1 a192 = w11.s1.a(str);
        a192.g(str);
        a192.e(str6);
        a192.h(i28);
        a192.f523664f = i19;
        a192.f523666h = hashMap;
        a192.f523667i = i27;
        c01.h7 h7Var22 = new c01.h7();
        h7Var22.f118760b = j17;
        h7Var22.f118762d = str3;
        a192.f(h7Var22);
        a192.f523673o = str5;
        w11.n1 a272 = a192.a();
        a272.a();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.P6(a272);
    }

    public void ij(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, r45.uf6 uf6Var, boolean z17, boolean z18, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        mj(context, str, str2, str3, i17, i18, uf6Var, z17, z18, str4, str5, c16564xb55e1d5, null, "", null);
    }

    public final void mj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, r45.uf6 uf6Var, boolean z17, boolean z18, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, r45.xz6 xz6Var, java.lang.String str6, tg3.z0 z0Var) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "send vedio context is null");
            return;
        }
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "send vedio args error, toUser[%s] fileName[%s]", str, str2);
            return;
        }
        if (!c01.d9.b().E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            ru5.g gVar = new ru5.g(context);
            gVar.f481334b = ru5.g.f481331j;
            gVar.f(new dk5.t5(this));
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        dk5.c2 c2Var = new dk5.c2();
        ru5.g gVar2 = new ru5.g(context);
        gVar2.f481334b = ru5.g.f481331j;
        android.app.Dialog dialog = (android.app.Dialog) gVar2.f(new dk5.v5(this, c2Var)).g();
        c2Var.f316075b = context;
        c2Var.f316079f = str2;
        c2Var.f316080g = str3;
        c2Var.f316074a = dialog;
        c2Var.f316081h = str;
        c2Var.f316082i = str4;
        c2Var.f316086m = z17;
        c2Var.f316077d = i17 > 0 ? 1 : 0;
        c2Var.f316078e = i18;
        c2Var.f316083j = z18;
        c2Var.f316087n = uf6Var;
        c2Var.f316091r = str5;
        c2Var.f316095v = z0Var;
        c2Var.f316090q = c16564xb55e1d5;
        c2Var.f316097x = xz6Var;
        c2Var.f316098y = str6;
        c2Var.execute(new java.lang.Object[0]);
    }

    public void nj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, boolean z18, java.lang.String str4, java.lang.String str5) {
        ij(context, str, str2, str3, i17, i18, null, z17, z18, str4, str5, null);
    }

    public void oj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, boolean z18, java.lang.String str4, java.lang.String str5, r45.xz6 xz6Var, java.lang.String str6, tg3.z0 z0Var) {
        mj(context, str, str2, str3, i17, i18, null, z17, z18, str4, str5, null, xz6Var, str6, z0Var);
    }

    public void wi(android.content.Context context, int i17, java.util.List list, tg3.x0 x0Var) {
        dk5.y5 y5Var = new dk5.y5(this, context, i17, x0Var);
        l41.t tVar = new l41.t(list);
        gm0.j1.d().a(9146, new dk5.z5(this, y5Var));
        gm0.j1.d().g(tVar);
    }
}
