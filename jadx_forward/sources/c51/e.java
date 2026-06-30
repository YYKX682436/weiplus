package c51;

/* loaded from: classes10.dex */
public abstract class e extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final d51.c f120166f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f120167g;

    /* renamed from: h, reason: collision with root package name */
    public final int f120168h;

    /* renamed from: i, reason: collision with root package name */
    public final int f120169i;

    /* renamed from: m, reason: collision with root package name */
    public final int f120170m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f120171n;

    public e(d51.c config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f120166f = config;
        this.f120167g = "PAGLoadTask";
        this.f120168h = 10000;
        this.f120169i = 10001;
        this.f120170m = 10002;
        this.f120171n = ".temp";
    }

    @Override // fp0.d
    public void a() {
        dn.j jVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load pag config:");
        d51.c cVar = this.f120166f;
        sb6.append(cVar);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f120167g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        java.lang.String str2 = cVar.f308057b;
        java.lang.String str3 = cVar.f308056a;
        java.lang.String str4 = str2 + this.f120171n;
        try {
            jVar = new dn.j();
            jVar.f323318d = "task_PagCdnDownloader";
            java.lang.String host = new java.net.URL(str3).getHost();
            int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, false, new java.util.ArrayList());
            int f18 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(host, true, new java.util.ArrayList());
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            jVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str3.getBytes());
            jVar.D1 = str3;
            jVar.E1 = host;
            jVar.G1 = str4;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.c();
            jVar.N1 = "";
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "attachPagTaskInfo mediaId:" + jVar.f69601xaca5bdda + " imageUrl:" + str3);
        } catch (java.net.MalformedURLException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "attachPagTaskInfo fail:" + e17);
            jVar = null;
        }
        if (jVar == null) {
            e(new c51.a(str2, this.f120168h));
            b(fp0.u.f346823f);
            return;
        }
        jVar.f323320f = new c51.d(this, str4, str2);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addRecvTask failed.");
        e(new c51.a(str2, this.f120169i));
        b(fp0.u.f346823f);
    }

    @Override // fp0.d
    public boolean c(fp0.d newTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newTask, "newTask");
        return false;
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f120166f.f308056a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        return a17;
    }

    public abstract void e(c51.c cVar);
}
