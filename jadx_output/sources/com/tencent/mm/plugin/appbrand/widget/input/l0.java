package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class l0 implements com.tencent.mm.plugin.appbrand.widget.input.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91526a;

    public l0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91526a = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.r4
    public boolean a(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 67) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91526a;
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.e(q0Var.f91612q.getText())) {
            return false;
        }
        q0Var.u(q0Var.f91612q.getText().toString());
        return true;
    }
}
