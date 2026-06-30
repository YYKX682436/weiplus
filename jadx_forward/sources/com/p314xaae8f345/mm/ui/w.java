package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21340x254df46b f292717d;

    public w(com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b) {
        this.f292717d = activityC21340x254df46b;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.ActivityC21340x254df46b activityC21340x254df46b = this.f292717d;
        android.content.DialogInterface.OnCancelListener onCancelListener = activityC21340x254df46b.f278096e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        activityC21340x254df46b.finish();
    }
}
