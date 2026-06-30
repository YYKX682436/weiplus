package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes11.dex */
public abstract class n {
    public static boolean a(android.content.Context context, java.lang.String str, boolean z17) {
        boolean z18;
        boolean z19;
        if ((!str.equals("noop") || (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j && com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273979i)) && gm0.k2.c(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceHelper", "ensure service running, type=%s ifRepeat=%s", str, java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.class);
        intent.setFlags(268435456);
        intent.putExtra("START_TYPE", str);
        if (com.p314xaae8f345.mm.p642xad8b531f.o.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() bindService");
            if (l75.d1.f398480c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceHelper", "ensureServiceInstance, disable push");
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.bindService(intent, new com.p314xaae8f345.mm.app.d0(), 1);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() startService");
            try {
                context.startService(intent);
                z18 = false;
                z19 = false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceHelper", "ensureServiceInstance() Exception = %s, Detail = %s SDK_INT = %s", e17.getClass().toString(), e17.getMessage(), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                z18 = e17 instanceof java.lang.IllegalStateException;
                if (fp.h.c(26)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                    boolean b17 = com.p314xaae8f345.mm.p642xad8b531f.o.b(context);
                    if (a17.getBoolean("service_first_crash", true)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=true result=%s", java.lang.Boolean.valueOf(b17));
                        a17.putBoolean("service_first_crash", false);
                        jx3.f fVar = jx3.f.INSTANCE;
                        fVar.mo68477x336bdfd8(954L, 80L, 1L, false);
                        if (z18) {
                            com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
                            a17.putBoolean("service_IllegalStateException", true);
                            fVar.mo68477x336bdfd8(954L, 81L, 1L, false);
                            if (b17) {
                                fVar.mo68477x336bdfd8(954L, 82L, 1L, false);
                            } else {
                                a17.putBoolean("crash_not_ignore", true);
                                fVar.mo68477x336bdfd8(954L, 83L, 1L, false);
                            }
                        } else {
                            fVar.mo68477x336bdfd8(954L, 86L, 1L, false);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false result=%s", java.lang.Boolean.valueOf(b17));
                        if (z18) {
                            com.p314xaae8f345.mm.p642xad8b531f.o.h(false);
                            if (a17.getBoolean("service_IllegalStateException", false)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=true");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=false");
                                a17.putBoolean("service_IllegalStateException", true);
                                jx3.f fVar2 = jx3.f.INSTANCE;
                                fVar2.mo68477x336bdfd8(954L, 87L, 1L, false);
                                if (b17) {
                                    fVar2.mo68477x336bdfd8(954L, 82L, 1L, false);
                                } else {
                                    a17.putBoolean("crash_not_ignore", true);
                                    fVar2.mo68477x336bdfd8(954L, 83L, 1L, false);
                                }
                            }
                        }
                    }
                }
                z19 = true;
            }
            if (fp.h.c(26)) {
                if (fp.h.c(26)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService crash_not_ignore=%s service_IllegalStateException=%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("crash_not_ignore", false)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o.b(context)));
                    if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("crash_not_ignore", false) && com.p314xaae8f345.mm.p642xad8b531f.o.b(context) && !z19) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                        a18.getClass();
                        a18.putBoolean("crash_not_ignore", false);
                        jx3.f.INSTANCE.mo68477x336bdfd8(954L, 85L, 1L, false);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreServiceUtil", "if_26_num=%s  if_ignore_false=%s  ignore_true=%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("if_26_num", true)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("if_ignore_false", true)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("ignore_true", false)));
        if (fp.h.c(26) && com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("if_26_num", true)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
            a19.getClass();
            a19.putBoolean("if_26_num", false);
            jx3.f.INSTANCE.mo68477x336bdfd8(954L, 92L, 1L, false);
        }
        if (fp.h.c(26)) {
            if (com.p314xaae8f345.mm.p642xad8b531f.o.b(context)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                a27.getClass();
                a27.putBoolean("ignore_true", true);
            } else if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("if_ignore_false", true)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                a28.getClass();
                a28.putBoolean("if_ignore_false", false);
                jx3.f fVar3 = jx3.f.INSTANCE;
                fVar3.mo68477x336bdfd8(954L, 90L, 1L, false);
                if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("ignore_true", false)) {
                    fVar3.mo68477x336bdfd8(954L, 91L, 1L, false);
                }
            }
        }
        return true;
    }

    public static void b(java.lang.String str) {
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).bj(str);
    }
}
