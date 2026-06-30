package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class f2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f234148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234149e;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f234149e = activityC16764xd1ab6b38;
        this.f234148d = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f234148d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234149e;
        if (activityC16764xd1ab6b38.C1) {
            activityC16764xd1ab6b38.f234081y1 = false;
            activityC16764xd1ab6b38.C1 = false;
            activityC16764xd1ab6b38.r7(0, false);
            activityC16764xd1ab6b38.Z6(true);
        }
    }
}
