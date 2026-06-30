package um;

/* loaded from: classes12.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f510223a = new java.util.HashMap();

    public static java.lang.Object a(um.o oVar, java.lang.String str, java.lang.Object obj) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ICacheService.Factory", "null service");
            return obj;
        }
        try {
            return ((jt0.i) ((m11.q0) oVar).f404302d).get(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ICacheService.Factory", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return obj;
        }
    }

    public static um.o b(java.lang.String str) {
        um.o oVar = (um.o) ((java.util.HashMap) f510223a).get(str);
        if (oVar != null) {
            return oVar;
        }
        fs.q g17 = fs.g.g(um.p.class, str);
        if (g17 != null) {
            return (um.o) g17.get();
        }
        return null;
    }
}
