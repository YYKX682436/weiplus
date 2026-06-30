package qi2;

/* loaded from: classes3.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final si2.b f445180h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f445181i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.w0 f445182m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f445183n;

    /* renamed from: o, reason: collision with root package name */
    public ce2.i f445184o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f445185p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.tencent.mm.plugin.finder.live.mic.pk.FinderLivePkGiftSelectPanelWidget$initRecyclerView$2] */
    public w0(android.content.Context context, si2.b callback, yz5.l selectBlock) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectBlock, "selectBlock");
        this.f445180h = callback;
        this.f445181i = selectBlock;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f445183n = arrayList;
        fg2.w0 w0Var = this.f445182m;
        if (w0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        w0Var.f343921d.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f199914d));
        qi2.n0 n0Var = new qi2.n0(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.mic.pk.FinderLivePkGiftSelectPanelWidget$initRecyclerView$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new ti2.j();
            }
        }, arrayList);
        n0Var.f374638o = new qi2.o0(this);
        this.f445185p = n0Var;
        fg2.w0 w0Var2 = this.f445182m;
        if (w0Var2 != null) {
            w0Var2.f343921d.mo7960x6cab2c8d(n0Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public static final void y(qi2.w0 w0Var) {
        fg2.w0 w0Var2 = w0Var.f445182m;
        if (w0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        w0Var2.f343920c.setVisibility(8);
        fg2.w0 w0Var3 = w0Var.f445182m;
        if (w0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        w0Var3.f343921d.setVisibility(8);
        fg2.w0 w0Var4 = w0Var.f445182m;
        if (w0Var4 != null) {
            w0Var4.f343919b.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dey;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.dhl;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.dhl);
        if (textView != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) rootView;
            i17 = com.p314xaae8f345.mm.R.id.imn;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.imn);
            if (progressBar != null) {
                i17 = com.p314xaae8f345.mm.R.id.lqa;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.lqa);
                if (c22849x81a93d25 != null) {
                    this.f445182m = new fg2.w0(relativeLayout, textView, relativeLayout, progressBar, c22849x81a93d25);
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        this.f445183n.clear();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f445185p;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void u() {
        a();
        this.f445181i.mo146xb9724478(this.f445184o);
    }
}
