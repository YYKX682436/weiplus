package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes8.dex */
public class ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 f145578d;

    public ae(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60) {
        this.f145578d = activityC10375x35d0ae60;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60 = this.f145578d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10375x35d0ae60.f145537i) && c01.z1.J(activityC10375x35d0ae60.f145537i)) {
            activityC10375x35d0ae60.f145538m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().r7(activityC10375x35d0ae60.f145536h);
        } else if (!c01.z1.J(activityC10375x35d0ae60.f145537i)) {
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            final java.lang.String str = activityC10375x35d0ae60.f145536h;
            final java.lang.String str2 = activityC10375x35d0ae60.f145537i;
            final java.lang.String X8 = cj6.X8(str);
            final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
            if (cj6.Da(X8)) {
                i17 = ot0.c3.l().d("getMsgCountByMember", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h4
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Integer.valueOf(ot0.z2.f430355a.V0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, m07));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$i4
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        android.database.Cursor f17 = g9Var.f275522r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.P0(m07) + g9Var.Z8(str) + "AND content LIKE '" + str2 + "%' ", null, 2);
                        int i18 = 0;
                        try {
                            try {
                                if (f17.moveToFirst()) {
                                    i18 = f17.getInt(0);
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                            }
                            f17.close();
                            return java.lang.Integer.valueOf(i18);
                        } catch (java.lang.Throwable th6) {
                            f17.close();
                            throw th6;
                        }
                    }
                });
            } else if (cj6.Pb(X8)) {
                i17 = ot0.z2.f430355a.V0(cj6.f275522r, X8, str, m07);
            } else {
                android.database.Cursor f17 = cj6.f275522r.f(" SELECT COUNT(*) FROM " + X8 + " WHERE" + cj6.P0(m07) + cj6.Z8(str) + "AND content LIKE '" + str2 + "%' ", null, 2);
                try {
                    try {
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                    }
                    if (f17.moveToFirst()) {
                        i17 = f17.getInt(0);
                    }
                    i17 = 0;
                } finally {
                    f17.close();
                }
            }
            activityC10375x35d0ae60.f145538m = i17;
        }
        if (activityC10375x35d0ae60.isFinishing() || activityC10375x35d0ae60.isDestroyed()) {
            return;
        }
        activityC10375x35d0ae60.runOnUiThread(new com.p314xaae8f345.mm.p648x55baa833.ui.zd(this));
    }
}
