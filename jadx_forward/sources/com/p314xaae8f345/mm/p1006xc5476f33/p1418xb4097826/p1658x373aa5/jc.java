package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class jc implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f213968d;

    public jc(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f213968d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc ocVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a;
        db5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214316c;
        boolean z17 = false;
        if (d5Var != null && d5Var.isShowing()) {
            z17 = true;
        }
        if (z17) {
            db5.d5 d5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214316c;
            if (d5Var2 != null) {
                d5Var2.dismiss();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214316c = null;
        }
        this.f213968d.onDismiss();
    }
}
