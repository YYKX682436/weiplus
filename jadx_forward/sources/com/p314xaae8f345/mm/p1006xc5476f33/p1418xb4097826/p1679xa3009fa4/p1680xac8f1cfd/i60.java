package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class i60 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f216235d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f216237f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f216237f = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.K3).mo141623x754a37bb()).r()).intValue();
    }

    public final void O6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (m158354x19263085().isFinishing() || m158354x19263085().isDestroyed()) {
            return;
        }
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) zVar.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class);
            if (t80Var != null) {
                m82555x4905e9fa = t80Var.S6();
            }
            m82555x4905e9fa = null;
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.m6e);
            if (c22801x87cbdc00 != null) {
                m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa();
            }
            m82555x4905e9fa = null;
        }
        if (m82555x4905e9fa == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int t17 = c1162x665295de != null ? c1162x665295de.t() : -1;
        if (t17 != -1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m82555x4905e9fa.p0(t17);
            in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
            if (s0Var != null && s0Var.m8185xcdaf1228() == 4) {
                h0Var.f391656d = s0Var.p(com.p314xaae8f345.mm.R.id.jdk);
            }
        }
        if (h0Var.f391656d == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_SPEED_GUIDE_INT;
        int r17 = c17.r(u3Var, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_SPEED_SHOW_TIME_LONG;
        long t18 = c18.t(u3Var2, 0L);
        boolean z17 = t18 == 0 || t18 + ((long) this.f216237f) < java.lang.System.currentTimeMillis() / ((long) 1000);
        if (r17 >= 3 || !z17) {
            return;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9l, (android.view.ViewGroup) null, false);
        this.f216235d = inflate;
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g39)) != null) {
            textView.setTextSize(1, 20.0f);
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.view.View view = this.f216235d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC", "checkShow", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC", "checkShow", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.animate().setDuration(300L).alpha(1.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f60(this, view, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), h0Var)).start();
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) h0Var.f391656d;
        android.view.View view2 = this.f216235d;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        viewGroup.addView(view2, layoutParams);
        android.view.View view3 = this.f216235d;
        if (view3 != null) {
            view3.setClickable(false);
        }
        android.view.View view4 = this.f216235d;
        if (view4 != null) {
            view4.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h60(this, h0Var));
        }
        this.f216238g = true;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (m158359x1e885992().getIntExtra("report_scene", 0) == 22) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpeedGuideUIC", "FinderScanPreviewLogic hide speedGuide");
        }
    }
}
