package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f262020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n2 f262021b;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n2 n2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f262021b = n2Var;
        this.f262020a = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            if (i17 <= 0 || i18 <= 0 || i19 <= 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n2 n2Var = this.f262021b;
            n2Var.f262038d.G.m83213x765074af(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = n2Var.f262038d;
            activityC19108xd69d11c7.f261429b2 = i17;
            activityC19108xd69d11c7.f261430c2 = i18;
            activityC19108xd69d11c7.f261432d2 = i19;
            activityC19108xd69d11c7.U6();
        }
        this.f262020a.b();
    }
}
