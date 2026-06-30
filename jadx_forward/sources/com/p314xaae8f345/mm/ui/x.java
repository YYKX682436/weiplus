package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class x implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f294068d;

    public x(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b) {
        this.f294068d = activityC21340x254df46b;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.AlertActivity", "mTipsBuilder onDismiss", new java.lang.Object[0]);
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b = this.f294068d;
        android.content.DialogInterface.OnDismissListener onDismissListener = activityC21340x254df46b.f278095d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        activityC21340x254df46b.finish();
    }
}
