package com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img;

/* loaded from: classes12.dex */
public class c implements k70.w {

    /* renamed from: e, reason: collision with root package name */
    public final int f234707e;

    /* renamed from: n, reason: collision with root package name */
    public final int f234713n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f234714o;

    /* renamed from: d, reason: collision with root package name */
    public long f234706d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f234708f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234709g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f234710h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f234711i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f234712m = 0;

    public c() {
        this.f234707e = 0;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886>(a0Var) { // from class: com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader$1
            {
                this.f39173x3fe91575 = -27874186;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d6886) {
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d68862 = c5833x5f3d6886;
                if (oq3.k.f428927a.c(1, c5833x5f3d68862.f136140g.f87706b) == 0) {
                    am.ao aoVar = c5833x5f3d68862.f136140g;
                    int i17 = aoVar.f87705a ? 1 : -1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c.this;
                    int i18 = cVar.f234708f + i17;
                    cVar.f234708f = i18;
                    if (i18 < 0) {
                        cVar.f234708f = 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "pauseCnt < 0");
                    }
                    if (cVar.f234708f == 0) {
                        cVar.f234709g = "";
                    } else {
                        if (aoVar.f87705a) {
                            str = aoVar.f87706b;
                            java.lang.String str2 = cVar.f234709g;
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (str == null) {
                                str = str2;
                            }
                        } else {
                            str = cVar.f234709g;
                        }
                        cVar.f234709g = str;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "req pause: %b count: %d talker %s", java.lang.Boolean.valueOf(aoVar.f87705a), java.lang.Integer.valueOf(cVar.f234708f), cVar.f234709g);
                    cVar.d();
                }
                return false;
            }
        };
        this.f234714o = abstractC20980x9b9ad01d;
        this.f234713n = android.os.Process.myUid();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        this.f234707e = com.p314xaae8f345.mm.R.C30861xcebc809e.bzt;
    }

    public void a(long j17, long j18, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "imglocalId " + j17 + " msglocalid " + j18 + " false");
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c17.m(u3Var, null), 0L);
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) android.text.format.DateFormat.format("M", java.lang.System.currentTimeMillis()));
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(k17 + 1));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG, java.lang.Long.valueOf(E1));
    }

    public boolean b() {
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return false;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(11);
        return i17 == 1 ? calendar.get(12) >= java.lang.Math.abs(gm0.j1.b().h()) % 30 : i17 >= 2 && i17 <= 6;
    }

    public boolean c() {
        if (this.f234706d != 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(this.f234709g, this.f234706d);
            if (T1 != null) {
                if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(T1.f404166a, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f234706d, this.f234709g), T1.f404173h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        if (this.f234706d != 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(this.f234709g, this.f234706d);
            if (T1 != null) {
                if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(T1.f404166a, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(this.f234706d, this.f234709g), T1.f404173h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d", java.lang.Long.valueOf(this.f234706d));
                    return;
                }
            }
            this.f234706d = 0L;
            if (T1.f404184s == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId %d", 0L);
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.m134976x2690a4ac();
                nVar.f347063o.f(this.f234706d, 5);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Not Downloaded, Force Cancel curMsgId %d", 0L);
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.m134976x2690a4ac();
                nVar2.f347063o.f(this.f234706d, 1);
            }
        }
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.m134976x2690a4ac();
        nVar3.f347069u.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.a(this, null));
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i19 == 0 && i27 == 0) {
            a(j17, j18, true);
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, true, false);
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 54L, 1L, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "img " + j17 + "msgLocalId " + j18 + " download failed");
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, false);
            jx3.f.INSTANCE.mo68477x336bdfd8(957L, 53L, 1L, false);
        }
        this.f234706d = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "normal download mode check network stat");
        this.f234710h = true;
        int i28 = this.f234713n;
        this.f234711i = android.net.TrafficStats.getUidRxBytes(i28);
        this.f234712m = android.net.TrafficStats.getUidTxBytes(i28);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        kq3.l lVar = nVar.f347069u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.b(this);
        kq3.k kVar = lVar.f392812b;
        if (kVar != null) {
            lVar.f392812b.mo50311x7ab51103(kVar.mo50292x733c63a2(1, bVar), 1000L);
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "onImgTaskCanceled %d", java.lang.Long.valueOf(j18));
        this.f234706d = 0L;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, true);
        jx3.f.INSTANCE.mo68477x336bdfd8(957L, 57L, 1L, false);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
