package com.p314xaae8f345.mm.p1000xe125c5cf;

/* loaded from: classes5.dex */
public class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1000xe125c5cf.ActivityC11322x5ef5de55 f153909a;

    public f(com.p314xaae8f345.mm.p1000xe125c5cf.ActivityC11322x5ef5de55 activityC11322x5ef5de55) {
        this.f153909a = activityC11322x5ef5de55;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionWarningDialog", "set MicroPhone unmute.");
            ((android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio")).setMicrophoneMute(false);
        }
        this.f153909a.finish();
    }
}
