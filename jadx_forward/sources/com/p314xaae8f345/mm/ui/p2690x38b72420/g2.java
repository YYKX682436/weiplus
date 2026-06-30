package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class g2 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 f288250a;

    public g2(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948) {
        this.f288250a = activityC22295xcc682948;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ContactRemarkInfoModUI", "cdn download finish!! succeed:%s remarkImageDownloadCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f288250a.R1));
        r1.R1--;
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.f2(this, i17));
        }
    }
}
