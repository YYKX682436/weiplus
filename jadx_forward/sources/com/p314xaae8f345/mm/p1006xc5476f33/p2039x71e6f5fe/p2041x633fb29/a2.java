package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u f240340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.w0 f240341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c2 f240342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y1 f240343g;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u uVar, sz3.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c2 c2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y1 y1Var) {
        this.f240340d = uVar;
        this.f240341e = w0Var;
        this.f240342f = c2Var;
        this.f240343g = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) this.f240340d;
        if (activityC17284x451cd422.isFinishing() || activityC17284x451cd422.isDestroyed()) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("template_type", 1);
        sz3.w0 w0Var = this.f240341e;
        bundle.putString("req_key", w0Var.f495672j);
        bundle.putString("enter_session", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b);
        bundle.putString("tab_session", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.d(1));
        bundle.putString("scan_session", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.c(1));
        bundle.putString("detect_session", java.lang.String.valueOf(w0Var.f495665c));
        bundle.putString("scanTabMerge", "1");
        if (w0Var.f495664b == 3) {
            bundle.putFloat("fixed_dialog_height_rate", 0.75f);
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z(kz5.c0.d(w0Var.f495672j), true, null, 4, null));
        }
        activityC17284x451cd422.getClass();
        uy3.j0 b17 = uy3.n0.b(activityC17284x451cd422, bundle, this.f240342f.f240370a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y1 y1Var = this.f240343g;
        if (y1Var != null) {
            y1Var.a(b17);
        }
    }
}
