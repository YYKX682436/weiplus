package ec4;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f332696a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f332697b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kj4 f332698c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f332700e;

    /* renamed from: d, reason: collision with root package name */
    public int f332699d = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f332701f = "";

    public static final /* synthetic */ java.lang.String a(ec4.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        java.lang.String str = jVar.f332701f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return str;
    }

    public final ec4.j b(java.lang.String mixPath, java.lang.String thumbPath) {
        float f17;
        r45.lj4 lj4Var;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixPath, "mixPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(mixPath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath >> mixPath: " + mixPath + ", sightMd5: " + p17 + ", thumbPath: " + thumbPath);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f332697b;
        java.util.LinkedList linkedList = (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) ? null : a90Var.f451373h;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath >> mediaObj is error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        java.lang.Object obj = linkedList.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.jj4 jj4Var = (r45.jj4) obj;
        if (jj4Var.f459389e != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaObj is upload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        java.lang.String Id = jj4Var.f459388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
        this.f332701f = Id;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaObj url: " + jj4Var.f459391g + ", desc: " + jj4Var.f459390f + ", thumb: " + jj4Var.f459393i + ", id: " + jj4Var.f459403s);
        dw3.d0 a17 = dw3.e0.f325735a.a(mixPath);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath commit video_info:" + a17);
            f17 = ((float) a17.f325725c) / 1000.0f;
        } else {
            f17 = 0.0f;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = mixPath.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(sb7));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.p314xaae8f345.mm.vfs.w6.c(mixPath, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni());
        byte[] bytes2 = thumbPath.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        sb8.append(kk.k.g(bytes2));
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.mm.vfs.w6.c(thumbPath, sb9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        r45.jj4 f18 = m21.y.f();
        f18.f459388d = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", 6, sb7, p17, "", "");
        f18.f459389e = 6;
        if (com.p314xaae8f345.mm.vfs.w6.k(sb7) <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            f18 = null;
        } else {
            ca4.w0 w0Var = new ca4.w0(sb7, 6);
            w0Var.f121579n = p17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().P1(w0Var, sb7, sb9, "", "");
            if (w0Var.f121573h <= 0 || w0Var.f121572g <= 0 || w0Var.f121574i <= 0) {
                lj4Var = null;
            } else {
                lj4Var = new r45.lj4();
                lj4Var.f461054e = w0Var.f121573h;
                lj4Var.f461053d = w0Var.f121572g;
                lj4Var.f461055f = w0Var.f121574i;
            }
            f18.f459388d = "Locall_path" + w0Var.f121571f;
            f18.f459398p = lj4Var;
            f18.f459403s = w0Var.f121571f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        }
        if (f18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMag.BackgroundVideoFinishUploader", "share img o.imagePath is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        f18.f459390f = jj4Var.f459390f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18.f459397o)) {
            f18.f459397o = jj4Var.f459390f;
        }
        f18.R = f17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = this.f332697b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17202);
        c19807x593d17202.f39014x86965dde.f451373h.clear();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = this.f332697b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17203);
        c19807x593d17203.f39014x86965dde.f451373h.add(f18);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f454799d = f18.f459403s;
        r45.kj4 kj4Var = this.f332698c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kj4Var);
        kj4Var.f460278h.clear();
        r45.kj4 kj4Var2 = this.f332698c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kj4Var2);
        kj4Var2.f460278h.add(ec4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f332696a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b226);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17204 = this.f332697b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17204);
        c17933xe8d1b226.m70466xfabce6e3(c19807x593d17204);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f332696a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b2262);
            r45.kj4 kj4Var3 = this.f332698c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kj4Var3);
            c17933xe8d1b2262.m70455x99ecb2f1(kj4Var3.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "finish >> " + f18.f459403s);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
            java.lang.String thumbSize = java.lang.String.valueOf(com.p314xaae8f345.mm.vfs.w6.k(sb9));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaThumbSize", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbSize, "thumbSize");
            dx1.g.f326022a.i("SnsPublishProcess", "thumbSizeList", thumbSize);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaThumbSize", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().w3(this.f332699d, this.f332696a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return this;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMag.BackgroundVideoFinishUploader", "parse postinfo error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f332697b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d1720);
        r45.q1 q1Var = c19807x593d1720.f39019x6e5c4c04;
        r45.kj4 kj4Var = this.f332698c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kj4Var);
        java.util.Iterator it = kj4Var.f460278h.iterator();
        java.lang.String str = null;
        while (true) {
            int i17 = 1;
            if (!it.hasNext()) {
                break;
            }
            r45.ec4 ec4Var = (r45.ec4) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(ec4Var.f454799d);
            try {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.mj4().mo11468x92b714fd(n17.h());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
                r45.mj4 mj4Var = (r45.mj4) mo11468x92b714fd;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = this.f332697b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17202);
                if (c19807x593d17202.f39012x33e0f24f != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = this.f332697b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17203);
                    mj4Var.f462113x = c19807x593d17203.f39012x33e0f24f.f472379d;
                }
                if ((q1Var != null ? q1Var.f465089m : null) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q1Var.f465089m.f461587d)) {
                    mj4Var.f462113x = q1Var.f465089m.f461587d;
                }
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd2 = new r45.vh4().mo11468x92b714fd(this.f332700e);
                if (mo11468x92b714fd2 != null) {
                    ((r45.vh4) mo11468x92b714fd2).f469769f = 0;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSightExtInfo");
                mj4Var.B = (r45.vh4) mo11468x92b714fd2;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17204 = this.f332697b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d17204);
                int i18 = c19807x593d17204.f39014x86965dde.f451370e;
                mj4Var.f462114y = i18;
                if (i18 == 1 || i18 == 15) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj4Var.f462113x)) {
                        r45.vh4 vh4Var = mj4Var.B;
                        if (vh4Var != null && mj4Var.f462114y == 15) {
                            if (!vh4Var.f469768e) {
                                i17 = 2;
                            }
                            mj4Var.C = i17;
                        }
                    } else {
                        mj4Var.C = 5;
                    }
                }
                n17.m(mj4Var.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(ec4Var.f454799d, n17);
                str = mj4Var.f462112w;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMag.BackgroundVideoFinishUploader", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
                return false;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f332699d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f332696a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b226);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "commit sns info ret %d, typeFlag %d sightMd5 %s", valueOf, java.lang.Integer.valueOf(c17933xe8d1b226.m70373x5384133c()), str);
        if (this.f332699d > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f332696a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b2262);
            if (c17933xe8d1b2262.m70373x5384133c() == 15) {
                java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", this.f332699d);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.f246306a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.x(j17, str, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + this.f332701f);
        if (this.f332701f.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ec4.i(this, null), 2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return true;
    }

    public final ec4.j d(int i17, byte[] extInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMag.BackgroundVideoFinishUploader", "setLocalSnsInfoId >> snsLocalId: " + i17);
        this.f332701f = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        this.f332696a = i18;
        ec4.j jVar = null;
        this.f332697b = i18 != null ? i18.m70371x485d7() : null;
        this.f332699d = i17;
        this.f332700e = extInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f332696a;
        r45.kj4 m70365xa8f45ee4 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70365xa8f45ee4() : null;
        this.f332698c = m70365xa8f45ee4;
        if (this.f332696a != null && this.f332697b != null && m70365xa8f45ee4 != null) {
            jVar = this;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return jVar;
    }
}
