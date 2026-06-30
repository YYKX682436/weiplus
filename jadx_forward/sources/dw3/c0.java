package dw3;

/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.c0 f325715a = new dw3.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f325716b = jz5.h.b(dw3.a0.f325711d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f325717c = jz5.h.b(dw3.b0.f325713d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f325718d = jz5.h.b(dw3.z.f325828d);

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f325719e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("media_file_key");

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f325720f = jz5.h.b(dw3.l.f325761d);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashSet f325721g = new java.util.HashSet();

    public final void A(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "markTimingDeleteFile file " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f325719e;
        java.util.Set w17 = o4Var.w("media_timing_delete_set", hashSet);
        w17.add(str);
        o4Var.F("media_timing_delete_set", w17);
    }

    public final boolean B(android.graphics.Bitmap bitmap, java.lang.String thumbPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        if (com.p314xaae8f345.mm.vfs.w6.j(thumbPath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", thumbPath.concat(" is exit"));
            com.p314xaae8f345.mm.vfs.w6.h(thumbPath);
        }
        if (bitmap != null && i17 > 0) {
            android.graphics.Bitmap f17 = f(bitmap, i17);
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(f17, 60, android.graphics.Bitmap.CompressFormat.JPEG, thumbPath, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "saveThumb: target=" + i17 + ", source=[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ',' + bitmap.getByteCount() + "], output=[" + f17.getWidth() + ',' + f17.getHeight() + ']');
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaFileUtil", "thumbSize > 0 and save error");
                return false;
            }
        } else {
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaFileUtil", "saveThumb error");
                return false;
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, thumbPath, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "saveThumb: source=[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ',' + bitmap.getByteCount() + "], output=[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']');
            } catch (java.io.IOException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaFileUtil", "save error");
                return false;
            }
        }
        return true;
    }

    public final boolean C(java.lang.String videoPath, java.lang.String thumbPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        return B(ai3.d.p(videoPath), thumbPath, i17);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        if (android.text.TextUtils.isEmpty(configProvider.E)) {
            configProvider.E = n();
        }
        if (android.text.TextUtils.isEmpty(configProvider.D)) {
            java.lang.String str2 = "photoCapture_" + java.lang.System.currentTimeMillis();
            dw3.h hVar = dw3.h.f325744a;
            if (hVar.f()) {
                str = hVar.c("capture", str2);
            } else {
                java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i("wcf://temp/" + str2, true);
                if (i17 == null) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + '/' + str2;
                } else {
                    str = i17;
                }
            }
            configProvider.D = str;
        }
        if (android.text.TextUtils.isEmpty(configProvider.A)) {
            configProvider.A = m();
        }
        c(configProvider);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        if (android.text.TextUtils.isEmpty(configProvider.E)) {
            configProvider.E = t21.w2.p() + "/vsg_output_" + java.lang.System.currentTimeMillis();
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        dw3.h hVar = dw3.h.f325744a;
        if (!hVar.f()) {
            if (android.text.TextUtils.isEmpty(configProvider.C)) {
                configProvider.C = t21.o2.Bi().Ai() + "/vsg_thumb_" + java.lang.System.currentTimeMillis();
            }
            if (android.text.TextUtils.isEmpty(configProvider.B)) {
                configProvider.B = t21.o2.Bi().Ai() + "/vsg_output_" + java.lang.System.currentTimeMillis();
                return;
            }
            return;
        }
        java.lang.String b17 = hVar.b("edit");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(configProvider.C)) {
            configProvider.C = b17 + "/vsg_thumb_" + currentTimeMillis;
        }
        if (android.text.TextUtils.isEmpty(configProvider.B)) {
            configProvider.B = b17 + "/vsg_output_" + currentTimeMillis;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:4|(1:6)(1:(3:56|(1:58)|59)(1:60))|7|(3:46|47|(5:49|10|(2:12|(3:14|15|16)(7:18|(1:20)|21|(2:24|22)|25|26|(1:33)(1:30)))(1:34)|31|32))|9|10|(0)(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        r4 = r8;
        r8 = r11;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        r11 = null;
        r4 = r8;
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: all -> 0x0106, Exception -> 0x010b, TRY_ENTER, TryCatch #4 {Exception -> 0x010b, all -> 0x0106, blocks: (B:12:0x0074, B:14:0x007a, B:18:0x008d, B:20:0x0093, B:21:0x009d, B:22:0x00a5, B:26:0x00ac, B:28:0x00bb, B:30:0x00c1, B:33:0x00d7, B:24:0x00ec, B:34:0x00f0), top: B:10:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[Catch: all -> 0x0106, Exception -> 0x010b, TRY_LEAVE, TryCatch #4 {Exception -> 0x010b, all -> 0x0106, blocks: (B:12:0x0074, B:14:0x007a, B:18:0x008d, B:20:0x0093, B:21:0x009d, B:22:0x00a5, B:26:0x00ac, B:28:0x00bb, B:30:0x00c1, B:33:0x00d7, B:24:0x00ec, B:34:0x00f0), top: B:10:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(android.content.Context r8, android.content.Intent r9, java.lang.String r10, java.lang.String r11, android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.c0.d(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, android.net.Uri):java.lang.String");
    }

    public final java.lang.String e(java.lang.String str, java.lang.String videoPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        java.lang.String thumbPath = dw3.h.f325744a.c("other", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            C(videoPath, thumbPath, i17);
        } else if (i17 > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
            B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str), thumbPath, i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            thumbPath = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "checkSaveVideoThumb: " + i17 + ", " + thumbPath + ", " + videoPath + ", " + str);
        return thumbPath;
    }

    public final android.graphics.Bitmap f(android.graphics.Bitmap bitmap, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (i17 <= 0 || java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) <= i17) {
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            i18 = (int) (((bitmap.getHeight() * i17) * 1.0f) / bitmap.getWidth());
        } else {
            i18 = i17;
            i17 = (int) (((bitmap.getWidth() * i17) * 1.0f) / bitmap.getHeight());
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i17, i18, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }

    public final void g(java.lang.String newVideoPath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newVideoPath, "newVideoPath");
        if (newVideoPath.length() == 0) {
            return;
        }
        java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(newVideoPath);
        com.p314xaae8f345.mm.vfs.w6.u(r17);
        if (z17) {
            com.p314xaae8f345.mm.vfs.w6.t(r17);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:4|(1:6)(1:56)|7|(3:46|47|(6:49|50|10|(2:12|(3:14|15|16)(7:18|(1:20)|21|(2:24|22)|25|26|(1:33)(1:30)))(1:34)|31|32))|9|10|(0)(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r7 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        r7 = r2;
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a A[Catch: all -> 0x00fe, Exception -> 0x0103, TRY_ENTER, TryCatch #5 {Exception -> 0x0103, all -> 0x00fe, blocks: (B:12:0x007a, B:14:0x0080, B:18:0x0093, B:20:0x0099, B:21:0x00ab, B:22:0x00b3, B:26:0x00ba, B:28:0x00c9, B:30:0x00cf, B:33:0x00e5, B:24:0x00fa, B:34:0x0108), top: B:10:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108 A[Catch: all -> 0x00fe, Exception -> 0x0103, TRY_LEAVE, TryCatch #5 {Exception -> 0x0103, all -> 0x00fe, blocks: (B:12:0x007a, B:14:0x0080, B:18:0x0093, B:20:0x0099, B:21:0x00ab, B:22:0x00b3, B:26:0x00ba, B:28:0x00c9, B:30:0x00cf, B:33:0x00e5, B:24:0x00fa, B:34:0x0108), top: B:10:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(android.content.Context r17, android.content.Intent r18, java.lang.String r19, java.lang.String r20, android.net.Uri r21) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.c0.h(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, android.net.Uri):java.lang.String");
    }

    public final void i(ct0.b bVar) {
        if (bVar != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new dw3.m(bVar), "deleteDaemonMediaFile");
        }
    }

    public final void j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "deleteDir >> filePath: " + str);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        boolean z17 = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MediaFileUtil", "path:" + str + "  fileExist:" + j17, new java.lang.Object[0]);
        if (str != null && r26.n0.B(str, "DCIM", true)) {
            z17 = true;
        }
        if (!z17 && j17) {
            ((ku5.t0) ku5.t0.f394148d).h(new dw3.p(str), "MediaFileUtil_deleteMediaFile");
        }
    }

    public final void k(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "deleteMarkFilePath " + str);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f325719e;
        java.util.Set w17 = o4Var.w("media_file_delete_set", hashSet);
        if (w17.contains(str)) {
            w17.remove(str);
            j(str);
        }
        o4Var.F("media_file_delete_set", w17);
    }

    public final void l(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "deleteVideoFileWithCheckPath " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        boolean z17 = false;
        if (str != null) {
            java.lang.String Ai = t21.o2.Bi().Ai();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ai, "getAccVideoPath(...)");
            if (r26.n0.B(str, Ai, false)) {
                z17 = true;
            }
        }
        if (z17) {
            j(str);
        }
    }

    public final java.lang.String m() {
        dw3.h hVar = dw3.h.f325744a;
        if (hVar.f()) {
            java.lang.String k17 = ai3.d.k(hVar.b("capture"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getTempFileName(...)");
            return k17;
        }
        java.lang.String k18 = ai3.d.k(t21.o2.Bi().Ai());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getTempFileName(...)");
        return k18;
    }

    public final java.lang.String n() {
        java.lang.String str = "photoEdited_" + java.lang.System.currentTimeMillis();
        dw3.h hVar = dw3.h.f325744a;
        if (hVar.f()) {
            return hVar.c("edit", str);
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i("wcf://temp/" + str, true);
        if (i17 != null) {
            return i17;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath() + '/' + str;
    }

    public final java.lang.String o(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((java.lang.String) ((jz5.n) f325718d).mo141623x754a37bb()) + str + ".p");
        sb6.append(".mixa");
        return sb6.toString();
    }

    public final java.lang.String p(long j17) {
        jz5.g gVar = f325717c;
        com.p314xaae8f345.mm.vfs.w6.u((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        return ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()) + "thumb" + j17 + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
    }

    public final boolean q(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "configProvider : " + c16993xacc19624 + "  isCaptureMedia:" + z17 + "  ");
        if (!z17) {
            return false;
        }
        if (c16993xacc19624 == null) {
            return true;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new dw3.q(c16993xacc19624), "mux_save_work_daemon");
        return true;
    }

    public final void r(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new dw3.r(str));
    }

    public final void s(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new dw3.s(str));
    }

    public final boolean t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "configProvider : " + c16993xacc19624 + "  isCaptureMedia:" + z17 + "  ");
        if (!z17) {
            return false;
        }
        if (c16993xacc19624 == null) {
            return true;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(c16993xacc19624.A)) {
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c16993xacc19624.A, c16993xacc19624.B);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo inputVideoPath not exist :" + c16993xacc19624.A);
        }
        ((ku5.t0) ku5.t0.f394148d).h(new dw3.t(c16993xacc19624), "handleNoNeedRemuxCaptureVideo");
        return true;
    }

    public final void u(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "configProvider : " + c16993xacc19624 + "  isCaptureMedia:" + z17 + "   change:" + z18);
        if (c16993xacc19624 != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new dw3.u(c16993xacc19624, c16993xacc19624, z17, z18), "mux_save_work");
        }
    }

    public final void v(boolean z17, java.lang.String inputVideoPath, java.lang.String outputVideoPath, boolean z18, boolean z19, boolean z27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputVideoPath, "inputVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideoPath, "outputVideoPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "handleRemuxVideo >> saveSourceMedia: " + z17 + ", savaToSysAlbumIfMediaEdited: " + z18 + ", isCaptureMedia: " + z19 + ". change: " + z27 + ", inputVideoPath: " + inputVideoPath + ", outputVideoPath:" + outputVideoPath);
        ((ku5.t0) ku5.t0.f394148d).h(new dw3.v(z17, inputVideoPath, outputVideoPath, z19, z18, z27), "mux_save_work");
    }

    public final void w(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "cache delete file " + str);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f325719e;
        java.util.Set w17 = o4Var.w("media_file_delete_set", hashSet);
        w17.add(str);
        o4Var.F("media_file_delete_set", w17);
    }

    public final void x(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "cache delete key: " + str + " , file " + str2);
        if (str == null || str2 == null) {
            return;
        }
        f325719e.D(str, str2);
    }

    public final void y(java.lang.String str) {
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "photoEdited_", false)) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "markDeletePhotoEditFile: " + str);
            w(str);
        }
    }

    public final void z(java.util.ArrayList imagePathList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePathList, "imagePathList");
        java.util.Iterator it = imagePathList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            boolean z17 = false;
            if (str != null && r26.n0.B(str, "photoEdited_", false)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "markDeletePhotoEditFile: " + str);
                f325715a.w(str);
            }
        }
    }
}
