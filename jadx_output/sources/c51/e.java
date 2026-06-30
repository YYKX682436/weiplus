package c51;

/* loaded from: classes10.dex */
public abstract class e extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final d51.c f38633f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f38634g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38635h;

    /* renamed from: i, reason: collision with root package name */
    public final int f38636i;

    /* renamed from: m, reason: collision with root package name */
    public final int f38637m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f38638n;

    public e(d51.c config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f38633f = config;
        this.f38634g = "PAGLoadTask";
        this.f38635h = 10000;
        this.f38636i = 10001;
        this.f38637m = 10002;
        this.f38638n = ".temp";
    }

    @Override // fp0.d
    public void a() {
        dn.j jVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load pag config:");
        d51.c cVar = this.f38633f;
        sb6.append(cVar);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f38634g;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.lang.String str2 = cVar.f226524b;
        java.lang.String str3 = cVar.f226523a;
        java.lang.String str4 = str2 + this.f38638n;
        try {
            jVar = new dn.j();
            jVar.f241785d = "task_PagCdnDownloader";
            java.lang.String host = new java.net.URL(str3).getHost();
            int f17 = com.tencent.mm.network.n.f(host, false, new java.util.ArrayList());
            int f18 = com.tencent.mm.network.n.f(host, true, new java.util.ArrayList());
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            jVar.field_mediaId = com.tencent.mm.sdk.platformtools.w2.b(str3.getBytes());
            jVar.D1 = str3;
            jVar.E1 = host;
            jVar.G1 = str4;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + com.tencent.mm.sdk.platformtools.v0.f193027a.c();
            jVar.N1 = "";
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.tencent.mars.xlog.Log.i(str, "attachPagTaskInfo mediaId:" + jVar.field_mediaId + " imageUrl:" + str3);
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w(str, "attachPagTaskInfo fail:" + e17);
            jVar = null;
        }
        if (jVar == null) {
            e(new c51.a(str2, this.f38635h));
            b(fp0.u.f265290f);
            return;
        }
        jVar.f241787f = new c51.d(this, str4, str2);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "addRecvTask failed.");
        e(new c51.a(str2, this.f38636i));
        b(fp0.u.f265290f);
    }

    @Override // fp0.d
    public boolean c(fp0.d newTask) {
        kotlin.jvm.internal.o.g(newTask, "newTask");
        return false;
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(this.f38633f.f226523a);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public abstract void e(c51.c cVar);
}
