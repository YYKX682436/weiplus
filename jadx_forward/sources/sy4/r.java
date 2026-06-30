package sy4;

/* loaded from: classes15.dex */
public abstract class r {
    public static void a(java.lang.String str, int i17, boolean z17) {
        sy4.q qVar = new sy4.q();
        qVar.f495424a = str;
        qVar.f495426c = i17;
        qVar.f495427d = java.lang.System.currentTimeMillis();
        qVar.f495425b = sy4.m.f495417c.b(str).f66653x29106093;
        qVar.f495428e = z17;
        b(qVar);
    }

    public static void b(sy4.q qVar) {
        if (qVar != null) {
            m21.x xVar = new m21.x();
            xVar.a("expid", qVar.f495425b + ",");
            xVar.a("appid", qVar.f495424a + ",");
            xVar.a("action", qVar.f495426c + ",");
            xVar.a(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, qVar.f495427d + ",");
            xVar.a("hasRedPoint", (qVar.f495428e ? 1 : 0) + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report ");
            sb6.append(xVar.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WelabReporter", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14206, xVar);
        }
    }
}
