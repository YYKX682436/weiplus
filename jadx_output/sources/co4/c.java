package co4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final co4.c f43803a = new co4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f43804b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f43805c;

    static {
        java.lang.String str = lp0.b.X() + "app_vibrate";
        f43804b = str;
        f43805c = str + '/';
    }

    public static final boolean a() {
        return kz5.c0.i("OPPO-PFCM00", "OPPO-PEEM00", "OPPO-PEUM00", "OPPO-PEYM00", "OPPO-PFUM10", "vivo-V2133A", "vivo-V2162A", "vivo-V2121A", "vivo-V2111A", "vivo-V2069A", "vivo-V2046A", "vivo-V2055A", "vivo-V2130A").contains(o45.wf.f343026d);
    }

    public static final boolean b(ey3.a vibrateDescInfo) {
        com.tencent.mm.vfs.r6 r6Var;
        kotlin.jvm.internal.o.g(vibrateDescInfo, "vibrateDescInfo");
        if (kotlin.jvm.internal.o.b(vibrateDescInfo.f257603a, "phonering.HE")) {
            r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(f()));
        } else {
            r6Var = new com.tencent.mm.vfs.r6(f43805c + vibrateDescInfo.f257604b + ".HE");
        }
        return (a() ? false : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_preview_can_vibrate, true)) && r6Var.m();
    }

    public static final java.lang.String e(java.lang.String url, java.lang.String fileName, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (kotlin.jvm.internal.o.b(url, "phonering.HE")) {
            return f();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f43805c;
        sb6.append(str);
        sb6.append(fileName);
        sb6.append(".HE");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
        co4.c cVar = f43803a;
        if (!F && z17) {
            cVar.d(url, fileName);
            return f();
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
        if (!(m18.a() ? m18.f213266a.F(m18.f213267b) : false) && !z17) {
            cVar.d(url, fileName);
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(str + fileName + ".HE").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public static final java.lang.String f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f43805c;
        sb6.append(str);
        sb6.append("phonering.HE");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(sb6.toString());
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            f43803a.c();
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(str + "phonering.HE").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final void c() {
        java.lang.String str = f43805c;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.w6.c("assets:///phonering.HE", str + "phonering.HE");
        java.lang.System.currentTimeMillis();
    }

    public final void d(java.lang.String url, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f43804b + url);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            c();
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97160k = true;
        t0Var.f97156g = "vibrate_".concat(fileName);
        t0Var.f97150a = url;
        t0Var.f97155f = 0;
        t0Var.f97175z = f43805c + fileName + ".HE";
        t0Var.f97158i = false;
        t0Var.f97159j = false;
        t0Var.f97153d = fileName.concat(".HE");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
    }
}
