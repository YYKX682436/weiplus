package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class vp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zp f217795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zp zpVar) {
        super(0);
        this.f217795d = zpVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209283i7).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zp zpVar = this.f217795d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zpVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        if (c15456x2c452bca != null && c15456x2c452bca.S6() != zpVar.O6()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaGridUIC", "FinderNextTabPreloadEvent: showPreloadResultWhenSwitchTab=" + z18 + " isFragmentUnFocus=" + z17 + " tabType=" + zpVar.O6());
        if (z18 && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um umVar = zpVar.f218243e;
            if (umVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            umVar.f188689e.m56388xcaeb60d0().clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ym ymVar = zpVar.f218244f;
            if (ymVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ymVar.m56022x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
        return jz5.f0.f384359a;
    }
}
