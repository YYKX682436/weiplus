package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class m2 extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f247595e = {"CREATE TABLE IF NOT EXISTS SnsMedia ( local_id INTEGER PRIMARY KEY, seqId LONG, type INT, createTime LONG, userName VARCHAR(40), totallen INT, offset INT, local_flag INT, tmp_path TEXT, nums INT, try_times INT, StrId VARCHAR(40), upload_buf TEXT, reserved1 INT, reserved2 TEXT, reserved3 TEXT, reserved4 TEXT, reserved5 TEXT )", "CREATE INDEX IF NOT EXISTS serverSnsMediaTimeIndex ON SnsMedia ( createTime )"};

    /* renamed from: f, reason: collision with root package name */
    public static int f247596f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f247597g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247598d;

    static {
        new android.graphics.Point();
    }

    public m2(l75.k0 k0Var) {
        this.f247598d = k0Var;
    }

    public static boolean D0(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "convertImg2WxamZip >> origPath: %s destPath: %s", str, str2);
            boolean z17 = ((h12.z) i95.n0.c(h12.z.class)).Zi(n0(bitmap), str, str2, bitmap.getWidth(), bitmap.getHeight(), i17, i18, 2, 0, p1(str)) == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z17;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.snsMediaStorage", "convertImg2WxamZip bmp OutOfMemoryError! rollback");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    public static boolean D2(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.g(inputStream, null, options);
                boolean y27 = y2(options);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return y27;
            } catch (java.lang.Exception unused2) {
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return false;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                throw th6;
            }
        } catch (java.lang.Exception unused5) {
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }

    public static void G2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveUserCommentExifInterface", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (pc4.d.f434943a.A()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(str), str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveUserCommentExifInterface", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean J0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.J0(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean L0(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean P0 = P0(str, str2, str3, z17, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return P0;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r20v15 ??), method size: 2696
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static boolean P0(java.lang.String r34, java.lang.String r35, java.lang.String r36, boolean r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.P0(java.lang.String, java.lang.String, java.lang.String, boolean, int, int):boolean");
    }

    public static boolean S1(android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        java.lang.String str = options.outMimeType;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.indexOf("jpg") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        if (lowerCase.indexOf("jpeg") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isJpeg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return false;
    }

    public static boolean T1(android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        java.lang.String str = options.outMimeType;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.indexOf("jpg") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        if (lowerCase.indexOf("jpeg") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        if (lowerCase.indexOf("png") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSysSupportedPic", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean W0(java.lang.String r26, java.lang.String r27, java.lang.String r28, float r29) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.W0(java.lang.String, java.lang.String, java.lang.String, float):boolean");
    }

    public static boolean X1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if ("hevc".equals(x51.o1.Q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        if (((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            boolean Yj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Yj();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return Yj;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "isUseHevcUpload: hevc not support");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseHevcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return false;
    }

    public static boolean b1(java.lang.String str, int i17, int i18, android.graphics.Bitmap.CompressFormat compressFormat, int i19, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        int i27;
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        if (n07 == null || (i27 = n07.outWidth) <= 0 || (i28 = n07.outHeight) <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        boolean d17 = d1(n07, str, i27, i28, i17, i18, compressFormat, i19, str2, str3, z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createThumbNail", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return d17;
    }

    public static boolean b2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean Ri = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(64);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return Ri;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d1(android.graphics.BitmapFactory.Options r33, java.lang.String r34, int r35, int r36, int r37, int r38, android.graphics.Bitmap.CompressFormat r39, int r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.d1(android.graphics.BitmapFactory$Options, java.lang.String, int, int, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0289 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f1(android.graphics.BitmapFactory.Options r20, java.lang.String r21, int r22, int r23, int r24, android.graphics.Bitmap.CompressFormat r25, int r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.f1(android.graphics.BitmapFactory$Options, java.lang.String, int, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    public static boolean h2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        boolean z17 = true;
        if ("wxam".equals(x51.o1.Q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "isUploadUseWxamImg: hevc not support");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUploadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseWxamUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x023d A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TRY_LEAVE, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026b A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TRY_ENTER, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029d A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a0 A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5 A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, LOOP:0: B:68:0x017e->B:70:0x0189, LOOP_END, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e A[EDGE_INSN: B:71:0x018e->B:60:0x018e BREAK  A[LOOP:0: B:68:0x017e->B:70:0x0189], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168 A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b A[Catch: Exception -> 0x02bf, OutOfMemoryError -> 0x02da, TryCatch #2 {Exception -> 0x02bf, OutOfMemoryError -> 0x02da, blocks: (B:3:0x0011, B:5:0x0038, B:9:0x0041, B:11:0x0047, B:13:0x004b, B:15:0x0055, B:17:0x005f, B:18:0x0067, B:20:0x0070, B:22:0x007d, B:23:0x0094, B:25:0x0098, B:27:0x00a5, B:29:0x00b4, B:31:0x00c3, B:32:0x0233, B:34:0x023d, B:37:0x026b, B:39:0x0291, B:44:0x029d, B:45:0x02a2, B:48:0x02a0, B:50:0x00d9, B:53:0x0106, B:54:0x011b, B:56:0x012e, B:57:0x0146, B:60:0x018e, B:62:0x01ac, B:63:0x01c5, B:64:0x014d, B:67:0x016a, B:68:0x017e, B:70:0x0189, B:72:0x0153, B:75:0x0162, B:77:0x0168, B:79:0x013b), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i1(java.lang.String r29, java.lang.String r30, java.lang.String r31, float r32) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.i1(java.lang.String, java.lang.String, java.lang.String, float):boolean");
    }

    public static android.graphics.Bitmap k1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        int i17 = n07.outWidth;
        int i18 = n07.outHeight;
        int i19 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
        int i27 = i17 >= i18 ? 960 : 640;
        if (i17 >= i18) {
            i19 = 640;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, java.lang.Math.min(i19, n07.outHeight), java.lang.Math.min(i27, i17), false);
        if (T == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeBitmapWithSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return w07;
    }

    public static boolean k2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if ("wxpc".equals(x51.o1.Q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        boolean Zj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Zj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseWxpcUpload", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return Zj;
    }

    public static android.graphics.Bitmap m0(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addWhiteBackgroundToBitmap", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addWhiteBackgroundToBitmap", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAddWhiteBgToTransparentImg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_add_white_bg_to_transparent_img, true));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAddWhiteBgToTransparentImg", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (!valueOf.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addWhiteBackgroundToBitmap", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return bitmap;
        }
        if (!bitmap.hasAlpha()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addWhiteBackgroundToBitmap", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/SnsMediaStorage", "addWhiteBackgroundToBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/storage/SnsMediaStorage", "addWhiteBackgroundToBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addWhiteBackgroundToBitmap", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return createBitmap;
    }

    public static byte[] n0(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bitmap2RgbA", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmap2RgbA", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        android.graphics.Bitmap m07 = m0(bitmap);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(m07.getByteCount());
        m07.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bitmap2RgbA", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return array;
    }

    public static boolean o2(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.io.InputStream inputStream = null;
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.g(E, null, options);
                if (options.outMimeType.toLowerCase().indexOf("webp") >= 0) {
                    if (E != null) {
                        try {
                            E.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                    return true;
                }
                if (E != null) {
                    try {
                        E.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return false;
            } catch (java.lang.Exception unused3) {
                inputStream = E;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return false;
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream = E;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWebp", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                throw th;
            }
        } catch (java.lang.Exception unused6) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static byte[] p1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageAigcData", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (!pc4.d.f434943a.A()) {
            byte[] bArr = new byte[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageAigcData", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return bArr;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.snsMediaStorage", "getImageAigcData get realPathError %s", str);
            byte[] bArr2 = new byte[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageAigcData", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return bArr2;
        }
        ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).getClass();
        byte[] m64974x2d3d9617 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64974x2d3d9617(i17);
        if (m64974x2d3d9617 == null) {
            m64974x2d3d9617 = new byte[0];
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageAigcData", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return m64974x2d3d9617;
    }

    public static void u0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkWxamThumbTransform", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableUploadVideoThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17845x53034810 c17845x53034810 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17845x53034810();
        int h17 = bm5.o1.f104252a.h(c17845x53034810);
        boolean z17 = true;
        if (h17 != 2 && (h17 == 3 || 1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c17845x53034810))) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableUploadVideoThumbWxam", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWxamThumbTransform", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        } else {
            z0(str, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWxamThumbTransform", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        }
    }

    public static boolean y0(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip >> origPath: %s destPath: %s", str, str2);
            boolean z17 = ((h12.z) i95.n0.c(h12.z.class)).Zi(n0(bitmap), str, str2, bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight(), 2, 0, p1(str)) == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z17;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip bmp OutOfMemoryError! rollback");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    public static boolean y2(android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (options == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        java.lang.String str = options.outMimeType;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
        if (str.toLowerCase().indexOf("wxam") >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWxam", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return false;
    }

    public static boolean z0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip >> origPath: %s destPath: %s", str, str2);
            android.graphics.Bitmap b17 = r94.a.b(str, null, 0.0f);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip error.fileExist:%b origPath:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str)), str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return false;
            }
            byte[] n07 = n0(b17);
            byte[] p17 = p1(str);
            b17.recycle();
            boolean z17 = ((h12.z) i95.n0.c(h12.z.class)).Zi(n07, str, str2, b17.getWidth(), b17.getHeight(), b17.getWidth(), b17.getHeight(), 2, 0, p17) == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z17;
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.snsMediaStorage", "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertImg2WxamWithoutZip", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0847  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int C1(ca4.w0 r34) {
        /*
            Method dump skipped, instructions count: 2130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.C1(ca4.w0):int");
    }

    public boolean F2(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        android.database.Cursor D = this.f247598d.D("SnsMedia", null, "StrId=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        boolean moveToFirst = D.moveToFirst();
        boolean z18 = false;
        l75.k0 k0Var = this.f247598d;
        if (moveToFirst) {
            D.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            if (l2Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            } else {
                z17 = ((int) k0Var.l("SnsMedia", "local_id", l2Var.b())) != -1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertMedia", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                z18 = z17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return z18;
        }
        D.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        android.content.ContentValues b17 = l2Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(str);
        z17 = k0Var.p("SnsMedia", b17, "StrId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceMediaByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return z17;
    }

    public java.util.List K1(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertElment", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertElment", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ca4.w0 w0Var = (ca4.w0) it.next();
            int C1 = C1(w0Var);
            if (C1 == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertElment", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
                return null;
            }
            ca4.w0 w0Var2 = new ca4.w0(C1, w0Var.f121570e);
            w0Var2.f121573h = w0Var.f121573h;
            w0Var2.f121572g = w0Var.f121572g;
            w0Var2.f121574i = w0Var.f121574i;
            w0Var2.f121582q = w0Var.f121582q;
            w0Var2.f121583r = w0Var.f121583r;
            w0Var2.f121586u = w0Var.f121586u;
            w0Var2.f121584s = w0Var.f121584s;
            w0Var2.f121585t = w0Var.f121585t;
            w0Var2.f121587v = w0Var.f121587v;
            w0Var2.f121588w = w0Var.f121588w;
            linkedList.add(w0Var2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertElment", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ca4.w0 O2(ca4.w0 r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "setImageExtInfo failed: "
            java.lang.String r1 = "setImageExtInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            r3 = 0
            r4 = 0
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r6 = 1
            r5.inJustDecodeBounds = r6     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.io.InputStream r4 = com.p314xaae8f345.mm.vfs.w6.E(r11)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            boolean r6 = r4.markSupported()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            if (r6 != 0) goto L25
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r4 = r6
        L25:
            r6 = 1048576(0x100000, float:1.469368E-39)
            r4.mark(r6)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r11, r5)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r4.reset()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            com.tencent.mm.compatible.util.Exif r6 = new com.tencent.mm.compatible.util.Exif     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r6.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r6.m43598x45dadedd(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            int r6 = r6.m43592x7a249f0b()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r7 = 90
            if (r6 == r7) goto L4a
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 != r7) goto L45
            goto L4a
        L45:
            int r6 = r5.outHeight     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            int r0 = r5.outWidth     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L55
            goto L4e
        L4a:
            int r6 = r5.outWidth     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            int r0 = r5.outHeight     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L55
        L4e:
            r3 = r0
        L4f:
            r4.close()     // Catch: java.io.IOException -> L6f
            goto L6f
        L53:
            r5 = move-exception
            goto L59
        L55:
            r10 = move-exception
            goto L7e
        L57:
            r5 = move-exception
            r6 = r3
        L59:
            java.lang.String r7 = "MicroMsg.snsMediaStorage"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L55
            r8.append(r11)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L55
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r7, r5, r0, r8)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L6f
            goto L4f
        L6f:
            r10.f121572g = r3
            r10.f121573h = r6
            long r3 = com.p314xaae8f345.mm.vfs.w6.k(r11)
            int r11 = (int) r3
            r10.f121574i = r11
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return r10
        L7e:
            if (r4 == 0) goto L83
            r4.close()     // Catch: java.io.IOException -> L83
        L83:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.O2(ca4.w0, java.lang.String):ca4.w0");
    }

    public ca4.w0 P1(ca4.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertSight", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2();
        long i17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        l2Var.f247581e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i18 = w0Var.f121570e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        l2Var.f247579c = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        if (w0Var.f121581p != 7) {
            s0(str2);
        }
        u0(str2);
        r45.mj4 mj4Var = new r45.mj4();
        mj4Var.f462098f = w0Var.f121569d;
        mj4Var.f462097e = w0Var.f121568c;
        mj4Var.f462106q = w0Var.f121575j;
        mj4Var.f462107r = w0Var.f121576k;
        mj4Var.f462100h = 0;
        mj4Var.f462099g = new r45.cj4();
        mj4Var.f462102m = 0;
        mj4Var.f462104o = w0Var.f121577l;
        mj4Var.f462096d = w0Var.f121567b;
        mj4Var.f462103n = 2;
        mj4Var.f462109t = str;
        mj4Var.f462110u = str2;
        mj4Var.f462112w = w0Var.f121579n;
        mj4Var.I = w0Var.f121588w;
        try {
            l2Var.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i19 = l2Var.f247585i | 4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        l2Var.f247585i = i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int l17 = (int) this.f247598d.l("SnsMedia", "local_id", l2Var.b());
        java.lang.String str5 = "Locall_path" + l17;
        java.lang.String X = ca4.z0.X(str5);
        java.lang.String b07 = ca4.z0.b0(str5);
        java.lang.String c07 = ca4.z0.c0(str5);
        java.lang.String Z = ca4.z0.Z(str5);
        java.lang.String u17 = u1(str5);
        com.p314xaae8f345.mm.vfs.w6.u(u17);
        com.p314xaae8f345.mm.vfs.w6.c(str2, u17 + X);
        com.p314xaae8f345.mm.vfs.w6.c(str2, u17 + b07);
        com.p314xaae8f345.mm.vfs.w6.c(str2, u17 + c07);
        com.p314xaae8f345.mm.vfs.w6.c(str, u17 + Z);
        com.p314xaae8f345.mm.vfs.w6.c(str2, je4.c.f380850a.a() + b07);
        mj4Var.f462109t = u17 + Z;
        mj4Var.f462110u = u17 + b07;
        mj4Var.f462112w = w0Var.f121579n;
        try {
            l2Var.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.snsMediaStorage", "uploadInfo to byteArray error");
        }
        l2Var.l(str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        } else {
            r45.cj4 cj4Var = new r45.cj4();
            cj4Var.f453129e = 1;
            cj4Var.f453128d = str3;
            mj4Var.f462099g = cj4Var;
            mj4Var.f462103n = 0;
            mj4Var.A = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                r45.cj4 cj4Var2 = new r45.cj4();
                cj4Var2.f453129e = 1;
                cj4Var2.f453128d = str4;
                mj4Var.f462101i.add(cj4Var2);
            }
            try {
                l2Var.m(mj4Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.snsMediaStorage", e17, "", new java.lang.Object[0]);
            }
            l2Var.n();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHasCdnUrl", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        }
        Y2(l17, l2Var);
        O2(w0Var, mj4Var.f462110u);
        w0Var.f121571f = l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertSight", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return w0Var;
    }

    public void V2(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScreenSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        f247596f = i17;
        f247597g = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "SCREEN %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScreenSize", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
    }

    public int Y2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMediaByLocal", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        int p17 = this.f247598d.p("SnsMedia", l2Var.b(), "local_id=?", new java.lang.String[]{"" + i17});
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMediaByLocal", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return p17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n1(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2();
        android.database.Cursor D = this.f247598d.D("SnsMedia", null, "local_id=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        l2Var.a(D);
        D.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByMediaLocalId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return l2Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 o1(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2();
        android.database.Cursor D = this.f247598d.D("SnsMedia", null, "StrId=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return null;
        }
        l2Var.a(D);
        D.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getByStrId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return l2Var;
    }

    public final void s0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_video_thumb_resize, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return;
        }
        if (!fj6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        if (n07 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return;
        }
        int min = java.lang.Math.min(n07.outWidth, n07.outHeight);
        if (min <= 288) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return;
        }
        float f17 = (288 * 1.0f) / min;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "checkAndResizeThumb1 origin size:[%d %d] ratio:%f", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight), java.lang.Float.valueOf(f17));
        android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str), f17, f17, true);
        if (F0 != null) {
            try {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(F0, 70, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "checkAndResizeThumb change size:%d to:size:%d", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.snsMediaStorage", e17, "checkAndResizeThumb error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndResizeThumb", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
    }

    public java.lang.String u1(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        java.lang.String str3 = "";
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            return "";
        }
        java.lang.String g17 = kk.k.g(str.getBytes());
        if (g17.length() >= 1) {
            str2 = g17.charAt(0) + "/";
        } else {
            str2 = "";
        }
        if (g17.length() >= 2) {
            str3 = g17.charAt(1) + "/";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di() + str2 + str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return str4;
    }

    public int z1() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenWidth", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            i17 = f247596f;
        } else {
            i17 = f247596f;
            int i18 = f247597g;
            if (i17 > i18) {
                i17 = i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidth", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        return i17;
    }
}
