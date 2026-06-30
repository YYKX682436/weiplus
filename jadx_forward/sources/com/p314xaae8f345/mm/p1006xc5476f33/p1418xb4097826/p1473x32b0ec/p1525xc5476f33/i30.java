package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public final java.lang.String A;
    public int B;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f194435p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f194436q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f194437r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f194438s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f194439t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f194440u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f194441v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f194442w;

    /* renamed from: x, reason: collision with root package name */
    public ce2.i f194443x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f194444y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f194445z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194435p = rootView;
        this.f194436q = "FinderLiveOneClickGiftPlugin";
        this.f194437r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h30(this));
        this.f194438s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g30(this));
        this.f194439t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a30(this));
        this.f194441v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z20(this));
        this.f194442w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y20(this));
        this.f194444y = "live_gift_bubble_gift_id";
        this.f194445z = "live_gift_bubble_text";
        this.A = "live_gift_bubble_flip_type";
        this.B = 8;
        rootView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u20(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(v1(), "live_gift_bubble");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(v1(), 32, 25561);
        v1().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w20(this, statusMonitor));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        android.view.ViewGroup J1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x20.f196554a[status.ordinal()] == 1 && w0() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            jz5.f0 f0Var = null;
            if (ag0Var != null && (J1 = ag0Var.J1()) != null) {
                if (!J1.isShown()) {
                    J1 = null;
                }
                if (J1 != null) {
                    t1(J1);
                    f0Var = jz5.f0.f384359a;
                }
            }
            if (f0Var == null) {
                u1();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(android.view.View view) {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!x0() || com.p314xaae8f345.mm.ui.bk.d0()) ? i17 : i18;
        int i27 = (!x0() || com.p314xaae8f345.mm.ui.bk.d0()) ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i28 = t17[1];
        android.view.ViewGroup viewGroup = this.f194435p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float f17 = (i19 - i28) - dimension;
        float dimension3 = (i27 - width) - viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
        jz5.g gVar = this.f194442w;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setLayoutParams(layoutParams2);
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194436q, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i28 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
        }
    }

    public final void u1() {
        K0(8);
        this.B = 8;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f194440u;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
        this.f194440u = null;
    }

    public final android.view.View v1() {
        return (android.view.View) this.f194441v.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442;
        super.z0();
        ((je2.w) P0(je2.w.class)).f380814h.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b30(this));
        ((mm2.c1) P0(mm2.c1.class)).f410419t3.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d30(this));
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (c14227x4262fb442 = a9Var.A) != null) {
            c14227x4262fb442.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e30(this));
        }
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (c14227x4262fb44 = k0Var.f380920v) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f30(this));
    }
}
