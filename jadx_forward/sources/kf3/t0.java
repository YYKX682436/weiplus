package kf3;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388964d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388964d = activityC16486x3260b8cc;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postDelayed enterHighLightMsgId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388964d;
        sb6.append(activityC16486x3260b8cc.f230060e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryUI", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16486x3260b8cc.f230060e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryUI", "postDelayed enterHighLightMsgId empty");
            return;
        }
        kf3.k0 k0Var = activityC16486x3260b8cc.f230061f;
        java.lang.String str = k0Var.f388909o;
        if3.y s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : if3.k0.Ai().s0(str);
        if (s07 != null) {
            int z07 = if3.k0.Ai().z0(s07.f372746f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryAdapter", "getHighLightPosition %s", java.lang.Integer.valueOf(k0Var.f388912r - z07));
            i17 = k0Var.f388912r - z07;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendHistoryAdapter", "getHighLightPosition %s", -1);
            i17 = -1;
        }
        if (i17 != -1) {
            int firstVisiblePosition = i17 - activityC16486x3260b8cc.f230059d.getFirstVisiblePosition();
            activityC16486x3260b8cc.f230059d.setSelection(i17);
            activityC16486x3260b8cc.f230059d.post(new kf3.l0(this, firstVisiblePosition));
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16486x3260b8cc.mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = activityC16486x3260b8cc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6f);
            e4Var.c();
        }
    }
}
