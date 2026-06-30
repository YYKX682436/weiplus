package i02;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.z0 {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 f368049c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f368050d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f368051e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f368052f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f368053g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f368054h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f368055i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f368056j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f368057k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f368058l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f368059m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 f368060n;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var) {
        super(l0Var);
        android.content.pm.PackageInfo packageInfo = null;
        this.f368049c = null;
        this.f368055i = null;
        this.f368056j = new java.util.HashMap();
        this.f368057k = new java.util.HashMap();
        this.f368058l = new byte[0];
        this.f368059m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new i02.d(this), false);
        this.f368060n = new i02.e(this);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f368050d = context;
        this.f368051e = new java.util.HashMap();
        this.f368052f = new java.util.HashMap();
        this.f368053g = new java.util.concurrent.ConcurrentHashMap();
        this.f368054h = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String property = java.lang.System.getProperty("http.agent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", property);
        java.lang.String str = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property) ? "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)" : property) + " MicroMessenger";
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
        } else {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloaderImplTMAssistant", e17, "", new java.lang.Object[0]);
            }
        }
        if (packageInfo != null) {
            str = ((str + "/") + packageInfo.versionName) + "" + packageInfo.versionCode;
        }
        java.lang.String str3 = str + " NetType/" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", str3);
        hashMap.put("User-Agent", str3);
        this.f368055i = hashMap;
    }

    public static void g(i02.h hVar, java.lang.String str, int i17, int i18, boolean z17) {
        hVar.getClass();
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification failed: null task info");
            return;
        }
        if (f17.f68435x73c7b92d) {
            z2.k0 k0Var = new z2.k0(hVar.f368050d, "reminder_channel_id");
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                hVar.f368051e.put(str, java.lang.Long.valueOf(currentTimeMillis));
                k0Var.D.when = currentTimeMillis;
            } else {
                java.lang.Long l17 = (java.lang.Long) hVar.f368051e.get(str);
                if (l17 != null) {
                    k0Var.D.when = l17.longValue();
                } else {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    hVar.f368051e.put(str, valueOf);
                    k0Var.D.when = valueOf.longValue();
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(f17.f68404x28d45f97, false, false);
            if (!android.text.TextUtils.isEmpty(f17.f68418xf1e8cfcc)) {
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, FileDownloadInfo.appName=" + f17.f68418xf1e8cfcc + ", appId=" + f17.f68404x28d45f97);
                }
                k0Var.f(f17.f68418xf1e8cfcc);
            } else if (j17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67372x453d1e07)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, appName is empty");
            } else {
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, AppInfo.appName=" + j17.f67372x453d1e07 + ", appId=" + f17.f68404x28d45f97);
                }
                k0Var.f(j17.f67372x453d1e07);
            }
            switch (i17) {
                case 1:
                case 2:
                case 3:
                    k0Var.D.icon = android.R.drawable.stat_sys_download;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    boolean z18 = i18 == 0;
                    k0Var.f551003n = 100;
                    k0Var.f551004o = i18;
                    k0Var.f551005p = z18;
                    k0Var.e(hVar.f368050d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cek));
                    if (f17.f68431x4651c731) {
                        k0Var.f551002m = z2.k0.c(hVar.f368050d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cem));
                    }
                    k0Var.h(2, true);
                    long j18 = f17.f68408x32b20428;
                    android.content.Context context = hVar.f368050d;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13233xe6767370.class);
                    intent.putExtra("extra_download_id", j18);
                    k0Var.f550996g = android.app.PendingIntent.getActivity(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(268435456));
                    break;
                case 4:
                case 6:
                    hVar.h(str);
                    return;
                case 5:
                    k0Var.D.icon = android.R.drawable.stat_sys_download_done;
                    k0Var.d(true);
                    k0Var.f550996g = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, new android.content.Intent(), fp.g0.a(0));
                    k0Var.e(hVar.f368050d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ceh));
                    break;
            }
            synchronized (hVar.f368058l) {
                java.lang.Integer num = (java.lang.Integer) hVar.f368053g.get(str);
                if (num == null) {
                    hVar.f368053g.put(str, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).m(k0Var.b(), true)));
                } else {
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(num.intValue(), k0Var.b(), true);
                }
                if (i17 == 4) {
                    hVar.f368053g.remove(str);
                }
            }
        }
    }

    public static void i() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81.m105406xffba5073() + "/.tmp/");
        if (r6Var.m()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b, path:%s", java.lang.Boolean.valueOf(r6Var.J()), r6Var.u());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean a(long j17) {
        return k(j17, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        if (t0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t0Var.f178683a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
            return -1L;
        }
        java.lang.String str = t0Var.f178683a;
        java.lang.String str2 = t0Var.f178689g;
        h02.a f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str);
        if (f17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = d(f17.f68408x32b20428);
            int i17 = d17.f178496f;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, running, return");
                return d17.f178494d;
            }
            if (i17 == 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, md5 checking, return");
                return d17.f178494d;
            }
            if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, has download finished, install");
                if (t0Var.f178691i) {
                    k02.l.a(d17.f178494d, false, null);
                }
                return d17.f178494d;
            }
        }
        if (f17 == null) {
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str2);
        }
        i();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.j(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.j(t0Var.f178706x);
        h02.a b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.u0.b(t0Var);
        if (!t0Var.f178695m || f17 == null) {
            b17.f68408x32b20428 = java.lang.System.currentTimeMillis();
        } else {
            b17.f68408x32b20428 = f17.f68408x32b20428;
        }
        b17.f68441x10a0fed7 = 0;
        b17.f68414xf4f8adf4 = 2;
        if (f17 != null) {
            int i18 = f17.f68441x10a0fed7;
            if (i18 == 2) {
                b17.f68439x5ab9b1b4 = 1;
            } else if (i18 == 4) {
                b17.f68439x5ab9b1b4 = 1;
            } else {
                b17.f68439x5ab9b1b4 = 0;
            }
        } else {
            b17.f68439x5ab9b1b4 = 0;
        }
        if (!t0Var.f178696n || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                b17.f68409xc4f9be67 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
            return e(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "downloadInWifi, not wifi");
        b17.f68441x10a0fed7 = 0;
        b17.f68409xc4f9be67 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.a(b17);
        return b17.f68408x32b20428;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public boolean c(long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68411x238eb002)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.f68414xf4f8adf4 == 2) {
            ((ku5.t0) ku5.t0.f394148d).h(new i02.f(this, c17, j17), "MicroMsg.FileDownloaderImplTMAssistant");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask, delete file: %s", c17.f68419xf1e9b966);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j17);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d(long j17) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 c26663xc1a70300;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
        c13222x107de37.f178494d = j17;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68411x238eb002)) {
            c13222x107de37.f178495e = c17.f68411x238eb002;
            c13222x107de37.f178496f = c17.f68441x10a0fed7;
            java.lang.String str = c17.f68419xf1e9b966;
            c13222x107de37.f178497g = str;
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                c13222x107de37.f178500m = c17.f68413xf432b5ad;
                c13222x107de37.f178501n = c17.f68443x78351860;
            } else {
                c13222x107de37.f178500m = 0L;
                c13222x107de37.f178501n = 0L;
            }
            c13222x107de37.f178498h = c17.f68426x4b6e68b9;
            c13222x107de37.f178506s = c17.f68446x1294bc41;
            if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
                c26663xc1a70300 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300) new i02.c(this, 500L, null, c13222x107de37.f178495e).a(gm0.j1.e().d());
            } else {
                try {
                    c26663xc1a70300 = j().m104830xc45041ae(c13222x107de37.f178495e);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + e17.toString());
                    c26663xc1a70300 = null;
                }
            }
            if (c26663xc1a70300 != null) {
                int i17 = c26663xc1a70300.f56062xbec81024;
                if (i17 == 1 || i17 == 2) {
                    c13222x107de37.f178496f = 1;
                } else if (i17 == 3) {
                    c13222x107de37.f178496f = 2;
                } else if (i17 != 4) {
                    if (c13222x107de37.f178496f == 1) {
                        c13222x107de37.f178496f = 0;
                    }
                } else if (c13222x107de37.f178496f == 6) {
                    c13222x107de37.f178496f = 6;
                } else {
                    c13222x107de37.f178496f = 3;
                }
                c13222x107de37.f178497g = c26663xc1a70300.f56061xa9723acf;
                c13222x107de37.f178500m = c26663xc1a70300.f56060xabd4db75;
                c13222x107de37.f178501n = c26663xc1a70300.f56063xeaf8334;
            } else if (c13222x107de37.f178496f == 1) {
                c13222x107de37.f178496f = 0;
            }
            int i18 = c13222x107de37.f178496f;
            if ((i18 == 6 || i18 == 3) && !com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                c13222x107de37.f178496f = 0;
            }
            if (c13222x107de37.f178496f == 6) {
                if (!((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).contains(java.lang.Long.valueOf(c13222x107de37.f178494d))) {
                    c13222x107de37.f178496f = 3;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68419xf1e9b966)) {
                c17.f68419xf1e9b966 = c13222x107de37.f178497g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: appId: %s, status: %d, url: %s, path: %s", c17.f68404x28d45f97, java.lang.Integer.valueOf(c13222x107de37.f178496f), c13222x107de37.f178495e, c13222x107de37.f178497g);
        }
        return c13222x107de37;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    public long e(h02.a aVar) {
        ((ku5.t0) ku5.t0.f394148d).h(new i02.a(this, aVar), "MicroMsg.FileDownloaderImplTMAssistant");
        return aVar.f68408x32b20428;
    }

    public final void h(java.lang.String str) {
        synchronized (this.f368058l) {
            java.lang.Integer num = (java.lang.Integer) this.f368053g.get(str);
            if (num == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
                return;
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(num.intValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = " + num);
            this.f368053g.remove(str);
        }
    }

    public final com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 j() {
        if (this.f368049c == null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m104845xe4a9fc47 = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(this.f368050d).m104845xe4a9fc47("WechatDownloadClient");
            this.f368049c = m104845xe4a9fc47;
            m104845xe4a9fc47.m104832xe98e4d44(this.f368060n);
        }
        this.f368059m.c(240000L, 240000L);
        return this.f368049c;
    }

    public boolean k(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: id = " + j17);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68411x238eb002)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", java.lang.Long.valueOf(j17));
            return false;
        }
        if (c17.f68414xf4f8adf4 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", java.lang.Long.valueOf(j17));
            if (c17.f68414xf4f8adf4 != 4) {
                com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, delete file: " + c17.f68419xf1e9b966);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(j17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, DOWNLOADER_TYPE_WEBNET.");
            }
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 d17 = d(c17.f68408x32b20428);
        int i17 = d17.f178496f;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "download runing, return");
            return true;
        }
        if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "md5 checking ,return");
            return true;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "has download finished, install");
            if (c17.f68406x8d834527) {
                k02.l.a(d17.f178494d, false, null);
            }
            return true;
        }
        int i18 = c17.f68441x10a0fed7;
        if (i18 == 2) {
            c17.f68439x5ab9b1b4 = 1;
        } else if (i18 == 4) {
            c17.f68439x5ab9b1b4 = 2;
        } else {
            c17.f68439x5ab9b1b4 = 0;
        }
        c17.f68438x1bb3427e = c17.f68413xf432b5ad;
        c17.f68416x1c571ead = 0;
        i();
        if ((c17.f68431x4651c731 || c17.f68409xc4f9be67) && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask downloadInWifi, not wifi");
            return true;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            c17.f68409xc4f9be67 = true;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new i02.g(this, c17, z17, j17), "MicroMsg.FileDownloaderImplTMAssistant");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h1
    /* renamed from: removeDownloadTask */
    public int mo54687xdf0c94d1(long j17) {
        ((ku5.t0) ku5.t0.f394148d).h(new i02.b(this, j17), "MicroMsg.FileDownloaderImplTMAssistant");
        return 1;
    }
}
