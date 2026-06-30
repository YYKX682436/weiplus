package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes8.dex */
public class ce implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 f145626a;

    public ce(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60) {
        this.f145626a = activityC10375x35d0ae60;
    }

    @Override // db5.f4
    /* renamed from: onLoadMore */
    public void mo43537x1318b45a() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60 = this.f145626a;
        com.p314xaae8f345.mm.p648x55baa833.ui.ee eeVar = activityC10375x35d0ae60.f145535g;
        if (eeVar != null) {
            eeVar.f145672q -= 16;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae602 = eeVar.f145675t;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10375x35d0ae602.f145537i);
            int i17 = eeVar.f145673r;
            java.lang.String str = eeVar.f145670o;
            if (!K0 && c01.z1.J(activityC10375x35d0ae602.f145537i)) {
                eeVar.s(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c5(str, i17 - eeVar.f145672q));
            } else if (!c01.z1.J(activityC10375x35d0ae602.f145537i)) {
                eeVar.s(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b5(str, eeVar.f145671p, i17 - eeVar.f145672q));
            }
            activityC10375x35d0ae60.f145535g.notifyDataSetChanged();
        }
    }
}
