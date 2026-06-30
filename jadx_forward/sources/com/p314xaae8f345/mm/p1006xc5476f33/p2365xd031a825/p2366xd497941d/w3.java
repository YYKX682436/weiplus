package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class w3 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339 f261056a;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339 activityC19084x72adb339) {
        this.f261056a = activityC19084x72adb339;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339 activityC19084x72adb339 = this.f261056a;
        java.lang.String string = activityC19084x72adb339.m83105x7498fe14().getString("realname_verify_process_finish_bottom_username");
        java.lang.String string2 = activityC19084x72adb339.m83105x7498fe14().getString("realname_verify_process_finish_bottom_url");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(string, string2, 0, 1034);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19084x72adb339.mo55332x76847179(), string2, true);
        }
    }
}
