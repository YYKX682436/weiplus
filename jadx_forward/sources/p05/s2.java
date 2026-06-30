package p05;

/* loaded from: classes5.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.s2 f432220a = new p05.s2();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.q87 q87Var = (r45.q87) fVar.f152151d;
        java.lang.String str = p05.v2.f432238e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "CgiWeVisGetDeviceScore: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadDeviceScore resp: runScore: ");
            sb6.append(q87Var.f465298e);
            sb6.append(", size:");
            java.util.LinkedList<r45.o87> linkedList = q87Var.f465297d;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            for (r45.o87 o87Var : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p05.v2.f432238e, "resp: cpu:" + o87Var.f463572d + ", gpu:" + o87Var.f463573e);
            }
            p05.v2 v2Var = p05.v2.f432237d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = v2Var.Bi();
            p05.p3 p3Var = p05.p3.f432172a;
            Bi.G("need_run_score", java.lang.Boolean.parseBoolean(q87Var.f465298e));
            v2Var.Bi().B("score_cgi_time", java.lang.System.currentTimeMillis());
            r45.o87 o87Var2 = (r45.o87) kz5.n0.Z(linkedList);
            if (o87Var2 != null) {
                v2Var.Bi().z("cpu_score", o87Var2.f463572d);
                v2Var.Bi().z("gpu_score", o87Var2.f463573e);
            }
        }
        return jz5.f0.f384359a;
    }
}
