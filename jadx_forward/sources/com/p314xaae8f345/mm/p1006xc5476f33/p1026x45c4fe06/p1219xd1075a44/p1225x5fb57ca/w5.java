package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class w5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5 f173246d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f173247e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173248f;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u5 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f173246d = callback;
    }

    public final void a() {
        wu5.c cVar = this.f173247e;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            if (!cVar.isCancelled()) {
                wu5.c cVar2 = this.f173247e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
                cVar2.cancel(false);
            }
        }
        this.f173247e = null;
        this.f173246d.a(false);
        this.f173248f = false;
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
        android.view.View mo53488xc2a54588 = this.f173246d.mo53488xc2a54588();
        if (mo53488xc2a54588 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnEditableClientGlobalLayoutListener", "onGlobalLayout, content view is null");
            return;
        }
        android.app.Activity mo53487x19263085 = this.f173246d.mo53487x19263085();
        ?? r17 = mo53487x19263085;
        if (mo53487x19263085 == null) {
            r17 = q75.a.a(mo53488xc2a54588.getContext());
        }
        android.view.WindowInsets b17 = r17 != 0 ? com.p314xaae8f345.mm.ui.qk.b(r17) : mo53488xc2a54588.getRootWindowInsets();
        if (b17 == null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            mo53488xc2a54588.getWindowVisibleDisplayFrame(rect);
            systemWindowInsetBottom = rect.height();
        } else {
            systemWindowInsetBottom = b17.getSystemWindowInsetBottom();
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 30 || b17 == null) {
            if (r17 == 0) {
                r17 = mo53488xc2a54588.getContext();
            }
            c17 = com.p314xaae8f345.mm.ui.bl.c(r17);
        } else {
            c17 = b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        }
        if (i18 < 30 || b17 == null) {
            i17 = systemWindowInsetBottom - c17;
        } else {
            android.graphics.Insets insets = b17.getInsets(android.view.WindowInsets.Type.ime());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets, "getInsets(...)");
            i17 = insets.bottom - c17;
        }
        if (i17 <= 0) {
            i17 = 0;
        }
        wu5.c cVar = this.f173247e;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
            if (!cVar.isCancelled()) {
                wu5.c cVar2 = this.f173247e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
                cVar2.cancel(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v5 v5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v5(i17, this);
        if (this.f173246d.b() == 0) {
            if (i17 <= 0 && this.f173248f) {
                this.f173246d.a(false);
                this.f173248f = false;
            }
        } else if (i17 > 0 && !this.f173248f) {
            this.f173246d.a(true);
            this.f173248f = true;
        } else if (i17 <= 0 && this.f173248f) {
            this.f173246d.a(false);
            this.f173248f = false;
        }
        if (i17 > 0) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            this.f173247e = t0Var.z(v5Var, 160L, false);
        }
    }
}
