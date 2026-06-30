package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class w0 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 f201648d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var) {
        this.f201648d = x0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fn2.m0] */
    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        fn2.b0 b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var = this.f201648d;
        x0Var.getClass();
        fn2.s1 s1Var = (fn2.s1) x0Var;
        s1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongPanel", "Tab selected: " + i17);
        fn2.x1 x1Var = (fn2.x1) ((java.util.LinkedHashMap) s1Var.I).get(java.lang.Integer.valueOf(i17));
        if (x1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Tab selected: ");
            fn2.v1 tabType = x1Var.f345975g;
            sb6.append(tabType);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongTabView", sb6.toString());
            if (x1Var.f345978m) {
                return;
            }
            x1Var.f345978m = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongTabView", "Initializing tab content for tabType: " + tabType);
            android.content.Context context = x1Var.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i18 = x1Var.f345973e;
            p3325xe03a0797.p3326xc267989b.y0 y0Var = x1Var.f345976h;
            java.lang.String str = x1Var.f345977i;
            sf2.d3 controller = x1Var.f345972d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
            fn2.u1 sourceScene = x1Var.f345974f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
            int ordinal = tabType.ordinal();
            if (ordinal == 0) {
                b0Var = new fn2.b0(context, controller, i18, sourceScene, y0Var);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                b0Var = new fn2.m0(context, controller, y0Var, str, sourceScene);
            }
            x1Var.removeAllViews();
            x1Var.addView(b0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongTabView", "Tab view added for tabType: " + tabType);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = x1Var.f345976h;
            if (y0Var2 != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new fn2.w1(b0Var, null), 3, null);
            }
        }
    }
}
