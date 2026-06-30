package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class w5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.u5 f91713d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f91714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91715f;

    public w5(com.tencent.mm.plugin.appbrand.widget.input.u5 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f91713d = callback;
    }

    public final void a() {
        wu5.c cVar = this.f91714e;
        if (cVar != null) {
            kotlin.jvm.internal.o.d(cVar);
            if (!cVar.isCancelled()) {
                wu5.c cVar2 = this.f91714e;
                kotlin.jvm.internal.o.d(cVar2);
                cVar2.cancel(false);
            }
        }
        this.f91714e = null;
        this.f91713d.a(false);
        this.f91715f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int systemWindowInsetBottom;
        int c17;
        int i17;
        android.view.View contentView = this.f91713d.getContentView();
        if (contentView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnEditableClientGlobalLayoutListener", "onGlobalLayout, content view is null");
            return;
        }
        android.app.Activity activity = this.f91713d.getActivity();
        ?? r17 = activity;
        if (activity == null) {
            r17 = q75.a.a(contentView.getContext());
        }
        android.view.WindowInsets b17 = r17 != 0 ? com.tencent.mm.ui.qk.b(r17) : contentView.getRootWindowInsets();
        if (b17 == null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            contentView.getWindowVisibleDisplayFrame(rect);
            systemWindowInsetBottom = rect.height();
        } else {
            systemWindowInsetBottom = b17.getSystemWindowInsetBottom();
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 30 || b17 == null) {
            if (r17 == 0) {
                r17 = contentView.getContext();
            }
            c17 = com.tencent.mm.ui.bl.c(r17);
        } else {
            c17 = b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        }
        if (i18 < 30 || b17 == null) {
            i17 = systemWindowInsetBottom - c17;
        } else {
            android.graphics.Insets insets = b17.getInsets(android.view.WindowInsets.Type.ime());
            kotlin.jvm.internal.o.f(insets, "getInsets(...)");
            i17 = insets.bottom - c17;
        }
        if (i17 <= 0) {
            i17 = 0;
        }
        wu5.c cVar = this.f91714e;
        if (cVar != null) {
            kotlin.jvm.internal.o.d(cVar);
            if (!cVar.isCancelled()) {
                wu5.c cVar2 = this.f91714e;
                kotlin.jvm.internal.o.d(cVar2);
                cVar2.cancel(false);
            }
        }
        com.tencent.mm.plugin.appbrand.widget.input.v5 v5Var = new com.tencent.mm.plugin.appbrand.widget.input.v5(i17, this);
        if (this.f91713d.b() == 0) {
            if (i17 <= 0 && this.f91715f) {
                this.f91713d.a(false);
                this.f91715f = false;
            }
        } else if (i17 > 0 && !this.f91715f) {
            this.f91713d.a(true);
            this.f91715f = true;
        } else if (i17 <= 0 && this.f91715f) {
            this.f91713d.a(false);
            this.f91715f = false;
        }
        if (i17 > 0) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            this.f91714e = t0Var.z(v5Var, 160L, false);
        }
    }
}
