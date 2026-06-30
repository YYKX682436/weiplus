package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class d2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f260891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e2 f260892b;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.e2 e2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f260892b = e2Var;
        this.f260891a = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            java.lang.String format = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260892b.f260902d;
            activityC19082x760c9ba5.P = i17;
            activityC19082x760c9ba5.Q = i18;
            activityC19082x760c9ba5.R = i19;
            activityC19082x760c9ba5.A.f261007v.mo523x53d8522f(format);
        }
        this.f260891a.b();
    }
}
