package co4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final co4.c f125336a = new co4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f125337b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f125338c;

    static {
        java.lang.String str = lp0.b.X() + "app_vibrate";
        f125337b = str;
        f125338c = str + '/';
    }

    public static final boolean a() {
        return kz5.c0.i("OPPO-PFCM00", "OPPO-PEEM00", "OPPO-PEUM00", "OPPO-PEYM00", "OPPO-PFUM10", "vivo-V2133A", "vivo-V2162A", "vivo-V2121A", "vivo-V2111A", "vivo-V2069A", "vivo-V2046A", "vivo-V2055A", "vivo-V2130A").contains(o45.wf.f424559d);
    }

    public static final boolean b(ey3.a vibrateDescInfo) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vibrateDescInfo, "vibrateDescInfo");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vibrateDescInfo.f339136a, "phonering.HE")) {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(f()));
        } else {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(f125338c + vibrateDescInfo.f339137b + ".HE");
        }
        return (a() ? false : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_preview_can_vibrate, true)) && r6Var.m();
    }

    public static final java.lang.String e(java.lang.String url, java.lang.String fileName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, "phonering.HE")) {
            return f();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f125338c;
        sb6.append(str);
        sb6.append(fileName);
        sb6.append(".HE");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb6.toString());
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
        co4.c cVar = f125336a;
        if (!F && z17) {
            cVar.d(url, fileName);
            return f();
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
        if (!(m18.a() ? m18.f294799a.F(m18.f294800b) : false) && !z17) {
            cVar.d(url, fileName);
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str + fileName + ".HE").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public static final java.lang.String f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f125338c;
        sb6.append(str);
        sb6.append("phonering.HE");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb6.toString());
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            f125336a.c();
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str + "phonering.HE").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final void c() {
        java.lang.String str = f125338c;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.w6.c("assets:///phonering.HE", str + "phonering.HE");
        java.lang.System.currentTimeMillis();
    }

    public final void d(java.lang.String url, java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f125337b + url);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178693k = true;
        t0Var.f178689g = "vibrate_".concat(fileName);
        t0Var.f178683a = url;
        t0Var.f178688f = 0;
        t0Var.f178708z = f125338c + fileName + ".HE";
        t0Var.f178691i = false;
        t0Var.f178692j = false;
        t0Var.f178686d = fileName.concat(".HE");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
    }
}
