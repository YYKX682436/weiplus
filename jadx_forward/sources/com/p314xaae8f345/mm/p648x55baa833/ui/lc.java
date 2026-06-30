package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe f145845d;

    public lc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe) {
        this.f145845d = activityC10368x68cc8efe;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe.f145491o;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe = this.f145845d;
        activityC10368x68cc8efe.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor y27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y2(activityC10368x68cc8efe.f145493e);
        try {
            try {
                if (y27.moveToFirst()) {
                    while (!y27.isAfterLast()) {
                        if (-1 == activityC10368x68cc8efe.f145495g) {
                            activityC10368x68cc8efe.f145495g = y27.getLong(0);
                        }
                        kn.a aVar = new kn.a(y27.getLong(0));
                        aVar.f390908f = y27.getLong(1);
                        java.lang.String m143722x9616526c = aVar.m143722x9616526c();
                        if (!activityC10368x68cc8efe.f145494f.containsKey(m143722x9616526c)) {
                            activityC10368x68cc8efe.f145494f.put(m143722x9616526c, aVar);
                        }
                        y27.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectDateUI", e17.toString());
            }
            y27.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectDateUI", "[prepareData] time:%s", (java.lang.System.currentTimeMillis() - currentTimeMillis) + "");
            activityC10368x68cc8efe.f145496h.mo50293x3498a0(new com.p314xaae8f345.mm.p648x55baa833.ui.kc(this));
        } catch (java.lang.Throwable th6) {
            y27.close();
            throw th6;
        }
    }
}
