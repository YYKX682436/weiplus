package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.plugin.appbrand.widget.input.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91716a;

    public x(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91716a = q0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q3
    public boolean a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91716a;
        if (q0Var.f91612q == null) {
            return true;
        }
        if ("[DELETE_EMOTION]".equalsIgnoreCase(str)) {
            q0Var.f91612q.m();
            return true;
        }
        q0Var.f91612q.i(str);
        return true;
    }
}
