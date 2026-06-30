package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class k0 implements ml1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91520a;

    public k0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91520a = q0Var;
    }

    @Override // ml1.c
    public void a() {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91520a;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        if (e4Var == null) {
            return;
        }
        e4Var.getEditableText();
        q0Var.f91620y.a(q0Var.f91612q.getEditableText(), false);
    }
}
