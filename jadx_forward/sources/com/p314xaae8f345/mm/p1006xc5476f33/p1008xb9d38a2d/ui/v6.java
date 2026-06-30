package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public class v6 implements js.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155799a;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98) {
        this.f155799a = activityC11419x78fe9e98;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f155799a;
        if (str == null || str2 == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "gateway login account or pwd is null");
            activityC11419x78fe9e98.n7();
        } else {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(str, str2, 0, "", "", "", 0, "", false, true));
            activityC11419x78fe9e98.g7(true);
        }
    }
}
