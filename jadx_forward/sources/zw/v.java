package zw;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.v f558076a = new zw.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f558077b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f558078c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f558079d = com.p314xaae8f345.mm.vfs.q7.c("bizcache") + "/media_tmp/";

    public final void a(java.lang.String path, java.lang.String postPathName) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postPathName, "postPathName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: path:".concat(path));
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) f558077b).get(path);
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: preCompressFile hit: ".concat(str));
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = f558079d;
                sb6.append(str2);
                sb6.append(postPathName);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, sb6.toString())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSelectPhotoCompressHelper", "compress: just return");
                    return;
                }
                long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, str2 + postPathName, false);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("compress: result len: ");
                sb7.append(d17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSelectPhotoCompressHelper", sb7.toString());
                if (d17 > 0) {
                    return;
                }
            }
        }
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20582x7e1d131f());
        if (c17 != 0) {
            if (c17 == 1) {
                i17 = 1440;
            } else if (c17 == 2) {
                i17 = 2160;
            }
            int i18 = i17;
            fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
            java.lang.String str3 = f558079d;
            ((ee0.v4) o4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.P0(str3, path, postPathName, false, 0, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
        }
        i17 = 1080;
        int i182 = i17;
        fe0.o4 o4Var2 = (fe0.o4) i95.n0.c(fe0.o4.class);
        java.lang.String str32 = f558079d;
        ((ee0.v4) o4Var2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.P0(str32, path, postPathName, false, 0, i182);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPic", "com.tencent.mm.feature.sns.SnsUtilService");
    }

    public final java.lang.String b(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.Map map = f558078c;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(path);
        if (str == null) {
            str = com.p314xaae8f345.mm.vfs.w6.p(path);
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                map.put(path, str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSelectPhotoCompressHelper", "getFileMD5String: md5 is empty for path: ".concat(path));
            }
        }
        return str;
    }

    public final java.lang.String c(java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        return "image_".concat(md52);
    }
}
