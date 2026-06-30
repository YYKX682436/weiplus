package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f264893a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f264894b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f264895c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f264896d = new java.util.HashMap();

    public static boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path is null");
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
        if (options.outWidth <= 1 || options.outHeight <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath file path invalid: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1059L, 4L, 1L, false);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1059L, 3L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path: %s", str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.os.Bundle r16, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 r17, android.os.Bundle r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.b(android.os.Bundle, com.tencent.mm.ui.widget.MMWebView, android.os.Bundle, boolean):void");
    }

    public static void c(java.util.Map map, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.w0 w0Var) {
        if (c22633x83752a59 == null || map == null) {
            if (w0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).a();
                return;
            }
            return;
        }
        if (f264894b == -1) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_xweb_url_to_path_v2, 1);
            f264894b = Ni;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "openXWebUrlToPath %d", java.lang.Integer.valueOf(Ni));
        }
        if (!(f264894b == 1)) {
            if (w0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).a();
                return;
            }
            return;
        }
        java.lang.String str = (java.lang.String) map.get("current");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (w0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).a();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = np0.b.f420322a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str3 = np0.b.f420322a;
        sb7.append(str3);
        sb7.append("/");
        sb7.append(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(java.lang.System.currentTimeMillis())));
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(sb8);
        java.lang.String str5 = a18.f294812f;
        if (str5 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, null);
        if (!(m19.a() ? m19.f294799a.F(m19.f294800b) : false)) {
            com.p314xaae8f345.mm.vfs.z2 m27 = b3Var.m(a18, m19);
            if (m27.a()) {
                m27.f294799a.r(m27.f294800b);
            }
        }
        sb6.append(sb8);
        sb6.append("/reader_");
        sb6.append(kk.k.g(str.getBytes()));
        sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        java.lang.String sb9 = sb6.toString();
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
            f264895c = c22633x83752a59.n0(str, sb9, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.v0(w0Var, str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreviewImgHelper", "getImageBitmapToFile savePath exist");
        ((java.util.HashMap) f264896d).put(str, sb9);
        f264895c = true;
        if (w0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.o1) w0Var).b();
        }
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !f264895c) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) f264896d).get(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1059L, 5L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1059L, 2L, 1L, false);
        }
        return str2;
    }
}
