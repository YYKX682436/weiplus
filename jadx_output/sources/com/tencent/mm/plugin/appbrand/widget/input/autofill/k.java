package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.t4 f91337a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.s f91338b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Filter.FilterListener f91339c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.o f91340d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.j f91341e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.autofill.b0 f91342f = com.tencent.mm.plugin.appbrand.widget.input.autofill.b0.VIEW;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.autofill.c f91343g;

    public k(com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var) {
        this.f91337a = t4Var;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = new com.tencent.mm.plugin.appbrand.widget.input.autofill.s(t4Var.getContext());
        this.f91338b = sVar;
        this.f91340d = new com.tencent.mm.plugin.appbrand.widget.input.autofill.o(t4Var, sVar);
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = (com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var;
        ((x.n) e4Var.f91411h).put(new com.tencent.mm.plugin.appbrand.widget.input.autofill.d(this), e4Var);
        ((x.n) e4Var.f91413m).put(new com.tencent.mm.plugin.appbrand.widget.input.autofill.e(this), e4Var);
        ((x.n) e4Var.f91412i).put(new com.tencent.mm.plugin.appbrand.widget.input.autofill.f(this), e4Var);
        e4Var.addTextChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.autofill.g(this));
        this.f91339c = new com.tencent.mm.plugin.appbrand.widget.input.autofill.h(this);
        this.f91341e = new com.tencent.mm.plugin.appbrand.widget.input.autofill.i(this);
    }

    public void a() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = this.f91340d;
        com.tencent.mm.plugin.appbrand.widget.input.d1 a17 = com.tencent.mm.plugin.appbrand.widget.input.d1.a(oVar.f91351d);
        com.tencent.mm.plugin.appbrand.widget.input.b1 b1Var = oVar.f91350c;
        if (b1Var == null) {
            a17.getClass();
        } else {
            ((x.n) a17.f91388d).remove(b1Var);
        }
        this.f91343g = null;
        this.f91338b.a();
    }

    public final void b(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = this.f91343g;
        if (cVar == null) {
            return;
        }
        cVar.getFilter().filter(charSequence, this.f91339c);
    }

    public final void c() {
        int ordinal = this.f91342f.ordinal();
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = this.f91337a;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = this.f91338b;
        if (ordinal == 0) {
            sVar.f91294f = com.tencent.mm.sdk.platformtools.d2.f(t4Var.getContext())[0];
        } else {
            if (ordinal != 1) {
                return;
            }
            sVar.f91294f = ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getView().getMeasuredWidth();
        }
    }

    public void d() {
        if (this.f91343g == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = this.f91337a;
        java.lang.CharSequence text = t4Var.getText();
        if (!com.tencent.mm.sdk.platformtools.t8.J0(text)) {
            b(text);
        }
        android.view.View view = ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getView();
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = this.f91338b;
        sVar.f91301m = view;
        sVar.c();
        com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = (com.tencent.mm.plugin.appbrand.widget.input.autofill.c) ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c0) sVar.f91292d.getAdapter());
        cVar.f91322e = this;
        sVar.f91290b.setOnDismissListener(new com.tencent.mm.plugin.appbrand.widget.input.autofill.a(cVar));
        com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = this.f91340d;
        oVar.b(2);
        oVar.f91352e = Integer.MIN_VALUE;
        if (!com.tencent.mm.sdk.platformtools.t8.J0(text)) {
            oVar.f91353f = true;
        }
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar = oVar.f91349b.f91292d;
        if (vVar != null) {
            vVar.getAdapter().registerDataSetObserver(new com.tencent.mm.plugin.appbrand.widget.input.autofill.m(oVar));
        }
    }
}
