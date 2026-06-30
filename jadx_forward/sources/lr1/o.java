package lr1;

/* loaded from: classes8.dex */
public abstract class o {
    public static r45.e64 a() {
        try {
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(67591, null);
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, lbsContent is null!");
                return null;
            }
            r45.e64 e64Var = new r45.e64();
            java.lang.String[] split = str.split(",");
            e64Var.f454581f = java.lang.Integer.valueOf(split[0]).intValue();
            e64Var.f454584i = java.lang.Integer.valueOf(split[1]).intValue();
            e64Var.f454580e = java.lang.Integer.valueOf(split[2]).intValue() / 1000000.0f;
            e64Var.f454579d = java.lang.Integer.valueOf(split[3]).intValue() / 1000000.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is not null, %f, %f", java.lang.Float.valueOf(e64Var.f454580e), java.lang.Float.valueOf(e64Var.f454579d));
            return e64Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, reason %s", e17.getMessage());
            return null;
        }
    }
}
