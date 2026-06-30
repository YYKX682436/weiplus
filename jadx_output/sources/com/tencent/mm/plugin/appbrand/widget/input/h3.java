package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f91479d;

    public h3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var) {
        this.f91479d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91479d;
        android.view.View view = u3Var.f91685r;
        if (view != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(view)) {
                if (u3Var.f91684q.t()) {
                    u3Var.post(this);
                } else {
                    u3Var.f91685r.requestLayout();
                }
            }
        }
    }
}
