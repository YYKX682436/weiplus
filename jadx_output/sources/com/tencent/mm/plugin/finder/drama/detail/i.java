package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.qj2 f105148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f105149e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f105150f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f105151g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f105152h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f105153i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f105154m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f105155n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f105156o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f105157p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f105158q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f105159r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f105160s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f105161t;

    /* renamed from: u, reason: collision with root package name */
    public long f105162u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(r45.qj2 qj2Var) {
        if (qj2Var == null) {
            return;
        }
        this.f105148d = qj2Var;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(qj2Var.getString(6), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView imageView = this.f105150f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverIv");
            throw null;
        }
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329963q));
        android.widget.TextView textView = this.f105156o;
        if (textView == null) {
            kotlin.jvm.internal.o.o("barTitle");
            throw null;
        }
        boolean z17 = true;
        textView.setText(qj2Var.getString(1));
        android.widget.TextView textView2 = this.f105151g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView2.setText(qj2Var.getString(1));
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f105153i;
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.setText(qj2Var.getString(2));
        }
        android.widget.TextView textView3 = this.f105154m;
        if (textView3 != null) {
            textView3.setText(qj2Var.getString(2));
        }
        java.lang.String string = qj2Var.getString(2);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = this.f105153i;
            if (finderCollapsibleTextView2 != null) {
                finderCollapsibleTextView2.setVisibility(8);
            }
            android.widget.TextView textView4 = this.f105152h;
            if (textView4 == null) {
                return;
            }
            textView4.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f105149e = getContext().getIntent().getBooleanExtra("native_drama_drawer_mode", false);
        com.tencent.mm.protobuf.f parseFrom = new r45.qj2().parseFrom(getIntent().getByteArrayExtra("native_drama_info"));
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaInfo");
        this.f105148d = (r45.qj2) parseFrom;
        this.f105162u = getContext().getIntent().getLongExtra("native_drama_object_id", 0L);
        if (this.f105149e) {
            ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484892ts1)).inflate();
            this.f105154m = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.uju);
            android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.ujv);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f105160s = findViewById;
        } else {
            ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484893ts2)).inflate();
            this.f105158q = (android.widget.FrameLayout) getRootView().findViewById(com.tencent.mm.R.id.ujy);
            this.f105152h = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.ujt);
            this.f105153i = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) getRootView().findViewById(com.tencent.mm.R.id.ujs);
            android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.f486088uk3);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f105160s = findViewById2;
        }
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.f482547hd);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f105156o = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.ukb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f105155n = findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.f483236a25);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f105157p = (com.google.android.material.appbar.AppBarLayout) findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.uka);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f105159r = findViewById6;
        android.view.View findViewById7 = getRootView().findViewById(com.tencent.mm.R.id.ujp);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f105161t = findViewById7;
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.drama.detail.e(this));
        android.view.View findViewById8 = getRootView().findViewById(com.tencent.mm.R.id.ujr);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f105150f = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = getRootView().findViewById(com.tencent.mm.R.id.uk_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f105151g = textView;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f105153i;
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.setLocalExpanText(com.tencent.mm.R.string.f8u);
            finderCollapsibleTextView.setExpanText(com.tencent.mm.R.string.f8u);
            finderCollapsibleTextView.setLimitLine(4);
            finderCollapsibleTextView.setTextSize(14.0f);
            finderCollapsibleTextView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f105152h;
        if (textView2 != null) {
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            hc2.i.e(mMActivity, this.f105149e);
        }
        if (this.f105149e) {
            android.view.View view = this.f105159r;
            if (view == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout = this.f105158q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity2;
            android.view.View view2 = this.f105159r;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            hc2.i.a(mMActivity2, view2, this.f105158q);
            android.view.View view3 = this.f105159r;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout2 = this.f105158q;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            com.google.android.material.appbar.AppBarLayout appBarLayout = this.f105157p;
            if (appBarLayout == null) {
                kotlin.jvm.internal.o.o("appBarLayout");
                throw null;
            }
            com.tencent.mm.plugin.finder.drama.detail.d dVar = new com.tencent.mm.plugin.finder.drama.detail.d(this);
            com.google.android.material.appbar.AppBarLayout appBarLayout2 = this.f105157p;
            if (appBarLayout2 == null) {
                kotlin.jvm.internal.o.o("appBarLayout");
                throw null;
            }
            dVar.a(appBarLayout2, 0);
            appBarLayout.a(dVar);
        }
        O6(this.f105148d);
        android.view.View view4 = this.f105160s;
        if (view4 != null) {
            view4.setOnClickListener(new com.tencent.mm.plugin.finder.drama.detail.h(this));
        } else {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
