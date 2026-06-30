package df2;

/* loaded from: classes3.dex */
public final class gr extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311773m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k74 f311774n;

    /* renamed from: o, reason: collision with root package name */
    public r45.y23 f311775o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f311776p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311777q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f311778r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311773m = "LiveProductSizeAssistPanelController";
        this.f311776p = "";
    }

    public final void Z6() {
        r45.k74 k74Var = this.f311774n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshLiteAppView appId:");
        sb6.append(k74Var != null ? k74Var.m75945x2fec8307(0) : null);
        sb6.append(", path=");
        sb6.append(k74Var != null ? k74Var.m75945x2fec8307(1) : null);
        sb6.append(", query=");
        sb6.append(k74Var != null ? k74Var.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311773m, sb6.toString());
        if (k74Var != null) {
            java.lang.String m75945x2fec8307 = k74Var.m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.fr(this, k74Var, null), 3, null);
                return;
            }
        }
        a7("LiteAppIsNull");
    }

    public final void a7(java.lang.String source) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2) S6(com.p314xaae8f345.mm.R.id.ra_);
        if (c14341x36fc1ea2 != null) {
            if2.d0 d0Var = this.f311778r;
            if (d0Var != null) {
                d0Var.d(8);
            }
            if (c14341x36fc1ea2.getTag() != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveProductSizeAssistPanelView", "release: source=" + source + ", liteAppView=" + c14341x36fc1ea2.f197618f);
                c14341x36fc1ea2.setTag(null);
                android.view.View view = c14341x36fc1ea2.f197618f;
                if (view != null) {
                    android.view.ViewParent parent = view.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
                        ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).g();
                    }
                }
                c14341x36fc1ea2.f197618f = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        a7("onLiveEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2 c14341x36fc1ea2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14341x36fc1ea2) S6(com.p314xaae8f345.mm.R.id.ra_);
        if (c14341x36fc1ea2 != null) {
            if2.d0 d0Var = new if2.d0(c14341x36fc1ea2, new if2.c());
            this.f372636i = new df2.br(d0Var);
            this.f311778r = d0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.dr(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f311778r = null;
        a7("onViewUnmount");
    }
}
