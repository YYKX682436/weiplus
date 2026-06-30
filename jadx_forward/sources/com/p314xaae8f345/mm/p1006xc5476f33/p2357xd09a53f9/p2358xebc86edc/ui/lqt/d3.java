package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class d3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f259667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259668e;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, java.util.List list) {
        this.f259668e = activityC19014x45f83936;
        this.f259667d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259668e;
        hs4.d dVar = activityC19014x45f83936.Z;
        if (dVar != null) {
            dVar.c();
            if (i17 < 0 || i17 >= this.f259667d.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.Y6(activityC19014x45f83936);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) ((java.util.ArrayList) activityC19014x45f83936.G).get(i17);
            r45.n85 n85Var = activityC19014x45f83936.I;
            n85Var.f462700h = c19091x9511676c.f69225xed6d60f6;
            n85Var.f462698f = c19091x9511676c.f69223x58802fcb;
            n85Var.f462707r = c19091x9511676c.f69217xaef0808c;
            n85Var.f462699g = c19091x9511676c.f69222x587fd4e1;
            activityC19014x45f83936.f7();
            activityC19014x45f83936.h7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.Z6(activityC19014x45f83936);
        }
    }
}
