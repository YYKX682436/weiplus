package wn4;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final wn4.x f529104a = new wn4.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f529105b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f529106c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f529107d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static wn4.f f529108e;

    public static final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "cancelNotification");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).cancel(8341);
    }

    public static final void h(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        b();
        jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 23L, 1L, false);
        ((ku5.t0) ku5.t0.f394148d).B(new wn4.s(response));
    }

    public static final void i(java.lang.String title, java.lang.String text, android.app.PendingIntent pendingIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", title, text);
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.h(16, true);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(title);
        k0Var.e(text);
        k0Var.f550996g = pendingIntent;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        android.app.Notification b17 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).notify(8341, b17);
    }

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        boolean z17 = false;
        java.io.File file = new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(str, false));
        try {
            z17 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429(ak0.o.f87076b).m104719x3bfad524(file);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Updater.ManualUpdaterProcessor", e17, "verifyPatchMetaSignature", new java.lang.Object[0]);
        }
        if (!z17) {
            j();
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 17L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "hot patch verfiy signature error");
            return;
        }
        if (!com.p314xaae8f345.mm.app.m2.f135048a.a()) {
            j();
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 20L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientversion to recover.");
            return;
        }
        ak0.e a17 = ak0.g.a(file);
        if (a17 != null) {
            java.lang.String property = ((ak0.f) a17).f87070a.getProperty("patch.client.ver");
            if (android.text.TextUtils.isEmpty(property)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "Fail to get patch clientversion.");
            } else {
                b83.e eVar = new b83.e(lp0.a.f401782c, property);
                eVar.f(eVar.a(2));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.f223937b = new wn4.g(c16114x800e8cdb);
        int d17 = ak0.n.d(file);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "start to run patch. ret = " + d17);
        if (d17 == 0 || d17 == 1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 22L, 1L, false);
        } else if (d17 != 2) {
            j();
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 21L, 1L, false);
        } else {
            h(c16114x800e8cdb);
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 30L, 1L, false);
        }
    }

    public final boolean c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk checkAndShowInstallPatchDialog, newApkMd5 = " + str);
        java.lang.String l17 = c83.e.l(str);
        if (!com.p314xaae8f345.mm.vfs.w6.j(l17) || !uk.b.a(l17) || !c83.e.n(l17)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "checkAndShowInstallPatchDialog apk ready " + l17);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, l17, null, false);
        jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 5L, 1L, false);
        return true;
    }

    public final void d(com.p314xaae8f345.mm.vfs.r6 patchFile, long j17, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchFile, "patchFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.lang.String str = (java.lang.String) f529107d.get(java.lang.Long.valueOf(j17));
        if (str != null) {
            java.util.HashMap hashMap = f529106c;
            if (hashMap.get(str) != null) {
                java.lang.Object obj = hashMap.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return;
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(f529106c).remove(str);
        jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 8L, 1L, false);
        ((ku5.t0) ku5.t0.f394148d).h(new wn4.k(response, patchFile), "Updater");
    }

    public final java.lang.String e(int i17) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        boolean c17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "prepare to download fileMd5:" + c16114x800e8cdb.f223946i + " fileSize:" + c16114x800e8cdb.f223948n + " cdnUrl:" + c16114x800e8cdb.f223945h);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fp.m.c(), "mounted")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "no sdcard.");
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 9L, 1L, false);
            java.lang.Integer packageType = c16114x800e8cdb.f223943f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageType, "packageType");
            w73.f.i(10, packageType.intValue(), 103);
            return;
        }
        java.lang.Integer num = c16114x800e8cdb.f223943f;
        if (num != null && num.intValue() == 4) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            c17 = fp.i.c(((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) * 4);
        } else {
            c17 = fp.i.c(c16114x800e8cdb.f223948n);
        }
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "sdcard is full.");
            ((ku5.t0) ku5.t0.f394148d).B(wn4.p.f529093d);
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 10L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 55L, 1L, false);
            java.lang.Integer packageType2 = c16114x800e8cdb.f223943f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageType2, "packageType");
            w73.f.i(10, packageType2.intValue(), 104);
            return;
        }
        c83.e.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        ((ku5.t0) ku5.t0.f394148d).g(new c83.d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178683a = c16114x800e8cdb.f223945h;
        t0Var.f178686d = c16114x800e8cdb.f223947m;
        t0Var.f178687e = c16114x800e8cdb.f223946i;
        t0Var.f178691i = false;
        t0Var.f178693k = true;
        t0Var.f178707y = true;
        t0Var.f178692j = false;
        t0Var.f178688f = 2;
        java.lang.Integer num2 = c16114x800e8cdb.f223943f;
        if (num2 != null && num2.intValue() == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223952r)) {
            b83.e eVar = new b83.e(lp0.a.f401782c, c16114x800e8cdb.f223952r);
            eVar.f(eVar.a(5));
            eVar.c(7, 0L);
        }
        long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        f529108e = new wn4.f(c16114x800e8cdb, b17, f529105b, f529106c, f529107d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
        wn4.f fVar = f529108e;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("downloadCallbackListener");
            throw null;
        }
        i17.a(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "download start");
        jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 11L, 1L, false);
        java.lang.Integer num3 = c16114x800e8cdb.f223943f;
        if (num3 != null && num3.intValue() == 4) {
            r45.bw3 bw3Var = new r45.bw3();
            bw3Var.f452626d = java.lang.String.valueOf(b17);
            bw3Var.f452627e = c16114x800e8cdb.f223945h;
            bw3Var.f452630h = java.lang.System.currentTimeMillis();
            bw3Var.f452629g = "2";
            c83.e.s(bw3Var);
            ((x73.g) x73.c.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f533974a).a("", c16114x800e8cdb, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb r17) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn4.x.g(com.tencent.mm.plugin.hp.util.TinkerSyncResponse):void");
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "updateFailToast");
        ((ku5.t0) ku5.t0.f394148d).B(wn4.w.f529103d);
    }
}
