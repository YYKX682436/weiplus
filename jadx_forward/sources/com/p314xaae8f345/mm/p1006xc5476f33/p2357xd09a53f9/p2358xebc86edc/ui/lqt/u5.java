package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class u5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hs4.d f259928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f259929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259931d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, hs4.d dVar, int i17, java.lang.String str) {
        this.f259931d = activityC19020x7623dbfb;
        this.f259928a = dVar;
        this.f259929b = i17;
        this.f259930c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        hs4.d dVar = this.f259928a;
        if (dVar == null) {
            return;
        }
        int i17 = this.f259929b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259931d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.U6(activityC19020x7623dbfb, i17);
        dVar.c();
        if (dVar.f366161m < ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) ((java.util.LinkedList) activityC19020x7623dbfb.f259606x0).get(dVar.f366161m);
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
            java.lang.String str = this.f259930c;
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
