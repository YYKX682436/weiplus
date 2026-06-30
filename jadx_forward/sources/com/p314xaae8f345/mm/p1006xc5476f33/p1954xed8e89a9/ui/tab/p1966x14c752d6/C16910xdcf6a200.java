package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1966x14c752d6;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.observer.BizProfileWidgetOperateObserver */
/* loaded from: classes9.dex */
public class C16910xdcf6a200 extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1966x14c752d6.C16907x9fcdb293 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f236036e = true;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f236037f;

    public C16910xdcf6a200(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f236037f = activityC16840x4302a3e2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1966x14c752d6.C16907x9fcdb293, zr3.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        if (this.f236036e) {
            this.f236036e = false;
            qr3.c0.a(z3Var.d1());
            qk.o b17 = r01.z.b(z3Var.d1());
            this.f236035d = null;
            if (b17 != null) {
                b17.D0(false);
            }
            if (b17 != null) {
                b17.v0();
                qk.n D0 = b17.D0(false);
                this.f236035d = D0;
                D0.m();
                if (this.f236035d.l() != null && this.f236035d.l().length() > 0) {
                    this.f236035d.l();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f236037f;
            java.lang.String stringExtra = activityC16840x4302a3e2.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                activityC16840x4302a3e2.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
                db5.e1.y(activityC16840x4302a3e2, stringExtra, "", activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            }
        }
        return false;
    }
}
