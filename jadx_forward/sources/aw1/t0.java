package aw1;

/* loaded from: classes12.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.t0 f96215a = new aw1.t0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f96216b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f96217c = {"pdf", "docx", "xlsx", "doc", "xls", "zip", "pptx", "dwg", "rar", "mp3", "m4a", "txt", "wps", "PDF", "cdr", "ai", "et", "psd", "ofd", "stp", "mp4", "jpg", "wav", "ppt", "exe", "apk", "7z", "dxf", "csv", "JPG", "MOV", "STEP", "XLS", "MP3", "prj", "tif", "bin", "xlsm", "aac", "m4v", "DWG", "GBQ6", "prt", "wma", "lnk", "1", "MP4", "x_t", "XLSX", "xml", "png", "HEIC", "amr", "html", "rtf", "skp", "plt", "stl", "PNG"};

    /* renamed from: d, reason: collision with root package name */
    public static long f96218d;

    /* renamed from: e, reason: collision with root package name */
    public static long f96219e;

    /* renamed from: f, reason: collision with root package name */
    public static long f96220f;

    /* renamed from: g, reason: collision with root package name */
    public static long f96221g;

    /* renamed from: h, reason: collision with root package name */
    public static long f96222h;

    public static /* synthetic */ void b(aw1.t0 t0Var, com.p314xaae8f345.mm.vfs.x1 x1Var, int i17, boolean z17, boolean z18, boolean z19, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 32) != 0) {
            str = "";
        }
        t0Var.a(x1Var, i17, z17, z18, z19, str);
    }

    public final void a(com.p314xaae8f345.mm.vfs.x1 x1Var, int i17, boolean z17, boolean z18, boolean z19, java.lang.String str) {
        if (x1Var == null) {
            return;
        }
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(x1Var.f294765b);
        java.lang.String[] strArr = f96217c;
        if (!kz5.z.G(strArr, n17)) {
            n17 = "apk";
            if (!kz5.z.G(strArr, "apk")) {
                n17 = "others";
            }
        }
        java.lang.String str2 = n17;
        if (i17 == 21) {
            if ((str.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                boolean h17 = com.p314xaae8f345.mm.p962x4177e4be.j.h(str);
                long j17 = x1Var.f294767d;
                if (h17) {
                    f96221g++;
                    f96222h += j17;
                } else {
                    f96219e++;
                    f96220f += j17;
                }
            }
        }
        long j18 = x1Var.f294767d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        aw1.s0 s0Var = new aw1.s0(j18, i17, z17, z18, z19, str2);
        long j19 = 1000;
        long j27 = (s0Var.f96206a / j19) / j19;
        int i18 = j27 < 1 ? 1 : j27 < 10 ? 2 : j27 < 25 ? 3 : j27 < 50 ? 4 : j27 < 100 ? 5 : j27 < 200 ? 6 : j27 < 500 ? 7 : j27 < 1000 ? 8 : 9;
        int i19 = s0Var.f96209d ? 1 : 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append('_');
        sb6.append(s0Var.f96207b);
        sb6.append('_');
        sb6.append(i19);
        java.lang.String sb7 = sb6.toString();
        java.util.HashMap hashMap = f96216b;
        if (!hashMap.containsKey(sb7)) {
            hashMap.put(sb7, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(sb7);
        if (arrayList != null) {
            arrayList.add(s0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "addC2CFileItem, item = " + s0Var);
    }

    public final java.lang.String c(cl0.g gVar) {
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", "|", false);
    }

    public final synchronized void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("report_c2c_file_exist_last_report_" + gm0.j1.b().h(), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "reportExistC2CHistory, timeSpent = " + currentTimeMillis);
        if (!z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (currentTimeMillis < 86400000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "reportExistC2CHistory, not time, return");
                return;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("report_c2c_file_exist_history", gm0.j1.b().h(), 1);
        java.lang.String[] b17 = J2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
        if (b17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "reportExistC2CHistory, history is empty, return");
            return;
        }
        java.lang.String[] b18 = J2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "allKeys(...)");
        for (java.lang.String str2 : b18) {
            java.lang.String u17 = J2.u(str2, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            if (u17.length() > 0) {
                try {
                    java.util.Map b19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.i.b(new cl0.g(u17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "reportExistC2CHistory, key = " + str2 + ", reportDataMap = " + b19);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stock_chat_history_report", b19, 35066);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportC2CFileExist", th6, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("report_c2c_file_exist_last_report_" + gm0.j1.b().h(), java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "reportExistC2CHistory done");
    }

    public final void e() {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.lang.String str = "MicroMsg.ReportC2CFileExist";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileExist", "saveVideoFormatData, h264VideoCount = " + f96219e + ", h264VideoSize = " + f96220f + ", h265VideoCount = " + f96221g + ", h265VideoSize = " + f96222h);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("MicroMsg.ReportC2CFileExist", gm0.j1.b().h(), 1);
        J2.putLong("h264_video_cnt", f96219e);
        J2.putLong("h264_video_size", f96220f);
        J2.putLong("h265_video_cnt", f96221g);
        J2.putLong("h265_video_size", f96222h);
        java.util.HashMap hashMap3 = f96216b;
        java.util.Iterator it = hashMap3.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap3.get(str2);
            if (arrayList != null) {
                java.util.HashMap hashMap4 = new java.util.HashMap();
                java.util.HashMap hashMap5 = new java.util.HashMap();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it6 = arrayList.iterator();
                java.util.HashMap hashMap6 = hashMap3;
                java.util.Iterator it7 = it;
                java.util.HashMap hashMap7 = hashMap4;
                java.util.HashMap hashMap8 = hashMap5;
                int i17 = 0;
                long j17 = 0;
                int i18 = 0;
                long j18 = 0;
                long j19 = 0;
                int i19 = 0;
                int i27 = 0;
                long j27 = 0;
                while (it6.hasNext()) {
                    java.util.Iterator it8 = it6;
                    aw1.s0 s0Var = (aw1.s0) it6.next();
                    java.lang.StringBuilder sb7 = sb6;
                    boolean z17 = s0Var.f96208c;
                    long j28 = j19;
                    long j29 = s0Var.f96206a;
                    if (z17) {
                        i19++;
                        j27 += j29;
                    } else {
                        i27++;
                        j17 += j29;
                    }
                    if (s0Var.f96210e) {
                        i18++;
                        j18 += j29;
                    } else {
                        i17++;
                        j28 += j29;
                    }
                    int i28 = i17;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("ileItem.fileType = ");
                    long j37 = j17;
                    int i29 = s0Var.f96207b;
                    sb8.append(i29);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                    if (i29 == 30) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("ileItem.fileType = ");
                        java.lang.String str3 = s0Var.f96211f;
                        sb9.append(str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb9.toString());
                        hashMap = hashMap7;
                        hashMap.put(str3, java.lang.Long.valueOf(((java.lang.Number) hashMap.getOrDefault(str3, 0L)).longValue() + 1));
                        hashMap2 = hashMap8;
                        hashMap2.put(str3, java.lang.Long.valueOf(((java.lang.Number) hashMap2.getOrDefault(str3, 0L)).longValue() + j29));
                    } else {
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                    }
                    hashMap7 = hashMap;
                    hashMap8 = hashMap2;
                    sb6 = sb7;
                    it6 = it8;
                    j19 = j28;
                    i17 = i28;
                    j17 = j37;
                }
                long j38 = j19;
                java.lang.StringBuilder sb10 = sb6;
                java.util.HashMap hashMap9 = hashMap7;
                java.util.HashMap hashMap10 = hashMap8;
                cl0.g gVar = new cl0.g();
                java.lang.String str4 = str;
                gVar.o("type", 1);
                gVar.p("size", j27);
                gVar.o("num", i19);
                cl0.g gVar2 = new cl0.g();
                gVar2.o("type", 2);
                gVar2.p("size", j17);
                gVar2.o("num", i27);
                java.lang.String str5 = c(gVar) + '#' + c(gVar2);
                cl0.g gVar3 = new cl0.g();
                gVar3.o("type", 1);
                gVar3.p("size", j38);
                gVar3.o("num", i17);
                cl0.g gVar4 = new cl0.g();
                gVar4.o("type", 2);
                gVar4.p("size", j18);
                gVar4.o("num", i18);
                java.lang.String str6 = c(gVar3) + '#' + c(gVar4);
                for (java.lang.String str7 : hashMap9.keySet()) {
                    cl0.g gVar5 = new cl0.g();
                    gVar5.h("type", str7);
                    gVar5.h("size", hashMap10.get(str7));
                    gVar5.h("num", hashMap9.get(str7));
                    sb10.append(c(gVar5).concat("#"));
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{"_"}, false, 0, 6, null);
                if (f07.size() < 3) {
                    it = it7;
                    str = str4;
                    hashMap3 = hashMap6;
                } else {
                    java.lang.String str8 = (java.lang.String) f07.get(0);
                    java.lang.String str9 = (java.lang.String) f07.get(1);
                    java.lang.String str10 = (java.lang.String) f07.get(2);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str9, "0")) {
                        return;
                    }
                    java.util.Map k17 = kz5.c1.k(new jz5.l("file_size_range", str8), new jz5.l("file_memory_type", str9), new jz5.l("scan_start_timestamp", java.lang.Long.valueOf(f96218d)), new jz5.l("file_upload_or_download", str10), new jz5.l("chat_file_source_list", str5), new jz5.l("chat_scene_type_list", str6), new jz5.l("file_send_type_list", ""), new jz5.l("file_extension_type_list", sb10));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("report_c2c_file_exist_history", gm0.j1.b().h(), 1).D(str2, new cl0.g(k17).toString());
                    str = str4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addC2CFileItem, data = " + k17);
                    it = it7;
                    hashMap3 = hashMap6;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0428 A[Catch: all -> 0x0013, TryCatch #0 {, blocks: (B:5:0x0009, B:9:0x0016, B:11:0x002c, B:13:0x0032, B:15:0x0039, B:18:0x0043, B:20:0x0084, B:22:0x008f, B:25:0x0099, B:26:0x011f, B:28:0x0125, B:125:0x012b, B:126:0x0630, B:130:0x064d, B:30:0x0139, B:37:0x01ac, B:52:0x01d7, B:54:0x01e7, B:57:0x0213, B:59:0x021f, B:61:0x022d, B:64:0x0271, B:66:0x028e, B:68:0x0299, B:69:0x029d, B:71:0x02a3, B:74:0x02ab, B:77:0x02af, B:84:0x02d7, B:86:0x0314, B:87:0x033a, B:89:0x0364, B:90:0x0381, B:92:0x03bc, B:93:0x03d9, B:95:0x03eb, B:96:0x0428, B:98:0x0447, B:99:0x0462, B:101:0x0488, B:102:0x04c8, B:104:0x04f5, B:106:0x0505, B:108:0x0534, B:109:0x054f, B:110:0x0561, B:112:0x05ad, B:113:0x05ca, B:116:0x05ea, B:117:0x060a), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r59) {
        /*
            Method dump skipped, instructions count: 1655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.t0.f(com.tencent.wcdb.support.CancellationSignal):void");
    }
}
