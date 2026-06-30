package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed;

/* renamed from: com.tencent.cloud.huiyan.activities.BaseActivity */
/* loaded from: classes14.dex */
public class ActivityC2911x43985120 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f127437d = false;

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
            int r1 = ic.d.f371814k
            ic.d r1 = ic.c.f371813a
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig r2 = r1.f371823i
            if (r2 == 0) goto L12
            com.tencent.cloud.huiyan.enums.LanguageStyle r2 = r2.m21833xa423ad83()
            goto L14
        L12:
            com.tencent.cloud.huiyan.enums.LanguageStyle r2 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2929x16632119.AUTO
        L14:
            com.tencent.cloud.huiyan.enums.LanguageStyle r3 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2929x16632119.AUTO
            r4 = 0
            if (r2 != r3) goto L42
            android.content.Context r0 = r1.a()
            if (r0 != 0) goto L29
            mc.q r0 = mc.p.f407064a
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
            com.tencent.cloud.huiyan.enums.LanguageStyle r3 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2929x16632119.CUSTOMIZE_LANGUAGE
            java.lang.String r5 = "zh"
            if (r2 != r3) goto L89
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig r1 = r1.f371823i
            if (r1 == 0) goto L50
            java.lang.String r5 = r1.m21832xe43bdbdb()
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
            com.tencent.cloud.huiyan.enums.LanguageStyle r0 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2929x16632119.ENGLISH
            if (r2 != r0) goto L92
            java.lang.String r5 = "en"
            java.lang.String r0 = "US"
            goto L94
        L92:
            java.lang.String r0 = "CN"
        L94:
            com.tencent.cloud.huiyan.enums.LanguageStyle r1 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2929x16632119.TRADITIONAL_CHINESE
            if (r2 != r1) goto L9a
            java.lang.String r0 = "HK"
        L9a:
            java.util.Locale r1 = new java.util.Locale
            r1.<init>(r5, r0)
            android.content.Context r0 = mc.i.a(r8, r1)
        La3:
            if (r0 == 0) goto Lb7
            int r8 = ic.d.f371814k
            ic.d r8 = ic.c.f371813a
            r8.getClass()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r8.f371816b = r1
            super.attachBaseContext(r0)
            goto Lba
        Lb7:
            super.attachBaseContext(r8)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed.ActivityC2911x43985120.attachBaseContext(android.content.Context):void");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public final void finish() {
        int i17 = ic.d.f371814k;
        ic.c.f371813a.f371817c = true;
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        mc.b bVar = mc.a.f407027a;
        if (bVar.f407028a == null) {
            finish();
            return;
        }
        lc.i a17 = bVar.a();
        if (a17 != null) {
            lc.g gVar = (lc.g) a17;
            mc.p.f407064a.b("AuthingFragment", "user cancel the auth check.");
            java.lang.String string = gVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piu);
            int i17 = ic.d.f371814k;
            ic.c.f371813a.getClass();
            pc.l.f434744a.f434745a.name();
            mc.k.f407058a.a();
            pc.o oVar = gVar.f399352t;
            if (oVar != null) {
                oVar.a();
            }
            mc.d.f407048a.f407031b = null;
            pc.f.c(212, string);
        }
        android.app.FragmentManager fragmentManager = bVar.f407028a;
        if (fragmentManager == null) {
            return;
        }
        if (fragmentManager.getBackStackEntryCount() > 1) {
            bVar.f407028a.popBackStack();
            return;
        }
        int i18 = ic.d.f371814k;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
        if (c2920x9dce3f52 != null ? c2920x9dce3f52.m21846x7ea72bdf() : false) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final android.view.ViewGroup viewGroup;
        android.view.View childAt;
        requestWindowFeature(1);
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e17 = dVar.e();
        if (e17 != null && e17.m21785xfad25c86() != -1) {
            setTheme(e17.m21785xfad25c86());
        }
        if (e17 == null || !e17.m21798x905886a0()) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
        if (c2920x9dce3f52 != null && c2920x9dce3f52.m21845xd4e05aea()) {
            getWindow().setFlags(8192, 8192);
        }
        getWindow().setFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        super.onCreate(bundle);
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e18 = dVar.e();
        if (e18 != null) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            if (!e18.m21797xb1647dd9() && e18.m21787xb48e4618() != -1) {
                mc.p.f407064a.e("BaseActivity", "set status bar color ： " + e18.m21787xb48e4618());
                getWindow().setStatusBarColor(e18.m21787xb48e4618());
            }
            if (e18.m21797xb1647dd9()) {
                getWindow().addFlags(134217728);
                getWindow().setStatusBarColor(0);
            }
        }
        K6();
        mc.b bVar = mc.a.f407027a;
        bVar.f407028a = getFragmentManager();
        lc.i iVar = null;
        if (!android.text.TextUtils.isEmpty("")) {
            try {
                mc.p.f407064a.b("AuthFragmentManager", "getRealFragment fragmentName = ");
                iVar = (lc.i) java.lang.Class.forName("").newInstance();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
                mc.p.f407064a.e("AuthFragmentManager", "");
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
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed.ActivityC2911x43985120 activityC2911x43985120 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p331x7a1b3bed.ActivityC2911x43985120.this;
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        if (!activityC2911x43985120.f127437d) {
                            int i18 = windowInsets.getInsets(android.view.WindowInsets.Type.statusBars()).top;
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + i18, view.getPaddingRight(), view.getPaddingBottom());
                            int i19 = ic.d.f371814k;
                            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e19 = ic.c.f371813a.e();
                            if (e19 != null && !e19.m21797xb1647dd9() && e19.m21787xb48e4618() != -1) {
                                android.view.View view2 = new android.view.View(activityC2911x43985120);
                                view2.setBackgroundColor(e19.m21787xb48e4618());
                                viewGroup2.addView(view2, 0, new android.view.ViewGroup.LayoutParams(-1, i18));
                            }
                            activityC2911x43985120.f127437d = true;
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

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i17 = ic.d.f371814k;
        ic.c.f371813a.f371817c = true;
        mc.b bVar = mc.a.f407027a;
        if (bVar.f407029b != null) {
            bVar.f407029b = null;
        }
        if (bVar.f407028a != null) {
            bVar.f407028a = null;
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        nc.c cVar = nc.b.f417624a;
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
            nc.a aVar = cVar.f417625a;
            if (aVar != null) {
                ((lc.a) aVar).a();
                if (cVar.f417625a != null) {
                    cVar.f417625a = null;
                    return;
                }
                return;
            }
            return;
        }
        lc.a aVar2 = (lc.a) cVar.f417625a;
        aVar2.getClass();
        mc.p.f407064a.e("AuthingFragment", "permission forbid!");
        if (cVar.f417625a != null) {
            cVar.f417625a = null;
        }
        pc.f.c(224, aVar2.f399324a.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pj7));
        if (cVar.f417625a != null) {
            cVar.f417625a = null;
        }
    }
}
