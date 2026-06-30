package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class i extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.qj2 f186681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f186682e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f186683f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f186684g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f186685h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f186686i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f186687m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f186688n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f186689o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f186690p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f186691q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f186692r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f186693s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f186694t;

    /* renamed from: u, reason: collision with root package name */
    public long f186695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(r45.qj2 qj2Var) {
        if (qj2Var == null) {
            return;
        }
        this.f186681d = qj2Var;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(qj2Var.m75945x2fec8307(6), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        android.widget.ImageView imageView = this.f186683f;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverIv");
            throw null;
        }
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411496q));
        android.widget.TextView textView = this.f186689o;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("barTitle");
            throw null;
        }
        boolean z17 = true;
        textView.setText(qj2Var.m75945x2fec8307(1));
        android.widget.TextView textView2 = this.f186684g;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView2.setText(qj2Var.m75945x2fec8307(1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f186686i;
        if (c15258xcd50c176 != null) {
            c15258xcd50c176.m61745x765074af(qj2Var.m75945x2fec8307(2));
        }
        android.widget.TextView textView3 = this.f186687m;
        if (textView3 != null) {
            textView3.setText(qj2Var.m75945x2fec8307(2));
        }
        java.lang.String m75945x2fec8307 = qj2Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = this.f186686i;
            if (c15258xcd50c1762 != null) {
                c15258xcd50c1762.setVisibility(8);
            }
            android.widget.TextView textView4 = this.f186685h;
            if (textView4 == null) {
                return;
            }
            textView4.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f186682e = m80379x76847179().getIntent().getBooleanExtra("native_drama_drawer_mode", false);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.qj2().mo11468x92b714fd(m158359x1e885992().getByteArrayExtra("native_drama_info"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaInfo");
        this.f186681d = (r45.qj2) mo11468x92b714fd;
        this.f186695u = m80379x76847179().getIntent().getLongExtra("native_drama_object_id", 0L);
        if (this.f186682e) {
            ((android.view.ViewStub) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566425ts1)).inflate();
            this.f186687m = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uju);
            android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.f186693s = findViewById;
        } else {
            ((android.view.ViewStub) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566426ts2)).inflate();
            this.f186691q = (android.widget.FrameLayout) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujy);
            this.f186685h = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujt);
            this.f186686i = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujs);
            android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f567621uk3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f186693s = findViewById2;
        }
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f564080hd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f186689o = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ukb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f186688n = findViewById4;
        android.view.View findViewById5 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f564769a25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f186690p = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById5;
        android.view.View findViewById6 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uka);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f186692r = findViewById6;
        android.view.View findViewById7 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f186694t = findViewById7;
        findViewById7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.e(this));
        android.view.View findViewById8 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ujr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f186683f = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uk_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f186684g = textView;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f186686i;
        if (c15258xcd50c176 != null) {
            c15258xcd50c176.m61742x56ba452e(com.p314xaae8f345.mm.R.C30867xcad56011.f8u);
            c15258xcd50c176.m61738x5cc3d915(com.p314xaae8f345.mm.R.C30867xcad56011.f8u);
            c15258xcd50c176.m61741xc3b64c0d(4);
            c15258xcd50c176.m61747x3abfd950(14.0f);
            c15258xcd50c176.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f186685h;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            hc2.i.e(abstractActivityC21394xb3d2c0cf, this.f186682e);
        }
        if (this.f186682e) {
            android.view.View view = this.f186692r;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout = this.f186691q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
            android.view.View view2 = this.f186692r;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            hc2.i.a(abstractActivityC21394xb3d2c0cf2, view2, this.f186691q);
            android.view.View view3 = this.f186692r;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout2 = this.f186691q;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.f186690p;
            if (c2678xa407981c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.d(this);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c2 = this.f186690p;
            if (c2678xa407981c2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
                throw null;
            }
            dVar.a(c2678xa407981c2, 0);
            c2678xa407981c.a(dVar);
        }
        O6(this.f186681d);
        android.view.View view4 = this.f186693s;
        if (view4 != null) {
            view4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.h(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
