package ec4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.h f332681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f332683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332685h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332686i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ec4.s f332687m;

    public g(ec4.h hVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str2, java.lang.String str3, java.lang.String str4, ec4.s sVar) {
        this.f332681d = hVar;
        this.f332682e = str;
        this.f332683f = c17933xe8d1b226;
        this.f332684g = str2;
        this.f332685h = str3;
        this.f332686i = str4;
        this.f332687m = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o55.a Bi;
        float f17;
        r45.lj4 lj4Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        boolean z17;
        boolean z18;
        int l17;
        p012xc85e97e9.p093xedfae76a.c1 a17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        ec4.h hVar = this.f332681d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        r45.vh4 vh4Var = hVar.f332690a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        boolean z19 = vh4Var.f469776p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "commitFakeVideo >> " + java.lang.Thread.currentThread().getName() + ", isMediaFromMaasSdk=" + z19);
        if (z19) {
            Bi = ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Bi(this.f332682e);
        } else {
            Bi = ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Bi(this.f332682e);
        }
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "workType is error");
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.a(this.f332687m, Bi, this.f332682e));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        int i18 = Bi.f424695a;
        if (i18 == 4007) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "result is done " + this.f332682e);
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.b(this.f332687m, Bi, this.f332682e));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        if (i18 == 4008) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "result is done error");
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.c(this.f332687m, Bi, this.f332682e));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        ec4.h hVar2 = this.f332681d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo = this.f332683f;
        java.lang.String videoPath = this.f332684g;
        java.lang.String thumbPath = this.f332685h;
        java.lang.String desc = this.f332686i;
        java.lang.String workId = this.f332682e;
        hVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workId, "workId");
        dw3.d0 a18 = dw3.e0.f325735a.a(videoPath);
        if (a18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "addSightObjectByPath commit video_info:" + a18);
            f17 = ((float) a18.f325725c) / 1000.0f;
        } else {
            f17 = 0.0f;
        }
        if (f17 <= 0.01f) {
            if (z19) {
                o55.a Bi2 = ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Bi(workId);
                if (Bi2 != null) {
                    i17 = Bi2.f424702h;
                    f17 = i17 / 1000.0f;
                }
            } else {
                o55.a Bi3 = ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Bi(workId);
                if (Bi3 != null) {
                    i17 = Bi3.f424702h;
                    f17 = i17 / 1000.0f;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = videoPath.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(sb7));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(videoPath, sb7, false);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
        byte[] bytes2 = thumbPath.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        sb8.append(kk.k.g(bytes2));
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.vfs.w6.c(thumbPath, sb9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "addSightObjectByPath: copyVideoResult " + d17 + ", video copy from " + videoPath + " t0 " + sb7 + "; thumb copy from " + thumbPath + " to " + sb9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        r45.jj4 f18 = m21.y.f();
        f18.f459388d = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", 6, sb7, "", "", "");
        f18.f459389e = 6;
        ca4.w0 w0Var = new ca4.w0(sb7, 6);
        w0Var.f121579n = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().P1(w0Var, sb7, sb9, "", "");
        if (w0Var.f121573h <= 0 || w0Var.f121572g <= 0 || w0Var.f121574i <= 0) {
            lj4Var = null;
        } else {
            lj4Var = new r45.lj4();
            lj4Var.f461054e = w0Var.f121573h;
            lj4Var.f461053d = w0Var.f121572g;
            lj4Var.f461055f = w0Var.f121574i;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z27 = true;
        if (gm0.j1.a()) {
            str = "MicroMsg.BackgroundVideoFakeUploader";
            c17933xe8d1b226 = snsInfo;
            z17 = false;
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z18 = true;
            } else if (r17 != 2) {
                z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            } else {
                z18 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            c17933xe8d1b226 = snsInfo;
            str = "MicroMsg.BackgroundVideoFakeUploader";
            z17 = false;
            z18 = false;
        }
        if (z18) {
            java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(sb7, z17);
            if (i19 == null) {
                i19 = "";
            }
            f18.f459391g = i19;
            java.lang.String i27 = com.p314xaae8f345.mm.vfs.w6.i(sb9, z17);
            if (i27 == null) {
                i27 = "";
            }
            f18.f459393i = i27;
        }
        f18.f459388d = "Locall_path" + w0Var.f121571f;
        f18.f459398p = lj4Var;
        f18.f459403s = w0Var.f121571f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        f18.f459389e = 8;
        f18.f459390f = desc;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18.f459397o)) {
            f18.f459397o = desc;
        }
        f18.R = f17;
        f18.f459399p0 = workId;
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f454799d = f18.f459403s;
        r45.kj4 m70365xa8f45ee4 = c17933xe8d1b226.m70365xa8f45ee4();
        m70365xa8f45ee4.f460278h.add(ec4Var);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = c17933xe8d1b226;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720().mo11468x92b714fd(c17933xe8d1b2262.f68882xad49e234);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720) mo11468x92b714fd;
            c19807x593d1720.f39014x86965dde.f451373h.add(f18);
            c17933xe8d1b2262.m70466xfabce6e3(c19807x593d1720);
            c17933xe8d1b2262.m70455x99ecb2f1(m70365xa8f45ee4.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "commit mediaId: " + f18.f459403s + ", " + f18.f459388d + ", " + f18.f459390f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fake error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            z27 = z17;
        }
        if (!z27) {
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.d(this.f332687m));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f332683f;
        Fj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (c17933xe8d1b2263 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            l17 = -1;
        } else {
            l17 = (int) Fj.f247527d.l(dm.va.f68838xc4fe047c, "", c17933xe8d1b2263.mo9763xeb27878e());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + l17);
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).h7(l17, o75.b.f425115c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        int size = this.f332683f.m70371x485d7().f39014x86965dde.f451373h.size();
        int m70357x3fdd41df = this.f332683f.m70357x3fdd41df();
        ta4.b1.f498258a.b(l17, kz5.b0.c(this.f332684g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", "commit size: " + size + ", " + l17 + ", " + m70357x3fdd41df);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj().z0(l17);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("commitFakeVideo >> localId: ");
        sb10.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoFakeUploader", sb10.toString());
        try {
            ec4.h hVar3 = this.f332681d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            r45.vh4 vh4Var2 = hVar3.f332690a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            byte[] mo14344x5f01b1f6 = vh4Var2.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            if (z19) {
                pp0.o0 o0Var = (pp0.o0) i95.n0.c(pp0.o0.class);
                java.lang.String workTagId = this.f332682e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0 w0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246523b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                yy0.g8 g8Var = (yy0.g8) o0Var;
                g8Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "updateWorkToPublish >> workTagId: " + workTagId + ", workType: 4006, snsLocalId: " + l17 + ", postSessionId: " + str2 + ", snsCreateTime: " + m70357x3fdd41df);
                iz0.d dVar = iz0.d.f377577a;
                dm.ib d18 = dVar.d(workTagId);
                if (d18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(g8Var.f549645d, "updateWorkToPublish get info is null ".concat(workTagId));
                } else {
                    int i28 = d18.f67037xdb9e6ea3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "updateWorkToPublish >> lastWorkType >> " + i28);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    l75.k0 a19 = dVar.a();
                    p75.n0 n0Var = dm.ib.f319203y;
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("work_type", java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec));
                    contentValues.put("sns_local_id", java.lang.Integer.valueOf(l17));
                    contentValues.put("sns_ext_info", mo14344x5f01b1f6);
                    contentValues.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(currentTimeMillis));
                    contentValues.put("post_session_id", str2);
                    contentValues.put("sns_create_time", java.lang.Integer.valueOf(m70357x3fdd41df));
                    p75.m0 j17 = dm.ib.f319204z.j(workTagId);
                    p75.h1 j18 = dm.ib.f319203y.j(contentValues);
                    j18.f434184c = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "updateWorkToPublish >> workType: 4006, snsLocalId: " + l17 + ", workTagId: " + workTagId + ", confirmPublishTimeStamp: " + currentTimeMillis + ", snsCreateTime: " + m70357x3fdd41df + ", result: " + j18.a().f(a19));
                    ((ku5.t0) ku5.t0.f394148d).B(new yy0.d8(workTagId, i28, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec));
                }
            } else {
                n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
                java.lang.String workTagId2 = this.f332682e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0 w0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246523b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                wp4.x xVar = (wp4.x) fVar;
                xVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId2, "workTagId");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "updateWorkToPublish >> workTagId: " + workTagId2 + ", workType: 4006, snsLocalId: " + l17 + ", postSessionId: " + str3 + ", snsCreateTime: " + m70357x3fdd41df);
                zp4.e eVar = zp4.e.f556487a;
                dm.q0 d19 = eVar.d(workTagId2);
                if (d19 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(xVar.f529986d, "updateWorkToPublish get info is null ".concat(workTagId2));
                } else {
                    int i29 = d19.f68035xdb9e6ea3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "updateWorkToPublish >> lastWorkType >> " + i29);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    l75.k0 a27 = eVar.a();
                    p75.n0 n0Var2 = dm.q0.R;
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("work_type", java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec));
                    contentValues2.put("sns_local_id", java.lang.Integer.valueOf(l17));
                    contentValues2.put("sns_ext_info", mo14344x5f01b1f6);
                    contentValues2.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(currentTimeMillis2));
                    contentValues2.put("post_session_id", str3);
                    contentValues2.put("sns_create_time", java.lang.Integer.valueOf(m70357x3fdd41df));
                    p75.m0 j19 = dm.q0.S.j(workTagId2);
                    p75.h1 j27 = dm.q0.R.j(contentValues2);
                    j27.f434184c = j19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkToPublish >> workType: 4006, snsLocalId: " + l17 + ", workTagId: " + workTagId2 + ", confirmPublishTimeStamp: " + currentTimeMillis2 + ", snsCreateTime: " + m70357x3fdd41df + ", result: " + j27.a().f(a27));
                    ((ku5.t0) ku5.t0.f394148d).B(new wp4.u(workTagId2, i29, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec));
                }
            }
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.f(this.f332687m, l17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        } catch (java.io.IOException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackgroundVideoFakeUploader", "parse byte error");
            ((ku5.t0) ku5.t0.f394148d).B(new ec4.e(this.f332687m));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        }
    }
}
