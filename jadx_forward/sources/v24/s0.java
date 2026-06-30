package v24;

/* loaded from: classes15.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.s0 f514482a = new v24.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f514483b = jz5.h.b(v24.q0.f514479d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f514484c = jz5.h.b(v24.r0.f514481d);

    public static final java.lang.String c() {
        try {
            v24.w0 w0Var = v24.w0.f514494a;
            m14.o c17 = w0Var.c();
            if (c17 != null) {
                if (w0Var.g(c17.j().j())) {
                    tn3.b bVar = tn3.c.f502356a;
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    boolean b17 = bVar.b(context);
                    return (b17 && bVar.c()) ? "" : !b17 ? w0Var.d(c17.n()) : f514482a.a(c17.k());
                }
                if (!w0Var.f(c17.j().j())) {
                    return w0Var.d(c17.n());
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsPluginWxkbHelper", "getSettingPluginAdStr, fail, reason:" + e17.getMessage());
        }
        return "";
    }

    public final java.lang.String a(m14.b enableTipsData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enableTipsData, "enableTipsData");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? enableTipsData.l() : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? enableTipsData.n() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? enableTipsData.k() : enableTipsData.l();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            byte[] bytes = l17.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Object mo141623x754a37bb = ((jz5.n) f514483b).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            sb6.append((java.lang.String) mo141623x754a37bb);
            sb6.append('_');
            sb6.append(g17);
            java.lang.String sb7 = sb6.toString();
            if (!b().contains(sb7)) {
                b().putLong(sb7, c01.id.c());
                return l17;
            }
            int j17 = enableTipsData.j();
            long p17 = b().p(sb7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginWxkbHelper", "getEnableTips: days:" + j17 + " lastTime:" + p17);
            if (!d(p17, j17)) {
                return l17;
            }
        }
        return "";
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f514484c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final boolean d(long j17, int i17) {
        long c17 = c01.id.c() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginWxkbHelper", "isTimeExpired() called with: lastTime = " + j17 + ", n = " + i17 + ",elapsedTime:" + c17);
        return c17 > ((long) i17) * 86400000;
    }
}
