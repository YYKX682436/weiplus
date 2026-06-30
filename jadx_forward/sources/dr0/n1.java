package dr0;

/* loaded from: classes11.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.n1 f324007d = new dr0.n1();

    @Override // java.lang.Runnable
    public final void run() {
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Manager", "skip suicide: we're on foreground when suicide message was handled.");
                dr0.p1.f324022d.a().k(false);
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.proc.Manager", th6, "exception occurred.", new java.lang.Object[0]);
                return;
            }
        }
        ((bt.b1) k35.p.f385476a).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplicationDirectly, pid=" + android.os.Process.myPid());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMAppMgr", "exitApplicationDirectly", new java.lang.Object[0]);
        mm.g0.f410016a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        gm0.j1.i().f354741a.f354835g.e(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77703xc00c37da();
        if (c01.d9.e() != null && c01.d9.e().f152297d != null) {
            c01.d9.e().f152297d.r1(false);
        }
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        if (m78443x9cf0d20b != null) {
            m78443x9cf0d20b.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(8);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5177x8d056a0c().e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar = c5691xc916fb10.f136017g;
        hjVar.getClass();
        hjVar.f88369a = 2;
        c5691xc916fb10.e();
        com.p314xaae8f345.mm.ui.vb.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
        mm.k kVar = mm.k.N;
        if (kVar.h()) {
            if (kVar.h()) {
                java.util.Iterator it = ((java.util.ArrayList) sh.c.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).iterator();
                while (it.hasNext()) {
                    m3.d dVar = (m3.d) it.next();
                    if (((java.lang.String) dVar.f404626b).contains(":")) {
                        java.lang.String str = (java.lang.String) dVar.f404626b;
                        if (!str.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b) && !str.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274589d)) {
                            int intValue = ((java.lang.Integer) dVar.f404625a).intValue();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(java.lang.Integer.valueOf(intValue));
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        }
                    }
                }
            } else {
                m45.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":recovery", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":support", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":tools", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand0", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand1", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand2", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand3", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand4");
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/ui/MMAppMgr", "exitApplicationDirectly", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
