package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class e4 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, pt.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270402d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270403e;

    /* renamed from: f, reason: collision with root package name */
    public final long f270404f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f270405g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f270406h;

    /* renamed from: i, reason: collision with root package name */
    public final dn.h f270407i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f270408m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f270409n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f270410o;

    /* renamed from: p, reason: collision with root package name */
    public final int f270411p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a f270412q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930 f270413r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052 f270414s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 f270415t;

    public e4(java.lang.String str, long j17, boolean z17, dn.h hVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 d4Var, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        this.f270404f = 0L;
        this.f270405g = "";
        this.f270407i = null;
        this.f270408m = null;
        this.f270409n = null;
        this.f270410o = false;
        this.f270411p = 0;
        this.f270415t = null;
        this.f270404f = j17;
        this.f270405g = str;
        this.f270406h = str2;
        this.f270407i = hVar;
        this.f270415t = d4Var;
        this.f270410o = z17;
        this.f270408m = dVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.py5();
        lVar.f152198b = new r45.qy5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f152200d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
        lVar.f152201e = 107;
        lVar.f152202f = 1000000107;
        this.f270402d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig NetSceneSendAppMsgForCdn msgId[%d], sceneResult[%s], sessionId[%s], attachInfo[%s]. stack[%s]", java.lang.Long.valueOf(j17), hVar, str2, dVar, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().f270603e).put(java.lang.Integer.valueOf(hashCode()), new java.lang.Object());
    }

    @Override // pt.n0
    public long a() {
        return this.f270404f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        rt0.b bVar;
        this.f270403e = u0Var;
        java.lang.String str3 = this.f270405g;
        long j17 = this.f270404f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str3, j17);
        this.f270409n = Li;
        long m124847x74d37ac6 = Li.m124847x74d37ac6();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 d4Var = this.f270415t;
        if (m124847x74d37ac6 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene msginfo null id:%d", java.lang.Long.valueOf(j17));
            d4Var.a(3, -1);
            return -1;
        }
        ot0.q v17 = ot0.q.v(this.f270409n.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra doscene AppMessage.Content.parse null id:%d", java.lang.Long.valueOf(j17));
            d4Var.a(3, -1);
            return -1;
        }
        ez.v0 v0Var = ez.v0.f339310a;
        if (v0Var.j(java.lang.Integer.valueOf(v17.f430199i)) && this.f270409n.mo78013xfb85f7b0() == 10000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "stop send revoke msg(%s)", java.lang.Long.valueOf(this.f270409n.m124847x74d37ac6()));
            return -1;
        }
        if (v0Var.j(java.lang.Integer.valueOf(v17.f430199i)) && ((this.f270409n.I0() <= 0 || this.f270409n.P0() != 2) && (bVar = (rt0.b) v17.y(rt0.b.class)) != null && (bVar.f480905b != 0 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f480906c)))) {
            bVar.f480905b = 0L;
            bVar.f480906c = "";
            this.f270409n.d1(ot0.q.u(v17, null, null));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f270409n.m124847x74d37ac6(), this.f270409n);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f270402d;
        r45.py5 py5Var = (r45.py5) oVar.f152243a.f152217a;
        r45.b9 b9Var = new r45.b9();
        b9Var.set(1, v17.f430179d);
        b9Var.set(7, this.f270409n.Q0() + this.f270409n.m124847x74d37ac6() + p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3 + this.f270409n.mo78012x3fdd41df());
        b9Var.set(6, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        b9Var.set(3, this.f270409n.Q0());
        b9Var.set(0, c01.z1.r());
        b9Var.set(4, java.lang.Integer.valueOf(v17.f430199i));
        b9Var.set(2, java.lang.Integer.valueOf(v17.f430183e));
        b9Var.set(9, java.lang.Integer.valueOf(v17.f430239s));
        java.lang.String a17 = ((aq1.d1) po.a.f438812a).a(this.f270409n);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            b9Var.set(11, c01.ia.a(this.f270409n.G));
        } else {
            b9Var.set(11, a17);
        }
        b9Var.set(12, v17.I1);
        b9Var.set(13, v17.J1);
        b9Var.set(14, v17.K1);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar = this.f270412q;
        if (aVar != null) {
            b9Var.set(15, java.lang.Integer.valueOf(aVar.f270323a));
            b9Var.set(16, aVar.f270324b);
        }
        py5Var.set(11, java.lang.Integer.valueOf(this.f270411p));
        c01.l2 a18 = dk5.a1.a(this.f270406h);
        if (a18 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930 c6274x15294930 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930();
            this.f270413r = c6274x15294930;
            java.lang.String str4 = v17.f430207k;
            am.r20 r20Var = c6274x15294930.f136523g;
            r20Var.f89302e = str4;
            r20Var.f89298a = a18.f("prePublishId", "");
            this.f270413r.f136523g.f89300c = a18.f("preUsername", "");
            this.f270413r.f136523g.f89301d = a18.f("preChatName", "");
            this.f270413r.f136523g.f89303f = a18.e("preMsgIndex", 0);
            this.f270413r.f136523g.f89307j = a18.e("sendAppMsgScene", 0);
            this.f270413r.f136523g.f89308k = a18.e("getA8KeyScene", 0);
            this.f270413r.f136523g.f89309l = a18.f("referUrl", null);
            this.f270413r.f136523g.f89310m = a18.f("adExtStr", null);
            this.f270413r.f136523g.f89304g = this.f270409n.Q0();
            this.f270413r.f136523g.f89311n = v17.n();
            this.f270413r.f136523g.f89312o = v17.f430191g;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f270409n.Q0(), true);
            if (n17 != null) {
                this.f270413r.f136523g.f89305h = n17.f2();
            }
            this.f270413r.f136523g.f89306i = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(this.f270409n.Q0());
            if (v17.Y1 != null) {
                r45.td6 td6Var = new r45.td6();
                try {
                    td6Var.mo11468x92b714fd(android.util.Base64.decode(v17.Y1, 0));
                    r45.rd6 rd6Var = td6Var.f467864f;
                    str2 = rd6Var != null ? rd6Var.f466285d : "";
                } catch (java.lang.Exception unused) {
                }
                java.util.Locale locale = java.util.Locale.US;
                am.r20 r20Var2 = this.f270413r.f136523g;
                java.lang.String str5 = r20Var2.f89298a;
                java.lang.String str6 = r20Var2.f89300c;
                java.lang.String str7 = r20Var2.f89301d;
                py5Var.set(7, java.lang.String.format(locale, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", str5, str6, str7, java.lang.Integer.valueOf(c01.h2.a(str6, str7)), java.lang.Integer.valueOf(this.f270413r.f136523g.f89308k), str2));
            }
            str2 = "";
            java.util.Locale locale2 = java.util.Locale.US;
            am.r20 r20Var22 = this.f270413r.f136523g;
            java.lang.String str52 = r20Var22.f89298a;
            java.lang.String str62 = r20Var22.f89300c;
            java.lang.String str72 = r20Var22.f89301d;
            py5Var.set(7, java.lang.String.format(locale2, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", str52, str62, str72, java.lang.Integer.valueOf(c01.h2.a(str62, str72)), java.lang.Integer.valueOf(this.f270413r.f136523g.f89308k), str2));
        }
        if (a18 == null || v17.f430199i != 33) {
            i17 = 0;
        } else {
            this.f270414s = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052();
            int e17 = a18.e("fromScene", 1);
            this.f270414s.f135516g.f89768d = e17;
            a18.e("appservicetype", 0);
            this.f270414s.f135516g.getClass();
            java.lang.String f17 = a18.f("preChatName", "");
            if (2 == e17) {
                java.lang.String f18 = a18.f("preUsername", "");
                this.f270414s.f135516g.f89770f = f17 + ":" + f18;
            } else {
                this.f270414s.f135516g.f89770f = f17;
            }
            java.lang.String Q0 = this.f270409n.Q0();
            i17 = 0;
            boolean d17 = a18.d("moreRetrAction", false);
            if (Q0.endsWith("@chatroom")) {
                this.f270414s.f135516g.f89772h = d17 ? 5 : 2;
            } else {
                this.f270414s.f135516g.f89772h = d17 ? 4 : 1;
            }
            am.w wVar = this.f270414s.f135516g;
            wVar.f89769e = v17.f430270z2 + 1;
            wVar.f89771g = v17.f430202i2;
            wVar.f89765a = v17.f430206j2;
            wVar.f89766b = v17.f430210k2;
            wVar.f89767c = v17.A2;
            wVar.f89774j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            am.w wVar2 = this.f270414s.f135516g;
            wVar2.f89775k = 1;
            wVar2.f89776l = v17.f430222n2;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f270409n;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(Di.o2(f9Var, bm5.f0.f104097i, f9Var.z0()));
        if (n07 != null) {
            i18 = n07.outWidth;
            i17 = n07.outHeight;
        } else {
            i18 = i17;
        }
        dn.h hVar = this.f270407i;
        if (hVar.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn app sceneResult crc[%d], safecdn[%b], hitcachetype[%d], aeskey[%s]", java.lang.Integer.valueOf(hVar.f69525x419c7893), java.lang.Boolean.valueOf(hVar.f69565x50c91291), java.lang.Integer.valueOf(hVar.f69501xb9d727af), hVar.f69502xf11df5f5);
            hVar.f69502xf11df5f5 = "";
            py5Var.set(8, 1);
        }
        py5Var.set(9, java.lang.Integer.valueOf(hVar.f69525x419c7893));
        if (this.f270410o) {
            str = "@cdn_" + hVar.f69522xf9dbbe9c + "_" + hVar.f69502xf11df5f5 + "_1";
        } else {
            str = null;
        }
        b9Var.set(5, ot0.q.t(v17, str, hVar, i18, i17));
        py5Var.set(1, b9Var);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f270408m;
        if (dVar != null && (v17.f430247u != 0 || v17.f430215m > 26214400)) {
            py5Var.set(6, dVar.f68111xda9bc3b3);
            py5Var.set(5, 7);
        }
        py5Var.set(4, v17.f430243t);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69526x419c9c3d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig sceneResult filemd5 is null use content.filemd5[%s]", v17.f430243t);
        } else {
            py5Var.set(4, hVar.f69526x419c9c3d);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(this.f270409n.Q0())) {
            py5Var.set(12, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(this.f270409n.Q0()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig file md5[%s], HitMd5[%d], signature[%s], type[%d], sceneResult[%s], fromScene[%s]", py5Var.m75945x2fec8307(4), java.lang.Integer.valueOf(py5Var.m75939xb282bd08(8)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(py5Var.m75945x2fec8307(6)), java.lang.Integer.valueOf(py5Var.m75939xb282bd08(5)), this.f270407i, py5Var.m75945x2fec8307(7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "Req MsgSource %s", ((r45.b9) py5Var.m75936x14adae67(1)).m75945x2fec8307(11));
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f270404f, this.f270405g), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String r17;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s], newContent[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(this.f270404f), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f270409n.j()), ((r45.b9) ((r45.py5) oVar.f152243a.f152217a).m75936x14adae67(1)).m75945x2fec8307(5));
        r45.qy5 qy5Var = (r45.qy5) oVar.f152244b.f152233a;
        if (qy5Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(qy5Var.m75939xb282bd08(11));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f270409n.Q0(), this.f270409n.m124847x74d37ac6());
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == 102) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn MM_ERR_GET_AESKEY_FAILED");
                this.f270403e.mo815x76e0bfae(i18, i19, str, this);
                this.f270415t.a(i18, i19);
                return;
            }
            Li.r1(5);
            bu.a.e(Li.m124847x74d37ac6(), bu.a.c(i19, i18, str, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig send app msg failed, err=" + i18 + "," + i19);
            this.f270403e.mo815x76e0bfae(i18, i19, str, this);
            this.f270415t.a(i18, i19);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn svrid[%d]. aeskey[%s], old content[%s]", java.lang.Long.valueOf(qy5Var.m75942xfb822ef2(8)), qy5Var.m75945x2fec8307(9), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(Li.j()));
        dn.h hVar = this.f270407i;
        if (hVar != null && hVar.b()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qy5Var.m75945x2fec8307(9))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn need aeskey but ret null");
            } else {
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null) {
                    v17.T = qy5Var.m75945x2fec8307(9);
                    Li.d1(ot0.q.u(v17, null, null));
                    if (v17.f430199i == 5 && v17.f430167J == 0) {
                        Li.d1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w0.b(0, Li.Q0(), Li.A0() == 1, Li.j()));
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn aeskey[%s], new content[%s]", qy5Var.m75945x2fec8307(9), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(Li.j()));
            }
        }
        Li.r1(2);
        Li.o1(qy5Var.m75942xfb822ef2(8));
        c01.ia.P(Li, qy5Var.m75945x2fec8307(10), false);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(Li.m124847x74d37ac6());
        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.a(Li, ot0.u.a(Li));
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).pj(Li, true);
        this.f270403e.mo815x76e0bfae(i18, i19, str, this);
        this.f270415t.a(i18, i19);
        if (Li.n2()) {
            e35.g gVar = e35.g.f329123a;
            if (Li.m124847x74d37ac6() > 0) {
                java.lang.String Q0 = Li.Q0();
                if (!(Q0 == null || r26.n0.N(Q0))) {
                    java.lang.Integer num = (java.lang.Integer) e35.g.f329125c.remove(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(Li.m124847x74d37ac6(), Li.Q0()));
                    if (num == null) {
                        num = 0;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    int intValue = num.intValue();
                    v05.b bVar = new v05.b();
                    java.lang.String j17 = Li.j();
                    java.lang.String str2 = "";
                    if (j17 == null) {
                        j17 = "";
                    }
                    bVar.m126728xdc93280d(j17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportSendFinish ");
                    int i27 = bVar.f513848e;
                    int i28 = i27 + 8;
                    v05.a aVar = (v05.a) bVar.m75936x14adae67(i28);
                    sb6.append(aVar != null ? aVar.s() : null);
                    sb6.append(' ');
                    sb6.append(bVar.m75945x2fec8307(bVar.f449898d + 2));
                    sb6.append(' ');
                    sb6.append(intValue);
                    sb6.append(", ");
                    sb6.append(Li.m124847x74d37ac6());
                    sb6.append(", ");
                    sb6.append(Li.Q0());
                    sb6.append(", ");
                    sb6.append(Li.I0());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSourceReporter", sb6.toString());
                    e35.g.f329124b.clear();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6855x3f37011a c6855x3f37011a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6855x3f37011a();
                    c6855x3f37011a.f141737d = c6855x3f37011a.b("ToUsername", Li.Q0(), true);
                    v05.a aVar2 = (v05.a) bVar.m75936x14adae67(i28);
                    c6855x3f37011a.f141738e = aVar2 != null ? aVar2.m75942xfb822ef2(aVar2.f449897d + 0) : 0L;
                    v05.a aVar3 = (v05.a) bVar.m75936x14adae67(i28);
                    if (aVar3 != null && (r17 = aVar3.r()) != null) {
                        str2 = r17;
                    }
                    c6855x3f37011a.f141739f = c6855x3f37011a.b("FileExt", str2, true);
                    c6855x3f37011a.f141740g = intValue;
                    c6855x3f37011a.f141741h = c6855x3f37011a.b("FileId", bVar.m75945x2fec8307(i27 + 24) + '_' + Li.mo78012x3fdd41df(), true);
                    c6855x3f37011a.f141742i = c6855x3f37011a.b("MsgSvrId", java.lang.String.valueOf(Li.I0()), true);
                    c6855x3f37011a.k();
                }
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930 c6274x15294930 = this.f270413r;
        if (c6274x15294930 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6274x15294930.f136523g.f89302e)) {
            this.f270413r.f136523g.f89299b = "msg_" + java.lang.Long.toString(qy5Var.m75942xfb822ef2(8));
            this.f270413r.e();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5166x9fda1052 c5166x9fda1052 = this.f270414s;
        if (c5166x9fda1052 != null) {
            c5166x9fda1052.f135516g.f89773i = "msg_" + Li.I0();
            this.f270414s.e();
        }
        ot0.q v18 = ot0.q.v(Li.j());
        if (v18 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(Li.Q0())) {
                ot0.a aVar4 = (ot0.a) v18.y(ot0.a.class);
                if (aVar4 != null && aVar4.K) {
                    kn.j0.a(Li, v18);
                }
                ((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Zi(Li);
            }
            if (ez.v0.f339310a.j(java.lang.Integer.valueOf(v18.f430199i))) {
                ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(v18, Li, 6));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public e4(java.lang.String str, long j17, boolean z17, dn.h hVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d4 d4Var, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        this(str, j17, z17, hVar, d4Var, str2, dVar);
        this.f270411p = i17;
        this.f270412q = aVar;
    }
}
