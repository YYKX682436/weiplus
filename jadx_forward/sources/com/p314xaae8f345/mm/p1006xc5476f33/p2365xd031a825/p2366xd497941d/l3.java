package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class l3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m3 f260947a;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m3 m3Var) {
        this.f260947a = m3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m3 m3Var = this.f260947a;
        if (z17) {
            if (i17 == 1) {
                java.lang.String format = java.lang.String.format("%04d/%02d/%02d", 9999, 12, 31);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = m3Var.f260953d;
                activityC19082x760c9ba5.L = 9999;
                activityC19082x760c9ba5.M = 12;
                activityC19082x760c9ba5.N = 31;
                activityC19082x760c9ba5.A.f261005t.mo523x53d8522f(format);
            } else {
                java.lang.String format2 = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba52 = m3Var.f260953d;
                activityC19082x760c9ba52.L = i17;
                activityC19082x760c9ba52.M = i18;
                activityC19082x760c9ba52.N = i19;
                activityC19082x760c9ba52.A.f261005t.mo523x53d8522f(format2);
            }
        }
        m3Var.f260953d.f260829w.b();
    }
}
