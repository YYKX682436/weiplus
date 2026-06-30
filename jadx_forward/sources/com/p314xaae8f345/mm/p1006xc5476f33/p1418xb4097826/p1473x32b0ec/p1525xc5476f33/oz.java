package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class oz extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 f195337p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f195338q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.bwo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f195337p = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594) findViewById;
        super.K0(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iz izVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iz(this, root);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(root, izVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jz.f194706a[status.ordinal()] == 1) {
            ((mm2.h7) P0(mm2.h7.class)).f410653o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kz(this));
            ((mm2.h7) P0(mm2.h7.class)).f410648g.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lz(this));
            ((mm2.h7) P0(mm2.h7.class)).f410654p.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mz(this));
            ((mm2.w) P0(mm2.w.class)).f411036o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nz(this));
            boolean O6 = ((mm2.w) P0(mm2.w.class)).O6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f594 = this.f195337p;
            if (O6) {
                c14288xbc18f594.setAlpha(0.0f);
            } else {
                c14288xbc18f594.setAlpha(1.0f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        super.K0(8);
        this.f195338q = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(int i17, int i18, int i19) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.content.res.Resources resources;
        int i27;
        int Z6;
        boolean x07 = x0();
        android.view.ViewGroup viewGroup = this.f446856d;
        if (!x07) {
            if (!((mm2.c1) P0(mm2.c1.class)).R7()) {
                android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                layoutParams = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    layoutParams.addRule(12);
                    layoutParams.topMargin = 0;
                    layoutParams.bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14) + com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
                }
            } else if (!x0()) {
                if (zl2.r4.f555483a.w1()) {
                    resources = viewGroup.getContext().getResources();
                    i27 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz;
                } else {
                    resources = viewGroup.getContext().getResources();
                    i27 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df;
                }
                float dimension = resources.getDimension(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi wiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi.class);
                if (wiVar != null && wiVar.w0() == 0) {
                    Z6 = wiVar.f446856d.getHeight();
                } else {
                    df2.vh vhVar = (df2.vh) U0(df2.vh.class);
                    Z6 = vhVar != null ? vhVar.Z6() : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamIndicatorPlugin", "requestLayout gameBannerHeight:" + Z6);
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                layoutParams = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(12);
                    layoutParams.topMargin = (int) (i18 + i19 + Z6 + ((dimension - this.f195337p.getF196961h()) / 2));
                    layoutParams.bottomMargin = 0;
                }
            }
        }
        viewGroup.requestLayout();
        this.f195338q = true;
        java.lang.Integer num = (java.lang.Integer) ((mm2.h7) P0(mm2.h7.class)).f410653o.mo3195x754a37bb();
        if (num == null) {
            num = 0;
        }
        if (num.intValue() > 1) {
            super.K0(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(this, this.f446856d, "MultiStreamIndicatorPlugin", false, 4, null);
        }
    }
}
