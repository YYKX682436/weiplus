package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f91666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91667e;

    public u(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var, com.tencent.mm.pointers.PBool pBool) {
        this.f91667e = q0Var;
        this.f91666d = pBool;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, before run checkForInput");
        this.f91666d.value = true;
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91667e;
        java.lang.ref.WeakReference weakReference = q0Var.f91610o;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (v5Var == null || q0Var.f91612q == null || com.tencent.mm.plugin.appbrand.widget.input.r1.b(v5Var) != q0Var) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, run checkForInput");
        com.tencent.mm.plugin.appbrand.widget.input.s.f91646b.b(v5Var.a2());
        com.tencent.mm.plugin.appbrand.widget.input.m5.a(q0Var.f91612q);
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = q0Var.f91613r;
        com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var = q0Var.F;
        if (u3Var != null && u3Var.e(null)) {
            q0Var.f91613r.m(p3Var);
            q0Var.f91613r.z();
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        android.view.View.OnFocusChangeListener onFocusChangeListener = q0Var.f91605g;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f91412i).put(onFocusChangeListener, e4Var);
        } else {
            e4Var.getClass();
        }
        q0Var.f91612q.setFocusable(true);
        q0Var.f91612q.setFocusableInTouchMode(true);
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var2 = q0Var.f91613r;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var2 = q0Var.f91612q;
        u3Var2.f91691x = e4Var2;
        e4Var2.requestFocus();
        com.tencent.mm.plugin.appbrand.widget.input.m5.a(q0Var.f91612q);
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var3 = q0Var.f91613r;
        if (u3Var3 != null) {
            u3Var3.k(p3Var);
            q0Var.f91613r.I();
        }
    }
}
