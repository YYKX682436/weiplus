package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bj0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 f193575d;

    public bj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var) {
        this.f193575d = ej0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var = this.f193575d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            ej0Var.t1();
            return;
        }
        ((mm2.c1) ej0Var.P0(mm2.c1.class)).f410331e5 = true;
        android.content.Context context = ej0Var.f446856d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        com.p314xaae8f345.mm.ui.ee.f(activity.getTaskId(), null);
        if (com.p314xaae8f345.mm.ui.bk.w0()) {
            android.content.Context context2 = ej0Var.f446856d.getContext();
            com.p314xaae8f345.mm.ui.fj.f(context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null, true);
            android.content.Context context3 = ej0Var.f446856d.getContext();
            android.app.Activity activity2 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.putExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", true);
        }
    }
}
