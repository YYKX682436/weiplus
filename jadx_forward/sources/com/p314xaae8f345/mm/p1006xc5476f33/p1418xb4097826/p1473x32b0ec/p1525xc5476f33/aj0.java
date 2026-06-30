package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class aj0 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 f193432a;

    public aj0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var) {
        this.f193432a = ej0Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej0 ej0Var = this.f193432a;
        android.content.Context context = ej0Var.f446856d.getContext();
        if (!com.p314xaae8f345.mm.ui.fj.b(context instanceof android.app.Activity ? (android.app.Activity) context : null)) {
            android.content.Context context2 = ej0Var.f446856d.getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
            if (!com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId())) {
                g4Var.g(1, ej0Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2b), com.p314xaae8f345.mm.R.raw.f80311xadf8c434);
                g4Var.g(2, ej0Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k27), com.p314xaae8f345.mm.R.raw.f80184xd8bebcd4);
            }
        }
        g4Var.g(1, ej0Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574945k26), com.p314xaae8f345.mm.R.raw.f80164x8f15f9e0);
        g4Var.g(2, ej0Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k27), com.p314xaae8f345.mm.R.raw.f80184xd8bebcd4);
    }
}
