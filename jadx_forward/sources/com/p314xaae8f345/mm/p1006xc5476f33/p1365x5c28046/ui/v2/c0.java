package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes15.dex */
public class c0 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 f179887d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724) {
        this.f179887d = activityC13350x2639a724;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724 = this.f179887d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13350x2639a724.H) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(activityC13350x2639a724.H)) {
            return;
        }
        activityC13350x2639a724.f179813J.s(activityC13350x2639a724.H, true);
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724 = this.f179887d;
        activityC13350x2639a724.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572646bz4);
        activityC13350x2639a724.mo74407xb0dfae51(1001, activityC13350x2639a724.B);
        java.util.HashMap hashMap = activityC13350x2639a724.K;
        if (hashMap == null || !hashMap.containsKey(str)) {
            activityC13350x2639a724.E = null;
            activityC13350x2639a724.F = -1;
            activityC13350x2639a724.H = activityC13350x2639a724.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzs);
            activityC13350x2639a724.f179825r = 1;
            activityC13350x2639a724.f179816f = 0;
            activityC13350x2639a724.U6(activityC13350x2639a724.E);
            activityC13350x2639a724.Y6("");
        } else {
            activityC13350x2639a724.F = -1;
            activityC13350x2639a724.H = str;
            activityC13350x2639a724.f179825r = 4;
            activityC13350x2639a724.f179816f = ((java.lang.Integer) activityC13350x2639a724.K.get(str)).intValue();
            activityC13350x2639a724.U6(null);
            activityC13350x2639a724.Y6(str);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22311xa7822c52 c22311xa7822c52 = activityC13350x2639a724.I;
        if (c22311xa7822c52 != null) {
            c22311xa7822c52.setVisibility(8);
        }
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
