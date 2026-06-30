package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u f240627a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f240628b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f240629c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f240630d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240631e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u scanUIModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanUIModel, "scanUIModel");
        this.f240627a = scanUIModel;
    }

    public final void a(long j17, boolean z17) {
        java.lang.Long l17 = this.f240628b;
        if (l17 != null && l17.longValue() == j17) {
            if (z17) {
                this.f240631e = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) this.f240627a;
                activityC17284x451cd422.getClass();
                this.f240629c = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC17284x451cd422, activityC17284x451cd422.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w0(this));
                return;
            }
            this.f240631e = false;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f240629c;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
    }
}
