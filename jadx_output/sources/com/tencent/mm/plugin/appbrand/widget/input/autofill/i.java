package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class i extends com.tencent.mm.plugin.appbrand.widget.input.autofill.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar) {
        super(null);
        this.f91335b = kVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.autofill.e0
    public void a(java.lang.String str, com.tencent.mm.plugin.appbrand.widget.input.autofill.d0 d0Var) {
        if (d0Var == com.tencent.mm.plugin.appbrand.widget.input.autofill.d0.DELETE) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91335b;
            kVar.b(kVar.f91337a.getText());
        }
        com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 e0Var = this.f91336a;
        if (e0Var != null) {
            e0Var.a(str, d0Var);
        }
    }
}
