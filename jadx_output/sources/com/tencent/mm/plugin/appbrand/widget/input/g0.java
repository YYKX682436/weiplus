package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.widget.input.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91455d;

    public g0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91455d = q0Var;
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91455d;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        if (e4Var != null) {
            try {
                q0Var.f91620y.a(e4Var.getEditableText(), false);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
