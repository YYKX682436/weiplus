package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class yg implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155881d;

    public yg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0) {
        this.f155881d = activityC11466x7d774b0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155881d;
        java.lang.String trim = activityC11466x7d774b0.f155163e.getText().toString().trim();
        java.lang.String trim2 = activityC11466x7d774b0.f155162d.getText().toString().trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim2)) {
            if (trim2.length() <= 5) {
                str = trim2;
                str2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim2)) ? str : trim2;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && activityC11466x7d774b0.X6() && activityC11466x7d774b0.Z6()) {
                    int V6 = activityC11466x7d774b0.V6();
                    java.lang.String U6 = activityC11466x7d774b0.U6();
                    gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60875xf35223e, activityC11466x7d774b0);
                    gm0.j1.d().g(new r61.m1(U6, activityC11466x7d774b0.f155170o, V6, str2, str, "", ""));
                    activityC11466x7d774b0.B.setVisibility(0);
                }
                return false;
            }
            trim = trim2.substring(0, 5);
        }
        str = trim;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            int V62 = activityC11466x7d774b0.V6();
            java.lang.String U62 = activityC11466x7d774b0.U6();
            gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60875xf35223e, activityC11466x7d774b0);
            gm0.j1.d().g(new r61.m1(U62, activityC11466x7d774b0.f155170o, V62, str2, str, "", ""));
            activityC11466x7d774b0.B.setVisibility(0);
        }
        return false;
    }
}
