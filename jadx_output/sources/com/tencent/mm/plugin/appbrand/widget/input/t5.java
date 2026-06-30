package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class t5 implements com.tencent.mm.plugin.appbrand.page.ib {

    /* renamed from: f, reason: collision with root package name */
    public static final android.view.View.OnTouchListener f91663f = new com.tencent.mm.plugin.appbrand.widget.input.r5();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f91664d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.p f91665e;

    public t5(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f91664d = v5Var;
        this.f91665e = new com.tencent.mm.plugin.appbrand.widget.input.p(v5Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public void a(com.tencent.mm.plugin.appbrand.page.bb bbVar) {
        if (bbVar == com.tencent.mm.plugin.appbrand.page.bb.MODAL || bbVar == com.tencent.mm.plugin.appbrand.page.bb.ACTION_SHEET) {
            com.tencent.mm.plugin.appbrand.widget.input.r1.d(this.f91664d, null);
        }
    }

    public void b(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fbVar.getContentView();
        com.tencent.mm.plugin.appbrand.widget.input.p pVar = this.f91665e;
        viewGroup.setOnTouchListener(new com.tencent.mm.plugin.appbrand.widget.input.s5(this, pVar, new com.tencent.mm.plugin.appbrand.widget.input.i5(pVar)));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        this.f91665e.d(i17, i18, i19, i27, view);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public android.view.ViewGroup getContainer() {
        return this.f91665e;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r8
    public void h(int i17) {
        this.f91665e.setTranslationY(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
        this.f91665e.j(z17, i17, i18, i19, i27);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public void l(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        if (fbVar.getContentView() == null) {
            return;
        }
        ((android.view.ViewGroup) fbVar.getContentView()).setOnTouchListener(f91663f);
    }
}
