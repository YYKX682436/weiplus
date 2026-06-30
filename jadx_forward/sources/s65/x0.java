package s65;

/* loaded from: classes11.dex */
public class x0 implements s65.n0, s65.w {
    public final android.content.Context A;
    public long B;
    public final s65.m0 C;
    public long D;
    public final q65.b E;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l f485060a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f485061b = new java.util.ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f485062c;

    /* renamed from: d, reason: collision with root package name */
    public int f485063d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f485064e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f485065f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f485066g;

    /* renamed from: h, reason: collision with root package name */
    public int f485067h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f485068i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f485069j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f485070k;

    /* renamed from: l, reason: collision with root package name */
    public int f485071l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String[] f485072m;

    /* renamed from: n, reason: collision with root package name */
    public uk.m f485073n;

    /* renamed from: o, reason: collision with root package name */
    public uk.l f485074o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f485075p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f485076q;

    /* renamed from: r, reason: collision with root package name */
    public int f485077r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f485078s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f485079t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f485080u;

    /* renamed from: v, reason: collision with root package name */
    public int f485081v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f485082w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f485083x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.Intent f485084y;

    /* renamed from: z, reason: collision with root package name */
    public android.app.Notification f485085z;

    public x0(s65.u0 u0Var) {
        int i17 = o45.wf.f424556a;
        this.f485075p = false;
        this.f485076q = false;
        this.f485078s = false;
        this.f485080u = false;
        this.f485083x = false;
        this.f485084y = null;
        this.f485085z = null;
        this.A = null;
        this.C = new s65.m0(this);
        this.D = -1L;
        this.E = new s65.v0(this);
        this.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
    }

    public static void j(s65.x0 x0Var, int i17, int i18) {
        android.app.PendingIntent activity;
        android.content.Context context = x0Var.A;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571910ta);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.boa);
        if (i17 < i18) {
            long j17 = (i17 * 100) / i18;
            if (j17 - x0Var.D < 1) {
                return;
            }
            x0Var.D = j17;
            java.lang.String str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td) + java.lang.String.valueOf(x0Var.D) + "%";
            android.content.Intent intent = new android.content.Intent(x0Var.f485084y);
            intent.setClass(context, com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.class);
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728));
            z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
            k0Var.m(null);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f(string);
            k0Var.e(str);
            k0Var.f550996g = activity2;
            android.content.res.Resources resources = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(valueOf);
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            k0Var.j(decodeResource);
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            android.app.Notification b17 = k0Var.b();
            x0Var.f485085z = b17;
            b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.boa;
        } else {
            if (x0Var.f485080u) {
                java.lang.String b18 = x0Var.f485060a.b();
                if (!(b18 != null && new java.io.File(b18).exists())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "do noting. wait for merge apk.");
                }
            }
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571909t9);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(context, intent2, new com.p314xaae8f345.mm.vfs.r6(x0Var.f485060a.b()), "application/vnd.android.package-archive", false);
            intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.content.Intent intent3 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e.class);
                intent3.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
                intent3.setSelector(intent2);
                activity = android.app.PendingIntent.getActivity(context, 0, intent3, fp.g0.a(134217728));
            } else {
                activity = android.app.PendingIntent.getActivity(context, 0, intent2, fp.g0.a(134217728));
            }
            z2.k0 k0Var2 = new z2.k0(context, "reminder_channel_id");
            k0Var2.m(null);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.app.Notification notification2 = k0Var2.D;
            notification2.when = currentTimeMillis2;
            k0Var2.f(string);
            k0Var2.e(string2);
            k0Var2.f550996g = activity;
            android.content.res.Resources resources2 = context.getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(valueOf);
            arrayList2.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj2, decodeResource2, "com/tencent/mm/sandbox/updater/UpdaterManager", "showProgressNotification", "(II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            k0Var2.j(decodeResource2);
            notification2.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            android.app.Notification b19 = k0Var2.b();
            x0Var.f485085z = b19;
            b19.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.boa;
            b19.flags |= 16;
        }
        if (x0Var.f485076q) {
            return;
        }
        ((android.app.NotificationManager) context.getSystemService("notification")).notify(99, x0Var.f485085z);
    }

    @Override // s65.n0
    public void a(int i17, int i18) {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).a(i17, i18);
        }
    }

    @Override // s65.n0
    public void b() {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).b();
        }
    }

    @Override // s65.n0
    public void c(java.lang.String str) {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).c(str);
        }
    }

    @Override // s65.w
    public boolean d() {
        if (this.f485083x || java.lang.System.currentTimeMillis() - this.B <= com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.f273865q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", java.lang.Boolean.valueOf(this.f485083x), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.B));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "not busy");
        return false;
    }

    @Override // s65.w
    public boolean e(android.content.Intent intent) {
        boolean o17 = o(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "summerupdate handleCommand(Intent intent) ret need download[%b]", java.lang.Boolean.valueOf(o17));
        if (o17) {
            m(false);
        }
        return o17;
    }

    @Override // s65.n0
    public void f() {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).f();
        }
    }

    @Override // s65.w
    public void g(boolean z17) {
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "summerupdate setNetStatChanged isWifi %s", java.lang.Boolean.valueOf(z17));
        s65.m0 m0Var = this.C;
        if (m0Var.f485033g != z17) {
            m0Var.a(true);
            m0Var.f485033g = z17;
        }
        int i17 = this.f485077r;
        if (i17 != 2 || (z18 = this.f485083x)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "downloadMode %s downloading %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f485083x));
            return;
        }
        if (z17) {
            if (o(this.f485084y)) {
                m(true);
            }
        } else if (z18) {
            k();
        }
    }

    @Override // s65.n0
    public void h(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar) {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).h(lVar);
        }
    }

    @Override // s65.n0
    public void i() {
        java.util.Iterator it = this.f485061b.iterator();
        while (it.hasNext()) {
            ((s65.n0) it.next()).i();
        }
    }

    public void k() {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar = this.f485060a;
        if (lVar != null) {
            this.f485083x = false;
            lVar.mo159547xae7a2e7a();
            this.f485060a = null;
            this.B = java.lang.System.currentTimeMillis();
            this.C.b();
        }
    }

    public void l(int i17, boolean z17) {
        this.f485076q = z17;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new s65.u0(this, i17), 300L);
    }

    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "download() isWifiRetry %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "summerupdate download() downloadMode %s downloading %s", java.lang.Integer.valueOf(this.f485077r), java.lang.Boolean.valueOf(this.f485083x));
        if (this.f485084y == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "download() haven't handleCommand");
            return;
        }
        if (this.f485083x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "download() downloading, duplicate download request");
            return;
        }
        boolean z18 = true;
        if (!fp.m.c().equals("mounted")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "no sdcard.");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "system_config_prefs", 0);
            o4Var.getClass();
            o4Var.putLong("recomended_update_ignore", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 86400);
            l(2, true);
            i();
            return;
        }
        int i17 = this.f485077r;
        android.content.Context context = this.A;
        if (i17 == 2 && !z17) {
            s65.o0.g(context, 0, 0);
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(this.f485069j, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", c17);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "update package already exist.");
            l(1, true);
            c(c17);
            if (this.f485077r == 2) {
                java.lang.String str = this.f485069j;
                java.lang.String[] b17 = s65.o0.b();
                if (b17 != null) {
                    for (java.lang.String str2 : b17) {
                        if (str2.equals(str)) {
                            break;
                        }
                    }
                }
                z18 = false;
                if (z18) {
                    return;
                }
                s65.o0.d(this.f485069j, this.f485070k, this.f485068i, this.f485071l, this.f485077r, this.f485063d, this.f485079t);
                return;
            }
            return;
        }
        if (this.f485078s) {
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l lVar = this.f485060a;
            if (lVar != null) {
                try {
                    java.io.File file = new java.io.File(lVar.d());
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.GetUpdatePack", "error in deleteTempFile");
                }
            }
            s65.o0.h(context, 11);
        }
        if (this.f485078s || !this.f485075p || this.f485073n == null || this.f485074o == null) {
            if (fp.i.c(this.f485071l)) {
                n();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "SDCard is full");
                p();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "Incresment Update");
        s65.o0.h(context, 5);
        if (!fp.i.c(this.f485071l + this.f485074o.f510038e)) {
            p();
            return;
        }
        k();
        int i18 = this.f485074o.f510038e;
        java.lang.String str3 = this.f485069j;
        int i19 = this.f485063d;
        java.lang.String str4 = this.f485073n.f510039a + this.f485074o.f510037d;
        uk.l lVar2 = this.f485074o;
        this.f485060a = new s65.g0(i18, str3, i19, str4, lVar2.f510036c, lVar2.f510035b, this.f485077r == 2);
        r();
    }

    public final void n() {
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "downloadFullPack");
        s65.o0.h(this.A, 7);
        java.lang.String[] strArr = this.f485072m;
        if (strArr == null || strArr.length <= 0) {
            this.f485060a = new s65.z(this.f485071l, this.f485069j, this.f485063d, this.f485067h, this.f485064e, this.f485065f, this.f485066g, this.f485062c, this.f485077r == 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 77L, 1L, true);
        } else {
            this.f485060a = new s65.g0(this.f485071l, this.f485069j, this.f485063d, this.f485072m, this.f485077r == 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 76L, 1L, true);
        }
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e9, code lost:
    
        if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.c(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.f273829f + r7 + ".temp") != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.x0.o(android.content.Intent):boolean");
    }

    @Override // s65.w
    /* renamed from: onDestroy */
    public void mo163944xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "onDestroy");
        if (this.f485083x) {
            return;
        }
        q();
        l(1, true);
    }

    public final void p() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "system_config_prefs", 0);
        o4Var.getClass();
        o4Var.putLong("recomended_update_ignore", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 86400).commit();
        l(2, true);
        f();
    }

    public void q() {
        k();
        this.f485081v = 0;
        this.f485082w = null;
        this.f485062c = null;
        int i17 = o45.wf.f424556a;
        this.f485063d = 0;
        this.f485064e = null;
        this.f485065f = null;
        this.f485066g = null;
        this.f485067h = 0;
        this.f485069j = null;
        this.f485071l = 0;
        this.f485068i = null;
        this.f485072m = null;
        this.f485073n = null;
        this.f485074o = null;
        this.f485075p = false;
        this.f485076q = false;
        this.f485077r = 0;
        this.f485078s = false;
        this.f485084y = null;
        this.f485083x = false;
        this.f485085z = null;
        this.D = 0L;
    }

    public final void r() {
        boolean z17;
        if (this.f485077r == 2 && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this.A)) {
            s65.o0.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdaterManager", "we stop download, when silence and not wifi!");
            return;
        }
        int i17 = this.f485077r;
        s65.m0 m0Var = this.C;
        if (i17 == 2) {
            java.lang.String str = this.f485069j;
            long j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_flowstat_prefs", 4)).getLong(str, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "getPackFlowStat pack %s, flow %s", str, java.lang.Long.valueOf(j17));
            if (j17 > s65.m0.f485026h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdaterManager", "the traffice is overload, not download anymore in silence mode!");
                m0Var.b();
                return;
            }
        }
        java.lang.String str2 = this.f485069j;
        int i18 = this.f485071l;
        m0Var.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (!str2.equals(m0Var.f485030d)) {
                m0Var.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficStatistic", "pack size: " + i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", java.lang.Long.valueOf(s65.m0.f485026h));
            long max = java.lang.Math.max((long) (i18 * 4), s65.m0.f485026h);
            s65.m0.f485026h = max;
            long min = java.lang.Math.min(314572800L, max);
            s65.m0.f485026h = min;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", java.lang.Long.valueOf(min));
            if (!m0Var.f485031e) {
                android.content.Context context = m0Var.f485032f.A;
                if (context != null) {
                    m0Var.f485033g = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
                }
                m0Var.f485027a.c(30000L, 30000L);
                m0Var.f485031e = true;
                m0Var.f485030d = str2;
            }
        }
        if (this.f485060a != null) {
            l(1, false);
            this.f485083x = true;
            this.f485060a.a(this.E);
            b();
            if (this.f485077r == 2) {
                s65.o0.c();
            }
        }
    }
}
