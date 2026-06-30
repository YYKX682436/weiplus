package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class o2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f262081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2 f262082b;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2 p2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f262082b = p2Var;
        this.f262081a = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            if (i17 <= 0 || i18 <= 0 || i19 <= 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2 p2Var = this.f262082b;
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = p2Var.f262102d;
                activityC19108xd69d11c7.H.m83213x765074af(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l48));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c72 = p2Var.f262102d;
                activityC19108xd69d11c72.Y1 = 9999;
                activityC19108xd69d11c72.Z1 = 12;
                activityC19108xd69d11c72.f261428a2 = 31;
            } else {
                p2Var.f262102d.H.m83213x765074af(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c73 = p2Var.f262102d;
                activityC19108xd69d11c73.Y1 = i17;
                activityC19108xd69d11c73.Z1 = i18;
                activityC19108xd69d11c73.f261428a2 = i19;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c74 = p2Var.f262102d;
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7.f261426q2;
            activityC19108xd69d11c74.U6();
        }
        this.f262081a.b();
    }
}
