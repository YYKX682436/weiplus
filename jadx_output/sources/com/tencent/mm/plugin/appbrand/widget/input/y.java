package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.plugin.appbrand.widget.input.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91720a;

    public y(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91720a = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.o3
    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91720a;
        if (z17) {
            q0Var.f91608m = com.tencent.mm.plugin.appbrand.widget.input.p0.CONFIRM_BAR_CLICKED;
        }
        com.tencent.mm.plugin.appbrand.widget.input.q0.j(q0Var);
        q0Var.f91608m = null;
    }
}
