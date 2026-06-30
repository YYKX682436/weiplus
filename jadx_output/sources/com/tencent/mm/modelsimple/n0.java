package com.tencent.mm.modelsimple;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f71375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.o0 f71376f;

    public n0(com.tencent.mm.modelsimple.o0 o0Var, java.lang.String str, boolean z17) {
        this.f71376f = o0Var;
        this.f71374d = str;
        this.f71375e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f71374d;
        objArr[0] = java.lang.Integer.valueOf(str == null ? -1 : str.length());
        boolean z17 = this.f71375e;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo broadcastEvent content len[%d], cache[%b]", objArr);
        com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
        am.c1 c1Var = broadcastEvent.f54012g;
        c1Var.f6298a = 5;
        c1Var.f6299b = str;
        broadcastEvent.e();
        am.d1 d1Var = broadcastEvent.f54013h;
        java.lang.String str2 = d1Var.f6425f;
        int i17 = d1Var.f6426g;
        int i18 = d1Var.f6423d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        com.tencent.mm.modelsimple.o0 o0Var = this.f71376f;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(o0Var.f71386f);
        java.util.Map map = com.tencent.mm.modelsimple.o0.f71382h;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd event.result.Actionp[%d] noticeId[%s], position[%d], manualauthSucc[%b], noticeidTickMap[%s]", valueOf, str2, valueOf2, valueOf3, map);
        if (i17 != 1 || i18 != 6) {
            if (i18 == 2) {
                if (z17) {
                    com.tencent.mm.modelsimple.o0.H(o0Var, str2, str);
                }
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                ((java.util.HashMap) map).put(str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        if (z17) {
            com.tencent.mm.modelsimple.o0.H(o0Var, str2, str);
        }
        if (o0Var.f71386f) {
            java.lang.String str3 = d1Var.f6422c;
            java.lang.String str4 = d1Var.f6421b;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after init[%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.f193073c));
            if (o0Var.f71387g == null) {
                o0Var.f71387g = new com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1$1(this, com.tencent.mm.app.a0.f53288d, str3, str4);
            }
            o0Var.f71387g.alive();
        } else {
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent = new com.tencent.mm.autogen.events.LoginDisasterEvent();
            java.lang.String str5 = d1Var.f6422c;
            am.gj gjVar = loginDisasterEvent.f54483g;
            gjVar.f6768a = str5;
            gjVar.f6769b = d1Var.f6421b;
            loginDisasterEvent.e();
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((java.util.HashMap) map).put(str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }
}
