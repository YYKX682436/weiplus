package c01;

/* loaded from: classes12.dex */
public class r7 {

    /* renamed from: a, reason: collision with root package name */
    public c01.n7 f37415a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37416b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f37417c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f37418d = new java.util.concurrent.ArrayBlockingQueue(80);

    /* renamed from: e, reason: collision with root package name */
    public c01.p7 f37419e = null;

    /* renamed from: f, reason: collision with root package name */
    public c01.o7 f37420f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f37421g;

    public r7(boolean z17, java.lang.String str) {
        this.f37415a = null;
        this.f37416b = false;
        this.f37417c = "";
        gm0.j1.i();
        this.f37421g = new c01.m7(this, gm0.j1.e().a());
        this.f37415a = null;
        this.f37416b = z17;
        this.f37417c = str;
    }

    public static void a(c01.r7 r7Var, long j17, long j18) {
        if (r7Var.f37416b) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(86L, j17, j18, false);
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetPicService", e17, "parse image type error: %s", e17.getMessage());
        }
        java.lang.String str3 = (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.toLowerCase().contains("png")) ? str.toLowerCase().endsWith("gif") ? ".gif" : com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG : ".png";
        if (gm0.j1.a()) {
            return g83.a.a() + "/reader_" + i17 + "_" + kk.k.g(str.getBytes()) + str3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPicService", "genFileName, account not ready");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D() + "/imagecache");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o() + "/reader_" + i17 + "_" + kk.k.g(str.getBytes()) + str3;
    }

    public java.lang.String c(java.lang.String str, int i17, int i18, java.lang.String str2) {
        java.util.concurrent.Future future;
        java.lang.String b17 = b(str, i17);
        try {
            if (com.tencent.mm.vfs.w6.j(b17)) {
                return b17;
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GetPicService", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        try {
            ((java.util.concurrent.ArrayBlockingQueue) this.f37418d).add(new c01.q7(this, str, b17, i18, str2));
            c01.n7 n7Var = this.f37415a;
            if (n7Var != null) {
                java.util.concurrent.Future future2 = n7Var.f37346g;
                if ((future2 == null || future2.isDone()) ? false : true) {
                    return null;
                }
            }
            c01.n7 n7Var2 = this.f37415a;
            if (n7Var2 != null && (future = n7Var2.f37346g) != null) {
                future.cancel(false);
            }
            this.f37415a = new c01.n7(this);
            ((ku5.t0) ku5.t0.f312615d).g(this.f37415a);
            return null;
        } catch (java.lang.Exception e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GetPicService", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            return null;
        }
    }
}
