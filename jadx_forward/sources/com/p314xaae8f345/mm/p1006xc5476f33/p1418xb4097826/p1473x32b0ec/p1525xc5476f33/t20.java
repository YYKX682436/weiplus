package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class t20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195864p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f195865q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f195866r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f195867s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f195868t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195864p = rootView;
        this.f195865q = "FinderLiveOneClickGameTipsPlugin";
        this.f195866r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s20(this));
        this.f195867s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j20(this));
        this.f195868t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g20(this));
        rootView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f20(this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t20 t20Var, android.view.View view) {
        t20Var.getClass();
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = !t20Var.x0() ? i17 : i18;
        int i27 = !t20Var.x0() ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i28 = t17[1];
        android.view.ViewGroup viewGroup = t20Var.f195864p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float dimension3 = viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        float f17 = (i19 - i28) - dimension;
        if (!zl2.r4.f555483a.w1()) {
            f17 -= dimension3;
        }
        jz5.g gVar = t20Var.f195866r;
        float f18 = 2;
        float width2 = ((i27 - width) + (view.getWidth() / 2)) - ((((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getPaint().measureText(((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).getText().toString()) + viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7)) / f18);
        if (width2 >= dimension2) {
            dimension2 = width2;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width3 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) / f18));
        jz5.g gVar2 = t20Var.f195868t;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar2).mo141623x754a37bb()).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width3;
            layoutParams2.bottomMargin = (int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            ((android.view.View) ((jz5.n) gVar2).mo141623x754a37bb()).setLayoutParams(layoutParams2);
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t20Var.f195865q, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i28 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 123 || ordinal == 126) {
            u1();
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

    public final void u1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui uiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui.class);
        if ((uiVar == null || (dkVar = uiVar.f196101p) == null) ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dkVar.c(), java.lang.Boolean.TRUE)) {
            v1();
            return;
        }
        if (w0() != 0) {
            java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f410372l6;
            if (str == null || str.length() == 0) {
                return;
            }
            x1(((mm2.c1) P0(mm2.c1.class)).f410372l6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i20(this));
            return;
        }
        android.view.View w17 = w1();
        if (w17 != null) {
            if (!w17.isShown()) {
                w17 = null;
            }
            if (w17 != null) {
                w17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h20(this, w17));
                return;
            }
        }
        v1();
    }

    public final void v1() {
        K0(8);
    }

    public final android.view.View w1() {
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            if (ag0Var != null) {
                return ag0Var.G1();
            }
            return null;
        }
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
            if (c4Var != null) {
                return c4Var.D.f200431d;
            }
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        if (ag0Var2 != null) {
            return ag0Var2.G1();
        }
        return null;
    }

    public final void x1(java.lang.String str, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) P0(mm2.c1.class)).J2.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195865q, "[refreshBubble] bubble confilct");
            return;
        }
        android.view.View w17 = w1();
        if (w17 != null) {
            if (!w17.isShown()) {
                w17 = null;
            }
            if (w17 != null) {
                w17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p20(this, str, w17, callback));
                return;
            }
        }
        v1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.z0();
        ((mm2.c1) P0(mm2.c1.class)).f410338f6.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m20(this));
        ((mm2.c1) P0(mm2.c1.class)).K2.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n20(this));
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (c14227x4262fb44 = k0Var.f380920v) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o20(this));
    }
}
