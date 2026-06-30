package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class t2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f163600d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f163600d = onCancelListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f163600d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
    }
}
