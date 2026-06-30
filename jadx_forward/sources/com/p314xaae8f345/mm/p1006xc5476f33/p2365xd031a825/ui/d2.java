package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f261766a;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f261766a = activityC19108xd69d11c7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        this.f261766a.mo48674x36654fab();
        this.f261766a.mo48632xd46dd964();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f261766a;
            int i17 = activityC19108xd69d11c7.f261448m2;
            if (i17 == -1) {
                return;
            }
            activityC19108xd69d11c7.f261450n2 = i17;
            int intValue = ((java.lang.Integer) activityC19108xd69d11c7.W.a().get(this.f261766a.f261448m2)).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c72 = this.f261766a;
            if (activityC19108xd69d11c72.B1 != intValue) {
                activityC19108xd69d11c72.B1 = intValue;
                activityC19108xd69d11c72.f261440h2 = activityC19108xd69d11c72.f261467y.m83183xfb85ada3();
                this.f261766a.f261467y.m83213x765074af(((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.b(this.f261766a.mo55332x76847179(), this.f261766a.B1));
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c73 = this.f261766a;
                activityC19108xd69d11c73.Z6(activityC19108xd69d11c73.f261470z, activityC19108xd69d11c73.B1);
                this.f261766a.f261470z.d();
                this.f261766a.f261470z.e();
                this.f261766a.c7(false);
            }
        }
        this.f261766a.f261448m2 = -1;
    }
}
