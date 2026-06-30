package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkAddMembersUI */
/* loaded from: classes14.dex */
public class ActivityC16580xee897bd1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.f287983h.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560403jg);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        int i17 = sj3.i1.f490091c;
        c19642xb279030.setPadding(i17, i17, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard");
        android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        keyguardManager.inKeyguardRestrictedInputMode();
        hasWindowFocus();
        powerManager.isScreenOn();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.D) {
            this.D = false;
            p7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        this.D = false;
        super.p7();
    }
}
