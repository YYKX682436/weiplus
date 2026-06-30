package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class x2 implements com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.b3 f91718a;

    public x2(com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var) {
        this.f91718a = b3Var;
    }

    @Override // com.tenpay.miniapp.MiniAppSecureEditText.OnPasswdInputListener
    public final void onDone() {
        com.tencent.mm.plugin.appbrand.widget.input.b3 b3Var = this.f91718a;
        b3Var.getMyTag$luggage_wxa_app_input_ext_release();
        com.tencent.mm.plugin.appbrand.widget.input.z2 listener = b3Var.getListener();
        if (listener != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.t2) listener).f91661a.u(true);
        }
    }
}
