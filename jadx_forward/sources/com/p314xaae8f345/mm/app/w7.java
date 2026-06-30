package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public final class w7 implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.InterfaceC17195x10840331, com.p314xaae8f345.mm.p944x882e457a.x2, c01.s {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f135430g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f135431h;

    /* renamed from: i, reason: collision with root package name */
    public static int f135432i;

    /* renamed from: n, reason: collision with root package name */
    public static qm.z f135434n;

    /* renamed from: o, reason: collision with root package name */
    public static int f135435o;

    /* renamed from: p, reason: collision with root package name */
    public static long f135436p;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.g8 f135437d;

    /* renamed from: e, reason: collision with root package name */
    public c01.z7 f135438e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.w7 f135429f = new com.p314xaae8f345.mm.app.w7();

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.StringBuilder f135433m = new java.lang.StringBuilder();

    public static void a(java.lang.String str) {
        try {
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "checkApkExternal, fileSize = %s", java.lang.Integer.valueOf(k17));
            if (k17 < 8) {
                return;
            }
            uk.a a17 = uk.a.a(com.p314xaae8f345.mm.vfs.w6.N(str, k17 - 8, 8));
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "checkApkExternal, header null");
                return;
            }
            int i17 = a17.f510013a;
            if ((i17 + 8) - 8 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "checkApkExternal header wrong");
            } else {
                new uk.c().mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(str, (k17 - ((i17 + 8) - 8)) - 8, (i17 + 8) - 8));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "checkApkExternal, check ok");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WorkerProfile", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "Exception in checkApkExternal, %s", e17.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r4 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x001e, code lost:
    
        if ((r3 & 1) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if ((r3 & 1) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(int r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.w7.b(int):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.InterfaceC17195x10840331
    /* renamed from: onReportKVDataReady */
    public void mo43094x7b3da11b(byte[] bArr, byte[] bArr2, int i17) {
        cp.e.b("WorkerProfile", new com.p314xaae8f345.mm.app.v7(this, i17, bArr2));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "onSceneEnd dkwt type:%d [%d,%d,%s]", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 3 && i18 == -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "getStack([ %s ]), ThreadID: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
        if (i17 == 4 && i18 == -3002) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "summerdiz -3002 but errMsg is null");
                return;
            }
            java.lang.String substring = str.startsWith("autoauth_errmsg_") ? str.substring(16) : str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "summerdiz MM_ERR_IDCDISASTER -3002 errStr:%s", substring);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
            am.c1 c1Var = c5206xdf10b679.f135545g;
            c1Var.f87831a = 4;
            c1Var.f87832b = substring;
            c5206xdf10b679.e();
            return;
        }
        if (gm0.j1.a() && i17 == 4 && ((i18 == -6 || i18 == -310 || i18 == -311) && str != null && str.startsWith("autoauth_errmsg_"))) {
            if (com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079.f291666i != null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 701 && m1Var.mo808xfb85f7b0() != 702 && m1Var.mo808xfb85f7b0() != 126 && m1Var.mo808xfb85f7b0() != 252 && m1Var.mo808xfb85f7b0() != 763 && m1Var.mo808xfb85f7b0() != 138) {
            if (i17 == 4 && i18 == -213) {
                gm0.j1.i().f354745e.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs");
                M.A("default_uin_timely", 0);
                M.G("has_uin_timely", true);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5828x656db620 c5828x656db620 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5828x656db620();
                c5828x656db620.f136136g.getClass();
                c5828x656db620.e();
            }
            if (i17 == 4) {
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i().f354745e.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs");
                    M2.A("default_uin_timely", 0);
                    M2.G("has_uin_timely", true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5828x656db620 c5828x656db6202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5828x656db620();
                    c5828x656db6202.f136136g.getClass();
                    c5828x656db6202.e();
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 4 || i18 != -213) {
            if (i17 == 4) {
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i().f354745e.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs");
                    M3.A("default_uin_timely", 0);
                    M3.G("has_uin_timely", true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
                    am.hj hjVar = c5691xc916fb10.f136017g;
                    hjVar.getClass();
                    hjVar.f88369a = 1;
                    c5691xc916fb10.e();
                    return;
                }
                return;
            }
            return;
        }
        gm0.j1.i().f354745e.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs");
        M4.A("default_uin_timely", 0);
        M4.G("has_uin_timely", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb102 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar2 = c5691xc916fb102.f136017g;
        hjVar2.getClass();
        hjVar2.f88369a = 3;
        c5691xc916fb102.e();
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22495xaea25d1e.f291492d != null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22495xaea25d1e.class).addFlags(268435456);
        intent2.putExtra("errmsg", str);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
