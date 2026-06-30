package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.qj2 f105240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f105241e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f105242f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f105243g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f105244h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f105245i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f105246m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f105247n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f105248o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f105249p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f105250q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f105251r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f105252s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f105253t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f105254u;

    /* renamed from: v, reason: collision with root package name */
    public long f105255v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(r45.qj2 qj2Var, r45.nj2 nj2Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        if (qj2Var == null) {
            return;
        }
        this.f105240d = qj2Var;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(qj2Var.getString(6), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView imageView = this.f105242f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverIv");
            throw null;
        }
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329963q));
        android.widget.TextView textView = this.f105249p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("barTitle");
            throw null;
        }
        boolean z17 = true;
        textView.setText(qj2Var.getString(1));
        android.widget.TextView textView2 = this.f105243g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView2.setText(qj2Var.getString(1));
        android.widget.TextView textView3 = this.f105244h;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView4 = this.f105244h;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        android.content.Context context = textView4.getContext();
        java.lang.String nickname = (nj2Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) nj2Var.getCustom(0)) == null) ? null : finderContact2.getNickname();
        ((ke0.e) xVar).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.widget.ImageView imageView2 = this.f105245i;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("authIcon");
            throw null;
        }
        zy2.tb.a(m1Var, imageView2, (nj2Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) nj2Var.getCustom(0)) == null) ? null : finderContact.getAuthInfo(), 0, 4, null);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f105247n;
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.setText(qj2Var.getString(2));
        }
        java.lang.String string = qj2Var.getString(2);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView2 = this.f105247n;
            if (finderCollapsibleTextView2 != null) {
                finderCollapsibleTextView2.setVisibility(8);
            }
            android.widget.TextView textView5 = this.f105246m;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        android.widget.TextView textView6 = this.f105244h;
        if (textView6 != null) {
            textView6.setOnClickListener(new com.tencent.mm.plugin.finder.drama.drawer.i(nj2Var, this));
        } else {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f105241e = getContext().getIntent().getBooleanExtra("native_drama_drawer_mode", false);
        com.tencent.mm.protobuf.f parseFrom = new r45.qj2().parseFrom(getIntent().getByteArrayExtra("native_drama_info"));
        this.f105240d = parseFrom instanceof r45.qj2 ? (r45.qj2) parseFrom : null;
        this.f105255v = getContext().getIntent().getLongExtra("native_drama_object_id", 0L);
        if (this.f105241e) {
            ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484892ts1)).inflate();
            android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.ujv);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f105253t = findViewById;
        } else {
            ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484893ts2)).inflate();
            this.f105251r = (android.widget.FrameLayout) getRootView().findViewById(com.tencent.mm.R.id.ujy);
            this.f105246m = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.ujt);
            android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.f486088uk3);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f105253t = findViewById2;
        }
        this.f105247n = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) getRootView().findViewById(com.tencent.mm.R.id.uju);
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.f482547hd);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f105249p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.ukb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f105248o = findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.f483236a25);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f105250q = (com.google.android.material.appbar.AppBarLayout) findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.uka);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f105252s = findViewById6;
        android.view.View findViewById7 = getRootView().findViewById(com.tencent.mm.R.id.ujp);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f105254u = findViewById7;
        findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.drama.drawer.e(this));
        android.view.View findViewById8 = getRootView().findViewById(com.tencent.mm.R.id.ujr);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f105242f = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = getRootView().findViewById(com.tencent.mm.R.id.uk_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f105243g = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = getRootView().findViewById(com.tencent.mm.R.id.f486086uk1);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f105244h = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = getRootView().findViewById(com.tencent.mm.R.id.ujz);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f105245i = (android.widget.ImageView) findViewById11;
        android.widget.TextView textView = this.f105243g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f105247n;
        if (finderCollapsibleTextView != null) {
            finderCollapsibleTextView.setLocalExpanText(com.tencent.mm.R.string.f8u);
            finderCollapsibleTextView.setExpanText(com.tencent.mm.R.string.f8u);
            finderCollapsibleTextView.setLimitLine(2);
            finderCollapsibleTextView.setTextSize(14.0f);
            finderCollapsibleTextView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f105246m;
        if (textView2 != null) {
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            hc2.i.e(mMActivity, this.f105241e);
        }
        if (this.f105241e) {
            android.view.View view = this.f105252s;
            if (view == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout = this.f105251r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity2 = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
            if (mMActivity2 != null) {
                android.view.View view2 = this.f105252s;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("titleContainer");
                    throw null;
                }
                hc2.i.a(mMActivity2, view2, this.f105251r);
            }
            android.view.View view3 = this.f105252s;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout2 = this.f105251r;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            com.google.android.material.appbar.AppBarLayout appBarLayout = this.f105250q;
            if (appBarLayout == null) {
                kotlin.jvm.internal.o.o("appBarLayout");
                throw null;
            }
            com.tencent.mm.plugin.finder.drama.drawer.d dVar = new com.tencent.mm.plugin.finder.drama.drawer.d(this);
            com.google.android.material.appbar.AppBarLayout appBarLayout2 = this.f105250q;
            if (appBarLayout2 == null) {
                kotlin.jvm.internal.o.o("appBarLayout");
                throw null;
            }
            dVar.a(appBarLayout2, 0);
            appBarLayout.a(dVar);
        }
        O6(this.f105240d, null);
        android.view.View view4 = this.f105253t;
        if (view4 != null) {
            view4.setOnClickListener(new com.tencent.mm.plugin.finder.drama.drawer.h(this));
        } else {
            kotlin.jvm.internal.o.o("moreBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
