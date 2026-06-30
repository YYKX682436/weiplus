package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public abstract class a extends ab3.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f226261d;

    /* renamed from: e, reason: collision with root package name */
    public za3.d f226262e;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f f226266i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f226269o;

    /* renamed from: r, reason: collision with root package name */
    public int f226272r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 f226274t;

    /* renamed from: u, reason: collision with root package name */
    public long f226275u;

    /* renamed from: w, reason: collision with root package name */
    public i11.e f226277w;

    /* renamed from: f, reason: collision with root package name */
    public int f226263f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f226264g = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23(false);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f226265h = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f226267m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f226270p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f226271q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f226273s = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f226276v = "";

    /* renamed from: x, reason: collision with root package name */
    public final u60.e f226278x = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c(this);

    /* renamed from: n, reason: collision with root package name */
    public final u60.f f226268n = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();

    public a(android.app.Activity activity) {
        this.f226261d = activity;
    }

    @Override // ab3.e
    public void d() {
        this.f226261d.finish();
    }

    public abstract void j();

    public abstract void k();

    public void l() {
        android.app.Activity activity = this.f226261d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.ActivityC16288xe4825234.class);
        intent.putExtra("key_nullable", true);
        java.lang.String str = this.f226269o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_value", str);
        intent.putExtra("key_hint", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggs));
        intent.putExtra("Kwebmap_locaion", this.f226264g.f226122h);
        intent.putExtra("kFavInfoLocalId", n().getLongExtra("kFavInfoLocalId", -1L));
        intent.putExtra("kRemark", n().getStringExtra("kRemark"));
        android.app.Activity activity2 = this.f226261d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4096);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "editRemark", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public android.view.View m(int i17) {
        return this.f226261d.findViewById(i17);
    }

    public android.content.Intent n() {
        return this.f226261d.getIntent();
    }

    public abstract int o();

    public void p() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.app.Activity activity = this.f226261d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    public boolean q() {
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        return j62.e.g().c(c20298x46d4560a) == 1 || bm5.o1.f104252a.h(c20298x46d4560a) == 1;
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f fVar = this.f226266i;
        android.widget.TextView textView = fVar.f226340i;
        if (textView == null || fVar.f226341j == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f226266i.f226340i.getContext();
        java.lang.String str = this.f226269o;
        float textSize = this.f226266i.f226340i.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        java.util.ArrayList arrayList = this.f226271q;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f226266i.f226341j.setText("");
            return;
        }
        java.lang.String str2 = (java.lang.String) this.f226271q.get(0);
        java.lang.String string = this.f226261d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdl);
        for (int i17 = 1; i17 < this.f226271q.size(); i17++) {
            str2 = str2 + string + ((java.lang.String) this.f226271q.get(i17));
        }
        android.widget.TextView textView2 = this.f226266i.f226341j;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = this.f226266i.f226341j.getContext();
        float textSize2 = this.f226266i.f226341j.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str2, textSize2));
    }

    public void s(int i17) {
        this.f226266i.f226339h.setBackgroundColor(i17);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.uk.g(i17));
        if (valueOf.booleanValue()) {
            this.f226266i.f226333b.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f226266i.f226334c.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f226266i.f226338g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        } else {
            this.f226266i.f226333b.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f226266i.f226334c.getDrawable().setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.f226266i.f226338g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        }
        android.view.Window window = this.f226261d.getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        fp.m.e();
        this.f226261d.getWindow().setStatusBarColor(i17);
        android.view.View decorView = this.f226261d.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility((valueOf.booleanValue() ? systemUiVisibility & (-8193) : systemUiVisibility | 8192) | 1280);
    }
}
