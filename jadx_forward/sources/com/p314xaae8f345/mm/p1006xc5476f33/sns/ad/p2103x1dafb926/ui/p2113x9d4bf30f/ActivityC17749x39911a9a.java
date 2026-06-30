package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/ui/activity/DynamicCanvasPageUI;", "Lcom/tencent/liteapp/ui/WxaLiteAppUI;", "Lx54/b;", "Lm54/x;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI */
/* loaded from: classes4.dex */
public final class ActivityC17749x39911a9a extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 implements x54.b, m54.x {
    public final java.util.Map M1 = new java.util.LinkedHashMap();
    public final m54.l N1 = new m54.l();
    public long O1;
    public long P1;
    public long Q1;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 R1;
    public android.content.res.Resources S1;
    public boolean T1;

    @Override // x54.b
    public void K3(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        this.M1.remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // x54.b
    public void L2(int i17, x54.a observer) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.M1.put(java.lang.Integer.valueOf(i17), observer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|(16:144|145|(1:147)|148|(1:150)(1:241)|(3:152|153|154)(1:240)|155|(1:157)(1:237)|(1:159)|160|(1:162)(1:236)|(1:164)|165|(1:167)(1:235)|(1:169)|170)|(23:175|(3:177|(1:179)|180)|181|(19:186|(3:188|(1:190)|191)|192|193|194|195|(12:200|(3:202|(1:204)|205)|206|(8:211|(1:213)|215|216|(1:218)(1:227)|(3:220|(1:222)(1:224)|223)|225|226)|228|(0)|215|216|(0)(0)|(0)|225|226)|229|(0)|206|(9:208|211|(0)|215|216|(0)(0)|(0)|225|226)|228|(0)|215|216|(0)(0)|(0)|225|226)|233|(0)|192|193|194|195|(13:197|200|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|234|(0)|181|(20:183|186|(0)|192|193|194|195|(0)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|233|(0)|192|193|194|195|(0)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0538, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0494 A[Catch: all -> 0x053a, TryCatch #2 {all -> 0x053a, blocks: (B:154:0x0407, B:155:0x0420, B:159:0x042b, B:160:0x0432, B:164:0x043d, B:165:0x0444, B:169:0x0477, B:170:0x047e, B:172:0x0488, B:177:0x0494, B:180:0x04a6, B:181:0x04a9, B:183:0x04b3, B:188:0x04bf, B:191:0x04d1, B:192:0x04d4), top: B:153:0x0407 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04bf A[Catch: all -> 0x053a, TryCatch #2 {all -> 0x053a, blocks: (B:154:0x0407, B:155:0x0420, B:159:0x042b, B:160:0x0432, B:164:0x043d, B:165:0x0444, B:169:0x0477, B:170:0x047e, B:172:0x0488, B:177:0x0494, B:180:0x04a6, B:181:0x04a9, B:183:0x04b3, B:188:0x04bf, B:191:0x04d1, B:192:0x04d4), top: B:153:0x0407 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04fb A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0507 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0524 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0530 A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7() {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17749x39911a9a.g7():void");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            if (resources2 == null || getAssets() == null) {
                resources = super.getResources();
            } else {
                if (!this.T1 || this.S1 == null) {
                    this.S1 = resources2;
                    if ((resources2 instanceof j65.j) && getBaseContext().getResources() != null) {
                        android.content.res.Resources resources3 = this.S1;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(resources3, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                        android.content.res.Configuration b17 = ((j65.j) resources3).f379494e.b(getBaseContext().getResources().getConfiguration());
                        j65.m.c(b17, com.p314xaae8f345.mm.ui.bk.E(this.S1));
                        android.content.res.Resources resources4 = this.S1;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(resources4, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                        ((j65.j) resources4).getConfiguration().updateFrom(b17);
                        this.T1 = true;
                    }
                }
                resources = this.S1;
                if (resources == null) {
                    resources = super.getResources();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return resources;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicCanvas", "it can't replace resource!!");
            android.content.res.Resources resources5 = super.getResources();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return resources5;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("layout_inflater", name) || !(systemService instanceof android.view.LayoutInflater)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return systemService;
        }
        android.view.LayoutInflater c17 = com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return c17;
    }

    public final void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.X7(u4().l())) {
            java.lang.String o17 = u4().o();
            if (!(o17 == null || o17.length() == 0)) {
                gm0.j1.d().g(new ib4.n(u4().o(), u4().l()));
                gm0.j1.d().a(2883, new y54.x(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDarkMode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDarkMode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return C;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            x54.a aVar = (x54.a) ((java.util.LinkedHashMap) this.M1).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                aVar.mo142005x9d4787cb(i17, i18, intent);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                super.onActivityResult(i17, i18, intent);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicCanvas", "the onActivityResult error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doActivityBackgroundTransparentLogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(bundleExtra, "sns_landing_page_canvas_transparent", false)) {
                if (bundleExtra != null) {
                    bundleExtra.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
                }
                setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f576293vi);
                db5.f.c(this, null);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAd.DynamicCanvas", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doActivityBackgroundTransparentLogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onCreate(bundle);
        try {
            g7();
            h7();
            m54.j0.f405820a.a(4003001, (int) (this.O1 > 0 ? java.lang.System.currentTimeMillis() - this.O1 : 0L), u4());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("linkToLandingPageProxy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
                if (m69779x9cf0d20b != null) {
                    if (m69779x9cf0d20b.m69905x23b734ff()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PageParameter", "it is linking now");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PageParameter", "it is going to link");
                        m69779x9cf0d20b.m69788x38b478ea(m54.d0.f405795d);
                    }
                }
            } catch (java.lang.Throwable th7) {
                ca4.q.c("linkToLandingPageProxy", th7);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("linkToLandingPageProxy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            this.R1 = m54.f0.f405799a.a(this);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicCanvas", "the activity has something error!!!");
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            long currentTimeMillis = this.O1 > 0 ? java.lang.System.currentTimeMillis() - this.O1 : 0L;
            if (currentTimeMillis > 0) {
                long j17 = this.Q1;
                if (currentTimeMillis - j17 > 0) {
                    currentTimeMillis -= j17;
                }
            }
            m54.j0.f405820a.a(4003056, (int) currentTimeMillis, u4());
            super.onDestroy();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicCanvas", "the canvas ui is destroyed!!");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicCanvas", "there is an exception when destroy: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.R1;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onResume();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.R1;
        if (f5Var != null) {
            f5Var.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onStart();
        if (this.P1 > 0) {
            this.Q1 += java.lang.System.currentTimeMillis() - this.P1;
        }
        this.P1 = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onStop();
        this.P1 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onWindowFocusChanged(z17);
        if (z17 && (f5Var = this.R1) != null) {
            f5Var.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // m54.x
    public m54.l u4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return this.N1;
    }
}
