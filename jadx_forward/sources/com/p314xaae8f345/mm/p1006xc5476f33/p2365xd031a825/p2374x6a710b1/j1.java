package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes8.dex */
public class j1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f262443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.app.Dialog dialog) {
        super(false);
        this.f262443d = dialog;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.app.Dialog dialog = this.f262443d;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
