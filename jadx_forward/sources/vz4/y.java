package vz4;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f523306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz4.j f523309g;

    public y(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, java.lang.String str2, vz4.j jVar) {
        this.f523306d = c0Var;
        this.f523307e = str;
        this.f523308f = str2;
        this.f523309g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vz4.d0 d0Var = vz4.d0.f523262a;
        java.lang.Object obj = vz4.d0.f523263b;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f523306d;
        java.lang.String str = this.f523307e;
        java.lang.String str2 = this.f523308f;
        vz4.j jVar = this.f523309g;
        synchronized (obj) {
            if (!c0Var.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,check time out pkgId = " + str + " appId = " + str2);
                c0Var.f391645d = true;
                jVar.a("check time out");
            }
        }
    }
}
