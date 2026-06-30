package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class j0 extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91502d;

    public j0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91502d = q0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91502d;
        java.lang.ref.WeakReference weakReference = q0Var.f91610o;
        if (weakReference == null || weakReference.get() == null || q0Var.f91612q == null) {
            return;
        }
        q0Var.r();
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.e(editable)) {
            return;
        }
        q0Var.f91620y.a(q0Var.f91612q.getEditableText(), q0Var.f91621z);
    }
}
