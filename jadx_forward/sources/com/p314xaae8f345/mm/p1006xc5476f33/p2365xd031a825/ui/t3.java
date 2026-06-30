package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class t3 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 f262157a;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362) {
        this.f262157a = activityC19112x755f8362;
    }

    @Override // qp5.t
    /* renamed from: onInputValidChange */
    public void mo26603x194c4a1(boolean z17) {
        android.os.Bundle bundle;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362 = this.f262157a;
            activityC19112x755f8362.f261522q = activityC19112x755f8362.f261512d.m83161xfb85ada3();
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19112x755f8362);
            java.lang.String e17 = g17 != null ? g17.e() : null;
            if (activityC19112x755f8362.f261519n && !"UnbindProcess".equals(e17)) {
                activityC19112x755f8362.m83098x5406100e(new ss4.y(activityC19112x755f8362.f261522q, activityC19112x755f8362.f261521p));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15021, 1);
            } else {
                if (activityC19112x755f8362.m83106x57340563().d(activityC19112x755f8362.f261522q, activityC19112x755f8362.m83107xcc3330f3())) {
                    return;
                }
                java.lang.String str = "";
                if (g17 != null && (bundle = g17.f295334c) != null) {
                    str = bundle.getString("bus_info", "");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    activityC19112x755f8362.m83098x5406100e(new ss4.x(activityC19112x755f8362.f261522q, 1, activityC19112x755f8362.m83107xcc3330f3()));
                } else {
                    activityC19112x755f8362.m83098x5406100e(new ss4.x(activityC19112x755f8362.f261522q, 10, activityC19112x755f8362.m83107xcc3330f3(), str));
                }
            }
        }
    }
}
