package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 f236997e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf1, java.util.List list) {
        this.f236997e = activityC16963xe302cdf1;
        this.f236996d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f236996d;
        if (list == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordDetailUI", "start calc");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        long j17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf1 = this.f236997e;
            if (!hasNext) {
                java.lang.String format = java.lang.String.format("%s:%s:%s:%s:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1.C;
                activityC16963xe302cdf1.f182133g.f425013e = format;
                return;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var != null && !activityC16963xe302cdf1.f236795z) {
                int i29 = gp0Var.I;
                if (i29 == 1) {
                    i17++;
                    j17 += gp0Var.f456941f != null ? r9.getBytes().length : 0L;
                } else if (i29 == 2) {
                    i18++;
                } else if (i29 == 4 || i29 == 15) {
                    i19++;
                } else {
                    i27++;
                }
            }
        }
    }
}
