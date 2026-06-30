package y73;

/* loaded from: classes11.dex */
public class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f541239d;

    /* renamed from: e, reason: collision with root package name */
    public long f541240e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f541241f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f541242g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f541243h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f541244i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f541245m = false;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f541246n = false;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb) {
        this.f541241f = false;
        this.f541239d = c16114x800e8cdb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bm5.o1.f104252a.k(bm5.h0.RepairerConfig_Updater_MMdiffCgi_String, ""))) {
            return;
        }
        this.f541241f = true;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, boolean z17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223953s) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572067xu) : c16114x800e8cdb.f223953s;
        java.lang.String str = c16114x800e8cdb.f223954t;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        java.lang.String str2 = c16114x800e8cdb.f223955u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str2);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(268435456));
        z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
        k0Var.m(null);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(string);
        k0Var.e(str);
        k0Var.f550996g = activity;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        android.app.Notification b17 = k0Var.b();
        b17.flags |= 16;
        if (z17) {
            ((android.app.NotificationManager) context.getSystemService("notification")).notify(19841110, b17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "ignore action when load from cache,when response is alpha version");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "onTaskFailed");
        long j18 = this.f541240e;
        if (j18 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        y73.z.b(2);
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
        if (c16114x800e8cdb.e() == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 51L, 1L, false);
        } else if (c16114x800e8cdb.e() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskFailed taskId:%d", java.lang.Long.valueOf(j17));
            w73.f.k(126);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 126L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.io.File file;
        android.content.Context context;
        java.io.File[] listFiles;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        long j18 = this.f541240e;
        if (j18 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
            return;
        }
        y73.z.c(2);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.io.File file2 = new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(str, false));
        android.content.pm.ApplicationInfo applicationInfo = context2.getApplicationInfo();
        if (applicationInfo == null) {
            file = null;
        } else {
            file = new java.io.File(applicationInfo.dataDir, "tinker_server");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (file != null && (listFiles = file.listFiles()) != null) {
            java.lang.String name = file2.getName();
            for (java.io.File file3 : listFiles) {
                if (!file3.getName().equals(name)) {
                    ak0.z.b(file3);
                }
            }
        }
        int e17 = this.f541239d.e();
        if (e17 == 1) {
            context = context2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
        } else if (e17 != 2) {
            if (e17 == 3) {
                java.lang.String absolutePath = file2.getAbsolutePath();
                com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = w73.a.f525025b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeDiff HdiffApk， patchPath:%s , new apk md5：%s, TinkerSyncResponse = %s.", absolutePath, c16114x800e8cdb.f223949o, c16114x800e8cdb.m65149x9616526c());
                gm0.j1.e().j(new w73.b(context2, absolutePath, c16114x800e8cdb));
            } else if (e17 == 4) {
                this.f541246n = true;
                e(file2, j17);
            }
            context = context2;
        } else {
            b83.e eVar = new b83.e(lp0.a.f401782c, this.f541239d.f223952r);
            android.content.SharedPreferences b17 = eVar.b();
            java.lang.String a17 = eVar.a(1);
            if (b17.contains(a17)) {
                context = context2;
                eVar.c(1, java.lang.System.currentTimeMillis() - b17.getLong(a17, 0L));
                b17.edit().remove(a17).commit();
            } else {
                context = context2;
            }
            rf0.m mVar = (rf0.m) i95.n0.c(rf0.m.class);
            java.lang.String absolutePath2 = file2.getAbsolutePath();
            java.lang.String str2 = this.f541239d.f223952r;
            ((qf0.n) mVar).getClass();
            if (absolutePath2 != null && str2 != null) {
                ((ku5.t0) ku5.t0.f394148d).g(new qf0.m(absolutePath2, str2));
            }
            if (file2.exists() && file2.canRead() && file2.isFile() && file2.length() > 0) {
                java.lang.String file4 = file2.getAbsolutePath();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file4, "file");
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(file4)));
                try {
                    long readLong = dataInputStream.readLong();
                    vz5.b.a(dataInputStream, null);
                    if (readLong == 96093072812398L) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Bi();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "hotpatch hit tpc file");
                        final long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.String i17 = c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                        final com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("TPCFile"), file2.getName());
                        ((ku5.t0) ku5.t0.f394148d).q(new y73.j0(this, i17, file2.getAbsolutePath(), r6Var.o(), new xv.m0() { // from class: y73.d0$$a
                            @Override // xv.m0
                            public final void a(int i18) {
                                y73.d0 d0Var = y73.d0.this;
                                long j19 = currentTimeMillis;
                                com.p314xaae8f345.mm.vfs.r6 r6Var2 = r6Var;
                                d0Var.getClass();
                                if (i18 == 0) {
                                    new b83.e(lp0.a.f401782c, d0Var.f541239d.f223952r).d(java.lang.System.currentTimeMillis() - j19);
                                    d0Var.d(new java.io.File(r6Var2.o()));
                                } else {
                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                                    c6423x452b9f7c.f137646e = 99L;
                                    c6423x452b9f7c.f137648g = -1L;
                                    c6423x452b9f7c.f137645d = -1L;
                                    c6423x452b9f7c.k();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.SyncResponseProcessor", "TCPFile Fail:$resultCode");
                                }
                                ((ku5.t0) ku5.t0.f394148d).g(new y73.RunnableC30755x5978c16());
                            }
                        }));
                    }
                } finally {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "hotpatch not tpc file");
            d(file2);
        }
        android.content.Context context3 = context;
        context3.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", this.f541239d.f223952r).apply();
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb2 = this.f541239d;
        context3.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", c16114x800e8cdb2.d(c16114x800e8cdb2.f223942e, 2)).apply();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
    }

    public final void d(java.io.File file) {
        boolean z17;
        try {
            z17 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429(ak0.o.f87076b).m104719x3bfad524(file);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.SyncResponseProcessor", e17, "verify patch signature failed.", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 39L, 1L, false);
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "verify patch signature failed, tinker.");
            y73.z.b(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 31L, 1L, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
            return;
        }
        if (z65.c.f551992e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "[tomys] patch applying is blocked by assist.");
            return;
        }
        if (!com.p314xaae8f345.mm.app.m2.f135048a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientver to recover.");
            return;
        }
        ak0.e a17 = ak0.g.a(file);
        if (a17 != null) {
            java.lang.String property = ((ak0.f) a17).f87070a.getProperty("patch.client.ver");
            if (android.text.TextUtils.isEmpty(property)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.SyncResponseProcessor", "[-] Fail to get patch clientversion.");
            } else {
                b83.e eVar = new b83.e(lp0.a.f401782c, property);
                eVar.f(eVar.a(2));
            }
        }
        ak0.n.d(file);
    }

    public final void e(java.io.File file, long j17) {
        java.lang.String str = (java.lang.String) this.f541244i.get(java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = this.f541243h;
        if (str == null || hashMap.get(str) == null || ((java.lang.Boolean) hashMap.get(str)).booleanValue()) {
            hashMap.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
            c16114x800e8cdb.f223956v = true;
            if (c16114x800e8cdb.f223958x) {
                w73.a.e("mmdiff_apk_has_update_notify", c16114x800e8cdb.c(), 4);
            }
            java.util.Map map = c83.e.f121211a;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_stop_auto_update, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "isForceStopAutoMerge = %s, syncResponse = %s.", java.lang.Boolean.valueOf(z17), c16114x800e8cdb);
            if (z17) {
                return;
            }
            if (this.f541241f) {
                android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "finish download, and start merge patch", 1).show();
            }
            c83.e.b(c16114x800e8cdb);
            ((x73.g) x73.c.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f533974a).a(file.getAbsolutePath(), c16114x800e8cdb, false);
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.f223932f = new y73.k0(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    public final void g() {
        boolean equals = fp.m.c().equals("mounted");
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
        if (!equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.SyncResponseProcessor", "no sdcard.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 50L, 1L, false);
            w73.f.i(10, c16114x800e8cdb.e(), 103);
            return;
        }
        if (!(c16114x800e8cdb.f223943f.intValue() == 4 ? fp.i.c(((int) new java.io.File(c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)).length()) * 4) : fp.i.c(c16114x800e8cdb.f223948n))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.SyncResponseProcessor", "sdcard is full.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(614L, 51L, 1L, false);
            if (c16114x800e8cdb.e() == 3 || c16114x800e8cdb.e() == 4) {
                g0Var.mo68477x336bdfd8(614L, 55L, 1L, false);
                w73.f.i(10, c16114x800e8cdb.e(), 104);
                return;
            }
            return;
        }
        boolean z17 = this.f541241f;
        if (z17) {
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "start download patch.", 0).show();
        }
        c83.e.c(c16114x800e8cdb.f223943f.intValue(), 1);
        w73.f.h(1, c16114x800e8cdb.f223943f.intValue());
        if (c16114x800e8cdb.e() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "hdiffApk syncResponse, newApkMd5 = " + c16114x800e8cdb.f223949o + ", oldApkMd5 = " + c16114x800e8cdb.f223950p);
        }
        if (c16114x800e8cdb.e() == 3 || c16114x800e8cdb.e() == 4) {
            java.lang.String l17 = c83.e.l(c16114x800e8cdb.f223949o);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223949o) && c83.e.n(l17) && uk.b.a(l17)) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (z17) {
                    android.widget.Toast.makeText(context, "apk hase merge success can not megre, Switch wechat from background to foreground..", 0).show();
                }
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.b()) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3k) : c16114x800e8cdb.b();
                r45.mm6 mm6Var = new r45.mm6();
                mm6Var.f462201d = c16114x800e8cdb.f223947m;
                mm6Var.f462206i = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdx);
                mm6Var.f462208n = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1e);
                mm6Var.f462209o = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574949k33);
                mm6Var.f462204g = c16114x800e8cdb.f223949o;
                mm6Var.f462205h = c16114x800e8cdb.f223950p;
                mm6Var.f462203f = c16114x800e8cdb.f223948n;
                mm6Var.f462210p = c16114x800e8cdb.f223945h;
                mm6Var.f462211q = c16114x800e8cdb.f223946i;
                mm6Var.f462214t = c16114x800e8cdb.f223943f.intValue();
                mm6Var.f462212r = c16114x800e8cdb.f223951q;
                mm6Var.f462202e = l17;
                try {
                    mm6Var.f462213s = c83.e.q(c16114x800e8cdb.f223952r);
                } catch (java.lang.Exception unused) {
                }
                mm6Var.f462207m = string;
                c83.e.a(mm6Var, c16114x800e8cdb);
                c83.e.t(mm6Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, file is exist. need no to download. newApkMd5:%s", c16114x800e8cdb.f223949o);
                w73.f.h(13, c16114x800e8cdb.e());
                return;
            }
        }
        c83.e.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        ((ku5.t0) ku5.t0.f394148d).g(new c83.d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178683a = c16114x800e8cdb.f223945h;
        t0Var.f178686d = c16114x800e8cdb.f223947m;
        t0Var.f178687e = c16114x800e8cdb.f223946i;
        t0Var.f178691i = false;
        t0Var.f178693k = true;
        t0Var.f178688f = 2;
        t0Var.f178692j = false;
        long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        this.f541240e = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "Download task id is :%d", java.lang.Long.valueOf(b17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(614L, 2L, 1L, false);
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            g0Var2.mo68477x336bdfd8(614L, 7L, 1L, false);
        } else {
            g0Var2.mo68477x336bdfd8(614L, 8L, 1L, false);
        }
        if (c16114x800e8cdb.f223943f.intValue() == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223952r)) {
            b83.e eVar = new b83.e(lp0.a.f401782c, c16114x800e8cdb.f223952r);
            eVar.f(eVar.a(1));
            eVar.c(6, 0L);
        }
        if (c16114x800e8cdb.f223943f.intValue() == 3) {
            g0Var2.mo68477x336bdfd8(614L, 56L, 1L, false);
        }
        if (c16114x800e8cdb.f223943f.intValue() == 4) {
            w73.f.k(124);
            g0Var2.mo68477x336bdfd8(614L, 124L, 1L, false);
            ((x73.g) x73.c.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f533974a).a("", c16114x800e8cdb, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        if (this.f541239d.e() == 4) {
            this.f541242g.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            java.lang.String str2 = (java.lang.String) this.f541244i.get(java.lang.Long.valueOf(j17));
            try {
                java.io.File file = new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(str2, false));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + file.exists() + "， 长度 " + file.length() + ", recvLen = " + ((j18 / 1024) / 1024) + "MB, totalLen = " + j19);
                if (j19 > w73.a.f525024a * 2) {
                    w73.a.f525024a = j19 / 2;
                }
                if (this.f541245m || j18 <= w73.a.f525024a || !file.exists()) {
                    return;
                }
                if (this.f541241f) {
                    android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "read OldDeltaFriendFile and download 50%", 0).show();
                }
                this.f541245m = true;
                this.f541243h.put(str2, java.lang.Boolean.FALSE);
                w73.a.a(file.getAbsolutePath(), new y73.l0(this, str2, file, j17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskProgressChanged = filePath = " + str2 + "， is file exist = " + e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
    }

    public boolean j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "process tinker response: %s", c16114x800e8cdb.m65149x9616526c());
        boolean z18 = false;
        if (bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Updater_CloseAutoPatch_Int, 0) == 1) {
            return false;
        }
        if (!c16114x800e8cdb.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "process check response fail, just return");
            return false;
        }
        if (c16114x800e8cdb.h()) {
            if (ak0.o.f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process");
                new w11.f1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new y73.g0(this), false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return");
            }
            return true;
        }
        if (!c16114x800e8cdb.i()) {
            return true;
        }
        if (c16114x800e8cdb.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "is lower version skip.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 78L, 1L, false);
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                int intValue = java.lang.Integer.decode(lp0.a.f401782c).intValue();
                if (intValue >= 654316032 && intValue <= 654316287 && "vivo".equalsIgnoreCase(android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT == 29) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_vivo_q_patch, 0) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "[!] [tomys] Patch was blocked due to some compatibility issues.");
                        return true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.SyncResponseProcessor", th6, "[-] [tomys] Error happened in tmp ctrl code.", new java.lang.Object[0]);
            }
        }
        if (z65.c.f551992e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.SyncResponseProcessor", "[tomys] patch downloading is blocked by assist.");
            return true;
        }
        int intValue2 = c16114x800e8cdb.f223943f.intValue();
        java.lang.String str = c16114x800e8cdb.f223955u;
        if (intValue2 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223952r) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && c83.c.a(c16114x800e8cdb.f223952r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "auto,hdiff alpha package");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 77L, 1L, false);
            a(c16114x800e8cdb, z17);
            return true;
        }
        if (c16114x800e8cdb.f223943f.intValue() == 4) {
            y73.p.c(c16114x800e8cdb);
        }
        if (!(bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Updater_DISABLEALPHA_Int, 0) == 1) && c16114x800e8cdb.f223943f.intValue() == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.f223952r) && c83.c.a(c16114x800e8cdb.f223952r) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (this.f541241f) {
                android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "to open alpha switch.", 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk,auto,hdiff alpha package");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 79L, 1L, false);
            a(c16114x800e8cdb, z17);
            return true;
        }
        java.lang.String b17 = c16114x800e8cdb.b();
        java.lang.String str2 = c16114x800e8cdb.f223952r;
        java.lang.Integer num = c16114x800e8cdb.f223944g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s clientversion:%s", num, b17, str2);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int intValue3 = num.intValue();
        java.lang.String str3 = c16114x800e8cdb.f223947m;
        if (intValue3 == 2 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            java.util.HashMap hashMap = c16114x800e8cdb.f223942e;
            if (hashMap != null && !hashMap.isEmpty() && hashMap.containsKey(4)) {
                z18 = true;
            }
            if (z18) {
                if (b83.s.a(context, str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 44L, 1L, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", str3);
                } else {
                    int intValue4 = c16114x800e8cdb.f223943f.intValue();
                    int i17 = c16114x800e8cdb.f223948n;
                    if (intValue4 == 2) {
                        y73.u0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdx), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdz, c16114x800e8cdb.b(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3a), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i17)), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3e), new y73.e0(this), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574949k33), new y73.f0(this, context));
                    } else if (c16114x800e8cdb.f223943f.intValue() == 3 || c16114x800e8cdb.f223943f.intValue() == 4) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "showUpdateDialog syncResponse.packageType: %s.", c16114x800e8cdb.f223943f);
                        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16114x800e8cdb.b()) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3k) : c16114x800e8cdb.b();
                        r45.mm6 mm6Var = new r45.mm6();
                        mm6Var.f462201d = str3;
                        mm6Var.f462206i = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdx);
                        mm6Var.f462208n = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k3e);
                        mm6Var.f462209o = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574949k33);
                        mm6Var.f462204g = c16114x800e8cdb.f223949o;
                        mm6Var.f462205h = c16114x800e8cdb.f223950p;
                        mm6Var.f462203f = i17;
                        mm6Var.f462210p = c16114x800e8cdb.f223945h;
                        mm6Var.f462211q = c16114x800e8cdb.f223946i;
                        mm6Var.f462214t = c16114x800e8cdb.f223943f.intValue();
                        mm6Var.f462212r = c16114x800e8cdb.f223951q;
                        mm6Var.f462202e = c83.e.l(c16114x800e8cdb.f223949o);
                        c83.e.a(mm6Var, c16114x800e8cdb);
                        try {
                            mm6Var.f462213s = c83.e.q(c16114x800e8cdb.f223952r);
                        } catch (java.lang.Exception unused) {
                        }
                        mm6Var.f462207m = string;
                        c83.e.t(mm6Var);
                    }
                    y73.a.b(4);
                }
                return true;
            }
        }
        if (c16114x800e8cdb.g() && !b83.s.a(context, str3)) {
            g();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f541239d.e() == 4) {
            this.f541244i.put(java.lang.Long.valueOf(j17), str);
            this.f541242g.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.Long.parseLong("0")));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "onTaskRemoved taskId:%d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f541239d;
        if (c16114x800e8cdb == null || c16114x800e8cdb.e() != 4) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onTaskRemoved taskId:%d", java.lang.Long.valueOf(j17));
        w73.f.k(127);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 127L, 1L, false);
    }
}
