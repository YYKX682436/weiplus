package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, android.os.Looper looper) {
        super(looper);
        this.f127716a = activityC3721x69b5f133;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127716a;
        if (i17 == 1) {
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.Q6(activityC3721x69b5f133, "openLiteAppANR");
        } else {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.Q6(activityC3721x69b5f133, "openLiteAppLoadingError");
        }
    }
}
