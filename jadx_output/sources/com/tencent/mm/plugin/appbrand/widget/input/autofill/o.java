package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.t4 f91348a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.s f91349b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f91351d;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.b1 f91350c = new com.tencent.mm.plugin.appbrand.widget.input.autofill.l(this);

    /* renamed from: e, reason: collision with root package name */
    public int f91352e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91353f = false;

    public o(com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var, com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar) {
        this.f91348a = t4Var;
        this.f91349b = sVar;
    }

    public final void a(int i17, int i18, int i19, int i27, int i28) {
        int i29 = this.f91352e;
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = this.f91348a;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = this.f91349b;
        if ((i29 == Integer.MIN_VALUE || i29 >= 0 - i28) && i18 - i17 >= i27 + i28) {
            sVar.f91301m = ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getView();
            sVar.f91293e = i27 + (i28 * 2);
            sVar.f91295g = 0 - i28;
            sVar.f91296h = true;
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = (com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var;
        if (i17 - e4Var.getView().getHeight() >= i27) {
            sVar.f91301m = e4Var.getView();
            sVar.f91293e = (i28 * 2) + i27;
            sVar.f91295g = (-(i27 + i28)) - e4Var.getView().getHeight();
            sVar.f91296h = true;
            return;
        }
        if (i27 > i19) {
            a(i17, i18, i19, i27 - i19, i28);
            return;
        }
        sVar.f91293e = i19;
        sVar.f91301m = e4Var.getView();
        int i37 = 0 - i28;
        if (this.f91352e < i37) {
            sVar.f91295g = (-(i27 + i28)) - e4Var.getView().getHeight();
            sVar.f91296h = true;
        } else {
            sVar.f91295g = i37;
            sVar.f91296h = true;
        }
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = this.f91349b;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar = sVar.f91292d;
        if (vVar != null && sVar.b()) {
            if (1 == i17 && this.f91353f) {
                this.f91352e = Integer.MIN_VALUE;
                this.f91353f = false;
            }
            vVar.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.appbrand.widget.input.autofill.n(this, vVar, i17));
        }
    }
}
