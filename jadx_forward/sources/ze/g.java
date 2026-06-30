package ze;

/* loaded from: classes7.dex */
public abstract class g implements ze.p, xi1.s {

    /* renamed from: _softOrientation */
    private java.lang.String f77587x942ca107;

    /* renamed from: activityOrientationHandler */
    private final xi1.p f77588x830c78c9;

    /* renamed from: displayMetrics */
    private final android.util.DisplayMetrics f77589x99c541a1;

    /* renamed from: dryRun */
    private final boolean f77590xb12358e0;

    /* renamed from: heightPx */
    private int f77591xcb58ed8f;

    /* renamed from: initConfig */
    private com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 f77592xf3d9c872;

    /* renamed from: isFold */
    private boolean f77593xb9a2e84b;

    /* renamed from: isFoldDevice */
    private final boolean f77594x17184e81;

    /* renamed from: isLastInMultiWindowMode */
    private boolean f77595x15a9d8e7;

    /* renamed from: lastLandscapeVHeight */
    private int f77596x7511e4b8;

    /* renamed from: lastLandscapeVWidth */
    private int f77597xe393a415;

    /* renamed from: lastOrientation */
    private int f77598x2c91b15a;

    /* renamed from: lastPortraitVHeight */
    private int f77599x6ddd5bac;

    /* renamed from: lastPortraitVWidth */
    private int f77600x90c37ea1;

    /* renamed from: lastScreenHDp */
    private int f77601x9c808512;

    /* renamed from: lastScreenWDp */
    private int f77602x9c80bd61;

    /* renamed from: maxEdge */
    private int f77603x32493541;

    /* renamed from: minEdge */
    private int f77604x3f630f2f;

    /* renamed from: orientation */
    private java.lang.String f77605xaa32f5d0;

    /* renamed from: resizable */
    private boolean f77606x7fce62ab;

    /* renamed from: rt, reason: collision with root package name */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f553261rt;

    /* renamed from: scale */
    private float f77607x683094a;

    /* renamed from: systemRatio */
    private double f77608xa3bff31c;

    /* renamed from: widthPx */
    private int f77609x4fe9de6e;

    /* renamed from: windowOrientation */
    private ze.b f77610xe6b4ebc0;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, xi1.p pVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f553261rt = rt6;
        this.f77588x830c78c9 = pVar;
        this.f77590xb12358e0 = z17;
        this.f77605xaa32f5d0 = "portrait";
        this.f77607x683094a = 1.0f;
        nf.y yVar = nf.x.f418149b;
        boolean z18 = false;
        boolean e17 = yVar != null ? yVar.e() : false;
        this.f77594x17184e81 = e17;
        this.f77589x99c541a1 = new android.util.DisplayMetrics();
        if (e17 && !rt6.mo48803xee5260a9().mo51617xea4a57dd()) {
            z18 = true;
        }
        this.f77593xb9a2e84b = z18;
        this.f77608xa3bff31c = -1.0d;
        android.app.Activity r07 = rt6.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        this.f77610xe6b4ebc0 = m178750x8c46e51d(r07.getResources().getConfiguration().orientation);
        android.app.Activity r08 = rt6.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r08);
        this.f77598x2c91b15a = r08.getResources().getConfiguration().orientation;
        android.app.Activity r09 = rt6.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r09);
        this.f77602x9c80bd61 = r09.getResources().getConfiguration().screenWidthDp;
        android.app.Activity r010 = rt6.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r010);
        this.f77601x9c808512 = r010.getResources().getConfiguration().screenHeightDp;
        m178751x6aea0eb5();
    }

    /* renamed from: getBackgroundView */
    private final android.view.View m178748x43ae89e9() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f553261rt.f156343s;
        android.view.ViewParent parent = qVar != null ? qVar.getParent() : null;
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }

    /* renamed from: parseOrientation */
    private final ze.b m178750x8c46e51d(int i17) {
        if (i17 == 1) {
            return ze.b.f553250e;
        }
        if (i17 == 2) {
            return ze.b.f553249d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AppBrandWindowLayoutManager", "unexpected orientation [%d], fallback to portrait", java.lang.Integer.valueOf(i17));
        return ze.b.f553250e;
    }

    /* renamed from: refreshDisplayInfo */
    private final void m178751x6aea0eb5() {
        android.graphics.Point point = new android.graphics.Point();
        android.app.Activity r07 = this.f553261rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        java.lang.Object systemService = r07.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.app.Activity r08 = this.f553261rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r08);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(r08)) {
            nf.y yVar = nf.x.f418149b;
            if (yVar != null ? yVar.a() : false) {
                defaultDisplay.getRealSize(point);
                defaultDisplay.getRealMetrics(this.f77589x99c541a1);
                int i17 = point.x;
                this.f77609x4fe9de6e = i17;
                int i18 = point.y;
                this.f77591xcb58ed8f = i18;
                this.f77603x32493541 = java.lang.Math.max(i17, i18);
                this.f77604x3f630f2f = java.lang.Math.min(this.f77609x4fe9de6e, this.f77591xcb58ed8f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "refreshDisplayInfo: system [w,h] = [%d,%d]", java.lang.Integer.valueOf(this.f77609x4fe9de6e), java.lang.Integer.valueOf(this.f77591xcb58ed8f));
            }
        }
        defaultDisplay.getSize(point);
        defaultDisplay.getMetrics(this.f77589x99c541a1);
        int i172 = point.x;
        this.f77609x4fe9de6e = i172;
        int i182 = point.y;
        this.f77591xcb58ed8f = i182;
        this.f77603x32493541 = java.lang.Math.max(i172, i182);
        this.f77604x3f630f2f = java.lang.Math.min(this.f77609x4fe9de6e, this.f77591xcb58ed8f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "refreshDisplayInfo: system [w,h] = [%d,%d]", java.lang.Integer.valueOf(this.f77609x4fe9de6e), java.lang.Integer.valueOf(this.f77591xcb58ed8f));
    }

    /* renamed from: resetWindowOrientation */
    private final void m178752xf5657631() {
        if (!this.f553261rt.V || this.f77588x830c78c9 == null) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.f77587x942ca107)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation by softOrientation[%s]", this.f77587x942ca107);
            this.f77588x830c78c9.b(xi1.o.d(this.f77587x942ca107), null);
        } else {
            xi1.o a17 = this.f77588x830c78c9.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getCurrentOrientation(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation with orientation[%s]", a17);
            this.f77588x830c78c9.b(a17, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(7:3|(2:5|(2:7|(1:11))(2:44|(1:46)))(2:47|(1:49))|12|13|14|(1:18)|(2:27|(2:34|(1:40)(2:38|39))(1:42))(1:25))|50|12|13|14|(2:16|18)|(1:21)|27|(1:29)|32|34|(2:36|40)(1:41)) */
    /* renamed from: set_softOrientation */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m178753x123d5969(java.lang.String r5) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f553261rt
            android.app.Activity r0 = r0.r0()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            java.lang.String r1 = "_softOrientation = [%s]"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.String r3 = "Luggage.AppBrandWindowLayoutManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1, r2)
            if (r5 == 0) goto L5f
            int r1 = r5.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L45
            r2 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r2) goto L37
            r2 = 1430647483(0x5545f2bb, float:1.3602894E13)
            if (r1 == r2) goto L2a
            goto L5f
        L2a:
            java.lang.String r1 = "landscape"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L5f
            ze.b r1 = ze.b.f553249d
            r4.f77610xe6b4ebc0 = r1
            goto L69
        L37:
            java.lang.String r1 = "portrait"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L40
            goto L5f
        L40:
            ze.b r1 = ze.b.f553250e
            r4.f77610xe6b4ebc0 = r1
            goto L69
        L45:
            java.lang.String r1 = "auto"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4e
            goto L5f
        L4e:
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            ze.b r1 = r4.m178750x8c46e51d(r1)
            r4.f77610xe6b4ebc0 = r1
            goto L69
        L5f:
            java.lang.String r1 = "unhandled orientation = [%s]"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r1, r2)
        L69:
            r1 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r4.f553261rt     // Catch: iz5.b -> L7c
            com.tencent.mm.plugin.appbrand.page.i3 r2 = r2.x0()     // Catch: iz5.b -> L7c
            if (r2 == 0) goto L7c
            com.tencent.mm.plugin.appbrand.page.v5 r2 = r2.m52174xaf156f4a()     // Catch: iz5.b -> L7c
            if (r2 == 0) goto L7c
            xi1.m r1 = r2.C1()     // Catch: iz5.b -> L7c
        L7c:
            if (r1 == 0) goto L89
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.zf
            if (r2 == 0) goto L89
            com.tencent.mm.plugin.appbrand.zf r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.zf) r1
            boolean r1 = r1.f173996p
            if (r1 == 0) goto L89
            return
        L89:
            r4.f77587x942ca107 = r5
            java.lang.String r5 = "set softOrientation"
            r1 = 1
            r4.m178754xe0e57a67(r5, r1)
            boolean r5 = r4.mo51620x1ab1e3d4()
            if (r5 != 0) goto L9b
            boolean r5 = r4.f77606x7fce62ab
            if (r5 == 0) goto Lbb
        L9b:
            xi1.p r5 = r4.f77588x830c78c9
            if (r5 == 0) goto Lbb
            java.lang.String r5 = "_softOrientation: unlock orientation"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            int r5 = r0.getRequestedOrientation()
            r0 = 14
            if (r5 == r0) goto Lbb
            r0 = -1
            if (r5 == r0) goto Lbb
            xi1.p r5 = r4.f77588x830c78c9
            xi1.o r0 = xi1.o.UNSPECIFIED
            ze.c r1 = new ze.c
            r1.<init>(r4)
            r5.b(r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.g.m178753x123d5969(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tuningRtContentView */
    public final void m178754xe0e57a67(java.lang.String str, boolean z17) {
        m178755xe0e57a67(true, false, str, z17);
    }

    /* renamed from: tuningRtContentView$default */
    public static /* synthetic */ void m178756x68124904(ze.g gVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        gVar.m178754xe0e57a67(str, z17);
    }

    @Override // xi1.s
    /* renamed from: createFullscreenHandler */
    public xi1.m mo51609xe80d1173(xi1.k kVar) {
        android.app.Activity r07 = this.f553261rt.r0();
        if (r07 == null) {
            r07 = null;
        }
        xi1.g mo48803xee5260a9 = this.f553261rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48803xee5260a9, "getWindowAndroid(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.zf(mo48803xee5260a9, kVar, r07);
    }

    @Override // xi1.s
    /* renamed from: forceLightMode */
    public boolean mo52324x6c02152e() {
        return false;
    }

    /* renamed from: getBackgroundColor */
    public int mo52939x3119c89f() {
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d;
    }

    /* renamed from: getInitConfig */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 m178758xe21a8068() {
        return this.f77592xf3d9c872;
    }

    /* renamed from: getLastLandscapeVHeight */
    public final int m178759x22dda12e() {
        return this.f77596x7511e4b8;
    }

    /* renamed from: getLastLandscapeVWidth */
    public final int m178760x3bc380df() {
        return this.f77597xe393a415;
    }

    /* renamed from: getLastPortraitVHeight */
    public final int m178761xc60d3876() {
        return this.f77599x6ddd5bac;
    }

    /* renamed from: getLastPortraitVWidth */
    public final int m178762xa41fe097() {
        return this.f77600x90c37ea1;
    }

    @Override // xi1.s
    /* renamed from: getOrientationHandler */
    public xi1.p mo51612x60543150() {
        xi1.g mo48803xee5260a9 = this.f553261rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48803xee5260a9, "getWindowAndroid(...)");
        return new zi1.b(mo48803xee5260a9);
    }

    /* renamed from: getResizable */
    public final boolean m178763x7f3bd3f5() {
        return this.f77606x7fce62ab;
    }

    /* renamed from: getRt */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 m178764x5db1c38() {
        return this.f553261rt;
    }

    @Override // xi1.s
    /* renamed from: getScale */
    public float mo51614x7520af94() {
        return this.f77607x683094a;
    }

    /* renamed from: getStatusBar */
    public abstract /* synthetic */ xi1.f mo51615x8408480b();

    @Override // xi1.s
    /* renamed from: getVDisplayMetrics */
    public android.util.DisplayMetrics mo48807xad90d981() {
        return m178749xad90d981(false);
    }

    @Override // ze.p
    /* renamed from: init */
    public void mo53407x316510(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 initConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        this.f77592xf3d9c872 = initConfig;
        this.f77606x7fce62ab = initConfig.N.f158996z;
        m178757x68124904(this, true, false, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, false, 8, null);
    }

    /* renamed from: isFold */
    public final boolean m178765xb9a2e84b() {
        return this.f77593xb9a2e84b;
    }

    @Override // xi1.s
    /* renamed from: isLargeScreenWindow */
    public boolean mo51618xbcb3824d() {
        android.app.Activity r07 = this.f553261rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(r07) && !mo51620x1ab1e3d4();
    }

    @Override // ze.p
    /* renamed from: onAppConfigGot */
    public void mo53409xab40bc48(k91.r appConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appConfig, "appConfig");
        java.lang.String str = "portrait";
        this.f77605xaa32f5d0 = "portrait";
        java.lang.String str2 = appConfig.a().f387257m;
        if (str2 == null) {
            java.lang.String str3 = appConfig.f387281r.f387083a;
            if (str3 != null) {
                if (!(str3.length() == 0)) {
                    str = str3;
                }
            }
            this.f77605xaa32f5d0 = str;
        } else {
            this.f77605xaa32f5d0 = str2;
        }
        boolean z17 = appConfig.f387287x;
        boolean z18 = this.f77606x7fce62ab;
        if (z18 != z17) {
            this.f77606x7fce62ab = z17;
            m178756x68124904(this, "redundancy field check fail", false, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AppBrandWindowLayoutManager", "setResizableToWindow: redundancy field check fail, please call complexzeng to fix, fromAttr = [%b], fromAppJson = [%b]", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // ze.p
    /* renamed from: onConfigurationChanged */
    public void mo53410x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        if (this.f77598x2c91b15a != newConfig.orientation && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f77587x942ca107, "auto") && mo51620x1ab1e3d4() && !this.f77606x7fce62ab) {
            this.f77610xe6b4ebc0 = m178750x8c46e51d(newConfig.orientation);
        }
        int i17 = this.f77598x2c91b15a;
        int i18 = newConfig.orientation;
        if (i17 != i18 || newConfig.screenHeightDp != this.f77601x9c808512 || newConfig.screenWidthDp != this.f77602x9c80bd61) {
            this.f77593xb9a2e84b = this.f77594x17184e81 || (!(newConfig.screenHeightDp == this.f77601x9c808512 && newConfig.screenWidthDp == this.f77602x9c80bd61) && i17 == i18);
            if (this.f553261rt.mo48803xee5260a9().mo51617xea4a57dd() || this.f77595x15a9d8e7) {
                this.f77593xb9a2e84b = false;
            }
            this.f77595x15a9d8e7 = this.f553261rt.mo48803xee5260a9().mo51617xea4a57dd();
            m178751x6aea0eb5();
            if (this.f77593xb9a2e84b && (newConfig.screenHeightDp != this.f77601x9c808512 || newConfig.screenWidthDp != this.f77602x9c80bd61)) {
                m178752xf5657631();
            }
            android.view.View m178748x43ae89e9 = m178748x43ae89e9();
            if (m178748x43ae89e9 != null) {
                m178748x43ae89e9.addOnLayoutChangeListener(new ze.d(m178748x43ae89e9, this));
            }
        }
        this.f77598x2c91b15a = newConfig.orientation;
        this.f77601x9c808512 = newConfig.screenHeightDp;
        this.f77602x9c80bd61 = newConfig.screenWidthDp;
    }

    @Override // ze.p
    /* renamed from: onInitConfigUpdated */
    public void mo53411xc6ee77ca(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 initConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        this.f77592xf3d9c872 = initConfig;
        this.f77606x7fce62ab = initConfig.N.f158996z;
        if (mo51620x1ab1e3d4()) {
            android.app.Activity r07 = this.f553261rt.r0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
            android.content.res.Configuration configuration = r07.getResources().getConfiguration();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configuration, "getConfiguration(...)");
            mo53410x50e1c15d(configuration);
        }
        m178757x68124904(this, true, true, "onInitConfigUpdated", false, 8, null);
    }

    /* renamed from: setInitConfig */
    public final void m178766x103ece74(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1) {
        this.f77592xf3d9c872 = c3897xbc286aa1;
    }

    /* renamed from: setLastLandscapeVHeight */
    public final void m178767x9d30d03a(int i17) {
        this.f77596x7511e4b8 = i17;
    }

    /* renamed from: setLastLandscapeVWidth */
    public final void m178768x8a084053(int i17) {
        this.f77597xe393a415 = i17;
    }

    /* renamed from: setLastPortraitVHeight */
    public final void m178769x1451f7ea(int i17) {
        this.f77599x6ddd5bac = i17;
    }

    /* renamed from: setLastPortraitVWidth */
    public final void m178770x3b4b62a3(int i17) {
        this.f77600x90c37ea1 = i17;
    }

    /* renamed from: setResizable */
    public final void m178771xdb8f9469(boolean z17) {
        this.f77606x7fce62ab = z17;
    }

    @Override // xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        m178753x123d5969(name);
    }

    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if ((r14.f77608xa3bff31c == -1.0d) != false) goto L9;
     */
    /* renamed from: getVDisplayMetrics */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.DisplayMetrics m178749xad90d981(boolean r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.g.m178749xad90d981(boolean):android.util.DisplayMetrics");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tuningRtContentView */
    public final void m178755xe0e57a67(boolean z17, boolean z18, java.lang.String str, boolean z19) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new ze.e(this, z17, z18, str, z19));
            return;
        }
        android.view.View m178748x43ae89e9 = m178748x43ae89e9();
        if (!mo51620x1ab1e3d4() || m178748x43ae89e9 == null) {
            return;
        }
        android.util.DisplayMetrics m178749xad90d981 = m178749xad90d981(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: orientation = [%s], vdmW = [%d], vdmH = [%d]", str, this.f553261rt.f156336n, this.f77610xe6b4ebc0, java.lang.Integer.valueOf(m178749xad90d981.widthPixels), java.lang.Integer.valueOf(m178749xad90d981.heightPixels));
        this.f553261rt.f156353y1 = true;
        if ((!m178748x43ae89e9.isLaidOut() && z17) || z18) {
            m178748x43ae89e9.post(new ze.f(this));
            return;
        }
        int measuredWidth = m178748x43ae89e9.getMeasuredWidth();
        int measuredHeight = m178748x43ae89e9.getMeasuredHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: width [%d], height[%d]", str, this.f553261rt.f156336n, java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight));
        float f17 = (measuredWidth * 1.0f) / m178749xad90d981.widthPixels;
        float f18 = (measuredHeight * 1.0f) / m178749xad90d981.heightPixels;
        float min = java.lang.Math.min(f17, f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: scaleMin = [%f], scaleMax = [%f]", str, this.f553261rt.f156336n, java.lang.Float.valueOf(min), java.lang.Float.valueOf(java.lang.Math.max(f17, f18)));
        this.f77607x683094a = min;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300(m178749xad90d981.widthPixels, m178749xad90d981.heightPixels);
        ((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).gravity = 17;
        float f19 = this.f77607x683094a;
        c12547xf52fd300.f169103a = f19;
        if (java.lang.Float.isNaN(f19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: scale is NaN", str, this.f553261rt.f156336n);
            this.f77607x683094a = 1.0f;
            c12547xf52fd300.f169103a = 1.0f;
            ((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).width = -1;
            ((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).height = -1;
        }
        if (this.f77590xb12358e0) {
            return;
        }
        xi1.g mo48803xee5260a9 = this.f553261rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a9, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        ((xi1.i) mo48803xee5260a9).a(c12547xf52fd300, this.f553261rt);
        xi1.g mo48803xee5260a92 = this.f553261rt.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a92, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        android.app.Activity r07 = this.f553261rt.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        ((xi1.i) mo48803xee5260a92).d(b3.l.m9702x7444d5ad(r07, mo52939x3119c89f()), this.f553261rt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f553261rt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        android.app.Activity r08 = c11510xdd90c2f2.r0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r08);
        qVar.setBackgroundColor(b3.l.m9702x7444d5ad(r08, mo52939x3119c89f()));
    }

    /* renamed from: tuningRtContentView$default */
    public static /* synthetic */ void m178757x68124904(ze.g gVar, boolean z17, boolean z18, java.lang.String str, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
        }
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        gVar.m178755xe0e57a67(z17, z18, str, z19);
    }

    public /* synthetic */ g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, xi1.p pVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c11510xdd90c2f2, pVar, (i17 & 4) != 0 ? false : z17);
    }
}
