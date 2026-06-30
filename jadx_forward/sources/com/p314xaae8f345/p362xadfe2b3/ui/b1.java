package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class b1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, android.os.Looper looper) {
        super(looper);
        this.f127670a = activityC3722x408816c7;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127670a;
        if (i17 == 1) {
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.T6(activityC3722x408816c7, "openLiteAppANR");
        } else {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.T6(activityC3722x408816c7, "openLiteAppLoadingError");
        }
    }
}
