package com.tencent.mm.modelsimple;

/* loaded from: classes5.dex */
public class d1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f71306n = new com.tencent.mm.sdk.platformtools.n3("deleteRevokeMessageThread");

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71307d;

    /* renamed from: e, reason: collision with root package name */
    public final long f71308e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71309f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f71310g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71311h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f71312i;

    /* renamed from: m, reason: collision with root package name */
    public final long f71313m;

    /* JADX WARN: Removed duplicated region for block: B:13:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1(com.tencent.mm.storage.f9 r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelsimple.d1.<init>(com.tencent.mm.storage.f9, java.lang.String, java.lang.String):void");
    }

    public static boolean H(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var != null) {
            return f9Var.getType() == 1 || f9Var.getType() == 16777265 || f9Var.getType() == 822083633 || f9Var.getType() == 805306417 || f9Var.getType() == 1107296305;
        }
        return false;
    }

    public static r15.d I(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        r15.d c17 = ic5.f.f290437c.c(f9Var);
        if (c17 != null) {
            return c17;
        }
        w15.h hVar = new w15.h();
        java.lang.String f27 = f9Var.f2();
        if (f27 == null) {
            f27 = "";
        }
        hVar.fromXml(f27);
        if (hVar.j() == null || hVar.j().j() == null) {
            return null;
        }
        return hVar.j().j();
    }

    public static void J(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, java.lang.String str3) {
        java.util.Map d17;
        if (!H(f9Var)) {
            r15.d I = ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ni() ? I(f9Var) : null;
            f9Var.d1(str);
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) == 1) {
                f9Var.setType(285222674);
                w15.h hVar = new w15.h();
                w15.e eVar = new w15.e();
                w15.d dVar = new w15.d();
                dVar.s(c01.id.a() / 1000);
                dVar.w(str);
                dVar.u("revokemsgcontent");
                eVar.k(dVar);
                hVar.o("revokemsgcontent");
                eVar.l(str);
                hVar.n(eVar);
                if (I != null) {
                    r15.b bVar = new r15.b();
                    bVar.o(I);
                    hVar.l(bVar);
                }
                f9Var.x3(hVar.toXml());
            } else {
                f9Var.setType(268445456);
                f9Var.x3(str);
            }
            tg3.p1.f419206a.d(f9Var);
            return;
        }
        java.lang.String K = f9Var.getType() == 822083633 ? K(str3) : str3;
        int type = f9Var.getType();
        java.lang.String K2 = K(f9Var.G);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) != 1) {
            f9Var.setType(268445458);
            java.lang.String format = java.lang.String.format("<sysmsg type=\"invokeMessage\"><invokeMessage><text><![CDATA[%s]]></text><timestamp><![CDATA[%s]]></timestamp><link><text><![CDATA[%s]]></text></link><preContent><![CDATA[%s]]></preContent><type><![CDATA[%s]]></type><msgSource><![CDATA[%s]]></msgSource></invokeMessage></sysmsg>", str, java.lang.Long.valueOf(c01.id.a()), str2, "", java.lang.Integer.valueOf(type), K2);
            f9Var.d1(K);
            f9Var.x3(format);
            return;
        }
        f9Var.setType(285222674);
        w15.h hVar2 = new w15.h();
        w15.e eVar2 = new w15.e();
        w15.d dVar2 = new w15.d();
        dVar2.s(c01.id.a() / 1000);
        dVar2.u("revokemsgcontent");
        dVar2.p(1);
        dVar2.w(str);
        if (!android.text.TextUtils.isEmpty(K2)) {
            try {
                K2 = new java.lang.String(android.util.Base64.decode(K2, 0));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneRevokeMsg", th6, "parse msgSourceStr err", new java.lang.Object[0]);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(K2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(K2, "msgsource", null)) != null) {
                dVar2.q((java.lang.String) d17.get(".msgsource.atuserlist"));
            }
        }
        dVar2.r(f9Var.I0());
        dVar2.t(type);
        eVar2.k(dVar2);
        eVar2.l(str);
        hVar2.o("revokemsgcontent");
        hVar2.n(eVar2);
        f9Var.x3(hVar2.toXml());
        f9Var.d1(K);
    }

    public static java.lang.String K(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return android.util.Base64.encodeToString(str.getBytes(), 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneRevokeMsg", th6, "safeBase64Encode err:%s", str);
            return "";
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71307d = u0Var;
        return dispatch(sVar, this.f71311h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 594;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (((java.lang.Integer) bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.revoke.RepairerConfigSimulateRevokeResult())).intValue() == 1) {
            r45.xs5 xs5Var = (r45.xs5) this.f71311h.f70711b.f70700a;
            if (xs5Var != null) {
                xs5Var.f390381e = null;
            }
            i18 = 4;
            i19 = -1;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f71309f, this.f71308e);
        cd0.c0 c0Var = cd0.c0.f40528a;
        if (i18 == 0 && i19 == 0) {
            c0Var.a(Li, 1);
        } else {
            c0Var.a(Li, 2);
        }
        if ((i18 == 0 && i19 == 0) || !com.tencent.mm.sdk.platformtools.t8.K0(this.f71312i)) {
            long msgId = Li.getMsgId();
            long j17 = this.f71308e;
            if (msgId == j17) {
                if (Li.getType() == 1090519089) {
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelsimple.a1(this, Li.j(), Li));
                } else {
                    c01.w9.e(Li, false);
                }
                com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(Li);
                r45.xs5 xs5Var2 = (r45.xs5) this.f71311h.f70711b.f70700a;
                if (xs5Var2 == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s， type:%s", java.lang.Long.valueOf(Li.getMsgId()), java.lang.Long.valueOf(Li.I0()), xs5Var2.f390381e, java.lang.Integer.valueOf(Li.getType()));
                int type = Li.getType();
                J(this.f71310g, "  " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g3_), Li, Li.j());
                Li.j1(0);
                Li.y3();
                com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent = new com.tencent.mm.autogen.events.RevokeNativeMsgEvent();
                am.ds dsVar = revokeNativeMsgEvent.f54714g;
                dsVar.f6496a = this.f71308e;
                dsVar.f6498c = this.f71309f;
                revokeNativeMsgEvent.e();
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
                ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Zi(Li.Q0(), Li.getMsgId(), Li.I0());
                java.lang.Object l17 = c01.d9.b().p().l(290818, 0);
                c01.d9.b().p().w(290818, java.lang.Integer.valueOf((l17 != null ? com.tencent.mm.sdk.platformtools.t8.P(l17.toString(), 0) : 0) + 1));
                Li.setType(type);
                if (Li.k2()) {
                    v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                    ot0.u.a(Li);
                    ((u90.a) vVar).getClass();
                    com.tencent.mm.modelstat.e.f71505a.getClass();
                } else {
                    ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                    com.tencent.mm.modelstat.e.f71505a.getClass();
                }
                f71306n.postDelayed(new com.tencent.mm.modelsimple.b1(this, Li), 300000L);
                if (kn.l0.a(M1)) {
                    com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent notifyGroupToolsResetEvent = new com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent();
                    notifyGroupToolsResetEvent.f54547g.f7903a = M1;
                    notifyGroupToolsResetEvent.e();
                }
                if (t21.d3.s() && Li.isVideo()) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = Li.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h17 = t21.d3.h(z07);
                    if (h17 != null && h17.f415004c != this.f71313m) {
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.modelsimple.c1(this, Li, h17));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", java.lang.Long.valueOf(j17));
            }
        } else if (H(Li)) {
            Li.l1(Li.F & (-5));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
        }
        this.f71307d.onSceneEnd(i18, i19, str, this);
    }
}
