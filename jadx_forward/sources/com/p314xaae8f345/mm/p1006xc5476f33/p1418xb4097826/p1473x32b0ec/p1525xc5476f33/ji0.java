package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ji0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f194640p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f194641q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f194642r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f194643s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f194644t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f194645u;

    /* renamed from: v, reason: collision with root package name */
    public r45.a73 f194646v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(android.view.ViewGroup root, qo0.c statusMonitor, android.app.Activity activity, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f194640p = "Finder.FinderLiveVisitorGameRankSwitchGuidePlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f565285by4);
        this.f194641q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bi0.f193573d);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) root.findViewById(com.p314xaae8f345.mm.R.id.cgs);
        this.f194642r = c22613xe7040d9c;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci0(this));
        }
        android.widget.Button button = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ei0(this, root));
        }
        android.widget.Button button2 = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        if (button2 != null) {
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fi0(this));
        }
        this.f194643s = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f194644t = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.i0v);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.mn9);
        this.f194645u = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gi0(this, activity));
        }
        java.lang.Object layoutParams = findViewById2 != null ? findViewById2.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(root.getContext()) + ((int) root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        }
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setLayoutParams(layoutParams2);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ji0 ji0Var, r45.z63 z63Var, boolean z17) {
        long m75942xfb822ef2 = ((mm2.e1) ji0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) ji0Var.P0(mm2.c1.class)).f410379n;
        long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : -1L;
        ek2.q1 q1Var = ek2.r1.f335057u;
        java.lang.String m75945x2fec8307 = z63Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        new ek2.r1(m75942xfb822ef2, m76784x5db1b11, 1, q1Var.b(m75945x2fec8307, z17)).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hi0(ji0Var, z17, z63Var));
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        r45.z63 g76 = ((mm2.c1) P0(mm2.c1.class)).g7();
        if (g76 != null) {
            v1(false, g76);
        }
        u1();
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
        if (i17 == 0 || (view = this.f194641q) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void u1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194640p, "back");
        android.view.View view = this.f194641q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGameRankSwitchGuidePlugin", "back", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f194642r;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
    }

    public final void v1(boolean z17, r45.z63 z63Var) {
        new ek2.v0(1, z17 ? 1 : 2, S0(), z63Var).l();
    }
}
