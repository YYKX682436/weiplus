package t21;

/* loaded from: classes12.dex */
public class q1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, wf0.h1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f496417d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f496418e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496419f;

    /* renamed from: g, reason: collision with root package name */
    public long f496420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f496421h;

    /* renamed from: i, reason: collision with root package name */
    public final int f496422i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f496423m;

    /* renamed from: n, reason: collision with root package name */
    public final dn.h f496424n;

    /* renamed from: o, reason: collision with root package name */
    public final dn.h f496425o;

    /* renamed from: p, reason: collision with root package name */
    public final m11.a0 f496426p;

    public q1(java.lang.String str, int i17, dn.h hVar, m11.a0 a0Var) {
        this.f496419f = null;
        this.f496422i = 0;
        this.f496424n = null;
        this.f496425o = null;
        this.f496426p = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, hVar != null);
        iz5.a.g(null, a0Var != null);
        this.f496419f = str;
        this.f496424n = hVar;
        this.f496426p = a0Var;
        this.f496422i = i17;
    }

    public r45.xu6 H(t21.v2 v2Var, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String I;
        dn.h hVar;
        java.lang.String str;
        java.util.Map d17;
        this.f496417d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xu6();
        lVar.f152198b = new r45.yu6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadvideo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de;
        lVar.f152201e = 39;
        lVar.f152202f = 1000000039;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f496418e = a17;
        r45.xu6 xu6Var = (r45.xu6) a17.f152243a.f152217a;
        xu6Var.f471978n = 0;
        dn.h hVar2 = this.f496424n;
        xu6Var.f471977m = (int) hVar2.f69523x17c343e7;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        xu6Var.f471979o = cu5Var;
        xu6Var.f471974h = 0;
        xu6Var.f471973g = hVar2.f69562x366b1958;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(new byte[0]);
        xu6Var.f471975i = cu5Var2;
        xu6Var.f471971e = c01.z1.r();
        xu6Var.f471972f = hVar2.f69563x1209e7cb;
        java.lang.String str2 = this.f496419f;
        xu6Var.f471970d = str2;
        if (v2Var.f496555t == 1) {
            xu6Var.f471985s = 2;
        }
        if (v2Var.f496559x == 3) {
            xu6Var.f471985s = 3;
        }
        xu6Var.f471980p = v2Var.f496548m;
        xu6Var.f471983q = com.p314xaae8f345.mm.p971x6de15a2e.y2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 2;
        xu6Var.f471984r = 2;
        xu6Var.f471993y = hVar2.f69562x366b1958;
        java.lang.String str3 = hVar2.f69522xf9dbbe9c;
        xu6Var.f471987u = str3;
        xu6Var.f471990x = str3;
        xu6Var.f471989w = 1;
        if (hVar2.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", K(), java.lang.Boolean.valueOf(hVar2.f69565x50c91291), java.lang.Integer.valueOf(hVar2.f69501xb9d727af), java.lang.Integer.valueOf(hVar2.f69525x419c7893), hVar2.f69502xf11df5f5);
            xu6Var.P = 1;
            xu6Var.f471988v = "";
            xu6Var.B = "";
        } else {
            java.lang.String str4 = hVar2.f69502xf11df5f5;
            xu6Var.f471988v = str4;
            xu6Var.B = str4;
        }
        xu6Var.E = hVar2.f69526x419c9c3d;
        xu6Var.Q = hVar2.f69543x16680d46;
        xu6Var.R = hVar2.f69525x419c7893;
        t21.v2 h17 = t21.d3.h(str2);
        if (h17 == null || h17.K == 0) {
            I = I(h17);
        } else {
            java.lang.String I2 = I(h17);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.u3(I2);
            c01.ia.N(f9Var, c01.ia.E(2), false);
            I = f9Var.G;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.R)) {
            hVar = hVar2;
        } else {
            hVar = hVar2;
            ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).Bi(pt0.f0.Li(h17.f496553r, h17.f496549n), h17.R);
            I = ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).Ai(I, h17.R);
        }
        vf0.w1 w1Var = (vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class));
        java.lang.String str5 = w1Var.f517828d;
        w1Var.f517828d = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoFeatureService", "popForwardSnsId:" + str5);
        long j17 = h17.K;
        if (j17 == 0 || j17 == -1) {
            str = "MicroMsg.NetSceneUploadVideoForCdn";
            if (!str5.isEmpty()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.f496553r, h17.f496549n);
                c01.h7 h7Var = new c01.h7();
                h7Var.f118763e = str5;
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li, h7Var);
                I = ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Ai(Li, I, h7Var);
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
            }
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(h17.f496553r, h17.f496549n);
            c01.h7 h7Var2 = new c01.h7();
            str = "MicroMsg.NetSceneUploadVideoForCdn";
            h7Var2.f118760b = h17.K;
            h7Var2.f118762d = h17.L;
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li2, h7Var2);
            I = ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Ai(Li2, I, h7Var2);
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
        xu6Var.f471986t = I;
        xu6Var.N = v2Var.F;
        java.lang.String str6 = this.f496423m;
        if (str6 != null) {
            xu6Var.f471981p0 = v2Var.f496537c;
            xu6Var.Z = str6;
        }
        dn.h hVar3 = this.f496425o;
        if (hVar3 != null) {
            if (hVar3.b()) {
                xu6Var.f471992x1 = 1;
                xu6Var.f471976l1 = "";
            } else {
                xu6Var.f471976l1 = hVar3.f69502xf11df5f5;
            }
            xu6Var.f471991x0 = hVar3.f69526x419c9c3d;
            xu6Var.f471994y0 = hVar3.f69522xf9dbbe9c;
            xu6Var.f471982p1 = (int) hVar3.f69523x17c343e7;
        }
        xu6Var.B1 = v2Var.Q;
        t21.v2 h18 = t21.d3.h(str2);
        if (h18 != null) {
            java.lang.String g17 = h18.g();
            java.lang.String str7 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "msg", null)) == null) ? null : (java.lang.String) d17.get(".msg.videomsg.$originsourcemd5");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                java.lang.String f17 = h18.f();
                if (com.p314xaae8f345.mm.vfs.w6.j(f17)) {
                    xu6Var.f471995y1 = com.p314xaae8f345.mm.vfs.w6.p(f17);
                }
            } else {
                xu6Var.f471995y1 = str7;
            }
        }
        java.lang.String g18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.g()) ? v2Var.g() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.N) ? m11.a.b(v2Var.N) : "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.g())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "uploadVideo video.recvXml is empty and update: %s", g18);
                v2Var.f496558w = g18;
                t21.d3.Q(v2Var);
            }
            m11.a c17 = m11.a.c(g18);
            if (c17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f404154a)) {
                xu6Var.V = c17.f404154a;
                xu6Var.Y = c17.f404155b;
                xu6Var.X = c17.f404157d;
                xu6Var.W = c17.f404156c;
            }
        }
        dn.h hVar4 = hVar;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(hVar4.f69563x1209e7cb)) {
            xu6Var.U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(hVar4.f69563x1209e7cb);
        }
        r45.uf6 uf6Var = v2Var.E;
        if (uf6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468866d)) {
            java.lang.String str8 = uf6Var.f468866d;
            if (str8 == null) {
                str8 = "";
            }
            xu6Var.F = str8;
            xu6Var.G = uf6Var.f468867e;
            java.lang.String str9 = uf6Var.f468870h;
            if (str9 == null) {
                str9 = "";
            }
            xu6Var.H = str9;
            java.lang.String str10 = uf6Var.f468869g;
            if (str10 == null) {
                str10 = "";
            }
            xu6Var.f471969J = str10;
            java.lang.String str11 = uf6Var.f468868f;
            if (str11 == null) {
                str11 = "";
            }
            xu6Var.I = str11;
            java.lang.String str12 = uf6Var.f468871i;
            if (str12 == null) {
                str12 = "";
            }
            xu6Var.K = str12;
        } else if (uf6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468869g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468868f)) {
            xu6Var.f471969J = uf6Var.f468869g;
            xu6Var.I = uf6Var.f468868f;
        }
        if (uf6Var != null) {
            java.lang.String str13 = uf6Var.f468872m;
            if (str13 == null) {
                str13 = "";
            }
            xu6Var.M = str13;
            java.lang.String str14 = uf6Var.f468873n;
            xu6Var.L = str14 != null ? str14 : "";
        }
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, false);
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(tj6);
        if (n07 != null) {
            xu6Var.A = n07.outWidth;
            xu6Var.f471996z = n07.outHeight;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "cdntra getImageOptions for thumb failed path:%s", tj6);
        }
        tg3.u0 u0Var2 = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        ((k90.b) u0Var2).rj(null, f0Var, str2, false);
        int Ai = t21.i2.wi().Ai(new wf0.l1(str2, f0Var));
        if (Ai == 1) {
            xu6Var.S = 1;
            xu6Var.T = 2;
        } else if (Ai == 2) {
            xu6Var.S = 1;
            xu6Var.T = 1;
        } else if (Ai == 3 || Ai == 6) {
            xu6Var.S = 2;
            xu6Var.T = 3;
        } else if (Ai == 7) {
            xu6Var.S = 3;
            xu6Var.T = 4;
        } else if (Ai != 8) {
            xu6Var.S = 0;
            xu6Var.T = 0;
        } else {
            xu6Var.S = 1;
            xu6Var.T = 5;
        }
        if (h18 != null && h18.g() != null) {
            r15.b bVar = new r15.b();
            bVar.m126729xdc93280d(h18.g(), "msg");
            xu6Var.C1 = bVar.m126747x696739c();
        }
        java.lang.Object[] objArr = new java.lang.Object[23];
        objArr[0] = K();
        objArr[1] = str2;
        objArr[2] = hVar4.f69563x1209e7cb;
        java.lang.String str15 = hVar4.f69502xf11df5f5;
        objArr[3] = java.lang.Integer.valueOf(str15 == null ? -1 : str15.length());
        objArr[4] = hVar4.f69522xf9dbbe9c;
        objArr[5] = java.lang.Integer.valueOf(hVar4.f69562x366b1958);
        objArr[6] = java.lang.Integer.valueOf(xu6Var.A);
        objArr[7] = java.lang.Integer.valueOf(xu6Var.f471996z);
        objArr[8] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(xu6Var.B);
        objArr[9] = java.lang.Integer.valueOf(xu6Var.f471985s);
        objArr[10] = xu6Var.E;
        objArr[11] = java.lang.Integer.valueOf(xu6Var.P);
        objArr[12] = java.lang.Integer.valueOf(xu6Var.R);
        objArr[13] = xu6Var.Q;
        objArr[14] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(xu6Var.f471988v);
        objArr[15] = xu6Var.F;
        objArr[16] = java.lang.Integer.valueOf(xu6Var.G);
        objArr[17] = xu6Var.H;
        objArr[18] = xu6Var.K;
        objArr[19] = xu6Var.f471986t;
        objArr[20] = java.lang.Integer.valueOf(xu6Var.S);
        objArr[21] = java.lang.Integer.valueOf(xu6Var.T);
        objArr[22] = xu6Var.V;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%s summersafecdn cdntra doscene file:%s touser:%s aes:%d fileid:%s thumb:[%d %d %d], thumbaeskey [%s] funcFlag: %d, md5:%s HitMd5:%d CRC32:%d, VideoNewMd5:%s AESKey:%s stream %s streamtime: %d title %s thumburl %s msgSource[%s] msgForwardType[%d] Source[%d], appId[%s]", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Req MsgSource %s", xu6Var.f471986t);
        return xu6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String I(t21.v2 r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L39
            java.lang.String r0 = r11.M
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto Ld
            java.lang.String r11 = r11.M
            goto L3a
        Ld:
            long r0 = r11.K
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L22
            java.lang.String r11 = r11.L     // Catch: java.lang.Throwable -> L39
            com.tencent.mm.storage.f9 r11 = pt0.f0.Li(r11, r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r11.G     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = c01.ia.v(r11)     // Catch: java.lang.Throwable -> L39
            goto L3a
        L22:
            java.lang.String r11 = r11.f()
            java.lang.String r11 = com.p314xaae8f345.mm.vfs.w6.p(r11)
            java.lang.Class<zb0.d0> r0 = zb0.d0.class
            i95.m r0 = i95.n0.c(r0)
            zb0.d0 r0 = (zb0.d0) r0
            yb0.g r0 = (yb0.g) r0
            java.lang.String r11 = r0.Di(r11)
            goto L3a
        L39:
            r11 = 0
        L3a:
            int r0 = r10.f496422i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r11}
            java.lang.String r2 = "MicroMsg.NetSceneUploadVideoForCdn"
            java.lang.String r3 = "createVideoMsgSource preLoadLength: %s, forward uuid %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r1)
            if (r0 <= 0) goto L8a
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r1) goto L52
            goto L8a
        L52:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "<msgsource><videopreloadlen>"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "</videopreloadlen>"
            r1.append(r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r0 != 0) goto L74
            java.lang.String r0 = "<sec_msg_node><uuid>"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = "</uuid></sec_msg_node>"
            r1.append(r11)
        L74:
            java.lang.String r11 = "</msgsource>"
            r1.append(r11)
            com.tencent.mm.plugin.report.service.g0 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r3 = 354(0x162, double:1.75E-321)
            r5 = 35
            r7 = 1
            r9 = 0
            r2.mo68477x336bdfd8(r3, r5, r7, r9)
            java.lang.String r11 = r1.toString()
            return r11
        L8a:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r0 == 0) goto L95
            java.lang.String r11 = c01.ia.n()
            return r11
        L95:
            java.lang.String r11 = c01.ia.o(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.q1.I(t21.v2):java.lang.String");
    }

    public void J(int i17, int i18, int i19, java.lang.String str, r45.yu6 yu6Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        t21.v2 h17;
        int i27;
        if (yu6Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(yu6Var.f472914n);
        }
        final t21.v2 h18 = t21.d3.h(this.f496419f);
        if (h18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd Get INFO FAILED :" + this.f496419f);
            f65.y0.f341552a.l(null, this.f496419f, 5, 0L, 0L, 0L, 0L, false, i19);
            this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
            this.f496426p.a(3, -1, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == 102) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + this.f496419f + " user:" + h18.h());
            f65.y0.f341552a.l(null, this.f496419f, 10, 0L, 0L, 0L, 0L, false, i19);
            this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
            this.f496426p.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == -22) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd BLACK  errtype:" + i18 + " errCode:" + i19 + "  file:" + this.f496419f + " user:" + h18.h());
            t21.d3.D(this.f496419f);
            f65.y0.f341552a.l(null, this.f496419f, 10, 0L, 0L, 0L, 0L, false, i19);
            this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
            this.f496426p.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd SERVER FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + this.f496419f + " user:" + h18.h());
            t21.d3.G(this.f496419f);
            f65.y0.f341552a.l(null, this.f496419f, 10, 0L, 0L, 0L, 0L, false, i19);
            this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
            this.f496426p.a(i18, i19, 0L, "");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i18 + " errCode:" + i19 + "  file:" + this.f496419f + " user:" + h18.h());
            t21.d3.G(this.f496419f);
            f65.y0.f341552a.l(null, this.f496419f, 10, 0L, 0L, 0L, 0L, false, i19);
            this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
            this.f496426p.a(i18, i19, 0L, "");
            return;
        }
        h18.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        h18.f496537c = yu6Var.f472911h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s dkmsgid  set svrmsgid %d -> %d", K(), java.lang.Long.valueOf(h18.f496537c), java.lang.Integer.valueOf(x51.o1.f533598r));
        if (10007 == x51.o1.f533597q && (i27 = x51.o1.f533598r) != 0 && h18.f496537c != 0) {
            h18.f496537c = i27;
            x51.o1.f533598r = 0;
        }
        h18.f496544i = 199;
        h18.U = cc1.y.f4296x366c91de;
        if (this.f496424n.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], old RecvXml[%s]", K(), yu6Var.f472912i, h18.g());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yu6Var.f472912i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn need aeskey but ret null", K());
            } else {
                java.lang.String str2 = ((("<msg><videomsg aeskey=\"" + yu6Var.f472912i + "\" cdnthumbaeskey=\"" + yu6Var.f472912i + "\" cdnvideourl=\"" + this.f496424n.f69522xf9dbbe9c + "\" ") + "cdnthumburl=\"" + this.f496424n.f69522xf9dbbe9c + "\" ") + "length=\"" + this.f496424n.f69523x17c343e7 + "\" ") + "cdnthumblength=\"" + this.f496424n.f69562x366b1958 + "\"/>";
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str2);
                java.lang.String str3 = h18.N;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                java.lang.String str4 = sb6.toString() + "</msg>";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "cdn callback new build cdnInfo:%s", str4);
                h18.f496558w = str4;
                boolean B = t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, this.f496419f, false), this.f496424n.f69522xf9dbbe9c, yu6Var.f472912i);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf((B ? 1 : 2) + 900);
                objArr[1] = java.lang.Integer.valueOf(h18.f496541f);
                g0Var.d(12696, objArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], new RecvXml[%s], saveret[%b]", K(), yu6Var.f472912i, h18.g(), java.lang.Boolean.valueOf(B));
            }
        }
        t21.d3.Q(h18);
        t21.d3.R(h18);
        java.lang.String str5 = h18.S;
        if (t21.d3.s() && this.f496425o != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && (h17 = t21.d3.h(str5)) != null) {
            h17.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            h17.f496544i = 199;
            h17.U = cc1.y.f4296x366c91de;
            t21.d3.Q(h17);
        }
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h18.f496553r, h18.f496549n);
        c01.ia.P(Li, yu6Var.f472913m, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
        ((com.p314xaae8f345.mm.p793x2f25ba7b.a) ((v90.u) i95.n0.c(v90.u.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.e.f153038a.b(Li);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f496418e.f152243a.f152217a;
        if (fVar instanceof r45.xu6) {
            r45.xu6 xu6Var = (r45.xu6) fVar;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xu6Var.C1)) {
                r15.b bVar = new r15.b();
                bVar.m126728xdc93280d(xu6Var.C1);
                ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Vi(bVar, Li);
            }
            ((pc0.g) ((ci0.r) i95.n0.c(ci0.r.class))).wi(this.f496424n == null ? "" : ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, this.f496419f, false), h18.f496537c, xu6Var.f471972f, xu6Var.S, xu6Var.f471982p1);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h18.h(), true);
        if (((n17 == null || ((int) n17.E2) <= 0) ? false : n17.k2()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(h18.h())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s upload to biz :%s", K(), h18.h());
            if (h18.f496537c < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + h18.f496537c + " file:" + this.f496419f + " toUser:" + h18.h());
                f65.y0.f341552a.l(null, this.f496419f, 5, 0L, 0L, 0L, 0L, false, -1);
                t21.d3.G(this.f496419f);
                this.f496426p.a(3, -1, 0L, "");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s not upload to biz", K());
            if (h18.f496537c <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + h18.f496537c + " file:" + this.f496419f + " toUser:" + h18.h());
                f65.y0.f341552a.l(null, this.f496419f, 5, 0L, 0L, 0L, 0L, false, -1);
                t21.d3.G(this.f496419f);
                this.f496426p.a(3, -1, 0L, "");
            }
        }
        f65.y0 y0Var = f65.y0.f341552a;
        java.lang.String str6 = this.f496419f;
        long j17 = yu6Var.f472911h;
        if (str6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSendReporter", "reportSendSuccess: ".concat(str6));
            ((ku5.t0) ku5.t0.f394148d).b(new f65.t0(str6, j17), "MicroMsg.VideoSendReporter");
        }
        this.f496417d.mo815x76e0bfae(i18, i19, str, m1Var);
        if (!t21.d3.t() || this.f496423m == null) {
            this.f496426p.a(0, 0, yu6Var.f472911h, yu6Var.f472913m);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) {
            if (this.f496424n != null) {
                final java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, this.f496419f, false);
                final java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, this.f496419f, false);
                if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "checkC2CPath: filePath=" + rj6 + ", thumbPath=" + tj6);
                    ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: t21.q1$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            zz.b hj6;
                            java.lang.String str7 = tj6;
                            java.lang.String str8 = rj6;
                            t21.q1 q1Var = t21.q1.this;
                            q1Var.getClass();
                            t21.v2 v2Var = h18;
                            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.f());
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = Li;
                            java.lang.String str9 = q1Var.f496419f;
                            if (K0) {
                                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str7);
                                hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str8, f9Var.mo78013xfb85f7b0(), q1Var.f496424n.f69526x419c9c3d, null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "check video thumb dup, fileName = " + str9 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str7, f9Var.mo78013xfb85f7b0(), p17, null).f559224a);
                            } else {
                                hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(v2Var.f(), str8, str7, f9Var.mo78013xfb85f7b0(), v2Var.f496548m, com.p314xaae8f345.mm.vfs.w6.p(v2Var.f()));
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "check video dup, fileName = " + str9 + " result = " + hj6);
                        }
                    });
                }
            }
            if (this.f496425o == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                return;
            }
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, true);
            if (com.p314xaae8f345.mm.vfs.w6.j(Ai)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "checkC2CPath: originVideoPath=".concat(Ai));
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).cj(Ai, Li.mo78013xfb85f7b0(), this.f496425o.f69526x419c9c3d, null, new yz5.l() { // from class: t21.q1$$b
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "check video dup origin, fileName = " + t21.q1.this.f496419f + " result = " + ((zz.b) obj).m180095x9616526c());
                        return null;
                    }
                });
            }
        }
    }

    public final java.lang.String K() {
        return this.f496419f + "_" + hashCode();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.lang.String str = this.f496419f;
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null) {
            this.f496420g = h17.f496549n;
            this.f496421h = h17.f496553r;
            H(h17, u0Var);
            return mo9409x10f9447a(sVar, this.f496418e, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideoForCdn", "Get info Failed file:" + str);
        this.f496426p.a(3, -1, 0L, "");
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f496420g, this.f496421h), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoForCdn", "%s cdntra onGYNetEnd errtype[%d %d]", K(), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        J(i17, i18, i19, str, (r45.yu6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        t21.d3.G(this.f496419f);
    }

    public q1(java.lang.String str, java.lang.String str2, int i17, dn.h hVar, m11.a0 a0Var) {
        this.f496419f = null;
        this.f496422i = 0;
        this.f496424n = null;
        this.f496425o = null;
        this.f496426p = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, hVar != null);
        iz5.a.g(null, a0Var != null);
        this.f496419f = str;
        this.f496424n = hVar;
        this.f496426p = a0Var;
        this.f496422i = i17;
        this.f496423m = str2;
    }

    public q1(java.lang.String str, java.lang.String str2, int i17, dn.h hVar, dn.h hVar2, m11.a0 a0Var) {
        this.f496419f = null;
        this.f496422i = 0;
        this.f496424n = null;
        this.f496425o = null;
        this.f496426p = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, hVar != null);
        iz5.a.g(null, a0Var != null);
        this.f496419f = str;
        this.f496424n = hVar;
        this.f496426p = a0Var;
        this.f496422i = i17;
        this.f496425o = hVar2;
        this.f496423m = str2;
    }
}
