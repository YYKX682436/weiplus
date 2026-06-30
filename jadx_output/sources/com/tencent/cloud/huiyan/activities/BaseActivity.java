package com.tencent.cloud.huiyan.activities;

/* loaded from: classes14.dex */
public class BaseActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f45904d = false;

    public void K6() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r0 != null) goto L42;
     */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L5
            goto La3
        L5:
            int r1 = ic.d.f290281k
            ic.d r1 = ic.c.f290280a
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig r2 = r1.f290290i
            if (r2 == 0) goto L12
            com.tencent.cloud.huiyan.enums.LanguageStyle r2 = r2.getLanguageStyle()
            goto L14
        L12:
            com.tencent.cloud.huiyan.enums.LanguageStyle r2 = com.tencent.cloud.huiyan.enums.LanguageStyle.AUTO
        L14:
            com.tencent.cloud.huiyan.enums.LanguageStyle r3 = com.tencent.cloud.huiyan.enums.LanguageStyle.AUTO
            r4 = 0
            if (r2 != r3) goto L42
            android.content.Context r0 = r1.a()
            if (r0 != 0) goto L29
            mc.q r0 = mc.p.f325531a
            java.lang.String r1 = "LanguageManager"
            java.lang.String r2 = "huiyan base api, context is null!"
            r0.b(r1, r2)
            goto L40
        L29:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            java.util.Locale r0 = r0.get(r4)
            if (r0 == 0) goto L40
            android.content.Context r0 = mc.i.a(r8, r0)
            goto La3
        L40:
            r0 = r8
            goto La3
        L42:
            com.tencent.cloud.huiyan.enums.LanguageStyle r3 = com.tencent.cloud.huiyan.enums.LanguageStyle.CUSTOMIZE_LANGUAGE
            java.lang.String r5 = "zh"
            if (r2 != r3) goto L89
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig r1 = r1.f290290i
            if (r1 == 0) goto L50
            java.lang.String r5 = r1.getLanguageCode()
        L50:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L40
            java.lang.String r1 = "_"
            java.lang.String[] r1 = r5.split(r1)
            int r2 = r1.length
            r3 = 1
            r6 = 2
            if (r2 != r6) goto L6f
            java.util.Locale r0 = new java.util.Locale
            r2 = r1[r4]
            r1 = r1[r3]
            r0.<init>(r2, r1)
            android.content.Context r0 = mc.i.a(r8, r0)
            goto L86
        L6f:
            java.lang.String r1 = "-"
            java.lang.String[] r1 = r5.split(r1)
            int r2 = r1.length
            if (r2 == r6) goto L79
            goto L86
        L79:
            java.util.Locale r0 = new java.util.Locale
            r2 = r1[r4]
            r1 = r1[r3]
            r0.<init>(r2, r1)
            android.content.Context r0 = mc.i.a(r8, r0)
        L86:
            if (r0 == 0) goto L40
            goto La3
        L89:
            com.tencent.cloud.huiyan.enums.LanguageStyle r0 = com.tencent.cloud.huiyan.enums.LanguageStyle.ENGLISH
            if (r2 != r0) goto L92
            java.lang.String r5 = "en"
            java.lang.String r0 = "US"
            goto L94
        L92:
            java.lang.String r0 = "CN"
        L94:
            com.tencent.cloud.huiyan.enums.LanguageStyle r1 = com.tencent.cloud.huiyan.enums.LanguageStyle.TRADITIONAL_CHINESE
            if (r2 != r1) goto L9a
            java.lang.String r0 = "HK"
        L9a:
            java.util.Locale r1 = new java.util.Locale
            r1.<init>(r5, r0)
            android.content.Context r0 = mc.i.a(r8, r1)
        La3:
            if (r0 == 0) goto Lb7
            int r8 = ic.d.f290281k
            ic.d r8 = ic.c.f290280a
            r8.getClass()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r8.f290283b = r1
            super.attachBaseContext(r0)
            goto Lba
        Lb7:
            super.attachBaseContext(r8)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cloud.huiyan.activities.BaseActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final void finish() {
        int i17 = ic.d.f290281k;
        ic.c.f290280a.f290284c = true;
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        mc.b bVar = mc.a.f325494a;
        if (bVar.f325495a == null) {
            finish();
            return;
        }
        lc.i a17 = bVar.a();
        if (a17 != null) {
            lc.g gVar = (lc.g) a17;
            mc.p.f325531a.b("AuthingFragment", "user cancel the auth check.");
            java.lang.String string = gVar.b().getString(com.tencent.mm.R.string.piu);
            int i17 = ic.d.f290281k;
            ic.c.f290280a.getClass();
            pc.l.f353211a.f353212a.name();
            mc.k.f325525a.a();
            pc.o oVar = gVar.f317819t;
            if (oVar != null) {
                oVar.a();
            }
            mc.d.f325515a.f325498b = null;
            pc.f.c(212, string);
        }
        android.app.FragmentManager fragmentManager = bVar.f325495a;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.getBackStackEntryCount() > 1) {
            bVar.f325495a.popBackStack();
            return;
        }
        int i18 = ic.d.f290281k;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
        if (huiYanSdkConfig != null ? huiYanSdkConfig.isHaveResultFragment() : false) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final android.view.ViewGroup viewGroup;
        android.view.View childAt;
        requestWindowFeature(1);
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        com.tencent.cloud.huiyan.entity.AuthUiConfig e17 = dVar.e();
        if (e17 != null && e17.getMainActivityThemeId() != -1) {
            setTheme(e17.getMainActivityThemeId());
        }
        if (e17 == null || !e17.isUseDeepColorStatusBarIcon()) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
        if (huiYanSdkConfig != null && huiYanSdkConfig.isDisableSystemRecordScreen()) {
            getWindow().setFlags(8192, 8192);
        }
        getWindow().setFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        super.onCreate(bundle);
        com.tencent.cloud.huiyan.entity.AuthUiConfig e18 = dVar.e();
        if (e18 != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            if (!e18.isTransparentStatusBar() && e18.getStatusBarColor() != -1) {
                mc.p.f325531a.e("BaseActivity", "set status bar color ： " + e18.getStatusBarColor());
                getWindow().setStatusBarColor(e18.getStatusBarColor());
            }
            if (e18.isTransparentStatusBar()) {
                getWindow().addFlags(134217728);
                getWindow().setStatusBarColor(0);
            }
        }
        K6();
        mc.b bVar = mc.a.f325494a;
        bVar.f325495a = getFragmentManager();
        lc.i iVar = null;
        if (!android.text.TextUtils.isEmpty("")) {
            try {
                mc.p.f325531a.b("AuthFragmentManager", "getRealFragment fragmentName = ");
                iVar = (lc.i) java.lang.Class.forName("").newInstance();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
                mc.p.f325531a.e("AuthFragmentManager", "");
            }
        }
        if (iVar != null) {
            bVar.b(iVar);
        } else {
            bVar.b(new lc.g());
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            android.view.View findViewById = getWindow().getDecorView().findViewById(android.R.id.content);
            if ((findViewById instanceof android.view.ViewGroup) && (childAt = (viewGroup = (android.view.ViewGroup) findViewById).getChildAt(0)) != null) {
                childAt.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: hc.a$$a
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                        com.tencent.cloud.huiyan.activities.BaseActivity baseActivity = com.tencent.cloud.huiyan.activities.BaseActivity.this;
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        if (!baseActivity.f45904d) {
                            int i18 = windowInsets.getInsets(android.view.WindowInsets.Type.statusBars()).top;
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + i18, view.getPaddingRight(), view.getPaddingBottom());
                            int i19 = ic.d.f290281k;
                            com.tencent.cloud.huiyan.entity.AuthUiConfig e19 = ic.c.f290280a.e();
                            if (e19 != null && !e19.isTransparentStatusBar() && e19.getStatusBarColor() != -1) {
                                android.view.View view2 = new android.view.View(baseActivity);
                                view2.setBackgroundColor(e19.getStatusBarColor());
                                viewGroup2.addView(view2, 0, new android.view.ViewGroup.LayoutParams(-1, i18));
                            }
                            baseActivity.f45904d = true;
                        }
                        return windowInsets;
                    }
                });
            }
            android.view.WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i17 = ic.d.f290281k;
        ic.c.f290280a.f290284c = true;
        mc.b bVar = mc.a.f325494a;
        if (bVar.f325496b != null) {
            bVar.f325496b = null;
        }
        if (bVar.f325495a != null) {
            bVar.f325495a = null;
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        nc.c cVar = nc.b.f336091a;
        if (i17 != 119) {
            return;
        }
        boolean z17 = false;
        for (int i18 : iArr) {
            if (i18 == -1) {
                z17 = true;
            }
        }
        if (!z17) {
            nc.a aVar = cVar.f336092a;
            if (aVar != null) {
                ((lc.a) aVar).a();
                if (cVar.f336092a != null) {
                    cVar.f336092a = null;
                    return;
                }
                return;
            }
            return;
        }
        lc.a aVar2 = (lc.a) cVar.f336092a;
        aVar2.getClass();
        mc.p.f325531a.e("AuthingFragment", "permission forbid!");
        if (cVar.f336092a != null) {
            cVar.f336092a = null;
        }
        pc.f.c(224, aVar2.f317791a.b().getString(com.tencent.mm.R.string.pj7));
        if (cVar.f336092a != null) {
            cVar.f336092a = null;
        }
    }
}
