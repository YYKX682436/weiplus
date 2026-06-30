package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class t0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f272819a;

    public t0(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f272819a = onDismissListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1
    public void a() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f272819a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
