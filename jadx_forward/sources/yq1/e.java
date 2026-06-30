package yq1;

/* loaded from: classes11.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        java.util.LinkedList linkedList = bs1.a.a().f455987d;
        r45.hm6 hm6Var = linkedList != null ? (r45.hm6) linkedList.getFirst() : null;
        if (hm6Var == null) {
            return;
        }
        java.lang.String str = "export/xxx" + java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        r45.lk lkVar = new r45.lk();
        lkVar.f461066d = hm6Var.f457828d;
        lkVar.f461067e = str;
        lkVar.f461068f = 20;
        b0Var.x(lkVar);
        b0Var.y(hm6Var.f457828d, str);
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Success!", 1).show();
        ((ku5.t0) ku5.t0.f394148d).h(yq1.c.f545958d, "BizFlutterDigestHelper");
    }

    public final void b() {
        if (!yq1.j.f545970c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
            return;
        }
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Success! WeChat will kill self in 1 second...", 1).show();
        ku5.u0 u0Var = ku5.t0.f394148d;
        yq1.d dVar = yq1.d.f545959d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dVar, 1000L, false);
    }
}
