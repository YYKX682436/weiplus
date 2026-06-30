package uv2;

/* loaded from: classes10.dex */
public final class e implements uv2.m {

    /* renamed from: a, reason: collision with root package name */
    public static final uv2.e f512909a = new uv2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final long f512910b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f512911c;

    /* renamed from: d, reason: collision with root package name */
    public static final uv2.r f512912d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f512913e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f512914f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f512915g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f512916h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f512917i;

    static {
        long Ui;
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((qs2.q) ((w40.e) c17)).pj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_video_max_size_buffer, 130023424L);
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size, 943718400L) + Ui2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "finder post expect video max size:" + Ui + ", buffer:" + Ui2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            long Ui3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_video_max_size_buffer_low, 130023424L);
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size_low, 943718400L) + Ui3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "finder post expect video max size low:" + Ui + ", buffer:" + Ui3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[getPostExpectVideoMaxSize] maxSize:" + Ui);
        f512910b = Ui;
        i95.m c18 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        f512911c = ((qs2.q) ((w40.e) c18)).ij();
        f512912d = new uv2.r("FinderPostMediaProcessManager", 1);
        f512913e = new java.util.concurrent.ConcurrentHashMap();
        f512914f = new java.util.concurrent.ConcurrentHashMap();
        f512915g = new java.util.concurrent.ConcurrentHashMap();
        f512916h = jz5.h.b(uv2.d.f512908d);
        f512917i = jz5.h.b(uv2.a.f512899d);
    }

    @Override // uv2.m
    public void a(java.lang.String mediaId, uv2.n result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f512914f;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(mediaId);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((uv2.m) it.next()).a(mediaId, result);
            }
        }
        concurrentHashMap.remove(mediaId);
        f512915g.put(mediaId, result);
    }

    @Override // uv2.m
    public void b(java.lang.String mediaId, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.ArrayList arrayList = (java.util.ArrayList) f512914f.get(mediaId);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((uv2.m) it.next()).b(mediaId, f17);
            }
        }
    }

    public final void c(java.util.List mediaList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        java.util.Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            java.lang.String i17 = f512909a.i((r45.mb4) it.next());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[cancelProcess] originMediaId:" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0) f512913e.remove(i17);
            if (f0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.b(f0Var, null, 1, null);
            }
            f512915g.remove(i17);
        }
    }

    public final boolean d(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.D).mo141623x754a37bb()).r()).booleanValue()) {
            return false;
        }
        i95.m c17 = i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_sns_finder_post_p3_to_bt709_lut, 1) != 1) {
            return false;
        }
        java.lang.String t17 = r26.i0.t(((b92.u2) m()).aj(path), ";", ",", false);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int optInt = new org.json.JSONObject(t17).optInt("ffmpegColorPrimaries");
            r1 = optInt == 11 || optInt == 12;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[isDisplayP3Video] result:" + r1 + " colorSpaceJsonStr:" + t17 + " path:" + path);
        return true;
    }

    public final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, java.lang.String filePath) {
        r45.q23 m76980xaa7f977e;
        r45.ko6 ko6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderObj.getFeedObject().m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) != null) {
            r45.ko6 ko6Var2 = m76980xaa7f977e.f465134w;
            java.lang.String str = ko6Var2 != null ? ko6Var2.f460417i : null;
            if (!(str == null || str.length() == 0)) {
                boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(filePath);
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(filePath);
                i95.m c17 = i95.n0.c(pp0.h0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String Ai = ((yy0.m0) ((pp0.h0) c17)).Ai(filePath);
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, Ai);
                if (!b17 && (ko6Var = m76980xaa7f977e.f465134w) != null) {
                    ko6Var.f460415g = 100;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoChecksumValid] same:" + b17 + " localId:" + finderObj.m59260x51f8f5b0() + " originalCheckSum:" + str + " checkSum:" + Ai + " filePath:" + filePath + " fileExists:" + j17 + " fileSize:" + k17);
                return b17;
            }
        }
        return false;
    }

    public final int f(java.lang.String str, int i17, int i18, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams, boolean z17) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 3L, k17);
        if (z17) {
            g0Var.C(1523L, 3L, k17);
        }
        long j17 = f512910b;
        if (k17 <= j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209566y3).mo141623x754a37bb()).r()).intValue() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] no need zip");
                return 0;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] need zip");
        g0Var.C(1253L, 4L, 1L);
        if (z17) {
            g0Var.C(1523L, 4L, 1L);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = str + ".remux";
        if (str != null) {
            com.p314xaae8f345.mm.p961x7eb7aaf2.C11146xae24e907 c11146xae24e907 = new com.p314xaae8f345.mm.p961x7eb7aaf2.C11146xae24e907();
            c11146xae24e907.f153158d = i17;
            c11146xae24e907.f153159e = i18;
            c11146xae24e907.f153160f = videoParams.f152726f;
            c11146xae24e907.f153161g = videoParams.f152727g;
            c11146xae24e907.f153162h = videoParams.f152728h;
            c11146xae24e907.f153164m = videoParams.f152730m;
            c11146xae24e907.f153165n = videoParams.f152731n;
            c11146xae24e907.f153166o = videoParams.f152732o;
            c11146xae24e907.f153168q = videoParams.f152734q;
            c11146xae24e907.f153169r = videoParams.f152735r;
            c11146xae24e907.f153170s = videoParams.f152736s;
            c11146xae24e907.f153171t = videoParams.f152737t;
            c11146xae24e907.f153172u = videoParams.f152738u;
            c11146xae24e907.f153173v = videoParams.f152739v;
            c11146xae24e907.f153174w = videoParams.f152740w;
            c11146xae24e907.f153175x = videoParams.f152741x;
            c11146xae24e907.f153176y = videoParams.f152742y;
            c11146xae24e907.f153177z = videoParams.f152743z;
            c11146xae24e907.A = videoParams.A;
            c11146xae24e907.B = videoParams.B;
            c11146xae24e907.C = videoParams.C;
            c11146xae24e907.D = videoParams.D;
            c11146xae24e907.E = videoParams.E;
            c11146xae24e907.F = videoParams.F;
            c11146xae24e907.G = videoParams.G;
            c11146xae24e907.H = videoParams.H;
            c11146xae24e907.I = videoParams.I;
            c11146xae24e907.f153167p = videoParams.f152733p;
            c11146xae24e907.f153157J = videoParams.f152723J;
            c11146xae24e907.K = videoParams.K;
            c11146xae24e907.f153163i = videoParams.f152729i;
            i95.m c17 = i95.n0.c(c35.n.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            vf0.n1 n1Var = (vf0.n1) ((c35.n) c17);
            i19 = n1Var.Ai(str, str2, c11146xae24e907, false);
            if (i19 < 0) {
                i19 = n1Var.Ai(str, str2, c11146xae24e907, true);
            }
        } else {
            i19 = -1;
        }
        int i27 = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] zip cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, ret:" + i27);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        g0Var.C(1253L, 5L, elapsedRealtime2);
        if (z17) {
            g0Var.C(1523L, 5L, elapsedRealtime2);
        }
        if (i27 < 0) {
            g0Var.C(1253L, 6L, 1L);
            if (z17) {
                g0Var.C(1523L, 6L, 1L);
            }
            return -2;
        }
        com.p314xaae8f345.mm.vfs.w6.w(str2, str);
        long k18 = com.p314xaae8f345.mm.vfs.w6.k(str2);
        g0Var.C(1253L, 7L, k18);
        if (z17) {
            g0Var.C(1523L, 7L, k18);
        }
        return k18 > j17 ? -3 : 0;
    }

    public final float g(java.lang.String input, float f17, float f18, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.v2()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.a(input, f17, f18, i17, z17, z18);
        }
        return 0.0f;
    }

    public final qc0.e1 h() {
        return (qc0.e1) ((jz5.n) f512917i).mo141623x754a37bb();
    }

    public final java.lang.String i(r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String m75945x2fec8307 = media.m75945x2fec8307(48);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()));
        sb6.append('_');
        sb6.append(media.m75942xfb822ef2(59));
        return sb6.toString();
    }

    public final java.lang.String j(r45.mb4 media, java.lang.String suffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.h(new mn2.g4(media, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.R, "xV99", 0, 0, null, false, null, 248, null), suffix);
    }

    public final java.util.List k(java.util.List mediaList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            r45.mb4 mb4Var = (r45.mb4) it.next();
            if (mb4Var.m75933x41a8a7f2(13)) {
                arrayList.add(mb4Var);
            } else if (!hc2.l0.c(mb4Var)) {
                arrayList.add(mb4Var);
            }
        }
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d l(boolean z17) {
        return z17 ? tu2.s.f503685a.i() : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K2();
    }

    public final bg0.v m() {
        return (bg0.v) ((jz5.n) f512916h).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l n(r45.mb4 r27, boolean r28, java.lang.String r29, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n5 r30) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.n(r45.mb4, boolean, java.lang.String, com.tencent.mm.plugin.finder.report.n5):jz5.l");
    }

    public final boolean o(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.vfs.w6.j(path)) {
            return false;
        }
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(path), false);
            d61.a c17 = d61.c.c(randomAccessFile, new byte[8], d61.a.f308223f, 4194304L);
            long j17 = 8;
            long j18 = c17.f308243d + j17;
            long a17 = c17.a() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[isMoovOptimize] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms beginPos=" + j18 + " remains=" + a17);
            if (1 <= j18 && j18 < 129) {
                z17 = true;
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(randomAccessFile);
            throw th6;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(randomAccessFile);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(r45.mb4 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "media"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r0 = 21
            com.tencent.mm.protobuf.f r1 = r9.m75936x14adae67(r0)
            r45.h70 r1 = (r45.h70) r1
            r2 = 0
            if (r1 == 0) goto L1b
            java.util.LinkedList r1 = r1.f457430d
            if (r1 == 0) goto L1b
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.ho6 r1 = (r45.ho6) r1
            goto L1c
        L1b:
            r1 = r2
        L1c:
            com.tencent.mm.protobuf.f r3 = r9.m75936x14adae67(r0)
            r45.h70 r3 = (r45.h70) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            java.util.LinkedList r3 = r3.f457430d
            if (r3 == 0) goto L32
            int r3 = r3.size()
            if (r3 != r4) goto L32
            r3 = r4
            goto L33
        L32:
            r3 = r5
        L33:
            if (r3 == 0) goto L93
            com.tencent.mm.protobuf.f r3 = r9.m75936x14adae67(r0)
            r45.h70 r3 = (r45.h70) r3
            if (r3 == 0) goto L4a
            r45.g70 r3 = r3.f457437n
            if (r3 == 0) goto L4a
            java.util.LinkedList r3 = r3.f456472e
            if (r3 == 0) goto L4a
            int r3 = r3.size()
            goto L4b
        L4a:
            r3 = r5
        L4b:
            if (r3 != 0) goto L93
            com.tencent.mm.protobuf.f r3 = r9.m75936x14adae67(r0)
            r45.h70 r3 = (r45.h70) r3
            if (r3 == 0) goto L5b
            boolean r3 = r3.f457440q
            if (r3 != 0) goto L5b
            r3 = r4
            goto L5c
        L5b:
            r3 = r5
        L5c:
            if (r3 == 0) goto L93
            com.tencent.mm.protobuf.f r9 = r9.m75936x14adae67(r0)
            r45.h70 r9 = (r45.h70) r9
            if (r9 == 0) goto L69
            r45.tz6 r9 = r9.f457439p
            goto L6a
        L69:
            r9 = r2
        L6a:
            if (r9 != 0) goto L93
            if (r1 == 0) goto L93
            r45.wp6 r9 = r1.f457879t
            if (r9 == 0) goto L84
            if (r9 == 0) goto L76
            java.lang.String r2 = r9.f470912d
        L76:
            if (r2 == 0) goto L81
            int r9 = r2.length()
            if (r9 != 0) goto L7f
            goto L81
        L7f:
            r9 = r5
            goto L82
        L81:
            r9 = r4
        L82:
            if (r9 == 0) goto L93
        L84:
            long r2 = r1.f457869g
            long r6 = r1.f457868f
            long r2 = r2 - r6
            long r6 = r1.f457871i
            long r0 = r1.f457870h
            long r6 = r6 - r0
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L93
            goto L94
        L93:
            r4 = r5
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.p(r45.mb4):boolean");
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, boolean z17, java.lang.String videoPath) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.q23 m76980xaa7f977e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (!(videoPath.length() == 0)) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "optimize result: " + ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) c17).mo10231x922a682f(videoPath) + ", isOptimize:" + o(videoPath) + " videoPath:" + videoPath);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[optimizeAndUpdateCheckSum] localId:" + finderObj.m59260x51f8f5b0() + " needCalcCheckSum:" + z17 + " videoPath:" + videoPath);
        if (!z17 || (m76802x2dd01666 = finderObj.getFeedObject().m76802x2dd01666()) == null || (m76980xaa7f977e = m76802x2dd01666.m76980xaa7f977e()) == null) {
            return;
        }
        r45.ko6 ko6Var = m76980xaa7f977e.f465134w;
        java.lang.String str = ko6Var != null ? ko6Var.f460417i : null;
        i95.m c18 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        java.lang.String Ai = ((yy0.m0) ((pp0.h0) c18)).Ai(videoPath);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, Ai);
        r45.ko6 ko6Var2 = m76980xaa7f977e.f465134w;
        if (ko6Var2 != null) {
            ko6Var2.f460417i = Ai;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[calcCheckSum] isSame:" + b17 + " localId:" + finderObj.m59260x51f8f5b0() + " originalCheckSum:" + str + " newCheckSum:" + Ai + " filePath:" + videoPath);
    }

    public final uv2.n r(r45.mb4 media, boolean z17, java.lang.String outputPath, java.lang.String from, boolean z18, yz5.l progressCallback) {
        uv2.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressCallback, "progressCallback");
        java.lang.String i17 = i(media);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] originMediaId:" + i17 + " isLongVideo:" + z17 + " from:" + from + " originMediaUrl:" + media.m75945x2fec8307(48) + " url:" + media.m75945x2fec8307(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object remove = f512915g.remove(i17);
        h0Var.f391656d = remove;
        if (remove == null) {
            java.lang.Object obj = new java.lang.Object();
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            uv2.c cVar = new uv2.c(progressCallback, h0Var, obj, c0Var);
            java.lang.String i18 = i(media);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processMediaAsync] originMediaId:" + i18);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f512914f;
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(i18);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(cVar);
            concurrentHashMap.put(i18, arrayList);
            uv2.p pVar = new uv2.p(media, z17, outputPath, this);
            uv2.r rVar = f512912d;
            rVar.getClass();
            fp0.o oVar = rVar.f512945a;
            if (oVar.e(pVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TaskExecutor", "[addTask] isInRunningTask");
            } else {
                oVar.a(pVar);
            }
            synchronized (obj) {
                if (!c0Var.f391645d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] wait originMediaId:" + i17);
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderMediaProcessManager", "[processMediaSync] wait interrupted originMediaId:" + i17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] notify originMediaId:" + i17);
                }
            }
        }
        if (!z18 && (nVar = (uv2.n) h0Var.f391656d) != null && nVar.f512937d == 0 && nVar.f512935b.f257326a && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nVar.f512934a.f457435i.f458308d, outputPath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] moveFile src:" + nVar.f512934a.f457435i.f458308d + " dest:" + outputPath);
            com.p314xaae8f345.mm.vfs.w6.c(nVar.f512934a.f457435i.f458308d, outputPath);
            nVar.f512934a.f457435i.f458308d = outputPath;
        }
        uv2.n nVar2 = (uv2.n) h0Var.f391656d;
        return nVar2 == null ? new uv2.n(new r45.h70(), new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z(false, false, false, 0, false, false, false, 126, null), 0.0f, 0, 0, 0, 60, null) : nVar2;
    }

    public final void s(java.lang.String endReason, boolean z17, boolean z18, long j17, java.lang.String outputPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endReason, "endReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        i95.m c17 = i95.n0.c(pp0.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((yy0.m7) ((pp0.l0) c17)).nj(endReason, z17, z18, j17, outputPath);
    }

    public final int t(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(r45.mb4 r23, java.lang.String r24, r45.mb4 r25, float r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.u(r45.mb4, java.lang.String, r45.mb4, float, boolean):void");
    }
}
