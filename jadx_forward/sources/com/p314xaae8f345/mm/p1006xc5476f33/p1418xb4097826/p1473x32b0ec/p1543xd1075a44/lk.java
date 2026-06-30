package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lk {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f200473j = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f200474a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f200475b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e6 f200476c;

    /* renamed from: d, reason: collision with root package name */
    public int f200477d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f200478e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f200479f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f200480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200481h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f200482i;

    public lk(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.ViewGroup licenseContainer, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e6 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(licenseContainer, "licenseContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f200474a = activity;
        this.f200475b = z17;
        this.f200476c = callback;
        ae2.in inVar = ae2.in.f85221a;
        this.f200477d = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_KNOW_GAME_LICENSE_UPDATE_INT_SYNC, 0);
        this.f200482i = "";
        this.f200478e = licenseContainer;
        licenseContainer.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jk(this));
        android.view.View findViewById = licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.l0i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f200479f = (android.widget.CheckBox) findViewById;
        b().setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kk(this));
        android.view.View findViewById2 = licenseContainer.findViewById(com.p314xaae8f345.mm.R.id.l0k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f200480g = textView;
        android.text.SpannableString h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.h(activity, com.p314xaae8f345.mm.R.C30867xcad56011.dgc, this.f200481h);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(h17);
    }

    public final void a() {
        if (this.f200475b) {
            this.f200477d = 0;
        }
        int i17 = this.f200477d;
        android.view.View view = this.f200478e;
        if (i17 != 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b().setChecked(true);
        this.f200476c.mo57852x3dcbea6f();
    }

    public final android.widget.CheckBox b() {
        android.widget.CheckBox checkBox = this.f200479f;
        if (checkBox != null) {
            return checkBox;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
        throw null;
    }
}
