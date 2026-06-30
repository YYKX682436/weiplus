package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class c0 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91372d;

    public c0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        this.f91372d = q0Var;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$18", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = 67 == i17;
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91372d;
        q0Var.f91621z = z17;
        if (z17) {
            q0Var.B.removeCallbacks(q0Var.A);
            q0Var.B.postDelayed(q0Var.A, 1000L);
        } else {
            ((com.tencent.mm.plugin.appbrand.widget.input.i0) q0Var.A).run();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$18", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
