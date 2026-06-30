package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class v1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appTask, "appTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.y1 y1Var = (android.os.Build.VERSION.SDK_INT < 29 || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156626h) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156625g ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.z1.f156890b : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156624f ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.b2.f156554b : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.c2.f156563b : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.a2.f156539b;
        java.lang.Integer Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d, appTask);
        if (Ai != null) {
            int intValue = Ai.intValue();
            x.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156633r;
            synchronized (dVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "zombieTask ignored Task Ids " + kz5.n0.g0(dVar, null, null, null, 0, null, null, 63, null) + " -> " + intValue);
                if (dVar.contains(java.lang.Integer.valueOf(intValue))) {
                    return false;
                }
                z17 = false;
            }
        } else {
            z17 = false;
        }
        if (y1Var.a(appTask) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d2.f156582b.a(appTask)) {
            return true;
        }
        return z17;
    }
}
