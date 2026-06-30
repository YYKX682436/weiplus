package v22;

/* loaded from: classes10.dex */
public final class m extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final v22.g f514365f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f514366g;

    /* renamed from: h, reason: collision with root package name */
    public final long f514367h;

    /* renamed from: i, reason: collision with root package name */
    public long f514368i;

    public m(v22.g mixInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixInfo, "mixInfo");
        this.f514365f = mixInfo;
        this.f514366g = "MicroMsg.EmojiMixTask";
        this.f514367h = mixInfo.f514347b;
    }

    public static final void e(v22.m mVar, boolean z17) {
        v22.g gVar = mVar.f514365f;
        boolean z18 = false;
        if (!z17) {
            qr.e.f447541a.a(gVar.f514347b, false, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = gVar.f514355j;
            c21053xdbf1e5f4.getClass();
            c21053xdbf1e5f4.f68652x452f0c30 = 11;
            c21053xdbf1e5f4.f68650xee2fac53 = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "updateEmojiInfo: " + c21053xdbf1e5f4.mo42933xb5885648());
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(c21053xdbf1e5f4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.d(mVar.f514367h, 3, gVar.f514346a);
            return;
        }
        int i17 = gVar.f514346a;
        if ((i17 == 3 || i17 == 4 || i17 == 5) && (i17 == 4 || i17 == 5)) {
            z18 = true;
        }
        if (!z18) {
            qr.e.f447541a.a(gVar.f514347b, true, null);
        }
        java.lang.String mo42933xb5885648 = gVar.f514355j.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
        java.lang.String filePath = gVar.f514349d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "postUploadTask: " + filePath + ", " + mo42933xb5885648);
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(filePath);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(mo42933xb5885648);
        if (N != null) {
            if (k17 <= 0) {
                N.f68652x452f0c30 = 12;
                N.f68650xee2fac53 = 2;
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(N);
                com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.d(N.f68648x46085dc4, 4, N.f68649x3933ac0b);
            } else {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(filePath);
                java.lang.String str = rr.s.f480682a.c() + p17;
                com.p314xaae8f345.mm.vfs.w6.w(filePath, str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCapture", "upload file " + str + " length is " + k17);
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().f1(N.mo42933xb5885648());
                N.f68671x4b6e68b9 = p17;
                N.f68650xee2fac53 = 3;
                N.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
                    N.f68691xdde7652c = p17;
                    N.f68660x7650f4b9 = p17;
                }
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().J0(N);
                qr.a0.f447532a.a(N);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(19, mVar.f514367h, 0L, 0L, 0L, mVar.f514368i, 0L, 0, 0, gVar.f514346a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.c(1, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.c(38, (int) mVar.f514368i);
    }

    @Override // fp0.d
    public void a() {
        v22.g gVar = this.f514365f;
        v22.z zVar = new v22.z(gVar.f514348c, gVar.f514350e, gVar.f514349d, gVar.f514351f, gVar.f514352g, gVar.f514353h, gVar.f514354i, gVar.f514347b);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.ArrayList) gVar.f514350e.f514326a).iterator();
        while (it.hasNext()) {
            ((av3.a) it.next()).d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.c(37, 1);
        v22.l lVar = new v22.l(this, currentTimeMillis);
        zVar.f514417o = java.lang.System.currentTimeMillis();
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        java.lang.String str = zVar.f514403a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        double d18 = (d17 != null ? java.lang.Integer.valueOf(d17.f243919e) : null) != null ? 1000.0d / d17.f243919e : 0.0d;
        zVar.f514415m = lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start decode ");
        sb6.append(java.lang.Thread.currentThread().getId());
        sb6.append(", fps: ");
        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.f243919e) : null);
        sb6.append(", duration: ");
        sb6.append(d17 != null ? java.lang.Integer.valueOf(d17.f243915a) : null);
        sb6.append(", videoFrameDuration: ");
        sb6.append(d18);
        sb6.append(", removeBackground:");
        boolean z18 = zVar.f514407e;
        sb6.append(z18);
        sb6.append(", path: ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixer", sb6.toString());
        zVar.f514412j = 0;
        t85.j jVar = zVar.f514408f;
        boolean z19 = jVar != null;
        int i17 = zVar.f514406d;
        boolean z27 = i17 > 1;
        int i18 = d17 != null ? d17.f243915a : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markStartEmojiMix, removeBackground:" + z18 + ", hasSticker:" + z19 + ", speedUp:" + z27 + ", videoDuration:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1012L, 17L, 1L);
        if (z18) {
            g0Var.C(1012L, 18L, 1L);
        }
        if (z19) {
            g0Var.C(1012L, 19L, 1L);
        }
        if (z27) {
            g0Var.C(1012L, 20L, 1L);
        }
        if (i18 > 0) {
            g0Var.C(1012L, 36L, i18);
        }
        boolean z28 = zVar.f514409g;
        if (z28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseGif");
            g0Var.C(1012L, 31L, 1L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseWxam");
            g0Var.C(1012L, 30L, 1L);
        }
        zVar.f514413k = new v22.b(str, zVar.f514404b, i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f514405c)) {
            java.lang.String str2 = zVar.f514405c;
            if (zVar.f514413k == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMgr");
                throw null;
            }
            zVar.f514414l = new v22.f(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, r4.f531355m, zVar.f514409g);
        }
        d32.j jVar2 = new d32.j(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, !z28, jVar);
        zVar.f514411i = jVar2;
        jVar2.f307693m = new v22.u(zVar);
        jVar2.f307691k.mo50293x3498a0(new d32.f(jVar2, z18, new v22.y(zVar, d17)));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f514367h);
    }
}
