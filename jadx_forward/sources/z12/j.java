package z12;

/* loaded from: classes12.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550844d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550845e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f550846f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f550847g = true;

    /* renamed from: h, reason: collision with root package name */
    public final int f550848h;

    /* renamed from: i, reason: collision with root package name */
    public final long f550849i;

    public j(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f550848h = 256;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f550849i = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "start upload at " + currentTimeMillis);
        this.f550846f = c21053xdbf1e5f4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ej0();
        lVar.f152198b = new r45.fj0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmemojiupload";
        lVar.f152200d = 703;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f550844d = a17;
        r45.ej0 ej0Var = (r45.ej0) a17.f152243a.f152217a;
        r45.vt6 vt6Var = new r45.vt6();
        if (c21053xdbf1e5f4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(164L, 13L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "NetSceneEmojiUpload: %s", c21053xdbf1e5f4.mo42933xb5885648());
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().Y2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c21053xdbf1e5f4);
            vt6Var.f470067d = c21053xdbf1e5f4.mo42933xb5885648();
            vt6Var.f470069f = c21053xdbf1e5f4.f68679x22618426;
            ej0Var.f455097d.add(vt6Var);
            this.f550848h = (c21053xdbf1e5f4.f68679x22618426 / 8192) * 2;
        }
    }

    public final void H(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, boolean z17) {
        if (c21053xdbf1e5f4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.mo42933xb5885648())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a14934 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934();
        java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
        am.p4 p4Var = c5324xe5a14934.f135636g;
        p4Var.f89136b = mo42933xb5885648;
        p4Var.f89135a = 0;
        p4Var.f89137c = z17;
        c5324xe5a14934.e();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f550849i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "finish cost " + currentTimeMillis + " size " + c21053xdbf1e5f4.f68679x22618426 + " rate " + (c21053xdbf1e5f4.f68679x22618426 / currentTimeMillis));
    }

    public void I() {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f550846f;
        c21053xdbf1e5f4.f68681x29d3a4dd = 0;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f4);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        int i18;
        byte[] D0;
        byte[] D02;
        this.f550845e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550844d;
        r45.vt6 vt6Var = (r45.vt6) ((r45.ej0) oVar.f152243a.f152217a).f455097d.get(0);
        boolean z17 = this.f550847g;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f550846f;
        if (!z17) {
            if (c21053xdbf1e5f4 == null || (i17 = c21053xdbf1e5f4.f68681x29d3a4dd) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
                return -1;
            }
            int i19 = c21053xdbf1e5f4.f68679x22618426 - i17;
            i18 = i19 <= 8192 ? i19 : 8192;
            if ((c21053xdbf1e5f4.f68678x13320507 & 1) == 1) {
                byte[] z18 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(c21053xdbf1e5f4);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(z18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                    D0 = new byte[0];
                } else {
                    D0 = new byte[i18];
                    int length = z18.length;
                    java.lang.System.arraycopy(z18, c21053xdbf1e5f4.f68681x29d3a4dd, D0, 0, i18);
                }
            } else {
                D0 = c21053xdbf1e5f4.D0(i17, i18);
            }
            if (D0 == null || D0.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
                return -1;
            }
            vt6Var.f470068e = c21053xdbf1e5f4.f68681x29d3a4dd;
            vt6Var.f470070g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(D0, 0, D0.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", java.lang.Integer.valueOf(D0.length), java.lang.Integer.valueOf(vt6Var.f470070g.f273689a.length));
            int i27 = c21053xdbf1e5f4.f68681x29d3a4dd;
            int i28 = c21053xdbf1e5f4.f68679x22618426;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        java.lang.String str = vt6Var.f470067d;
        vt6Var.f470068e = 0;
        int i29 = c21053xdbf1e5f4.f68679x22618426 - 0;
        i18 = i29 <= 8192 ? i29 : 8192;
        if ((c21053xdbf1e5f4.f68678x13320507 & 1) == 1) {
            byte[] z19 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(c21053xdbf1e5f4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(z19)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                D02 = new byte[0];
            } else {
                D02 = new byte[i18];
                int length2 = z19.length;
                java.lang.System.arraycopy(z19, 0, D02, 0, i18);
            }
        } else {
            D02 = c21053xdbf1e5f4.D0(0, i18);
        }
        if (D02 == null || D02.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
            return -1;
        }
        vt6Var.f470068e = 0;
        vt6Var.f470070g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(D02, 0, D02.length);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(D02.length);
        objArr[1] = java.lang.Integer.valueOf(vt6Var.f470070g.f273689a.length);
        objArr[2] = java.lang.Integer.valueOf(c21053xdbf1e5f4 == null ? -1 : c21053xdbf1e5f4.f68681x29d3a4dd);
        objArr[3] = java.lang.Integer.valueOf(c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68679x22618426 : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", objArr);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 703;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        int i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + i18 + " errcode:" + i19);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f550846f;
        if (i18 != 0 || i19 != 0) {
            I();
            this.f550845e.mo815x76e0bfae(i18, i19, str, this);
            H(c21053xdbf1e5f4, false);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.ej0 ej0Var = (r45.ej0) oVar.f152243a.f152217a;
        r45.fj0 fj0Var = (r45.fj0) oVar.f152244b.f152233a;
        int size = ej0Var.f455097d.size();
        int size2 = fj0Var.f455926d.size();
        java.util.LinkedList linkedList = fj0Var.f455926d;
        if (size != size2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + ej0Var.f455097d.size() + ", resp size:" + linkedList.size());
            I();
            this.f550845e.mo815x76e0bfae(i18, i19, str, this);
            H(c21053xdbf1e5f4, false);
            return;
        }
        r45.wt6 wt6Var = (linkedList == null || linkedList.size() <= 0) ? null : (r45.wt6) linkedList.get(0);
        if (wt6Var == null || (str2 = wt6Var.f470987g) == null || !str2.equals(c21053xdbf1e5f4.mo42933xb5885648()) || (i27 = wt6Var.f470985e) < c21053xdbf1e5f4.f68681x29d3a4dd) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = wt6Var.f470987g;
            objArr[1] = java.lang.Integer.valueOf(wt6Var.f470986f);
            objArr[2] = java.lang.Integer.valueOf(wt6Var.f470985e);
            objArr[3] = java.lang.Integer.valueOf(c21053xdbf1e5f4 == null ? -1 : c21053xdbf1e5f4.f68681x29d3a4dd);
            objArr[4] = java.lang.Integer.valueOf(c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68679x22618426 : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", objArr);
            I();
            this.f550845e.mo815x76e0bfae(4, -2, "", this);
            H(c21053xdbf1e5f4, false);
            return;
        }
        if (c21053xdbf1e5f4 != null && wt6Var.f470984d != 0 && i27 == wt6Var.f470986f && i27 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Integer.valueOf(wt6Var.f470984d), java.lang.Integer.valueOf(wt6Var.f470985e), java.lang.Integer.valueOf(wt6Var.f470986f));
            I();
            this.f550845e.mo815x76e0bfae(i18, i19, "", this);
            return;
        }
        int i28 = fj0Var.f76492x92037252.f458492d;
        if (i28 != 0 || wt6Var.f470984d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(wt6Var.f470984d));
            I();
            this.f550845e.mo815x76e0bfae(i18, i19, "", this);
            return;
        }
        if (this.f550847g) {
            this.f550847g = false;
        }
        if (i27 >= wt6Var.f470986f) {
            c21053xdbf1e5f4.f68681x29d3a4dd = 0;
            c21053xdbf1e5f4.f68682x29d3a50c = 3;
            c21053xdbf1e5f4.f68674xa37f827c = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f4);
            this.f550845e.mo815x76e0bfae(i18, i19, "", this);
            H(c21053xdbf1e5f4, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", java.lang.Integer.valueOf(i27));
        c21053xdbf1e5f4.f68681x29d3a4dd = wt6Var.f470985e;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(c21053xdbf1e5f4);
        if (mo807x6c193ac1(m47995xb7ba1aa7(), this.f550845e) < 0) {
            this.f550845e.mo815x76e0bfae(3, -1, "", this);
            H(c21053xdbf1e5f4, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return this.f550848h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
