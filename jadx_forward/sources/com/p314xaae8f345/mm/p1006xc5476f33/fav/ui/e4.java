package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class e4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b f182362d;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        this.f182362d = activityC13569x56faec8b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b = this.f182362d;
        tl.y0 y0Var = (tl.y0) activityC13569x56faec8b.f181921w;
        int i18 = 0;
        if (y0Var.f501725e == 1) {
            int a17 = y0Var.f501722b.a();
            if (a17 > tl.y0.f501720f) {
                tl.y0.f501720f = a17;
            }
            i17 = (a17 * 100) / tl.y0.f501720f;
        } else {
            i17 = 0;
        }
        while (true) {
            int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b.D;
            if (i18 >= 7) {
                break;
            }
            int[] iArr2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b.C;
            if (i17 >= iArr2[i18] && i17 < iArr2[i18 + 1]) {
                activityC13569x56faec8b.f181915q.setBackgroundResource(iArr[i18]);
                break;
            }
            i18++;
        }
        return true;
    }
}
