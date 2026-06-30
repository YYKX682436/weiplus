package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0 f159223a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0();

    /* renamed from: b, reason: collision with root package name */
    public static int f159224b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f159225c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f159226d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f159227e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f159228f;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        f159224b = a17 != null ? a17.getInt("ConsolePrinterPrintLevel", Integer.MAX_VALUE) : Integer.MAX_VALUE;
        f159225c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.l0.f159219d);
        f159226d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.k0.f159213d);
        f159227e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.m0.f159221d);
        f159228f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g0.f159206d);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            int i17 = f159224b;
            if (2 <= i17 && i17 < 6) {
                if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    if (c()) {
                        ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.j0.f159211d);
                    }
                    if (c() || ((java.lang.Boolean) ((jz5.n) f159226d).mo141623x754a37bb()).booleanValue()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g b17 = b();
                        b17.f159201b = f159224b;
                        cl.q0.f124255l = b17;
                        return;
                    }
                    return;
                }
                if (c()) {
                    tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.i0();
                    java.lang.String a17 = n25.a.a();
                    ((sb0.f) iVar).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.S6(context, "你的手机没有授权微信获得浮窗权限，无法打开console输出面板", new j35.f0(i0Var), true, a17);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "enable, not need");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.g) ((jz5.n) f159228f).mo141623x754a37bb();
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f159225c).mo141623x754a37bb()).booleanValue();
    }
}
