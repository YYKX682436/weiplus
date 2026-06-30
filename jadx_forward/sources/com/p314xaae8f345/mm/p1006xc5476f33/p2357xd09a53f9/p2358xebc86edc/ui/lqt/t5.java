package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class t5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f259911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259914g;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, hs4.d dVar, int i17, java.lang.String str) {
        this.f259914g = activityC19020x7623dbfb;
        this.f259911d = dVar;
        this.f259912e = i17;
        this.f259913f = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        hs4.d dVar = this.f259911d;
        if (dVar == null) {
            return;
        }
        int i18 = this.f259912e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259914g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.U6(activityC19020x7623dbfb, i18);
        dVar.c();
        if (i17 < ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).get(i17);
            activityC19020x7623dbfb.W = c19091x9511676c.f69225xed6d60f6;
            activityC19020x7623dbfb.X = c19091x9511676c;
            activityC19020x7623dbfb.h7(false);
            if (activityC19020x7623dbfb.S != 2) {
                if (activityC19020x7623dbfb.F && !c19091x9511676c.v0()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.V6(activityC19020x7623dbfb);
                }
                activityC19020x7623dbfb.s7(activityC19020x7623dbfb.f259589h.m83183xfb85ada3(), false);
                return;
            }
            java.lang.String str = this.f259913f;
            if (android.text.TextUtils.isEmpty(str) || c19091x9511676c.v0()) {
                activityC19020x7623dbfb.f259589h.d();
                return;
            }
            activityC19020x7623dbfb.f259589h.m83213x765074af(str);
            activityC19020x7623dbfb.f259589h.m83169xe7297452().requestFocus();
            activityC19020x7623dbfb.m83140xebcf1de0();
        }
    }
}
