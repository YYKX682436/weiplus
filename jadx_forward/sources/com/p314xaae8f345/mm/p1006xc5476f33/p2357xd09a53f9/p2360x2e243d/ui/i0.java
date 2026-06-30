package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class i0 implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19029x3a87aca7 f260165a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19029x3a87aca7 activityC19029x3a87aca7) {
        this.f260165a = activityC19029x3a87aca7;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19029x3a87aca7 activityC19029x3a87aca7 = this.f260165a;
        if (i17 == -1) {
            activityC19029x3a87aca7.setResult(-1);
            return null;
        }
        if (i17 == 0) {
            activityC19029x3a87aca7.setResult(0);
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        activityC19029x3a87aca7.setResult(1);
        return null;
    }
}
