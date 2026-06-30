package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class o7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f290983a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.n8 f290984b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f290986d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f290987e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f290988f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f290989g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290990h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f290991i;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290994l;

    /* renamed from: m, reason: collision with root package name */
    public int f290995m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290996n;

    /* renamed from: c, reason: collision with root package name */
    public am.zg f290985c = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f290992j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f290993k = 0;

    public o7(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.n8 n8Var) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f290994l = new com.p314xaae8f345.mm.ui.C21372x5864b8cc(this, a0Var);
        this.f290995m = 0;
        this.f290996n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5254xefb6387e>(a0Var) { // from class: com.tencent.mm.ui.GlobalAlertMgr$11
            {
                this.f39173x3fe91575 = -2026915730;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5254xefb6387e c5254xefb6387e) {
                com.p314xaae8f345.mm.ui.o7.this.f290995m = c5254xefb6387e.f135585g.f89221a;
                return false;
            }
        };
        this.f290983a = activityC21401x6ce6f73f;
        this.f290984b = n8Var;
    }

    public static long a(com.p314xaae8f345.mm.ui.o7 o7Var) {
        o7Var.getClass();
        boolean equals = "1".equals(j62.e.g().a("clicfg_storage_alert_clean_cache_android", "1", false, true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "storageDisableAlert, use = " + equals);
        if (!equals) {
            return -1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentCleanCacheService", "cleanCache");
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(lp0.b.g0()).G();
        long j17 = 0;
        if (G != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentCleanCacheService", "delete log file " + r6Var.o());
                long C = r6Var.C();
                if (r6Var.l()) {
                    j17 += C;
                }
            }
        }
        com.p314xaae8f345.mm.vfs.r6[] G2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p2621x8fb0427b.x3.f277857a).G();
        if (G2 != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G2) {
                java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(java.lang.System.currentTimeMillis()));
                if (r26.i0.n(m82467xfb82e301, ".xlog", false)) {
                    if (!r26.i0.n(m82467xfb82e301, format + ".xlog", false)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentCleanCacheService", "delete log file " + r6Var2.o());
                        long C2 = r6Var2.C();
                        if (r6Var2.l()) {
                            j17 += C2;
                        }
                    }
                }
            }
        }
        long j18 = j17;
        if (!z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return j18;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.y6(o7Var, j18));
        return j18;
    }

    public final void b() {
        if (!this.f290992j) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(45);
        }
        this.f290992j = true;
    }

    public java.lang.String c(int i17) {
        return this.f290983a.getString(i17);
    }

    public final void d(boolean z17) {
        if (z17) {
            g();
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f290983a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
        intent.putExtra("kintent_hint", c(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f290983a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21401x6ce6f73f, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void e(int i17, int i18, int i19, java.lang.String str) {
        u11.a a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert jumpByActionType  alertId[%d], actionType[%d], btnId[%d], url[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13191, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f290983a;
        switch (i18) {
            case 2:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                j45.l.j(activityC21401x6ce6f73f, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 3:
                if (this.f290990h) {
                    d(true);
                    return;
                }
                if (this.f290991i == null) {
                    this.f290991i = new com.p314xaae8f345.mm.ui.j7(this);
                }
                c01.d9.e().a(255, this.f290991i);
                com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(1);
                c01.d9.e().g(w0Var);
                this.f290989g = db5.e1.Q(this.f290983a, c(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c(com.p314xaae8f345.mm.R.C30867xcad56011.irw), true, true, new com.p314xaae8f345.mm.ui.h7(this, w0Var));
                return;
            case 4:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(activityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
                intent2.putExtra("bind_scene", 3);
                java.lang.String simCountryIso = ((android.telephony.TelephonyManager) activityC21401x6ce6f73f.getSystemService("phone")).getSimCountryIso();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
                    intent2.putExtra("country_name", a17.f505262c);
                    intent2.putExtra("couttry_code", a17.f505261b);
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC21401x6ce6f73f, intent2);
                return;
            case 5:
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("BaseScanUI_select_scan_mode", 1);
                intent3.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                intent3.putExtra("key_scan_report_enter_scene", 25);
                intent3.setFlags(65536);
                if (iq.b.g(activityC21401x6ce6f73f) || iq.b.x(activityC21401x6ce6f73f) || iq.b.c(activityC21401x6ce6f73f, true)) {
                    return;
                }
                j45.l.j(activityC21401x6ce6f73f, "scanner", ".ui.BaseScanUI", intent3, null);
                return;
            case 6:
                android.content.Intent intent4 = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.class);
                intent4.putExtra("WizardRootClass", com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.class.getCanonicalName());
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC21401x6ce6f73f, intent4);
                return;
            case 7:
                android.content.Intent intent5 = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4.class);
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = this.f290983a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent5);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC21401x6ce6f73f2, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21401x6ce6f73f2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityC21401x6ce6f73f2, "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            default:
                return;
        }
    }

    public final boolean f(am.zg zgVar) {
        q45.b bVar;
        java.util.LinkedList linkedList;
        if (zgVar == null || (bVar = zgVar.f90094a) == null || (linkedList = bVar.f441660g) == null || linkedList.size() == 0) {
            return false;
        }
        q45.b bVar2 = zgVar.f90094a;
        int i17 = bVar2.f441657d;
        java.lang.String str = bVar2.f441658e;
        java.lang.String str2 = bVar2.f441659f;
        int i18 = zgVar.f90097d;
        int size = bVar2.f441660g.size();
        q45.b bVar3 = zgVar.f90094a;
        int i19 = bVar3.f441661h;
        if (i19 >= 0 && i19 < size) {
            q45.a aVar = (q45.a) bVar3.f441660g.get(i19);
            e(i17, aVar.f441654e, aVar.f441653d, aVar.f441656g);
            return true;
        }
        if (i18 != 0) {
            if (i18 != 1) {
                return true;
            }
            db5.e1.C(this.f290983a, str2, str, ((q45.a) bVar3.f441660g.get(0)).f441655f, ((q45.a) zgVar.f90094a.f441660g.get(1)).f441655f, false, zgVar.f90095b, zgVar.f90096c);
            return true;
        }
        if (size == 1) {
            q45.a aVar2 = (q45.a) bVar3.f441660g.get(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(aVar2.f441653d), java.lang.Integer.valueOf(aVar2.f441654e), aVar2.f441655f, aVar2.f441656g);
            db5.e1.E(this.f290983a, str2, str, aVar2.f441655f, false, new com.p314xaae8f345.mm.ui.e7(this, i17, aVar2));
            return true;
        }
        q45.a aVar3 = (q45.a) bVar3.f441660g.get(1);
        q45.a aVar4 = (q45.a) zgVar.f90094a.f441660g.get(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", str, str2, java.lang.Integer.valueOf(aVar3.f441653d), java.lang.Integer.valueOf(aVar3.f441654e), aVar3.f441655f, aVar3.f441656g, java.lang.Integer.valueOf(aVar4.f441653d), java.lang.Integer.valueOf(aVar4.f441654e), aVar4.f441655f, aVar4.f441656g);
        db5.e1.C(this.f290983a, str2, str, aVar3.f441655f, aVar4.f441655f, false, new com.p314xaae8f345.mm.ui.f7(this, i17, aVar3), new com.p314xaae8f345.mm.ui.g7(this, i17, aVar4));
        return true;
    }

    public final void g() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f290988f;
        if (j0Var != null) {
            j0Var.show();
            return;
        }
        if (this.f290986d == null) {
            android.view.View inflate = android.view.View.inflate(this.f290983a, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
            this.f290986d = inflate;
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setText(c(com.p314xaae8f345.mm.R.C30867xcad56011.irg));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f290986d.findViewById(com.p314xaae8f345.mm.R.id.mmp);
            this.f290987e = c21503x6e5a020a;
            c21503x6e5a020a.getEditText().setInputType(129);
        }
        this.f290988f = db5.e1.x(this.f290983a, null, null, this.f290986d, new com.p314xaae8f345.mm.ui.m7(this), new com.p314xaae8f345.mm.ui.n7(this));
    }
}
