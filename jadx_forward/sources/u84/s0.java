package u84;

/* loaded from: classes4.dex */
public final class s0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f507197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f507198e;

    public s0(u84.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f507197d = m1Var;
        this.f507198e = c17933xe8d1b226;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        u84.m1 m1Var = this.f507197d;
        java.lang.String j18 = m1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", stateTriggerType is ");
        u84.o1 y17 = u84.m1.y(m1Var);
        sb6.append(y17 != null ? new java.lang.Integer(y17.b()) : null);
        sb6.append(", model snsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f507198e;
        sb6.append(c17933xe8d1b226.m70367x7525eefd());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j18, sb6.toString());
        u84.o1 y18 = u84.m1.y(m1Var);
        boolean z17 = false;
        if (!(y18 != null && y18.b() == 0)) {
            u84.o1 y19 = u84.m1.y(m1Var);
            if (y19 != null && y19.b() == 1) {
                z17 = true;
            }
            if (z17 && e0Var == l44.e0.f397635p && ca4.m0.Y(c17933xe8d1b226)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                boolean z18 = m1Var.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                if (!z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    m1Var.L = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    android.os.Handler handler = m1Var.M;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    u84.r0 r0Var = new u84.r0(m1Var);
                    u84.o1 y27 = u84.m1.y(m1Var);
                    if (y27 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
                        j17 = y27.f507169k;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
                    } else {
                        j17 = 3000;
                    }
                    handler.postDelayed(r0Var, j17);
                }
            }
        } else if (e0Var == l44.e0.f397626d) {
            android.view.ViewGroup B = u84.m1.B(m1Var);
            if (B != null) {
                B.setVisibility(4);
            }
            android.view.ViewGroup A = u84.m1.A(m1Var);
            if (A != null) {
                A.setVisibility(0);
            }
        } else if (e0Var == l44.e0.f397627e) {
            android.view.ViewGroup B2 = u84.m1.B(m1Var);
            if (B2 != null) {
                B2.setVisibility(0);
            }
            android.view.ViewGroup A2 = u84.m1.A(m1Var);
            if (A2 != null) {
                A2.setVisibility(4);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
