package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.o0 f152909f;

    public n0(com.p314xaae8f345.mm.p957x53236a1b.o0 o0Var, java.lang.String str, boolean z17) {
        this.f152909f = o0Var;
        this.f152907d = str;
        this.f152908e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f152907d;
        objArr[0] = java.lang.Integer.valueOf(str == null ? -1 : str.length());
        boolean z17 = this.f152908e;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo broadcastEvent content len[%d], cache[%b]", objArr);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
        am.c1 c1Var = c5206xdf10b679.f135545g;
        c1Var.f87831a = 5;
        c1Var.f87832b = str;
        c5206xdf10b679.e();
        am.d1 d1Var = c5206xdf10b679.f135546h;
        java.lang.String str2 = d1Var.f87958f;
        int i17 = d1Var.f87959g;
        int i18 = d1Var.f87956d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p957x53236a1b.o0 o0Var = this.f152909f;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(o0Var.f152919f);
        java.util.Map map = com.p314xaae8f345.mm.p957x53236a1b.o0.f152915h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd event.result.Actionp[%d] noticeId[%s], position[%d], manualauthSucc[%b], noticeidTickMap[%s]", valueOf, str2, valueOf2, valueOf3, map);
        if (i17 != 1 || i18 != 6) {
            if (i18 == 2) {
                if (z17) {
                    com.p314xaae8f345.mm.p957x53236a1b.o0.H(o0Var, str2, str);
                }
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                ((java.util.HashMap) map).put(str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.p957x53236a1b.o0.H(o0Var, str2, str);
        }
        if (o0Var.f152919f) {
            java.lang.String str3 = d1Var.f87955c;
            java.lang.String str4 = d1Var.f87954b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after init[%b]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274606c));
            if (o0Var.f152920g == null) {
                o0Var.f152920g = new com.p314xaae8f345.mm.p957x53236a1b.C11134x7f65bf70(this, com.p314xaae8f345.mm.app.a0.f134821d, str3, str4);
            }
            o0Var.f152920g.mo48813x58998cd();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370();
            java.lang.String str5 = d1Var.f87955c;
            am.gj gjVar = c5690x46542370.f136016g;
            gjVar.f88301a = str5;
            gjVar.f88302b = d1Var.f87954b;
            c5690x46542370.e();
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((java.util.HashMap) map).put(str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }
}
