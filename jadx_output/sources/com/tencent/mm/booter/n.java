package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public abstract class n {
    public static boolean a(android.content.Context context, java.lang.String str, boolean z17) {
        boolean z18;
        boolean z19;
        if ((!str.equals("noop") || (com.tencent.mm.sdk.platformtools.a0.f192447j && com.tencent.mm.sdk.platformtools.a0.f192446i)) && gm0.k2.c(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceHelper", "ensure service running, type=%s ifRepeat=%s", str, java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.booter.CoreService.class);
        intent.setFlags(268435456);
        intent.putExtra("START_TYPE", str);
        if (com.tencent.mm.booter.o.d()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() bindService");
            if (l75.d1.f316947c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceHelper", "ensureServiceInstance, disable push");
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.bindService(intent, new com.tencent.mm.app.d0(), 1);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() startService");
            try {
                context.startService(intent);
                z18 = false;
                z19 = false;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceHelper", "ensureServiceInstance() Exception = %s, Detail = %s SDK_INT = %s", e17.getClass().toString(), e17.getMessage(), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                z18 = e17 instanceof java.lang.IllegalStateException;
                if (fp.h.c(26)) {
                    com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.booter.o.a();
                    boolean b17 = com.tencent.mm.booter.o.b(context);
                    if (a17.getBoolean("service_first_crash", true)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=true result=%s", java.lang.Boolean.valueOf(b17));
                        a17.putBoolean("service_first_crash", false);
                        jx3.f fVar = jx3.f.INSTANCE;
                        fVar.idkeyStat(954L, 80L, 1L, false);
                        if (z18) {
                            com.tencent.mm.booter.o.h(false);
                            a17.putBoolean("service_IllegalStateException", true);
                            fVar.idkeyStat(954L, 81L, 1L, false);
                            if (b17) {
                                fVar.idkeyStat(954L, 82L, 1L, false);
                            } else {
                                a17.putBoolean("crash_not_ignore", true);
                                fVar.idkeyStat(954L, 83L, 1L, false);
                            }
                        } else {
                            fVar.idkeyStat(954L, 86L, 1L, false);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false result=%s", java.lang.Boolean.valueOf(b17));
                        if (z18) {
                            com.tencent.mm.booter.o.h(false);
                            if (a17.getBoolean("service_IllegalStateException", false)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=true");
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=false");
                                a17.putBoolean("service_IllegalStateException", true);
                                jx3.f fVar2 = jx3.f.INSTANCE;
                                fVar2.idkeyStat(954L, 87L, 1L, false);
                                if (b17) {
                                    fVar2.idkeyStat(954L, 82L, 1L, false);
                                } else {
                                    a17.putBoolean("crash_not_ignore", true);
                                    fVar2.idkeyStat(954L, 83L, 1L, false);
                                }
                            }
                        }
                    }
                }
                z19 = true;
            }
            if (fp.h.c(26)) {
                if (fp.h.c(26)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService crash_not_ignore=%s service_IllegalStateException=%s", java.lang.Boolean.valueOf(com.tencent.mm.booter.o.a().getBoolean("crash_not_ignore", false)), java.lang.Boolean.valueOf(com.tencent.mm.booter.o.b(context)));
                    if (com.tencent.mm.booter.o.a().getBoolean("crash_not_ignore", false) && com.tencent.mm.booter.o.b(context) && !z19) {
                        com.tencent.mm.sdk.platformtools.o4 a18 = com.tencent.mm.booter.o.a();
                        a18.getClass();
                        a18.putBoolean("crash_not_ignore", false);
                        jx3.f.INSTANCE.idkeyStat(954L, 85L, 1L, false);
                    }
                }
                if (z18) {
                    if (z17) {
                        return a(context, str, false);
                    }
                    return false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreServiceUtil", "if_26_num=%s  if_ignore_false=%s  ignore_true=%s", java.lang.Boolean.valueOf(com.tencent.mm.booter.o.a().getBoolean("if_26_num", true)), java.lang.Boolean.valueOf(com.tencent.mm.booter.o.a().getBoolean("if_ignore_false", true)), java.lang.Boolean.valueOf(com.tencent.mm.booter.o.a().getBoolean("ignore_true", false)));
        if (fp.h.c(26) && com.tencent.mm.booter.o.a().getBoolean("if_26_num", true)) {
            com.tencent.mm.sdk.platformtools.o4 a19 = com.tencent.mm.booter.o.a();
            a19.getClass();
            a19.putBoolean("if_26_num", false);
            jx3.f.INSTANCE.idkeyStat(954L, 92L, 1L, false);
        }
        if (fp.h.c(26)) {
            if (com.tencent.mm.booter.o.b(context)) {
                com.tencent.mm.sdk.platformtools.o4 a27 = com.tencent.mm.booter.o.a();
                a27.getClass();
                a27.putBoolean("ignore_true", true);
            } else if (com.tencent.mm.booter.o.a().getBoolean("if_ignore_false", true)) {
                com.tencent.mm.sdk.platformtools.o4 a28 = com.tencent.mm.booter.o.a();
                a28.getClass();
                a28.putBoolean("if_ignore_false", false);
                jx3.f fVar3 = jx3.f.INSTANCE;
                fVar3.idkeyStat(954L, 90L, 1L, false);
                if (com.tencent.mm.booter.o.a().getBoolean("ignore_true", false)) {
                    fVar3.idkeyStat(954L, 91L, 1L, false);
                }
            }
        }
        return true;
    }

    public static void b(java.lang.String str) {
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).bj(str);
    }
}
