package z12;

/* loaded from: classes12.dex */
public class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550914d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550915e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f550916f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f550917g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f550918h = false;

    /* renamed from: i, reason: collision with root package name */
    public final long f550919i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f550920m;

    public y(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, long j17, int i17, int i18) {
        boolean z17 = false;
        this.f550919i = 0L;
        this.f550920m = "";
        if (str2 != null && str2.length() > 0 && c21053xdbf1e5f4 != null) {
            z17 = true;
        }
        iz5.a.g(null, z17);
        this.f550919i = j17;
        this.f550920m = str2;
        this.f550916f = c21053xdbf1e5f4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zt6();
        lVar.f152198b = new r45.au6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendemoji";
        lVar.f152200d = 175;
        lVar.f152201e = 68;
        lVar.f152202f = 1000000068;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f550914d = a17;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().Y2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c21053xdbf1e5f4);
        r45.zt6 zt6Var = (r45.zt6) a17.f152243a.f152217a;
        r45.cj0 cj0Var = new r45.cj0();
        cj0Var.f453113d = c21053xdbf1e5f4.mo42933xb5885648();
        cj0Var.f453121o = str;
        cj0Var.f453118i = str2;
        cj0Var.f453115f = c21053xdbf1e5f4.f68679x22618426;
        cj0Var.f453119m = c21053xdbf1e5f4.j();
        if (c21053xdbf1e5f4.f68683x1d5dc4d == 1) {
            cj0Var.f453119m += "<storeunique>1</storeunique>";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("storeunique", "md5 " + cj0Var.f453113d);
        }
        cj0Var.f453117h = c21053xdbf1e5f4.f68689x2262335f;
        cj0Var.f453122p = c01.ia.n();
        cj0Var.f453123q = i17;
        cj0Var.f453125s = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "NetSceneUploadEmoji: md5 %s, size %s fromScene %d", c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), java.lang.Integer.valueOf(cj0Var.f453125s));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(str2)) {
            cj0Var.f453124r = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(str2);
        }
        int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2) ? 2 : 1;
        int i27 = c21053xdbf1e5f4.f68653x95b20dd4;
        l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
        if (i27 == 50) {
            cj0Var.f453120n = "56,2," + i19;
        } else if (i27 == 49) {
            cj0Var.f453120n = "56,1," + i19;
        }
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str2, j17);
            r15.b bVar = new r15.b();
            bVar.m126729xdc93280d(Li.j(), "msg");
            if (bVar.n() != null) {
                cj0Var.f453126t = bVar.m126747x696739c();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.emoji.NetSceneUploadEmoji", "", e17);
        }
        zt6Var.f473902e.add(cj0Var);
        zt6Var.f473901d = zt6Var.f473902e.size();
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6 r6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6.class);
        java.lang.String md52 = c21053xdbf1e5f4.mo42933xb5885648();
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4 l4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.l4) r6Var;
        l4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        synchronized (l4Var.Ai()) {
            l4Var.Ai().remove(md52);
            l4Var.Ai().addFirst(md52);
            while (l4Var.Ai().size() >= 12) {
                l4Var.Ai().removeLast();
            }
            l4Var.Bi(l4Var.Ai());
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        byte[] D0;
        this.f550915e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550914d;
        r45.cj0 cj0Var = (r45.cj0) ((r45.zt6) oVar.f152243a.f152217a).f473902e.get(0);
        if (this.f550917g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + cj0Var.f453113d);
            cj0Var.f453116g = new r45.cu5();
            cj0Var.f453114e = 0;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f550916f;
        int i17 = c21053xdbf1e5f4.f68679x22618426;
        int i18 = c21053xdbf1e5f4.f68681x29d3a4dd;
        int i19 = i17 - i18;
        if (i19 > 8192) {
            i19 = 8192;
        }
        if ((c21053xdbf1e5f4.f68678x13320507 & 1) == 1) {
            byte[] z17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(c21053xdbf1e5f4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(z17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
                D0 = new byte[0];
            } else {
                D0 = new byte[i19];
                int length = z17.length;
                java.lang.System.arraycopy(z17, c21053xdbf1e5f4.f68681x29d3a4dd, D0, 0, i19);
            }
        } else {
            D0 = c21053xdbf1e5f4.D0(i18, i19);
        }
        if (n22.m.h(D0) == -1 && this.f550917g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
            c21053xdbf1e5f4.w();
            return -1;
        }
        if (D0 == null || D0.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
            return -1;
        }
        int length2 = D0.length;
        cj0Var.f453114e = c21053xdbf1e5f4.f68681x29d3a4dd;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.c(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(D0));
        cj0Var.f453116g = cu5Var;
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = cj0Var.f453118i;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str)) {
            cj0Var.f453122p = ((aq1.d1) po.a.f438812a).a(pt0.f0.Li(this.f550920m, this.f550919i));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + c21053xdbf1e5f4.f68681x29d3a4dd + ", total:" + c21053xdbf1e5f4.f68679x22618426 + ", len:" + length2);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getDispatchInterceptRet */
    public int mo47996x4facbe8f(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        return w11.c1.a(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f550919i, this.f550920m), this) ? org.p3343x72743996.net.InterfaceC29524x4f65168b.f74071xb0bfc305 : super.mo47996x4facbe8f(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 175;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27;
        int i28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd errtype:" + i18 + " errcode:" + i19);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.zt6 zt6Var = (r45.zt6) oVar.f152243a.f152217a;
        r45.au6 au6Var = (r45.au6) oVar.f152244b.f152233a;
        if (au6Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(au6Var.f451803f);
        }
        if (i18 != 0 || i19 != 0) {
            this.f550915e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        int size = zt6Var.f473902e.size();
        int size2 = au6Var.f451802e.size();
        java.util.LinkedList linkedList = zt6Var.f473902e;
        java.util.LinkedList linkedList2 = au6Var.f451802e;
        if (size != size2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + linkedList2.size() + ", resp size:" + linkedList.size());
            this.f550915e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.dj0 dj0Var = (r45.dj0) linkedList2.get(0);
        java.lang.String str2 = dj0Var.f454059g;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f550916f;
        if (str2 == null || !str2.equals(c21053xdbf1e5f4.mo42933xb5885648()) || (i27 = dj0Var.f454057e) < c21053xdbf1e5f4.f68681x29d3a4dd) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + dj0Var.f454057e + ", size=" + c21053xdbf1e5f4.f68679x22618426);
            this.f550915e.mo815x76e0bfae(4, -2, "", this);
            c21053xdbf1e5f4.f68681x29d3a4dd = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().V2(c21053xdbf1e5f4);
            return;
        }
        int i29 = au6Var.f76492x92037252.f458492d;
        if (i29 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", java.lang.Integer.valueOf(i29));
            this.f550915e.mo815x76e0bfae(4, -2, "", this);
            return;
        }
        int i37 = dj0Var.f454056d;
        if (i37 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd: respInfo Ret %s", java.lang.Integer.valueOf(i37));
            this.f550915e.mo815x76e0bfae(4, -2, "", this);
            return;
        }
        if (i27 < dj0Var.f454058f) {
            if (this.f550918h) {
                this.f550915e.mo815x76e0bfae(4, -2, "", this);
                return;
            } else {
                new qr.r(c21053xdbf1e5f4, false, new z12.x(this));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + dj0Var.f454060h);
        java.lang.String str3 = this.f550920m;
        long j17 = this.f550919i;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str3, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", java.lang.Long.valueOf(dj0Var.f454061i), java.lang.Integer.valueOf(x51.o1.f533598r));
        if (10007 == x51.o1.f533597q && (i28 = x51.o1.f533598r) != 0) {
            dj0Var.f454060h = i28;
            x51.o1.f533598r = 0;
        }
        Li.o1(dj0Var.f454061i);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().u1(c21053xdbf1e5f4.f68671x4b6e68b9);
        if (u17 != null) {
            c21053xdbf1e5f4 = u17;
        }
        c21053xdbf1e5f4.f68681x29d3a4dd = 0;
        c21053xdbf1e5f4.f68668xd33ad9b9 = java.lang.System.currentTimeMillis();
        c21053xdbf1e5f4.f68682x29d3a50c = 3;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().V2(c21053xdbf1e5f4);
        if (Li.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(Li);
            ((u90.a) vVar).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.a(Li, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.b(Li);
        }
        if (!linkedList.isEmpty() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.cj0) linkedList.get(0)).f453126t)) {
            r15.b bVar = new r15.b();
            bVar.m126728xdc93280d(((r45.cj0) linkedList.get(0)).f453126t);
            ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Vi(bVar, Li);
        }
        this.f550915e.mo815x76e0bfae(i18, i19, "", this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 256;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
