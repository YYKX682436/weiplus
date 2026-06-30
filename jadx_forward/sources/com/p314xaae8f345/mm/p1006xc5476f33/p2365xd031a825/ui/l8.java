package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f261944d;

    public l8(android.content.DialogInterface.OnCancelListener onCancelListener, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x7 x7Var) {
        this.f261944d = null;
        this.f261944d = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.u(false);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f261944d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
