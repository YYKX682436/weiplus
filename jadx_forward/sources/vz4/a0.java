package vz4;

/* loaded from: classes8.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f523246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f523247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vz4.j f523250h;

    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, java.lang.String str2, vz4.j jVar) {
        this.f523246d = h0Var;
        this.f523247e = c0Var;
        this.f523248f = str;
        this.f523249g = str2;
        this.f523250h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.b((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c) this.f523246d.f391656d);
        vz4.d0 d0Var = vz4.d0.f523262a;
        java.lang.Object obj = vz4.d0.f523263b;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f523247e;
        java.lang.String str = this.f523248f;
        java.lang.String str2 = this.f523249g;
        vz4.j jVar = this.f523250h;
        synchronized (obj) {
            if (!c0Var.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,download time out pkgId = " + str + " appId = " + str2);
                c0Var.f391645d = true;
                jVar.a("download time out");
            }
        }
    }
}
