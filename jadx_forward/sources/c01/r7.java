package c01;

/* loaded from: classes12.dex */
public class r7 {

    /* renamed from: a, reason: collision with root package name */
    public c01.n7 f118948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f118949b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f118950c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f118951d = new java.util.concurrent.ArrayBlockingQueue(80);

    /* renamed from: e, reason: collision with root package name */
    public c01.p7 f118952e = null;

    /* renamed from: f, reason: collision with root package name */
    public c01.o7 f118953f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f118954g;

    public r7(boolean z17, java.lang.String str) {
        this.f118948a = null;
        this.f118949b = false;
        this.f118950c = "";
        gm0.j1.i();
        this.f118954g = new c01.m7(this, gm0.j1.e().a());
        this.f118948a = null;
        this.f118949b = z17;
        this.f118950c = str;
    }

    public static void a(c01.r7 r7Var, long j17, long j18) {
        if (r7Var.f118949b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(86L, j17, j18, false);
        }
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = "";
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            if (parse != null && parse.getQueryParameter("wxtype") != null) {
                str2 = parse.getQueryParameter("wxtype").toLowerCase();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetPicService", e17, "parse image type error: %s", e17.getMessage());
        }
        java.lang.String str3 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.toLowerCase().contains("png")) ? str.toLowerCase().endsWith("gif") ? ".gif" : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG : ".png";
        if (gm0.j1.a()) {
            return g83.a.a() + "/reader_" + i17 + "_" + kk.k.g(str.getBytes()) + str3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPicService", "genFileName, account not ready");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D() + "/imagecache");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o() + "/reader_" + i17 + "_" + kk.k.g(str.getBytes()) + str3;
    }

    public java.lang.String c(java.lang.String str, int i17, int i18, java.lang.String str2) {
        java.util.concurrent.Future future;
        java.lang.String b17 = b(str, i17);
        try {
            if (com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                return b17;
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetPicService", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        try {
            ((java.util.concurrent.ArrayBlockingQueue) this.f118951d).add(new c01.q7(this, str, b17, i18, str2));
            c01.n7 n7Var = this.f118948a;
            if (n7Var != null) {
                java.util.concurrent.Future future2 = n7Var.f118879g;
                if ((future2 == null || future2.isDone()) ? false : true) {
                    return null;
                }
            }
            c01.n7 n7Var2 = this.f118948a;
            if (n7Var2 != null && (future = n7Var2.f118879g) != null) {
                future.cancel(false);
            }
            this.f118948a = new c01.n7(this);
            ((ku5.t0) ku5.t0.f394148d).g(this.f118948a);
            return null;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetPicService", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            return null;
        }
    }
}
