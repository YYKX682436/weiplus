package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/gl", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI */
/* loaded from: classes10.dex */
public abstract class AbstractActivityC15087xee12defa extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f210337s = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210338d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f210340f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f210341g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f210342h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl f210343i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f210344m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f210345n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f210346o;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f210339e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hl.f210868d);

    /* renamed from: p, reason: collision with root package name */
    public boolean f210347p = true;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ml f210348q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ml(this);

    /* renamed from: r, reason: collision with root package name */
    public volatile int f210349r = -1;

    public final void U6() {
        java.io.Serializable serializableExtra;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Nj(this);
        if (getIntent() == null || (serializableExtra = getIntent().getSerializableExtra("key_yreportsdk_reddot_info")) == null || !(serializableExtra instanceof java.util.HashMap)) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) serializableExtra;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).mk(this, hashMap);
        hashMap.size();
    }

    public boolean V6() {
        return true;
    }

    /* renamed from: W6 */
    public int getD() {
        return 0;
    }

    /* renamed from: X6 */
    public java.lang.String getF190953v() {
        return getClass().getSimpleName();
    }

    public int Y6() {
        return 0;
    }

    public void Z6(int i17, int i18, int i19, int i27, float f17) {
    }

    public void a7(int i17) {
    }

    public final void b7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "[LiveOrientation] needChangeOrientation set " + z17);
        this.f210338d = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        return !z17;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableActivityAnimation */
    public boolean mo56573xa904b9f2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        return !z17;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "finish " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + mo78538xecd98af8());
        if (!mo78538xecd98af8()) {
            this.f210340f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.il(this);
        }
        this.f210341g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 0;
    }

    @Override // android.app.Activity
    public int getTaskId() {
        if (!this.f210346o) {
            return super.getTaskId();
        }
        if (this.f210349r == -1) {
            this.f210349r = super.getTaskId();
        }
        return this.f210349r;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034c  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        if (z17) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575913li);
            } else {
                setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575914lj);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar = this.f210343i;
        if (glVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onDestroy");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "onDestroy " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f210341g);
        if (!this.f210341g && !this.f210342h) {
            this.f210342h = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a.d(hashCode(), this);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (ybVar != null) {
            ((c61.p2) ybVar).f120750g.remove(this);
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            l7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "onExitFinder finder:" + this);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d + (-1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d = i17;
            if (i17 < 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d = 0;
            }
            wo2.k kVar = (wo2.k) ((ws5.g) i95.n0.c(ws5.g.class));
            kVar.getClass();
            kVar.f529622i.remove(this);
            kVar.f529621h.remove(this);
            ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ui(false);
            if (!((c61.p2) l7Var.f120667x0).tj()) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.t1) ((ob0.z2) i95.n0.c(ob0.z2.class))).getClass();
                com.p314xaae8f345.mm.p849xbf8d97c1.o.k();
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).pj(false);
                ((c61.p2) l7Var.f120667x0).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommonService", "abandonAudioFocus not support!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206872a = "";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206873b = "";
                ey2.f fVar = (ey2.f) pf5.u.f435469a.e(c61.l7.class).a(ey2.f.class);
                fVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new ey2.e(fVar), "Finder.18054CacheVM");
                if (!pr2.a.f439482a.a()) {
                    ((ku5.t0) ku5.t0.f394148d).B(c61.s6.f120823d);
                }
                ms5.f.f412691a.a("onExitFinder");
                ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).getClass();
                ig2.m.f372926a.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203798a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListCache", "clearCache all");
                synchronized (cVar) {
                    ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203799b).clear();
                    ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c.f203800c).clear();
                }
                cu2.u.f303975b.clear();
                cu2.u.f303976c.clear();
                cu2.u.f303977d.clear();
                n54.i.e(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6 c15168x82e675a6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6) ((jz5.n) l7Var.Z).mo141623x754a37bb();
                c15168x82e675a6.getClass();
                try {
                    android.content.BroadcastReceiver broadcastReceiver = c15168x82e675a6.f212028f;
                    if (broadcastReceiver != null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
                    }
                    c15168x82e675a6.f212028f = null;
                } catch (java.lang.Throwable unused) {
                }
                if (c15168x82e675a6.P6()) {
                    c15168x82e675a6.f212034o.mo48814x2efc64();
                    if (c15168x82e675a6.Q6() && c15168x82e675a6.f212040u) {
                        android.view.WindowManager windowManager = c15168x82e675a6.f212041v;
                        if (windowManager != null) {
                            windowManager.removeView(c15168x82e675a6.f212042w);
                        }
                        c15168x82e675a6.f212042w = null;
                        c15168x82e675a6.f212040u = false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioVolumeController", "onExitFinder");
                }
                me2.c cVar2 = me2.c.f407454a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedDataCnl", "clear all data");
                me2.c.f407455b.clear();
                me2.c.f407456c.clear();
                me2.c.f407457d.clear();
                me2.c.f407458e.clear();
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = l7Var.ek().W;
            if (concurrentHashMap.size() >= 3000) {
                concurrentHashMap.clear();
            }
            if (gm0.j1.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
                l3Var.getClass();
                l3Var.f207666s.remove(this);
                l3Var.f207667t.remove(this);
                if (l3Var.f207666s.size() == 0) {
                    i95.m c17 = i95.n0.c(au2.q.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((au2.q) c17).f95623h = -1;
                }
            }
        }
        this.f210343i = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar = this.f210343i;
        if (glVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onNewIntent");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "onNewIntent " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f210341g);
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        ic2.l0 l0Var;
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "remove top activity:" + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184145b = null;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184147d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, weakReference != null ? (android.app.Activity) weakReference.get() : null)) {
            java.lang.String localClassName = getLocalClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localClassName, "getLocalClassName(...)");
            if (!r26.n0.B(localClassName, "FinderFinderSysMsgUI", false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184147d = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar = this.f210343i;
        if (glVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onPause");
        }
        if (((c61.yb) i95.n0.c(c61.yb.class)) != null && (l0Var = ((c61.l7) i95.n0.c(c61.l7.class)).P) != null) {
            java.util.HashSet hashSet = ic2.l0.f371872s;
            hashSet.remove(java.lang.Integer.valueOf(hashCode()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "unregister Looper " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209544x + " size: " + hashSet.size() + ' ' + l0Var.f371877h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "onPause " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f210340f);
        if (this.f210344m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.H1).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "REPORT_WHEN_SCREEN_SHOT remove");
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this.f210348q);
            }
        }
        java.lang.Runnable runnable = this.f210340f;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.il) runnable).run();
        }
        this.f210340f = null;
        if (isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a.d(hashCode(), this);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a;
        int hashCode = hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g0 c17 = j0Var.c(hashCode, false);
        if (c17 != null && c17.f206572e == 0 && c17.f206573f == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderEnterCostReporter", "notifyOnPause: abandon useless data " + c17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206617b.remove(java.lang.Integer.valueOf(hashCode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((r0.f206571d == 0) != false) goto L11;
     */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        getIntent().putExtra("key_mmfinder_is_resume", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "onStart " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f210341g);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).zj(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar = this.f210343i;
        if (glVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onStart");
        }
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gl glVar = this.f210343i;
        if (glVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a2) glVar).a("onStop");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "onStop " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f210341g);
        super.onStop();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).yj(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) pf5.z.f435481a.a(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        if (g1Var != null) {
            g1Var.f215990f = true;
        }
        super.mo2295x59cfc822();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        if (this.f210338d) {
            return;
        }
        super.mo50393x3c0b42ee();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "setRequestedOrientation: requestedOrientation = " + i17 + ", needChangeOrientation = " + this.f210338d + ", this=" + getF190953v());
        if (this.f210338d) {
            super.setRequestedOrientation(i17);
        } else {
            super.setRequestedOrientation(1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.ra.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.k9.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.vb.class)));
        ((nd0.e) i95.n0.c(nd0.e.class)).getClass();
        set.add(t04.a.class);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d92.l2.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d92.k2.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d92.j2.class)));
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d92.m2.class)));
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
    }
}
