package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class m1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f183912d;

    public m1(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f183912d = onDismissListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f183912d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
