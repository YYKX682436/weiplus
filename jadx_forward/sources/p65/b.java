package p65;

/* loaded from: classes12.dex */
public class b implements wo.t0 {
    public b(p65.a aVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            jz5.g gVar = fp.t.f346772a;
            try {
                if (((java.lang.Boolean) ((jz5.n) fp.t.f346772a).mo141623x754a37bb()).booleanValue()) {
                    java.lang.String m139410xbca9ae01 = io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139410xbca9ae01(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m139410xbca9ae01, "getCacheDirectory(...)");
                    java.io.File file = new java.io.File(m139410xbca9ae01, fp.t.f346773b);
                    if (file.exists()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterCacheUtil", "markInvalid");
                        java.io.File file2 = new java.io.File(m139410xbca9ae01, fp.t.f346774c);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file.renameTo(new java.io.File(file2, java.lang.String.valueOf(java.lang.System.nanoTime())));
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterCacheUtil", th6, "markInvalid error", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.app.p5.f("MicroMsg.BaseStartupRoutine", "[!!] Reset DeviceInfo. InstallTime(%s -> %s), Model(%s -> %s), MMGUID(%s, %s -> %s), AndroidID(%s -> %s)", str, str2, str5, str6, wo.w0.k(), str7, str8, str3, str4);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6388x682a936a c6388x682a936a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6388x682a936a();
            c6388x682a936a.f137324d = c6388x682a936a.b("PreFirstInstallTime", str, true);
            c6388x682a936a.f137325e = c6388x682a936a.b("CurFirstInstallTime", str2, true);
            c6388x682a936a.f137326f = c6388x682a936a.b("PreAndroidId", str3, true);
            c6388x682a936a.f137327g = c6388x682a936a.b("CurAndroidId", str4, true);
            c6388x682a936a.f137328h = c6388x682a936a.b("PreDeviceModel", str5, true);
            c6388x682a936a.f137329i = c6388x682a936a.b("CurDeviceModel", str6, true);
            c6388x682a936a.n();
            java.lang.String m17 = c6388x682a936a.m();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
                com.p314xaae8f345.mm.app.p5.b(28619, m17);
            }
            com.p314xaae8f345.mm.app.p5.b(21019, java.lang.String.format(java.util.Locale.ENGLISH, "51001,%s,,%s", bm5.f1.a(), 1));
        }
    }
}
