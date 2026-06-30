package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class f implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91331d;

    public f(com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar) {
        this.f91331d = kVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91331d;
        if (z17) {
            kVar.d();
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = kVar.f91338b;
        if (sVar.b()) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.c0 c0Var = (com.tencent.mm.plugin.appbrand.widget.input.autofill.c0) sVar.f91292d.getAdapter();
            sVar.a();
            com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = (com.tencent.mm.plugin.appbrand.widget.input.autofill.c) c0Var;
            cVar.f91322e.f91338b.f91290b.setOnDismissListener(null);
            cVar.f91322e = null;
        }
    }
}
