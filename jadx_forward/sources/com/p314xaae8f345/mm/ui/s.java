package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f291288d;

    public s(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b) {
        this.f291288d = activityC21340x254df46b;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f291288d.f278095d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.r(this), 200L);
    }
}
