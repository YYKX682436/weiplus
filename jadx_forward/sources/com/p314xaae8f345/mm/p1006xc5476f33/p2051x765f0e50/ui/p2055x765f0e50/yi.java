package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class yi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 f243322d;

    public yi(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 activityC17446x3014d797) {
        this.f243322d = activityC17446x3014d797;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797.f242105h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 activityC17446x3014d797 = this.f243322d;
        activityC17446x3014d797.getClass();
        qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
        int i18 = activityC17446x3014d797.f242107e;
        ef0.y2 y2Var = (ef0.y2) o8Var;
        y2Var.getClass();
        bw5.lc0 Ui = y2Var.Ui();
        int i19 = Ui != null ? Ui.f111279p : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setAiCreateModelType state: " + i18 + ", old: " + i19);
        bw5.lc0 Ui2 = y2Var.Ui();
        if (Ui2 != null) {
            Ui2.f111279p = i18;
            Ui2.f111282s[10] = true;
        }
        y2Var.wi();
        pq5.g l17 = new vk4.f(y2Var.Ui()).l();
        l17.f(activityC17446x3014d797);
        l17.q(new ef0.t2(y2Var, i18, i19));
        activityC17446x3014d797.finish();
        return true;
    }
}
