package j33;

/* loaded from: classes10.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f378961a = {"DCIM/Video screenshots", "DCIM/Screen recordings", "DCIM/ScreenRecorder", "Movies/Screenrecords"};

    /* renamed from: b, reason: collision with root package name */
    public static final int f378962b = lp0.b.m().substring(0, lp0.b.m().length() - 1).toLowerCase().hashCode();

    /* renamed from: c, reason: collision with root package name */
    public static final int f378963c = b("DCIM/Camera");

    /* renamed from: d, reason: collision with root package name */
    public static final int f378964d = b("download");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f378965e = new java.util.ArrayList(3);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f378966f = new java.util.ArrayList(4);

    static {
        java.lang.String[] strArr = {"Pictures/Screenshots", "DCIM/Screenshots", "Screenshot"};
        for (int i17 = 0; i17 < 3; i17++) {
            f378965e.add(java.lang.Integer.valueOf(b(strArr[i17])));
        }
        java.lang.String[] strArr2 = f378961a;
        for (int i18 = 0; i18 < 4; i18++) {
            f378966f.add(java.lang.Integer.valueOf(b(strArr2[i18])));
        }
    }

    public static int a(java.lang.String str) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        t21.d3.k(str, c19767x257d7f, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
        return c19767x257d7f.f38864x6ac9171;
    }

    public static int b(java.lang.String str) {
        return (android.os.Environment.getExternalStorageDirectory().toString() + "/" + str).toLowerCase().hashCode();
    }

    public static java.lang.String c(java.lang.String str, t23.j2 j2Var, long j17) {
        if (str != null) {
            return str.concat("#*$").concat(j2Var != null ? j2Var.f496731f : "").concat(java.lang.String.valueOf(j17));
        }
        throw new java.lang.NullPointerException("getCacheKey filePath is null!!!");
    }

    public static java.lang.String d(java.lang.String str, t23.j2 j2Var, int i17) {
        if (str != null) {
            return str.concat("#*$").concat(j2Var != null ? j2Var.f496731f : "").concat(-1 != i17 ? java.lang.String.valueOf(i17) : "");
        }
        throw new java.lang.NullPointerException("getDecodeTaskKey filePath is null!!!");
    }

    public static java.lang.String e(long j17) {
        return j17 >= 1073741824 ? java.lang.String.format("%dG", java.lang.Long.valueOf(((j17 / 1024) / 1024) / 1024)) : j17 >= 1048576 ? java.lang.String.format("%dM", java.lang.Long.valueOf((j17 / 1024) / 1024)) : j17 > 0 ? java.lang.String.format("%dK", java.lang.Long.valueOf(j17 / 1024)) : "";
    }

    public static java.lang.String f(java.lang.String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        int i17 = length - 1;
        if (str.charAt(i17) == '/') {
            int lastIndexOf = str.lastIndexOf(47, length - 2);
            return str.substring(lastIndexOf <= 0 ? 0 : lastIndexOf + 1, i17);
        }
        int lastIndexOf2 = str.lastIndexOf(47);
        return lastIndexOf2 <= 0 ? str : str.substring(lastIndexOf2 + 1);
    }

    public static java.lang.String g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("getFilePathFromKey key is null!!!");
        }
        int indexOf = str.indexOf("#*$");
        if (indexOf > 0) {
            return str.substring(0, indexOf);
        }
        throw new java.lang.NullPointerException("getFilePathFromKey end <= 0!!!");
    }

    public static long h() {
        try {
            return ip.c.l();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryUtil", "[getMaxSendVideoSize] catch exception:" + e17.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00dc. Please report as an issue. */
    public static java.lang.String i(android.content.Context context, int i17, int i18, int i19, java.lang.String str, boolean z17, java.util.ArrayList arrayList, boolean z18, boolean z19) {
        java.lang.String str2;
        java.lang.String str3;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_enable_vlog, false);
        int r17 = gm0.j1.b().m() ? gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) : 0;
        boolean z27 = r17 == 1 || fj6;
        boolean z28 = r17 == 1 || fj7;
        java.lang.String valueOf = java.lang.String.valueOf(i19);
        if (z18) {
            str3 = "";
            str2 = "";
        } else {
            str2 = valueOf;
            str3 = "/";
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).getIntent().getBooleanExtra("key_force_preview_on_confirm", false)) {
            if (i18 == 0 || i19 <= 1) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
            }
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + i18 + str3 + str2 + ")";
        }
        if (i17 == 4) {
            if (z27 && j(arrayList, true)) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573718fj3) + "(" + i18 + str3 + str2 + ")";
            }
            if (i18 == 0 || i19 <= 1) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
            }
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + "(" + i18 + str3 + str2 + ")";
        }
        if (i17 != 11) {
            if (i17 != 19) {
                if (i17 != 22) {
                    if (i17 != 25) {
                        if (i17 != 7) {
                            if (i17 != 8 && i17 != 28) {
                                if (i17 != 29) {
                                    if (i17 != 33) {
                                        if (i17 != 34) {
                                            switch (i17) {
                                                case 13:
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    switch (i17) {
                                                        case 36:
                                                        case 38:
                                                        case 40:
                                                            break;
                                                        case 37:
                                                        case 41:
                                                        case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                                                            break;
                                                        case 39:
                                                        case 42:
                                                            break;
                                                        default:
                                                            switch (i17) {
                                                                case 45:
                                                                case 47:
                                                                    break;
                                                                case 46:
                                                                    break;
                                                                default:
                                                                    if (i18 == 0 || i19 <= 1) {
                                                                        return context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572006w2 : com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
                                                                    }
                                                                    if (z18) {
                                                                        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18)};
                                                                        return z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fis, objArr) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fiu, objArr);
                                                                    }
                                                                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)};
                                                                    return z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fir, objArr2) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fit, objArr2);
                                                            }
                                                    }
                                                case 15:
                                                case 16:
                                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals("album_business_bubble_media_by_coordinate")) {
                                                        if (i18 == 0 || i19 <= 1) {
                                                            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
                                                        }
                                                        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + i18 + str3 + str2 + ")";
                                                    }
                                                    if (i18 != 0 || i19 <= 1) {
                                                        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                                                    }
                                                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + "(" + i18 + str3 + str2 + ")";
                                            }
                                        }
                                    }
                                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                                }
                            }
                        }
                    }
                    if (i18 == 0 || i19 <= 1) {
                        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
                    }
                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + i18 + str3 + str2 + ")";
                }
                if (z28 && j(arrayList, true)) {
                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573718fj3) + "(" + i18 + str3 + str2 + ")";
                }
                if (i18 == 0 || i19 <= 1) {
                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
                }
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + "(" + i18 + str3 + str2 + ")";
            }
            if (i18 == 0 || i19 <= 1) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
            }
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2) + "(" + i18 + str3 + str2 + ")";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
        }
        if (i18 != 0) {
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573717fj2);
    }

    public static boolean j(java.util.ArrayList arrayList, boolean z17) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        boolean z18 = false;
        boolean z19 = false;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (abstractC15633xee433078.r()) {
                z19 = true;
            } else if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                i17++;
                z18 = true;
            }
            if (z18 && z19) {
                break;
            }
            if (i17 > 1) {
                break;
            }
        }
        return z17 ? (z18 && z19) || i17 > 1 : (z18 && z19) || i17 >= 1;
    }

    public static void k(long j17, java.lang.String str, java.lang.String str2, boolean z17, int i17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        o70.j jVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryUtil", "imageSelectedChange username is empty imagePath:%s", str);
            return;
        }
        boolean z19 = abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryUtil", "imageSelectedChange islive, isParsed: " + c15632xfc4fd0d0.G + " videoPath: " + c15632xfc4fd0d0.f219963e + " coverTimeStampMs:" + c15632xfc4fd0d0.F + " videoDuration:" + c15632xfc4fd0d0.B);
        }
        ((b80.u) ((o70.e) i95.n0.c(o70.e.class))).getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) ((jz5.n) b80.u.f99809p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6Var, "access$getPreBuildImgFolder(...)");
        o70.h hVar = new o70.h(r6Var);
        hVar.a(z19 ? abstractC15633xee433078.o() : str);
        hVar.f424771f = j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        hVar.f424772g = str2;
        hVar.f424773h = !z17 ? 1 : 0;
        hVar.f424769d = i17;
        hVar.f424768c = 0;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078;
            if (c15632xfc4fd0d02.A == 1) {
                jVar = new o70.j();
                java.lang.String str3 = c15632xfc4fd0d02.f219963e;
                if (str3 == null) {
                    str3 = "";
                }
                jVar.f424783a = str3;
                jVar.f424784b = c15632xfc4fd0d02.B;
                jVar.f424785c = c15632xfc4fd0d02.F;
                hVar.f424777l = jVar;
                b80.u uVar = (b80.u) ((o70.e) i95.n0.c(o70.e.class));
                uVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "preBuildImg " + hVar);
                jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 0L, 1L, false);
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) uVar.f99813g).mo141623x754a37bb(), null, new b80.n(hVar, uVar, null), 1, null);
            }
        }
        jVar = null;
        hVar.f424777l = jVar;
        b80.u uVar2 = (b80.u) ((o70.e) i95.n0.c(o70.e.class));
        uVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "preBuildImg " + hVar);
        jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 0L, 1L, false);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) uVar2.f99813g).mo141623x754a37bb(), null, new b80.n(hVar, uVar2, null), 1, null);
    }

    public static boolean l() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false);
    }

    public static boolean m() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_enable_vlog, false);
    }

    public static boolean n() {
        int i17 = t23.p0.k().f496830f;
        if (i17 == 4) {
            return l();
        }
        if (i17 == 14 || i17 == 22) {
            return m();
        }
        return false;
    }

    public static void o(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    public static void p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, long j17, java.lang.String str, java.lang.String str2, boolean z17, int i17, boolean z18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5158xe0676aba c5158xe0676aba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5158xe0676aba();
        am.n nVar = c5158xe0676aba.f135507g;
        nVar.getClass();
        nVar.f88915a = str;
        nVar.getClass();
        nVar.getClass();
        nVar.getClass();
        nVar.getClass();
        nVar.f88916b = t23.p0.k().f496830f;
        c5158xe0676aba.b(android.os.Looper.getMainLooper());
    }

    public static boolean q() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion >= 29;
    }

    public static void r(java.util.List list, int i17, int i18) {
        if (i17 > i18) {
            while (i17 > i18) {
                java.util.Collections.swap(list, i17, i17 - 1);
                i17--;
            }
        } else {
            while (i17 < i18) {
                int i19 = i17 + 1;
                java.util.Collections.swap(list, i17, i19);
                i17 = i19;
            }
        }
    }
}
