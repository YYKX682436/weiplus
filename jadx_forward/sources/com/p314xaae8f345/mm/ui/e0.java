package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f289888d;

    public e0(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b) {
        this.f289888d = activityC21340x254df46b;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f289888d.f278096e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.d0(this), 200L);
    }
}
