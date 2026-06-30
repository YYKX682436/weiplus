package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class o5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q5 f91586d;

    public o5(com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var) {
        this.f91586d = q5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var = this.f91586d;
        if (q5Var.f91626b != null) {
            com.tencent.mm.plugin.appbrand.widget.input.q5.a(q5Var);
        }
    }
}
