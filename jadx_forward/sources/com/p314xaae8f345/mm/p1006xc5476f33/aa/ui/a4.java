package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class a4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154102b;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, java.lang.String str) {
        this.f154102b = activityC11351x975a7907;
        this.f154101a = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154102b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "click launchDialog cancel，mode：%s，submode：%s", java.lang.Integer.valueOf(activityC11351x975a7907.f154037h), java.lang.Integer.valueOf(activityC11351x975a7907.f154038i));
            activityC11351x975a7907.f7(13);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "click launchDialog confirm，mode：%s，submode：%s", java.lang.Integer.valueOf(activityC11351x975a7907.f154037h), java.lang.Integer.valueOf(activityC11351x975a7907.f154038i));
        activityC11351x975a7907.getClass();
        activityC11351x975a7907.u7(activityC11351x975a7907, this.f154101a, false, new java.util.ArrayList());
        activityC11351x975a7907.f7(12);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 8, 4);
    }
}
