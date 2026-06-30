package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI */
/* loaded from: classes4.dex */
public class ActivityC17994x10b0558a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f248155h = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f248156d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f248157e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences f248158f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f248159g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_bg_artist_preference_open, true);

    public final void V6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        w94.a aVar = w94.a.f525608a;
        int i17 = 1;
        if (aVar.b()) {
            java.lang.String c18 = q75.g.c(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "mediaEdit mimeType:%s", c18);
            if (android.text.TextUtils.isEmpty(c18)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                return;
            }
            if (c18.contains("image")) {
                c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(str, dw3.h.f325744a.c("sns_cover", null));
                c17.a(1, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.C17854xcf9566e3.class.getName());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
                if (c6889x9caa3908 != null) {
                    c6889x9caa3908.f142054h = 1;
                }
                if (c6889x9caa3908 != null) {
                    c6889x9caa3908.f142050d = 4;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            } else {
                java.lang.String[] e17 = dw3.h.f325744a.e("sns_cover", "video", "thumb");
                c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.c(str, e17[0], e17[1]);
                i17 = 2;
                c17.a(2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.C17855xdb509203.class.getName());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = ba4.b.f100231a;
                if (c6889x9caa39082 != null) {
                    c6889x9caa39082.f142054h = 2;
                }
                if (c6889x9caa39082 != null) {
                    c6889x9caa39082.f142050d = 4;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a17 = aVar.a();
            c16993xacc19624.f237209n = a17;
            c16993xacc19624.f237218w = a17.f152728h * 1000;
            c16993xacc19624.f237221z = false;
            ut3.m.f512715a.f(mo55332x76847179(), 8, com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd, c16993xacc19624, i17, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39083 = ba4.b.f100231a;
            if (c6889x9caa39083 != null) {
                c6889x9caa39083.f142054h = 1;
            }
            if (c6889x9caa39083 != null) {
                c6889x9caa39083.f142050d = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImageMode", 1);
            intent.putExtra("CropImage_ImgPath", str);
            intent.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni() + kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.p(this, intent, 6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    public final void W6(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (i17 == 2) {
            str = "onActivityResultImp";
            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(getApplicationContext(), intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
            this.f248156d = b17;
            if (b17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                return;
            }
            V6(b17);
        } else if (i17 != 5) {
            float f17 = 0.0f;
            if (i17 != 6) {
                switch (i17) {
                    case 8:
                        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ri();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f c16505x35e9c14f = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16505x35e9c14f) intent.getParcelableExtra("media_basic_out_model");
                        if (c16505x35e9c14f != null && c16505x35e9c14f.f230139d) {
                            if (c16505x35e9c14f.f230141f != null && pc4.d.f434943a.y()) {
                                f17 = c16505x35e9c14f.f230141f.getFloat("snsCoverOffsetKey", 0.0f);
                            }
                            java.util.Iterator it = c16505x35e9c14f.f230140e.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj).f230142d == og3.a.f426688d) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 Nj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj();
                                java.util.ArrayList arrayList = c16505x35e9c14f.f230140e;
                                Nj.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverByVideo", "com.tencent.mm.plugin.sns.model.UploadManager");
                                java.util.Iterator it6 = arrayList.iterator();
                                java.lang.String str7 = "";
                                java.lang.String str8 = str7;
                                java.lang.String str9 = str8;
                                while (it6.hasNext()) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) it6.next();
                                    if (c16506x8e746ffa.f230142d == og3.a.f426688d) {
                                        str8 = c16506x8e746ffa.f230143e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "videoPath:%s", str8);
                                    }
                                    if (c16506x8e746ffa.f230142d == og3.a.f426690f) {
                                        str9 = c16506x8e746ffa.f230143e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "thumbPath:%s", str9);
                                    }
                                    if (c16506x8e746ffa.f230142d == og3.a.f426689e) {
                                        str7 = c16506x8e746ffa.f230143e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "coverPath:%s", str7);
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "videoPath:%s thumbPath:%s", str8, str9);
                                if (Nj.i() == null || Nj.i().equals("")) {
                                    str5 = "setSnsCoverByVideo";
                                    str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                    str3 = "onActivityResultImp";
                                    str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                } else {
                                    java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), Nj.i());
                                    com.p314xaae8f345.mm.vfs.w6.u(d17);
                                    java.lang.String thumbPath = d17 + Nj.i() + "thumb_bg_";
                                    java.lang.String videoPath = d17 + Nj.i() + "vdieo_bg_";
                                    java.lang.String imagePath = d17 + Nj.i() + "image_bg_";
                                    com.p314xaae8f345.mm.vfs.w6.h(d17 + Nj.i() + "bg_");
                                    Nj.o(str8, videoPath);
                                    Nj.o(str9, thumbPath);
                                    Nj.o(str7, imagePath);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 Bj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj();
                                    java.lang.String userName = Nj.i();
                                    Bj.getClass();
                                    str3 = "onActivityResultImp";
                                    str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
                                    str5 = "setSnsCoverByVideo";
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "updateCoverVideoInfoLocal :".concat(userName));
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = Bj.L0(userName);
                                    L0.f67731xdde069b = userName;
                                    Bj.z0(L0);
                                    L0.f67730x2262335f = 2;
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(videoPath, L0.f67724x6586435)) {
                                        str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                    } else {
                                        str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67724x6586435));
                                        L0.f67724x6586435 = videoPath;
                                    }
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(thumbPath, L0.f67723x63c0190)) {
                                        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67723x63c0190));
                                        L0.f67723x63c0190 = thumbPath;
                                    }
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imagePath, L0.f67722x5a2f915)) {
                                        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67722x5a2f915));
                                        L0.f67722x5a2f915 = imagePath;
                                    }
                                    Bj.W0(L0, false);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                                    oi0.e.f427124d.b(thumbPath, videoPath);
                                }
                                Nj.j();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(7, null);
                                if (com.p314xaae8f345.mm.vfs.w6.j(str7)) {
                                    y7Var.a(str7, "");
                                }
                                if (com.p314xaae8f345.mm.vfs.w6.j(str8)) {
                                    y7Var.f(str8, str9, "", com.p314xaae8f345.mm.vfs.w6.p(str8));
                                }
                                y7Var.F(1);
                                int i19 = y7Var.i();
                                if (str8 != null) {
                                    ta4.b1.f498258a.b(i19, kz5.b0.c(str8));
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.W = i19;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                ba4.b.f100233c = i19;
                                ba4.b.f100232b = java.lang.System.currentTimeMillis();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str6);
                            } else {
                                str3 = "onActivityResultImp";
                                str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().r(c16505x35e9c14f.f230140e, f17);
                            }
                            setResult(-1);
                            finish();
                            str = str3;
                            str2 = str4;
                            break;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingSnsBackgroundUI", "CaptureVideoNormalModel is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                            return;
                        }
                        break;
                    case 9:
                        if (intent != null) {
                            je4.a.f380848a.a(this, 10, intent.getByteArrayExtra("SELECT_OBJECT"), intent.getIntExtra("SELECT_TAB_TYPE", 0), 0);
                            str = "onActivityResultImp";
                            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                            break;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                            return;
                        }
                    case 10:
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                        try {
                            c19792x256d2725.mo11468x92b714fd(intent.getByteArrayExtra("SELECT_OBJECT"));
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingSnsBackgroundUI", e17, "FinderObject error", new java.lang.Object[0]);
                        }
                        if (c19792x256d2725.m76802x2dd01666() != null) {
                            if (c19792x256d2725.m76802x2dd01666().m76964x7f025288() == 2) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
                                if (c6889x9caa3908 != null) {
                                    c6889x9caa3908.f142054h = 4;
                                }
                                if (c6889x9caa3908 != null) {
                                    c6889x9caa3908.f142050d = 4;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            } else if (c19792x256d2725.m76802x2dd01666().m76964x7f025288() == 4) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = ba4.b.f100231a;
                                if (c6889x9caa39082 != null) {
                                    c6889x9caa39082.f142054h = 3;
                                }
                                if (c6889x9caa39082 != null) {
                                    c6889x9caa39082.f142050d = 4;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().q(c19792x256d2725);
                        setResult(-1);
                        finish();
                        str = "onActivityResultImp";
                        str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                        break;
                    default:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                        return;
                }
            } else {
                str = "onActivityResultImp";
                str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h8(this));
                if (intent == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                this.f248156d = stringExtra;
                if (stringExtra == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.f248156d);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String path = this.f248156d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa(og3.a.f426689e, path, null, 4, null));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().r(arrayList2, 0.0f);
                setResult(-1);
                finish();
            }
        } else {
            str = "onActivityResultImp";
            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                return;
            }
            java.lang.String b18 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(getApplicationContext(), intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
            this.f248156d = b18;
            if (b18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                return;
            }
            V6(b18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    public final void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        w94.a aVar = w94.a.f525608a;
        if (aVar.b()) {
            java.lang.String[] e17 = dw3.h.f325744a.e("sns_cover", "video", "thumb");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.d(e17[0], e17[1]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a;
            aVar2.a(d17, aVar2.i());
            d17.a(1, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.C17854xcf9566e3.class.getName());
            d17.a(2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.C17855xdb509203.class.getName());
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a17 = aVar.a();
            d17.f237209n = a17;
            d17.f237218w = a17.f152728h * 1000;
            d17.f237221z = true;
            d17.f237217v = java.lang.Boolean.FALSE;
            ut3.m.f512715a.d(mo55332x76847179(), 8, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, d17, 0);
        } else {
            if (!com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(this, lp0.b.m(), "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, 2)) {
                dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.A().f142046d = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        return com.p314xaae8f345.mm.R.xml.f576484cj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iyk);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18012xe37424fa c18012xe37424fa = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18012xe37424fa) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248157e).h("settings_sns_bg_select_bg");
        if (c18012xe37424fa != null) {
            if (this.f248159g) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
                c18012xe37424fa.R = "Kravanja";
                c18012xe37424fa.M();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248157e).notifyDataSetChanged();
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248157e).v(c18012xe37424fa);
            }
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k8(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + i17 + " " + i18);
        if (i18 != -1) {
            if (i17 == 2 || i17 == 5 || i17 == 6) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i8(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        gm0.j1.i();
        gm0.j1.b().m();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j8(this, i17, i18, intent), 2000L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        } else {
            W6(i17, i18, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onBackPressed();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.f142050d = 3;
        }
        if (c6889x9caa3908 != null) {
            c6889x9caa3908.k();
        }
        ba4.b.f100231a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onCreate(bundle);
        this.f248157e = m79336x8b97809d();
        this.f248158f = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        if (!w94.a.f525608a.b()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f248157e).w("settings_sns_bg_select_from_finder");
        }
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        ba4.b.f100231a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onNewIntent(intent);
        setIntent(intent);
        setResult(-1);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", str + " item has been clicked!");
        boolean z17 = false;
        if (str.equals("settings_sns_bg_select_from_album")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142054h = 10;
            }
            if (c6889x9caa3908 != null) {
                c6889x9caa3908.f142050d = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            gm0.j1.i();
            if (gm0.j1.u().l()) {
                if (w94.a.f525608a.b()) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("is_hide_album_footer", true);
                    intent.putExtra("is_hide_album_preview_footer", true);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(this, 5, 1, 31, 3, false, intent);
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(this, 5, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.A().f142046d = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                db5.t7.k(this, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z17;
        }
        if (str.equals("settings_sns_bg_select_from_finder")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = ba4.b.f100231a;
            if (c6889x9caa39082 != null) {
                c6889x9caa39082.f142054h = 11;
            }
            if (c6889x9caa39082 != null) {
                c6889x9caa39082.f142050d = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            gm0.j1.i();
            if (gm0.j1.u().l()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("BIZ_SCENE", 3);
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(2);
                arrayList.add(4);
                arrayList.add(5);
                arrayList.add(3);
                arrayList.add(1);
                intent2.putIntegerArrayListExtra("TAB_LIST", arrayList);
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).yj(this, intent2, 9);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                db5.t7.k(this, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z17;
        }
        if (!str.equals("settings_sns_bg_take_photo")) {
            if (!str.equals("settings_sns_bg_select_bg")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39083 = ba4.b.f100231a;
            if (c6889x9caa39083 != null) {
                c6889x9caa39083.f142054h = 13;
            }
            if (c6889x9caa39083 != null) {
                c6889x9caa39083.f142050d = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.A().f142046d = 8;
            s0Var.A().f142047e = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39084 = ba4.b.f100231a;
        if (c6889x9caa39084 != null) {
            c6889x9caa39084.f142054h = 12;
        }
        if (c6889x9caa39084 != null) {
            c6889x9caa39084.f142050d = 4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), mo55332x76847179());
            if (a17) {
                X6();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
        } else {
            db5.t7.k(this, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if (iArr[0] == 0) {
                X6();
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l8(this), null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onResume();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f248157e;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }
}
