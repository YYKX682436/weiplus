package ss3;

/* loaded from: classes9.dex */
public abstract class q {
    public static boolean a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, c01.ta taVar, int i17) {
        if (c5303xc75d2f73 == null || taVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
            if (c5303xc75d2f73 == null) {
                return false;
            }
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        jq0Var.e("newsapp");
        jq0Var.j(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(1);
        jq0Var.c(taVar.f119009i);
        jq0Var.f459579s = taVar.f119016p + "";
        jq0Var.f459580t = true;
        jq0Var.f(taVar.h());
        jq0Var.B = "newsapp";
        jq0Var.C = true;
        gp0Var.K0(taVar.h());
        gp0Var.O0(taVar.f());
        gp0Var.m0(taVar.d());
        gp0Var.o0(taVar.c());
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        java.lang.String f17 = taVar.f();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87852e = f17;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 5;
        return true;
    }
}
