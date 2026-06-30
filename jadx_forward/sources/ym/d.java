package ym;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f544656a = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/cara/so";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f544657b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f544658c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f544659d = false;

    public static boolean a(ym.c cVar) {
        java.lang.String d17 = d();
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(d17);
                if (p17.equals(cVar.f544654b)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "so md5 error: %s", p17);
                return false;
            }
        }
        return false;
    }

    public static synchronized void b() {
        boolean z17;
        synchronized (ym.d.class) {
            java.lang.String str = f544656a;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!a17.f294812f.equals(l17)) {
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
            ym.c c17 = c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "env null");
                return;
            }
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).H(new ym.b(".zst"))) {
                if (r6Var != null) {
                    r6Var.l();
                }
            }
            if (!a(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "so md5 not match");
                java.lang.String d17 = d();
                if (android.text.TextUtils.isEmpty(d17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "checkSoMd5 so path null");
                } else {
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(d17);
                    if (r6Var2.m()) {
                        r6Var2.l();
                    }
                }
            }
            if (c() == null ? false : com.p314xaae8f345.mm.vfs.w6.j(d())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cara.CaraEnv", "env ready! just use it!");
                return;
            }
            if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_plugin_cara_so_download_open", "1", false, true), 1) != 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "so can't download");
                return;
            }
            java.lang.String str3 = c17.f544654b;
            f544657b = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("cara");
            long j17 = M.getLong("cara_so_download", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 < 86400000) {
                z17 = true;
            } else {
                M.putLong("cara_so_download", currentTimeMillis);
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Cara.CaraEnv", "so download repeat in 24 hours");
                return;
            }
            if (!f544658c) {
                fp.d0.n("wechatzstd");
                f544658c = true;
            }
            java.lang.String d18 = d();
            java.lang.String str4 = c17.f544655c;
            java.lang.String str5 = d18 + "." + java.lang.System.currentTimeMillis() + ".zst";
            ym.a aVar = new ym.a(d18, str3);
            com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var = new com.p314xaae8f345.mm.p971x6de15a2e.j2(str4, 0);
            j2Var.f153578k = false;
            j2Var.f153576i = "GET";
            j2Var.f153580m = true;
            j2Var.f153587t = true;
            j2Var.f153582o = 2;
            j2Var.f153579l = str5;
            j2Var.f153581n = new zm.a(j2Var, aVar, str5);
            j2Var.a();
        }
    }

    public static ym.c c() {
        java.lang.String j17 = j62.e.g().j("clicfg_plugin_cara_env_so_name_64", "", true, true);
        java.lang.String j18 = j62.e.g().j("clicfg_plugin_cara_env_so_md5_64", "", true, true);
        java.lang.String j19 = j62.e.g().j("clicfg_plugin_cara_env_so_min_version", "", true, true);
        java.lang.String j27 = j62.e.g().j("clicfg_plugin_cara_env_so_download_url_64", "", true, true);
        if (android.text.TextUtils.isEmpty(j17) || android.text.TextUtils.isEmpty(j18) || android.text.TextUtils.isEmpty(j19) || android.text.TextUtils.isEmpty(j27)) {
            return null;
        }
        ym.c cVar = new ym.c(null);
        cVar.f544653a = j17;
        cVar.f544654b = j18;
        cVar.f544655c = j27;
        return cVar;
    }

    public static java.lang.String d() {
        ym.c c17 = c();
        if (c17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f544656a);
        sb6.append("/");
        sb6.append(c17.f544653a + "_" + c17.f544654b + ".so");
        return sb6.toString();
    }
}
