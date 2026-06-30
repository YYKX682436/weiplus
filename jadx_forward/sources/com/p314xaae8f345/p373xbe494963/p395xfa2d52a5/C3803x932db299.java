package com.p314xaae8f345.p373xbe494963.p395xfa2d52a5;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::dashboard")
/* renamed from: com.tencent.liteav.sdkcommon.DashboardManager */
/* loaded from: classes15.dex */
public class C3803x932db299 {

    /* renamed from: LOG_MAX_SIZE */
    private static final int f14850x49cf64d7 = 15000;
    private static final java.lang.String TAG = "DashboardManager";

    /* renamed from: mAppContext */
    private final android.content.Context f14851x5869d49b;

    /* renamed from: mDashboardManagerView */
    private final com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g f14853x66b9f4cb;

    /* renamed from: mIsInit */
    private boolean f14856x9106827;

    /* renamed from: mSelectedDashboardChangeListener */
    private final com.tencent.liteav.sdkcommon.g.a f14857x981b80f0;

    /* renamed from: mSelectedDashboardId */
    private java.lang.String f14858x33e4387;

    /* renamed from: mUIHandler */
    private final android.os.Handler f14859x69b7c049;

    /* renamed from: mDashboards */
    private final java.util.ArrayList<java.lang.String> f14855x4c0460ac = new java.util.ArrayList<>();

    /* renamed from: mDashboardStatus */
    private final java.util.Map<java.lang.String, java.lang.String> f14854x5d2e9779 = new java.util.HashMap();

    /* renamed from: mDashboardLogs */
    private final java.util.Map<java.lang.String, java.lang.StringBuilder> f14852x315dc2f6 = new java.util.HashMap();

    public C3803x932db299() {
        com.tencent.liteav.sdkcommon.g.a aVar = new com.tencent.liteav.sdkcommon.g.a() { // from class: com.tencent.liteav.sdkcommon.DashboardManager.1
            @Override // com.tencent.liteav.sdkcommon.g.a
            public final void a(int i17) {
                if (com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14855x4c0460ac.size() <= i17) {
                    return;
                }
                com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299 c3803x932db299 = com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this;
                c3803x932db299.f14858x33e4387 = (java.lang.String) c3803x932db299.f14855x4c0460ac.get(i17);
                if (com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14855x4c0460ac.contains(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14858x33e4387)) {
                    com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14853x66b9f4cb.b((java.lang.String) com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14854x5d2e9779.get(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14858x33e4387));
                    java.lang.StringBuilder sb6 = (java.lang.StringBuilder) com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14852x315dc2f6.get(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14858x33e4387);
                    if (sb6 != null) {
                        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14853x66b9f4cb.a(sb6.toString());
                    } else {
                        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.this.f14853x66b9f4cb.a("");
                    }
                }
            }
        };
        this.f14857x981b80f0 = aVar;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "java DashBoardManager Construct");
        this.f14856x9106827 = false;
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        this.f14851x5869d49b = m29240x6e669035;
        this.f14853x66b9f4cb = new com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g(m29240x6e669035, aVar);
        this.f14859x69b7c049 = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addDashboardInternal */
    public void m30217xd10c3ed0(java.lang.String str) {
        if (this.f14855x4c0460ac.contains(str)) {
            return;
        }
        this.f14855x4c0460ac.add(str);
        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = this.f14853x66b9f4cb;
        gVar.f128076e.add(str);
        if (gVar.f128083l == null) {
            gVar.f128083l = gVar.f128076e.getItem(0);
            gVar.f128086o.a(0);
        }
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: appendLogInternal */
    public void m30218x177e8ea7(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar;
        android.widget.TextView textView;
        if (this.f14855x4c0460ac.contains(str)) {
            java.lang.StringBuilder sb6 = this.f14852x315dc2f6.get(str);
            if (sb6 == null) {
                sb6 = new java.lang.StringBuilder();
                this.f14852x315dc2f6.put(str, sb6);
            }
            sb6.append(str2);
            sb6.append("\n");
            if (sb6.length() > f14850x49cf64d7) {
                sb6.delete(0, sb6.length() / 2);
            }
            if (!str.equals(this.f14858x33e4387) || (textView = (gVar = this.f14853x66b9f4cb).f128080i) == null) {
                return;
            }
            textView.append(str2 + "\n");
            android.widget.ScrollView scrollView = gVar.f128082k;
            if (scrollView != null) {
                if ((scrollView.getScrollY() + gVar.f128082k.getHeight()) + gVar.a(100) >= gVar.f128080i.getMeasuredHeight()) {
                    gVar.f128075d.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.i.a(gVar));
                }
            }
        }
    }

    /* renamed from: checkPermission */
    private boolean m30219x28e6dcf7() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() <= 23 || android.provider.Settings.canDrawOverlays(this.f14851x5869d49b)) {
            return true;
        }
        android.widget.Toast.makeText(this.f14851x5869d49b, "no system alert window permission, please authorize", 0).show();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* renamed from: init */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30220x316510() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.C3803x932db299.m30220x316510():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeAllDashboardInternal */
    public void m30227xdab12074() {
        this.f14855x4c0460ac.clear();
        this.f14854x5d2e9779.clear();
        this.f14852x315dc2f6.clear();
        com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = this.f14853x66b9f4cb;
        gVar.f128076e.clear();
        gVar.f128083l = null;
        android.widget.TextView textView = gVar.f128079h;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = gVar.f128080i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeDashboardInternal */
    public void m30228x306c214d(java.lang.String str) {
        if (this.f14855x4c0460ac.contains(str)) {
            this.f14855x4c0460ac.remove(str);
            this.f14854x5d2e9779.remove(str);
            this.f14852x315dc2f6.remove(str);
            com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.g gVar = this.f14853x66b9f4cb;
            if (str.equals(gVar.f128083l)) {
                int position = gVar.f128076e.getPosition(gVar.f128083l);
                if (position != gVar.f128076e.getCount() - 1) {
                    int i17 = position + 1;
                    gVar.f128083l = gVar.f128076e.getItem(i17);
                    gVar.f128086o.a(i17 - 1);
                    android.widget.Spinner spinner = gVar.f128081j;
                    if (spinner != null) {
                        spinner.setSelection(i17);
                    }
                } else if (position > 0) {
                    int i18 = position - 1;
                    gVar.f128083l = gVar.f128076e.getItem(i18);
                    gVar.f128086o.a(i18);
                    android.widget.Spinner spinner2 = gVar.f128081j;
                    if (spinner2 != null) {
                        spinner2.setSelection(i18);
                    }
                }
            }
            gVar.f128076e.remove(str);
            if (gVar.f128076e.getCount() == 0) {
                gVar.f128083l = null;
            }
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStatusInternal */
    public void m30229x8a81dd1(java.lang.String str, java.lang.String str2) {
        if (this.f14855x4c0460ac.contains(str)) {
            this.f14854x5d2e9779.put(str, str2);
            if (str.equals(this.f14858x33e4387)) {
                this.f14853x66b9f4cb.b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDashboardInternal */
    public void m30230x3c555ff4(boolean z17) {
        if (!z17 || (m30219x28e6dcf7() && m30220x316510())) {
            this.f14853x66b9f4cb.a(z17);
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "init or check permission is fail");
        }
    }

    /* renamed from: addDashboard */
    public int m30231xb952b6f3(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "addDashboard dashboardId = ".concat(java.lang.String.valueOf(str)));
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.b.a(this, str));
        return 0;
    }

    /* renamed from: appendLog */
    public int m30232x77c1cdca(java.lang.String str, java.lang.String str2) {
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.f.a(this, str, str2));
        return 0;
    }

    /* renamed from: removeAllDashboard */
    public int m30233x9fb57c97() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "removeAllDashboard ");
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.d.a(this));
        return 0;
    }

    /* renamed from: removeDashboard */
    public int m30234x3f676670(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "removeDashboard dashboardId = ".concat(java.lang.String.valueOf(str)));
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.c.a(this, str));
        return 0;
    }

    /* renamed from: setStatus */
    public int m30235x231a26f4(java.lang.String str, java.lang.String str2) {
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.e.a(this, str, str2));
        return 0;
    }

    /* renamed from: showDashboard */
    public int m30236x9b513c17(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "showDashBoard isShow = ".concat(java.lang.String.valueOf(z17)));
        this.f14859x69b7c049.post(com.p314xaae8f345.p373xbe494963.p395xfa2d52a5.a.a(this, z17));
        return 0;
    }
}
