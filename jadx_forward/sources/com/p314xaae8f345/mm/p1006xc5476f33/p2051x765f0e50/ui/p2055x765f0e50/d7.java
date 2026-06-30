package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class d7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c7 f242468d;

    /* renamed from: e, reason: collision with root package name */
    public int f242469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        k14.w wVar = new k14.w(appId, i17, true);
        this.f242469e = wVar.hashCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthDataUIC", "delUserAuth scene: %d, callbackId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f242469e));
        gm0.j1.d().g(wVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(1127, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(1127, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c7 c7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c7 c7Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delUserAuth onSceneEnd errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        sb6.append(", callback: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthDataUIC", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            if ((m1Var != null && m1Var.mo808xfb85f7b0() == 1127) && m1Var.hashCode() == this.f242469e && (c7Var2 = this.f242468d) != null) {
                c7Var2.mo69005xe05b4124();
                return;
            }
            return;
        }
        if ((m1Var != null && m1Var.mo808xfb85f7b0() == 1127) && m1Var.hashCode() == this.f242469e && (c7Var = this.f242468d) != null) {
            c7Var.a(i17, i18, str);
        }
    }
}
