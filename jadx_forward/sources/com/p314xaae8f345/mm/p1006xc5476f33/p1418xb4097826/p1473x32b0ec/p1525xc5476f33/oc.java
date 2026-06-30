package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes14.dex */
public final class oc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195272p;

    /* renamed from: q, reason: collision with root package name */
    public te2.b2 f195273q;

    /* renamed from: r, reason: collision with root package name */
    public te2.d2 f195274r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195272p = statusMonitor;
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        qo0.c.a(this.f195272p, qo0.b.f446889g4, null, 2, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (status.ordinal() != 188) {
            return;
        }
        K0(0);
        te2.d2 d2Var = this.f195274r;
        if (d2Var != null) {
            d2Var.w();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCastScreenPanelWidget", "onPanelOpen");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        te2.b2 b2Var = this.f195273q;
        if (b2Var != null) {
            ((te2.l2) b2Var).mo979x3f5eee52();
        }
        te2.d2 d2Var = this.f195274r;
        if (d2Var != null) {
            d2Var.y();
        }
        this.f195274r = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        super.z0();
        if (this.f195273q == null || this.f195274r == null) {
            gk2.e S0 = S0();
            qo0.c cVar = this.f195272p;
            this.f195273q = new te2.l2(S0, cVar);
            android.view.ViewGroup viewGroup = this.f446856d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            te2.d2 d2Var = new te2.d2(context, cVar, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, this.f195273q);
            this.f195274r = d2Var;
            android.view.View view = d2Var.f499478o;
            if (view != null) {
                qo0.c cVar2 = d2Var.f499474h;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d2Var.f499475i;
                te2.b2 b2Var = d2Var.f499476m;
                d2Var.f499477n = new te2.a3(view, cVar2, abstractActivityC21394xb3d2c0cf, b2Var);
                te2.a3 y17 = d2Var.y();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(y17.f499389d.getContext());
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = y17.f499402t;
                c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
                c1163xf1deaba4.mo7960x6cab2c8d(y17.f499406x);
                y17.f499405w.setOnClickListener(new te2.q2(y17));
                if (b2Var != null) {
                    ((te2.l2) b2Var).mo56536x3b13c504(d2Var.y());
                }
                wd2.g gVar = d2Var.f199917g;
                com.p314xaae8f345.mm.ui.fk.a(gVar.f526377k);
                com.p314xaae8f345.mm.ui.fk.a(gVar.f526376j);
            }
            if (!x0()) {
                te2.d2 d2Var2 = this.f195274r;
                if (d2Var2 != null) {
                    te2.a3 y18 = d2Var2.y();
                    int b17 = i65.a.b(y18.f499389d.getContext(), com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8);
                    android.view.ViewGroup.LayoutParams layoutParams2 = y18.f499399q.getLayoutParams();
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.topMargin = (int) (b17 * 0.3d);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams4 = y18.f499398p.getLayoutParams();
                    layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                    if (layoutParams == null) {
                        return;
                    }
                    layoutParams.topMargin = (int) (b17 * 0.3d);
                    return;
                }
                return;
            }
            te2.d2 d2Var3 = this.f195274r;
            if (d2Var3 != null) {
                te2.a3 y19 = d2Var3.y();
                android.view.View view2 = y19.f499389d;
                int dimension = ((int) (com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).y - view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz))) - ((int) view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn));
                android.view.ViewGroup.LayoutParams layoutParams5 = y19.f499399q.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.topMargin = (int) (dimension * 0.3d);
                }
                android.view.ViewGroup.LayoutParams layoutParams7 = y19.f499398p.getLayoutParams();
                layoutParams = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams == null) {
                    return;
                }
                layoutParams.topMargin = (int) (dimension * 0.3d);
            }
        }
    }
}
