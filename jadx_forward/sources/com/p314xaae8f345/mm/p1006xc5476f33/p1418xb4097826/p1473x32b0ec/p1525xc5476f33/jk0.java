package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jk0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f194660p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194661q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f194662r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f194663s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f194664t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(android.view.ViewGroup root, qo0.c statusMonitor, android.app.Activity activity, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f194660p = "FinderLiveVisitorRoleGuidePlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f565285by4);
        this.f194661q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ek0(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) root.findViewById(com.p314xaae8f345.mm.R.id.cgs);
        this.f194662r = c22613xe7040d9c;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fk0(this));
        }
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f564001fc);
        this.f194663s = findViewById2;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        if (findViewById2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
        }
        android.widget.Button button = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.bun);
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gk0(this, activity));
        }
        android.widget.Button button2 = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.gt7);
        if (button2 != null) {
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hk0(this));
        }
        i95.m c18 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c61.yb.t2((c61.yb) c18, 14, null, 2, null);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1009) {
            java.lang.String str = this.f194660p;
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "REQUEST_FINDER_LIVE_ROLE resultCode:" + i18 + ",data:" + intent);
                return;
            }
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IS_FROM_SETTING", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "REQUEST_FINDER_LIVE_ROLE fromUserGuide:" + booleanExtra);
            if (booleanExtra) {
                t1(!(W0() != null ? ((dk2.r4) r5).q(intent) : false));
            }
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        t1(true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        android.view.View view;
        super.K0(i17);
        if (i17 == 0 || (view = this.f194661q) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        yz5.a aVar;
        android.view.View view = this.f194661q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin", "back", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f194662r;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        if (!z17 || (aVar = this.f194664t) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}
