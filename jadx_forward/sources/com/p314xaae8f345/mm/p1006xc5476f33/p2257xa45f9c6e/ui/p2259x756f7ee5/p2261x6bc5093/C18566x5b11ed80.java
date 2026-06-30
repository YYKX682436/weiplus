package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView */
/* loaded from: classes8.dex */
public class C18566x5b11ed80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8 {

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f254242t2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    public java.util.List f254243e2;

    /* renamed from: f2, reason: collision with root package name */
    public final java.util.List f254244f2;

    /* renamed from: g2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f254245g2;

    /* renamed from: h2, reason: collision with root package name */
    public rh4.b0 f254246h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f254247i2;

    /* renamed from: j2, reason: collision with root package name */
    public rh4.j0 f254248j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f254249k2;

    /* renamed from: l2, reason: collision with root package name */
    public android.widget.Toast f254250l2;

    /* renamed from: m2, reason: collision with root package name */
    public cl1.m0 f254251m2;

    /* renamed from: n2, reason: collision with root package name */
    public int f254252n2;

    /* renamed from: o2, reason: collision with root package name */
    public int f254253o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f254254p2;

    /* renamed from: q2, reason: collision with root package name */
    public int f254255q2;

    /* renamed from: r2, reason: collision with root package name */
    public final cl1.k0 f254256r2;

    /* renamed from: s2, reason: collision with root package name */
    public final cl1.l0 f254257s2;

    public C18566x5b11ed80(android.content.Context context) {
        super(context);
        this.f254243e2 = new java.util.ArrayList();
        this.f254244f2 = new java.util.ArrayList();
        this.f254245g2 = null;
        this.f254247i2 = false;
        this.f254249k2 = 0;
        this.f254252n2 = 1;
        this.f254253o2 = -1;
        this.f254254p2 = -1;
        this.f254255q2 = 0;
        this.f254256r2 = new rh4.e0(this);
        this.f254257s2 = new rh4.f0(this);
        j1(context);
    }

    private void j1(android.content.Context context) {
        mo7967x900dcbe1(new rh4.d0(this, context, 4, 1, false));
        rh4.i0 i0Var = new rh4.i0(this);
        this.f254245g2 = i0Var;
        mo7960x6cab2c8d(i0Var);
        k1();
        v1(context, i65.a.B(getContext()));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i1();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean g1(cl1.n0 n0Var) {
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = n0Var.f124421a;
        if (a17 == null || c11714x918fd2e4 == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStarImpl %s", c11714x918fd2e4.f157898h);
        int i17 = n0Var.f124422b;
        int i18 = c11714x918fd2e4.f157896f;
        java.lang.String str = c11714x918fd2e4.f157894d;
        int ce6 = i17 == 7 ? a17.ce(str, i18, false) : a17.ce(str, i18, true);
        if (ce6 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob add ok");
            u1(true);
        } else if (ce6 == -2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y17 = db5.e1.y(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571635ky, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).y7())), "", getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            if (y17 != null) {
                y17.o(true);
                y17.setCanceledOnTouchOutside(false);
                y17.show();
            }
        } else if (ce6 == -3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y18 = db5.e1.y(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571571j6), "", getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            if (y18 != null) {
                y18.o(true);
                y18.setCanceledOnTouchOutside(false);
                y18.show();
            }
        } else {
            dp.a.m125854x26a183b(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571615ke), 0).show();
        }
        return ce6 == 0;
    }

    /* renamed from: getDataList */
    public java.util.List<cl1.n0> m71639xe6796cde() {
        return this.f254243e2;
    }

    /* renamed from: getMaxCount */
    public int mo71638x92a0b781() {
        return (this.f254248j2.o() && ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).Bi() == 1) ? 4 : 8;
    }

    /* renamed from: getShowCount */
    public int m71640x8c6e4d5c() {
        return this.f254244f2.size();
    }

    /* renamed from: getShowDataSize */
    public int m71641x98cce35e() {
        return this.f254244f2.size();
    }

    /* renamed from: getShowLines */
    public int m71642x8cea4b4c() {
        return this.f254252n2;
    }

    /* renamed from: getShowList */
    public java.util.List<cl1.n0> m71643x67a476b1() {
        return this.f254244f2;
    }

    public void h1(int i17, cl1.n0 n0Var) {
        this.f254248j2.l(n0Var, i17);
    }

    public void i1() {
        if (this.f254251m2 == null) {
            android.view.View rootView = getRootView();
            if (rootView == null) {
                return;
            } else {
                this.f254251m2 = (cl1.m0) rootView.findViewById(com.p314xaae8f345.mm.R.id.d4h);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "configDragFeatureView");
        this.f254251m2.m15090x7f4ee506(this);
        this.f254251m2.mo15089x764ce020(this.f254244f2);
        this.f254251m2.mo15087xf427e221(this.f254256r2);
        this.f254251m2.mo15093xfd8913df(this.f254249k2);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_reorder, 1) == 1) {
            this.f254251m2.mo15088x8fc925aa(true);
        } else {
            this.f254251m2.mo15088x8fc925aa(false);
        }
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var == null || !j0Var.o()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7) this.f254251m2).e(false);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7) this.f254251m2).e(true);
        }
        this.f254251m2.mo15092x322ebdd9(false);
        this.f254251m2.mo15091xfb17b988(this.f254257s2);
        this.f172657c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7) this.f254251m2;
    }

    public void k1() {
        this.f254246h2 = new rh4.b0();
        m7964x8d4ad49c(this.f254246h2);
    }

    public final boolean l1() {
        return ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 1;
    }

    public void m1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "notifyDataChanged");
        mo7946xf939df19().m8146xced61ae5();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
        a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void n1(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            j0Var.p(k3Var, view, n0Var, i17);
        }
    }

    public void o1(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "onDragStateChange %d %b %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (l1()) {
            return;
        }
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var == null || !j0Var.o()) {
            rh4.j0 j0Var2 = this.f254248j2;
            if (j0Var2 != null) {
                j0Var2.q(z17);
            }
            if (!z17 && !z18 && this.f254247i2) {
                cl1.n0 n0Var = (cl1.n0) ((java.util.ArrayList) this.f254244f2).get(i17);
                boolean g17 = g1(n0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStar %d， add:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(g17));
                if (g17) {
                    this.f254248j2.e(i17, new cl1.n0(n0Var));
                }
            }
            this.f254247i2 = false;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(false);
        android.view.View rootView = getRootView();
        for (android.view.View view = (android.view.View) getParent(); view != rootView && (view instanceof android.view.ViewGroup); view = (android.view.View) view.getParent()) {
            ((android.view.ViewGroup) view).setClipChildren(false);
            if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f254249k2) {
            int measuredWidth = getMeasuredWidth();
            this.f254249k2 = measuredWidth;
            cl1.m0 m0Var = this.f254251m2;
            if (m0Var != null) {
                m0Var.mo15093xfd8913df(measuredWidth);
            }
            this.f254255q2 = 0;
            if (!E0() && mo7958x54496c8e() == 0) {
                v1(getContext(), this.f254249k2);
                return;
            }
            int i19 = this.f254255q2;
            if (i19 > 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "update item offset delay count reach max");
            } else {
                this.f254255q2 = i19 + 1;
                postDelayed(new rh4.RunnableC30031x5897494(this), 300L);
            }
        }
    }

    public void p1(float f17, float f18) {
        if (l1()) {
            return;
        }
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            this.f254247i2 = j0Var.a(f17, f18);
        }
        if (this.f254248j2.o()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f) this.f254251m2;
            this.f254247i2 = c12766x2cdb734f.c(f17, f18) && c12766x2cdb734f.d(f17);
        }
    }

    public void q1() {
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            j0Var.g();
        }
    }

    public void r1(cl1.a aVar) {
        this.f254248j2.c((cl1.n0) this.f254243e2.get(aVar.m8183xf806b362()), false);
    }

    public void s1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "remove item %d", java.lang.Integer.valueOf(i17));
        u1(false);
        java.util.List list = this.f254244f2;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.remove(i17);
        cl1.n0 n0Var = (cl1.n0) this.f254243e2.remove(i17);
        if (this.f254243e2.size() > arrayList.size()) {
            arrayList.add((cl1.n0) this.f254243e2.get(arrayList.size()));
        }
        this.f254245g2.m8155x27702c4(i17);
        if (this.f254243e2.size() >= mo71638x92a0b781()) {
            this.f254245g2.m8149x8b456734(mo71638x92a0b781() - 1);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f254245g2;
        f2Var.m8152xc67946d3(0, f2Var.mo1894x7e414b06(), java.lang.Boolean.TRUE);
        h1(i17, n0Var);
        this.f254252n2 = ((java.util.ArrayList) list).size() > 3 ? 2 : 1;
    }

    /* renamed from: setDataList */
    public void m71644xe131cdea(java.util.List<cl1.n0> list) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f254243e2.size());
        java.util.List list2 = this.f254244f2;
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setDateList now:%d showing:%d new:%d", valueOf, java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(list.size()));
        this.f254243e2 = new java.util.ArrayList(list);
        arrayList.clear();
        this.f254252n2 = ((java.util.ArrayList) list2).size() > 3 ? 2 : 1;
        int min = java.lang.Math.min(this.f254243e2.size(), mo71638x92a0b781());
        for (int i17 = 0; i17 < min; i17++) {
            arrayList.add((cl1.n0) this.f254243e2.get(i17));
        }
    }

    /* renamed from: setItemTitleColor */
    public void m71645xe7ece460(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setItemTitleColor, itemTitleColor: %d", java.lang.Integer.valueOf(i17));
        this.f254254p2 = i17;
    }

    /* renamed from: setLineGap */
    public void m71646xbbc97b80(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setLineGap, lineGap: %d", java.lang.Integer.valueOf(i17));
        this.f254253o2 = i17;
        v1(getContext(), this.f254249k2);
    }

    /* renamed from: setWeAppCallback */
    public void m71647xbdee5c96(rh4.j0 j0Var) {
        this.f254248j2 = j0Var;
        v1(getContext(), this.f254249k2);
    }

    public boolean t1() {
        return true;
    }

    public final void u1(boolean z17) {
        android.widget.Toast toast = this.f254250l2;
        if (toast != null) {
            toast.cancel();
        }
        this.f254250l2 = dp.a.m125854x26a183b(getContext(), "", 0);
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        this.f254250l2.setGravity(17, 0, 0);
        this.f254250l2.setView(inflate);
        ((android.widget.TextView) this.f254250l2.getView().findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571863rz : com.p314xaae8f345.mm.R.C30867xcad56011.f571640l3);
        this.f254250l2.show();
    }

    public final void v1(android.content.Context context, int i17) {
        int i18 = this.f254253o2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        int i19 = i18;
        ft.v3 v3Var = (ft.v3) i95.n0.c(ft.v3.class);
        float f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        ((et.g) v3Var).getClass();
        float a17 = el1.c.f335272a.a(this, f17, i17, i19, 0, 0);
        rh4.j0 j0Var = this.f254248j2;
        if (j0Var != null) {
            j0Var.j(a17);
        }
    }

    public C18566x5b11ed80(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254243e2 = new java.util.ArrayList();
        this.f254244f2 = new java.util.ArrayList();
        this.f254245g2 = null;
        this.f254247i2 = false;
        this.f254249k2 = 0;
        this.f254252n2 = 1;
        this.f254253o2 = -1;
        this.f254254p2 = -1;
        this.f254255q2 = 0;
        this.f254256r2 = new rh4.e0(this);
        this.f254257s2 = new rh4.f0(this);
        j1(context);
    }

    public C18566x5b11ed80(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f254243e2 = new java.util.ArrayList();
        this.f254244f2 = new java.util.ArrayList();
        this.f254245g2 = null;
        this.f254247i2 = false;
        this.f254249k2 = 0;
        this.f254252n2 = 1;
        this.f254253o2 = -1;
        this.f254254p2 = -1;
        this.f254255q2 = 0;
        this.f254256r2 = new rh4.e0(this);
        this.f254257s2 = new rh4.f0(this);
        j1(context);
    }
}
