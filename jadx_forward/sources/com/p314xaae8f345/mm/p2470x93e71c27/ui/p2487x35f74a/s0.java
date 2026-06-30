package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class s0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f272818d;

    public s0(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f272818d = onDismissListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f272818d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
