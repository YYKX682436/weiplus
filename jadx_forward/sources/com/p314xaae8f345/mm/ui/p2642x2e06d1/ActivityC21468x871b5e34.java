package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.BaseLuggageActivity */
/* loaded from: classes7.dex */
public class ActivityC21468x871b5e34 extends com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 implements nf.m {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Object f278766z = new byte[0];
    public volatile android.view.LayoutInflater A = null;

    public final boolean T6(java.lang.String str) {
        java.lang.String m17 = wo.w0.m();
        java.lang.String str2 = android.os.Build.DEVICE;
        if (str == null ? false : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m17.toLowerCase(), str.toLowerCase())) {
            return true;
        }
        return (str2 == null || str == null) ? false : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2.toLowerCase(), str.toLowerCase());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120
    /* renamed from: getLayoutId */
    public int mo32073x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569556eo;
    }

    @Override // android.app.Activity
    public android.view.LayoutInflater getLayoutInflater() {
        if (this.A == null) {
            synchronized (this.f278766z) {
                if (this.A == null) {
                    this.A = db5.h0.f309891d.l0(this);
                }
            }
        }
        return this.A;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.A == null) {
            synchronized (this.f278766z) {
                if (this.A == null) {
                    this.A = db5.h0.f309891d.l0(this);
                }
            }
        }
        return this.A;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        nf.g.a(this).h(i17, strArr, iArr);
    }

    /* renamed from: setNavigationbarColor */
    public void m78869x8b18f126(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            if (T6("y83a") || T6("y83") || T6("v1732a") || T6("v1732t")) {
                return;
            }
            getWindow().setNavigationBarColor(i17);
            boolean g17 = com.p314xaae8f345.mm.ui.uk.g(i17);
            android.view.View decorView = getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g17 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseLuggageActivity", th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }
}
