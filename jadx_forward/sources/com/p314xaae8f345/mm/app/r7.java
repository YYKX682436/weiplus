package com.p314xaae8f345.mm.app;

/* loaded from: classes9.dex */
public class r7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1145, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "onSceneEnd(GetServiceNotifyOptions), errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 1145) {
            k01.a1 a1Var = (k01.a1) ((k01.o0) m1Var);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = a1Var.f384534d;
            if ((((r45.tn3) oVar.f152243a.f152217a).f468118d & 1) == 0) {
                return;
            }
            boolean z17 = ((r45.un3) oVar.f152244b.f152233a).f469023d;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
            if (z17 != p17.o(u3Var, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "service notify message notice switch changed(to : %b)", java.lang.Boolean.valueOf(z17));
                c01.d9.b().p().x(u3Var, java.lang.Boolean.valueOf(z17));
                bn0.g.f104312a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z17);
                ((zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class)).O6(new java.lang.Object());
            }
            boolean z18 = ((r45.un3) a1Var.f384534d.f152244b.f152233a).f469025f;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
            if (z18 != p18.o(u3Var2, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "wxa custom session notify message notice switch changed(to : %b)", java.lang.Boolean.valueOf(z18));
                c01.d9.b().p().x(u3Var2, java.lang.Boolean.valueOf(z18));
                bn0.g.f104312a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
                ((zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class)).O6(new java.lang.Object());
            }
        }
    }
}
