package v62;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f515035a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f515036b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f515037c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f515038d = new java.util.HashMap();

    public static boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQbarDataManager", "hy: null in fastJudgeInBlacklist");
            return false;
        }
        if (!f515036b.contains(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQbarDataManager", "hy: %s already in blacklist", str);
        return true;
    }

    public static java.lang.String b() {
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483.f181392t;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getParent() + "/extqbar";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQbarDataManager", "hy: face dir not exist. mk dir");
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        return str.concat("/ext_qbar_config.csv");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v62.e.c(java.lang.String):void");
    }

    public static void d() {
        if (!com.p314xaae8f345.mm.vfs.w6.j(b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQbarDataManager", "hy: not found csv file");
            gm0.j1.d().g(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.k0(46));
            return;
        }
        try {
            java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(b());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQbarDataManager", "hy: found qrcode config");
            c(M);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtQbarDataManager", e17, "hy: read config file failed!", new java.lang.Object[0]);
        }
    }
}
