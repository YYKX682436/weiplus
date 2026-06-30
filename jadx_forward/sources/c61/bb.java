package c61;

/* loaded from: classes16.dex */
public final class bb {
    public bb(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String t17 = r26.i0.t(str, ",", "#", false);
        if (t17.length() <= 3000) {
            return t17;
        }
        java.lang.String substring = t17.substring(0, 3000);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final void b(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportKv: ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6614x2d7772d4 c6614x2d7772d4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6614x2d7772d4();
        c6614x2d7772d4.f139673d = z17 ? 1L : 0L;
        c6614x2d7772d4.f139674e = c6614x2d7772d4.b("error", str != null ? r26.i0.t(str, ",", "#", false) : null, true);
        c6614x2d7772d4.f139675f = c6614x2d7772d4.b("stackTrace", str2 != null ? a(str2) : "", true);
        c6614x2d7772d4.f139676g = currentTimeMillis / 1000;
        c6614x2d7772d4.f139677h = c6614x2d7772d4.b("pluginName", str3, true);
        c6614x2d7772d4.f139678i = java.lang.System.currentTimeMillis() - j17;
        c6614x2d7772d4.f139679j = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.app.x.f135439a;
        c6614x2d7772d4.f139680k = c6614x2d7772d4.b("flutter_revision", a03.h.a(), true);
        c6614x2d7772d4.f139681l = c6614x2d7772d4.b("widgetInformation", str4 != null ? r26.i0.t(str4, ",", "#", false) : null, true);
        c6614x2d7772d4.f139682m = c6614x2d7772d4.b("lastBuildWidget", str5 != null ? r26.i0.t(str5, ",", "#", false) : null, true);
        c6614x2d7772d4.f139683n = c6614x2d7772d4.b("lastSetStateStack", str6 != null ? a(str6) : "", true);
        c6614x2d7772d4.f139684o = c6614x2d7772d4.b("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        c6614x2d7772d4.k();
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportKv: ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6617x278ed17c c6617x278ed17c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6617x278ed17c();
        c6617x278ed17c.f139709d = z17 ? 1L : 0L;
        c6617x278ed17c.f139710e = c6617x278ed17c.b("error", str != null ? r26.i0.t(str, ",", "#", false) : null, true);
        c6617x278ed17c.f139711f = c6617x278ed17c.b("stackTrace", str2 != null ? a(str2) : "", true);
        c6617x278ed17c.f139712g = currentTimeMillis / 1000;
        c6617x278ed17c.f139713h = c6617x278ed17c.b("pluginName", str3, true);
        c6617x278ed17c.f139714i = java.lang.System.currentTimeMillis() - j17;
        c6617x278ed17c.f139715j = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.app.x.f135439a;
        c6617x278ed17c.f139716k = c6617x278ed17c.b("flutter_revision", a03.h.a(), true);
        c6617x278ed17c.f139717l = c6617x278ed17c.b("widgetInformation", str4 != null ? r26.i0.t(str4, ",", "#", false) : null, true);
        c6617x278ed17c.f139718m = c6617x278ed17c.b("lastBuildWidget", str5 != null ? r26.i0.t(str5, ",", "#", false) : null, true);
        c6617x278ed17c.f139719n = c6617x278ed17c.b("lastSetStateStack", str6 != null ? a(str6) : "", true);
        c6617x278ed17c.f139720o = c6617x278ed17c.b("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        c6617x278ed17c.k();
    }
}
