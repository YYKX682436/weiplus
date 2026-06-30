package p05;

/* loaded from: classes5.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.a3 f431972a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f431973b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f431974c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f431975d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f431976e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f431977f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f431978g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f431979h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f431980i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f431981j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f431982k;

    /* renamed from: l, reason: collision with root package name */
    public static final p05.c3 f431983l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f431984m;

    static {
        p05.a3 a3Var = new p05.a3();
        f431972a = a3Var;
        f431973b = lp0.b.h();
        java.lang.String str = lp0.b.h() + "xlab";
        f431974c = str;
        f431975d = "Models";
        f431976e = str + "/Models";
        f431977f = "Makeup";
        f431978g = str + "/Makeup";
        f431979h = "LutFilters";
        f431980i = "settings";
        f431981j = str + "/settings";
        f431982k = "ImageLabel81V1.0.0.21.xnet";
        p05.c3 c3Var = new p05.c3();
        f431983l = c3Var;
        java.lang.String str2 = "assets:///xlab/Models";
        f431984m = str2;
        gr.b.f356194a.a(str2 + "/ModelListConfig.xml", c3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "init assets config: " + c3Var.f432006c + ", " + c3Var.f432005b);
        int i17 = c3Var.f432005b;
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        if (!(i17 == tq5.i.f502802a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeVisFileUtil", "assets list config is invalid");
        }
        a3Var.a();
    }

    public final void a() {
        if (c()) {
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        e(assets);
    }

    public final boolean b(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        java.lang.String[] list;
        try {
            list = assetManager.list(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeVisFileUtil", e17, "checkFileMd5Match", new java.lang.Object[0]);
        }
        if (list == null) {
            return true;
        }
        if (list.length == 0) {
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p("assets:///" + str);
            java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17, p18)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "checkFileMd5Match: " + str + " is " + p17 + "; " + str2 + " is " + p18);
            d(assetManager, str, str2);
            return false;
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        for (java.lang.String str3 : list) {
            f431972a.b(assetManager, str + '/' + str3, str2 + '/' + str3);
        }
        return false;
    }

    public final boolean c() {
        java.lang.String M;
        java.lang.String str = f431974c + "/version.txt";
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            try {
                M = com.p314xaae8f345.mm.vfs.w6.M(str);
            } catch (java.io.IOException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + M + ", 0b0d3bfcbc324701f09b2f89790f1140");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0b0d3bfcbc324701f09b2f89790f1140", M);
        }
        M = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + M + ", 0b0d3bfcbc324701f09b2f89790f1140");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0b0d3bfcbc324701f09b2f89790f1140", M);
    }

    public final void d(android.content.res.AssetManager assets, java.lang.String assetsPath, java.lang.String localPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assets, "assets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetsPath, "assetsPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "copyAssets: " + assetsPath + "; " + localPath);
        try {
            java.lang.String[] list = assets.list(assetsPath);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.p314xaae8f345.mm.vfs.w6.u(localPath);
                for (java.lang.String str : list) {
                    f431972a.d(assets, assetsPath + '/' + str, localPath + '/' + str);
                }
                return;
            }
            java.io.InputStream open = assets.open(assetsPath);
            try {
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(localPath, false);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(open);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeVisFileUtil", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final void e(android.content.res.AssetManager assets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assets, "assets");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("xlab/");
        java.lang.String str = f431977f;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.lang.String str2 = f431974c;
        sb8.append(str2);
        sb8.append('/');
        sb8.append(str);
        d(assets, sb7, sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("xlab/");
        java.lang.String str3 = f431979h;
        sb9.append(str3);
        d(assets, sb9.toString(), str2 + '/' + str3);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("xlab/");
        java.lang.String str4 = f431980i;
        sb10.append(str4);
        d(assets, sb10.toString(), str2 + '/' + str4);
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("xlab/");
        java.lang.String str5 = f431975d;
        sb11.append(str5);
        d(assets, sb11.toString(), str2 + '/' + str5);
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        sb12.append(str2);
        sb12.append("/version.txt");
        java.lang.String sb13 = sb12.toString();
        byte[] bytes = "0b0d3bfcbc324701f09b2f89790f1140".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.w6.S(sb13, bytes, 0, bytes.length);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            pm0.v.L("XLabFileUtil_checkFile", true, p05.z2.f432275d);
        }
    }

    public final java.lang.String f(rh0.z scene) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        switch (scene.ordinal()) {
            case 0:
                str = "voip.ini";
                break;
            case 1:
                str = "zpbq.ini";
                break;
            case 2:
                str = "live.ini";
                break;
            case 3:
                str = "live_highrank.ini";
                break;
            case 4:
                str = "voip_highrank.ini";
                break;
            case 5:
                str = "sightcap.ini";
                break;
            case 6:
                str = "livepusher.ini";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        java.lang.String str2 = f431981j + '/' + str;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisFileUtil", "getIniFilePath: file not exist " + str2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.a3.g(java.lang.String):java.lang.String");
    }

    public final java.lang.String h(java.lang.String key) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p05.p3 p3Var = p05.p3.f432172a;
        java.util.LinkedList linkedList = p05.p3.f432173b;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p05.q3) obj).f432189a, key)) {
                    break;
                }
            }
            p05.q3 q3Var = (p05.q3) obj;
            str = q3Var != null ? q3Var.f432192d : null;
        }
        if (str != null) {
            return str;
        }
        java.util.Iterator it6 = f431983l.f432007d.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p05.b3) obj2).f431995b, key)) {
                break;
            }
        }
        p05.b3 b3Var = (p05.b3) obj2;
        if (b3Var != null) {
            return b3Var.f431997d;
        }
        return null;
    }
}
