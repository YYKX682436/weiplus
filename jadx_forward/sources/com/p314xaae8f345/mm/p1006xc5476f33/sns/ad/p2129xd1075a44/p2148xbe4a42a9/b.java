package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f245214d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f245215e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f245216f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f245217g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f245218h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f245219i;

    /* renamed from: m, reason: collision with root package name */
    public int f245220m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f245221n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f245222o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f245223p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f245224q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f245225r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad f245226s;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245214d = context;
        this.f245215e = "AdFinderNoticeSuccessHalfScreenWidget";
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f245216f;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f245216f) != null) {
            k0Var.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        java.lang.String str2 = this.f245215e;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.bys) {
            a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "click close btn");
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.kfg) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "click notice more btn, jump to finder profile UI, snsId is " + this.f245221n + ", mSource is " + this.f245220m);
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f245219i;
            int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(c17702x544f64e9 != null ? java.lang.Integer.valueOf(c17702x544f64e9.f244102a) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = this.f245219i;
            java.lang.String str3 = c17702x544f64e92 != null ? c17702x544f64e92.f38004xa53ddf1c : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f245218h;
            if (c17933xe8d1b226 != null && (m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(this.f245220m)) != null) {
                str = m70347x10413e67.f38104xce64ddf1;
            }
            l44.s4.h(this.f245214d, str3, str, this.f245221n, l44.s4.c(q17));
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = this.f245226s;
            if (c11137xb05b06ad == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                return;
            }
            ca4.z0.x0(c11137xb05b06ad);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/living/AdFinderNoticeSuccessHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
    }
}
