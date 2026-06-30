package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class c implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.f f91371d;

    public c(com.tencent.mm.plugin.appbrand.widget.input.f fVar) {
        this.f91371d = fVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.f fVar = this.f91371d;
        if (fVar.p(z17) && z17) {
            java.lang.ref.WeakReference weakReference = fVar.f91435h;
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) fVar.n();
            java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
            if (v5Var != null) {
                ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.o1(v5Var, t4Var));
            }
            ((com.tencent.mm.plugin.appbrand.widget.input.t4) fVar.n()).setInputId(fVar.f91433f);
            com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.e((com.tencent.mm.plugin.appbrand.page.v5) weakReference.get(), fVar);
        }
    }
}
