package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class r2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f163555a;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f163555a = onCancelListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.b1
    public void a() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f163555a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
    }
}
