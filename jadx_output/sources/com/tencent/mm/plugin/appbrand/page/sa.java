package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class sa implements ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final ni1.f f87087d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.webview.o f87088e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87089f;

    public sa(ni1.f originExtension) {
        kotlin.jvm.internal.o.g(originExtension, "originExtension");
        this.f87087d = originExtension;
    }

    @Override // ni1.f
    public void P() {
        android.view.View androidView;
        boolean z17 = false;
        this.f87089f = false;
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f87088e;
        if (oVar != null && (androidView = ((of1.w1) oVar).getAndroidView()) != null && androidView.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            this.f87087d.P();
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar2 = this.f87088e;
        kotlin.jvm.internal.o.d(oVar2);
        ((of1.w1) oVar2).P();
    }

    @Override // ni1.f
    public void V() {
        this.f87089f = true;
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f87088e;
        if (oVar != null) {
            ((of1.w1) oVar).V();
        }
        this.f87087d.V();
    }

    public final void m(com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar) {
        if (kotlin.jvm.internal.o.b(this.f87088e, oVar)) {
            return;
        }
        this.f87088e = oVar;
        if (this.f87089f) {
            V();
        } else {
            P();
            if (this.f87088e != null) {
                this.f87087d.V();
            }
        }
        if (oVar != null) {
            com.tencent.mm.plugin.appbrand.page.ra raVar = new com.tencent.mm.plugin.appbrand.page.ra(this);
            of1.w1 w1Var = (of1.w1) oVar;
            if (w1Var.f345036g) {
                return;
            }
            w1Var.f345050x.add(raVar);
        }
    }
}
