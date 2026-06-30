package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public class b3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f270757d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f270758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f270759f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f270760g;

    /* renamed from: h, reason: collision with root package name */
    public int f270761h;

    /* renamed from: i, reason: collision with root package name */
    public int f270762i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f270763m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f270764n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f270765o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f270766p;

    /* renamed from: r, reason: collision with root package name */
    public int f270768r;

    /* renamed from: s, reason: collision with root package name */
    public int f270769s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f270770t;

    /* renamed from: x, reason: collision with root package name */
    public d11.n f270774x;

    /* renamed from: q, reason: collision with root package name */
    public boolean f270767q = false;

    /* renamed from: u, reason: collision with root package name */
    public int f270771u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f270772v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f270773w = false;

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        boolean z17;
        this.f270773w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_fail_send_when_remuxing_fail, 1) == 1;
        synchronized (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270783w) {
            z17 = !com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270782v.containsKey(this.f270757d);
        }
        if (!z17) {
            z17 = t21.d3.h(this.f270757d) == null;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", this.f270757d);
            return true;
        }
        c();
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "onPostExecute");
        synchronized (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270783w) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.f270782v.remove(this.f270757d);
        }
        if (this.f270770t) {
            java.lang.String str = this.f270759f;
            if (this.f270762i == 2) {
                int k17 = (int) (com.p314xaae8f345.mm.vfs.w6.k(str) / 1024);
                int[] iArr = {512, 1024, 2048, 5120, 8192, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 15360, 20480};
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, 247, 255));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(106L, q17, 1L, false);
                g0Var2.mo68477x336bdfd8(106L, 246L, 1L, false);
            }
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.j(this.f270759f, this.f270762i);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.h(this.f270770t, this.f270758e, this.f270759f);
        int i17 = this.f270771u;
        java.lang.String str2 = this.f270758e;
        java.lang.String str3 = this.f270759f;
        int i18 = this.f270761h;
        long k18 = com.p314xaae8f345.mm.vfs.w6.k(str2);
        if (k18 > 0) {
            long k19 = com.p314xaae8f345.mm.vfs.w6.k(str3);
            int i19 = (int) ((100 * k19) / k18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "kv report video compression isNew[%d], oriSize[%d], remuxingSize[%d], compressionRatio[%d], bitrate[%d], preset[%d], retDuration[%d]", 1, java.lang.Long.valueOf(k18), java.lang.Long.valueOf(k19), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13432, 1, java.lang.Long.valueOf(k18), java.lang.Long.valueOf(k19), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImportMultiVideo", "file canot be empty");
        }
        t21.i2.wi().Di(this.f270758e, this.f270759f, new wf0.l1(this.f270757d, bm5.f0.f104104s), this.f270763m, "", "", this.f270762i == 1 ? 8 : 1, this.f270770t ? 1 : 3);
        f65.y0.f341552a.k(this.f270763m, this.f270757d, this.f270761h * 1000, com.p314xaae8f345.mm.vfs.w6.k(this.f270758e), com.p314xaae8f345.mm.vfs.w6.k(this.f270759f), com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.e(this.f270762i), this.f270766p, false);
        if (!this.f270773w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "updateVideo");
            t21.d3.P(this.f270757d, this.f270761h);
            t21.d3.M(this.f270757d);
        } else if (this.f270770t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideo", "updateVideo");
            t21.d3.P(this.f270757d, this.f270761h);
            t21.d3.M(this.f270757d);
        } else {
            t21.d3.G(this.f270757d);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x067d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b3.c():boolean");
    }
}
