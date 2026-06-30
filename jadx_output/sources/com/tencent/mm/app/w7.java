package com.tencent.mm.app;

/* loaded from: classes11.dex */
public final class w7 implements com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.report.service.IKVReportNotify, com.tencent.mm.modelbase.x2, c01.s {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f53897g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f53898h;

    /* renamed from: i, reason: collision with root package name */
    public static int f53899i;

    /* renamed from: n, reason: collision with root package name */
    public static qm.z f53901n;

    /* renamed from: o, reason: collision with root package name */
    public static int f53902o;

    /* renamed from: p, reason: collision with root package name */
    public static long f53903p;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.g8 f53904d;

    /* renamed from: e, reason: collision with root package name */
    public c01.z7 f53905e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.app.w7 f53896f = new com.tencent.mm.app.w7();

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.StringBuilder f53900m = new java.lang.StringBuilder();

    public static void a(java.lang.String str) {
        try {
            int k17 = (int) com.tencent.mm.vfs.w6.k(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "checkApkExternal, fileSize = %s", java.lang.Integer.valueOf(k17));
            if (k17 < 8) {
                return;
            }
            uk.a a17 = uk.a.a(com.tencent.mm.vfs.w6.N(str, k17 - 8, 8));
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "checkApkExternal, header null");
                return;
            }
            int i17 = a17.f428480a;
            if ((i17 + 8) - 8 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "checkApkExternal header wrong");
            } else {
                new uk.c().parseFrom(com.tencent.mm.vfs.w6.N(str, (k17 - ((i17 + 8) - 8)) - 8, (i17 + 8) - 8));
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "checkApkExternal, check ok");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WorkerProfile", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "Exception in checkApkExternal, %s", e17.getMessage());
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.w7.b(int):void");
    }

    @Override // com.tencent.mm.plugin.report.service.IKVReportNotify
    public void onReportKVDataReady(byte[] bArr, byte[] bArr2, int i17) {
        cp.e.b("WorkerProfile", new com.tencent.mm.app.v7(this, i17, bArr2));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "onSceneEnd dkwt type:%d [%d,%d,%s]", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 3 && i18 == -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "getStack([ %s ]), ThreadID: %s", new com.tencent.mm.sdk.platformtools.z3(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
        if (i17 == 4 && i18 == -3002) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "summerdiz -3002 but errMsg is null");
                return;
            }
            java.lang.String substring = str.startsWith("autoauth_errmsg_") ? str.substring(16) : str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "summerdiz MM_ERR_IDCDISASTER -3002 errStr:%s", substring);
            com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
            am.c1 c1Var = broadcastEvent.f54012g;
            c1Var.f6298a = 4;
            c1Var.f6299b = substring;
            broadcastEvent.e();
            return;
        }
        if (gm0.j1.a() && i17 == 4 && ((i18 == -6 || i18 == -310 || i18 == -311) && str != null && str.startsWith("autoauth_errmsg_"))) {
            if (com.tencent.mm.ui.tools.NewTaskUI.f210133i != null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.ui.tools.NewTaskUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (m1Var.getType() != 701 && m1Var.getType() != 702 && m1Var.getType() != 126 && m1Var.getType() != 252 && m1Var.getType() != 763 && m1Var.getType() != 138) {
            if (i17 == 4 && i18 == -213) {
                gm0.j1.i().f273212e.getClass();
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
                M.A("default_uin_timely", 0);
                M.G("has_uin_timely", true);
                com.tencent.mm.autogen.events.OtherLogoutEvent otherLogoutEvent = new com.tencent.mm.autogen.events.OtherLogoutEvent();
                otherLogoutEvent.f54603g.getClass();
                otherLogoutEvent.e();
            }
            if (i17 == 4) {
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i().f273212e.getClass();
                    com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
                    M2.A("default_uin_timely", 0);
                    M2.G("has_uin_timely", true);
                    com.tencent.mm.autogen.events.OtherLogoutEvent otherLogoutEvent2 = new com.tencent.mm.autogen.events.OtherLogoutEvent();
                    otherLogoutEvent2.f54603g.getClass();
                    otherLogoutEvent2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 4 || i18 != -213) {
            if (i17 == 4) {
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i().f273212e.getClass();
                    com.tencent.mm.sdk.platformtools.o4 M3 = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
                    M3.A("default_uin_timely", 0);
                    M3.G("has_uin_timely", true);
                    com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
                    am.hj hjVar = logoutEvent.f54484g;
                    hjVar.getClass();
                    hjVar.f6836a = 1;
                    logoutEvent.e();
                    return;
                }
                return;
            }
            return;
        }
        gm0.j1.i().f273212e.getClass();
        com.tencent.mm.sdk.platformtools.o4 M4 = com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs");
        M4.A("default_uin_timely", 0);
        M4.G("has_uin_timely", true);
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent2 = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar2 = logoutEvent2.f54484g;
        hjVar2.getClass();
        hjVar2.f6836a = 3;
        logoutEvent2.e();
        if (com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI.f209959d != null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI.class).addFlags(268435456);
        intent2.putExtra("errmsg", str);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
