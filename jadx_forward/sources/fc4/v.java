package fc4;

/* loaded from: classes4.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 O6(fc4.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        vVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46) vVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ncv);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$findSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        return c19718xcf23ab46;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlexibleScaleUIC", "setScaleEnable");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rpo);
            viewOnLongClickListenerC18284x499dee15.setClickable(true);
            al5.u3.c(al5.y3.f87635a, m80379x76847179(), viewOnLongClickListenerC18284x499dee15, viewOnLongClickListenerC18284x499dee15.m71055xe8faff3c(), new fc4.r(viewOnLongClickListenerC18284x499dee15, this), new fc4.s(this, viewOnLongClickListenerC18284x499dee15), new fc4.t(this), null, 64, null);
        } else {
            mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rpo).setOnLongClickListener(new fc4.u(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
    }
}
