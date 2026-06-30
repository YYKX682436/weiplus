package com.tencent.mm.app;

/* loaded from: classes9.dex */
public class r7 implements com.tencent.mm.modelbase.u0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1145, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "onSceneEnd(GetServiceNotifyOptions), errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && m1Var.getType() == 1145) {
            k01.a1 a1Var = (k01.a1) ((k01.o0) m1Var);
            com.tencent.mm.modelbase.o oVar = a1Var.f303001d;
            if ((((r45.tn3) oVar.f70710a.f70684a).f386585d & 1) == 0) {
                return;
            }
            boolean z17 = ((r45.un3) oVar.f70711b.f70700a).f387490d;
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
            if (z17 != p17.o(u3Var, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "service notify message notice switch changed(to : %b)", java.lang.Boolean.valueOf(z17));
                c01.d9.b().p().x(u3Var, java.lang.Boolean.valueOf(z17));
                bn0.g.f22779a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z17);
                ((zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class)).O6(new java.lang.Object());
            }
            boolean z18 = ((r45.un3) a1Var.f303001d.f70711b.f70700a).f387492f;
            com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
            if (z18 != p18.o(u3Var2, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "wxa custom session notify message notice switch changed(to : %b)", java.lang.Boolean.valueOf(z18));
                c01.d9.b().p().x(u3Var2, java.lang.Boolean.valueOf(z18));
                bn0.g.f22779a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
                ((zr.c) com.tencent.mm.sdk.event.q.f192403a.a(zr.c.class)).O6(new java.lang.Object());
            }
        }
    }
}
