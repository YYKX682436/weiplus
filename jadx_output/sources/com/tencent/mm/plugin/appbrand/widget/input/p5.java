package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class p5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q5 f91601d;

    public p5(com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var) {
        this.f91601d = q5Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var = this.f91601d;
        if (q5Var.f91626b != null) {
            android.graphics.Rect rect = q5Var.f91628d;
            int i17 = rect.bottom;
            q5Var.f91629e.getWindowVisibleDisplayFrame(rect);
            if (q5Var.f91628d.bottom != i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), q5Var.f91628d.toShortString());
                com.tencent.mm.plugin.appbrand.widget.input.q5.a(q5Var);
            }
        }
    }
}
