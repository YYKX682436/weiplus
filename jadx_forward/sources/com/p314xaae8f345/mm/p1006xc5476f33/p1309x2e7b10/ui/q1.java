package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f176663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176665f;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf, int i17, int i18) {
        this.f176665f = activityC13052x7242bfaf;
        this.f176663d = i17;
        this.f176664e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176665f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = activityC13052x7242bfaf.f176385q;
        if (c22626x3e1b8dda != null) {
            int i17 = this.f176663d;
            if (i17 == 0) {
                c22626x3e1b8dda.setVisibility(8);
                return;
            }
            if (c22626x3e1b8dda.getVisibility() != 0) {
                activityC13052x7242bfaf.f176385q.setVisibility(0);
            }
            int i18 = this.f176664e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftVideoUI", "update progress %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            if (activityC13052x7242bfaf.f176385q.m81376xb588562e() != i17 && i17 > 0) {
                activityC13052x7242bfaf.f176385q.m81380xca027da2(i17);
            }
            activityC13052x7242bfaf.f176385q.m81381x3ae760af(i18);
        }
    }
}
