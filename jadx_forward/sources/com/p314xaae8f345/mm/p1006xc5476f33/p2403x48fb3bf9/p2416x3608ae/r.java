package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b f265098d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b) {
        this.f265098d = activityC19301x4b18db3b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b = this.f265098d;
        if (activityC19301x4b18db3b.isFinishing()) {
            return false;
        }
        activityC19301x4b18db3b.finish();
        return false;
    }
}
