package ns4;

/* loaded from: classes8.dex */
public final class q2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421157d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421157d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ms4.j jVar = (ms4.j) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421157d;
        activityC19068x49d5e62b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "updateIncomeBalance: [blance] " + jVar);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activityC19068x49d5e62b.findViewById(com.p314xaae8f345.mm.R.id.pka);
        linearLayout.setVisibility(8);
        if (jVar == null || !jVar.f412577a) {
            return;
        }
        ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(6);
        linearLayout.setOnClickListener(new ns4.k3(activityC19068x49d5e62b));
        java.lang.String o17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + jVar.f412578b, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d = activityC19068x49d5e62b.f260727p;
        if (c19152xaaf0e35d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBalanceView");
            throw null;
        }
        c19152xaaf0e35d.e(o17, false);
        linearLayout.setVisibility(0);
    }
}
