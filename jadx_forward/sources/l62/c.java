package l62;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static l62.c f398297a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f398298b;

    static {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f398298b = new java.util.HashSet();
        for (e42.d0 d0Var : e42.d0.m126922xcee59d22()) {
            f398298b.add(d0Var.name());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptMMKV", "get mulit expt enum cost time [%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public static l62.c b() {
        if (f398297a == null) {
            f398297a = new l62.c();
        }
        return f398297a;
    }

    public final boolean a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ExptMMKV", "%s only mm process can write expt info", d());
        return false;
    }

    public java.lang.String c(e42.d0 d0Var, java.lang.String str, boolean z17) {
        return j62.e.g().a(d0Var.name(), str, z17, true);
    }

    public final java.lang.String d() {
        return hashCode() + "";
    }
}
