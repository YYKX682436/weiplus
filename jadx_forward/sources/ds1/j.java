package ds1;

/* loaded from: classes7.dex */
public final class j extends nu4.c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f324378i = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f324379c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f324380d;

    /* renamed from: e, reason: collision with root package name */
    public final mu4.x0 f324381e = new mu4.x0(1477);

    /* renamed from: f, reason: collision with root package name */
    public final mu4.h0 f324382f = new mu4.h0(1696, mu4.g0.f412946f);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f324383g = "__Game_Prefetcher_FakeAppId";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f324384h = "GameWebPrefetcher";

    static {
        new ds1.d(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initGameWebPrefetcherJsEngineInterceptor open: true");
    }

    @Override // nu4.c0
    public boolean a(int i17, java.lang.String str, yz5.l onCompleted) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCompleted, "onCompleted");
        if (i17 != 2) {
            return false;
        }
        if (this.f324379c != null) {
            onCompleted.mo146xb9724478(java.lang.Boolean.TRUE);
            return true;
        }
        this.f324379c = c().t0();
        java.lang.String contextName = this.f324384h;
        java.lang.String appId = this.f324383g;
        mu4.x0 x0Var = this.f324381e;
        mu4.h0 h0Var = this.f324382f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext for game");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = this.f324379c;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "initJsContext not created");
            onCompleted.mo146xb9724478(java.lang.Boolean.FALSE);
            return true;
        }
        try {
            ds1.a aVar = new ds1.a(new ds1.e());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar2 = this.f324379c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar2);
            aVar.a(rVar2);
            x0Var.a(new mu4.k0());
            h0Var.a(new mu4.d0());
            try {
                rVar.mo14673x29497b66(new ds1.g(rVar, this));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameWebPrefetcherJsEngineInterceptor", e17, "setJsExceptionHandler", new java.lang.Object[0]);
                h0Var.a(new mu4.z());
                java.lang.String message = e17.getMessage();
                jx3.f.INSTANCE.d(20821, appId, contextName, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                onCompleted.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            fs1.k kVar = fs1.k.f347829f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextName, "contextName");
            fs1.j.f347827g = appId;
            fs1.j.f347828h = contextName;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar3 = this.f324379c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar3);
            fs1.k.h(rVar3, str, new ds1.i(this, onCompleted), h0Var);
            x0Var.a(new mu4.l0());
            h0Var.a(new mu4.e0());
            return true;
        } catch (java.lang.Exception e18) {
            x0Var.a(new mu4.i0());
            h0Var.a(new mu4.y());
            java.lang.String message2 = e18.getMessage();
            jx3.f.INSTANCE.d(20821, appId, contextName, message2 != null ? r26.i0.u(message2, ',', '.', false, 4, null) : null);
            onCompleted.mo146xb9724478(java.lang.Boolean.FALSE);
            return true;
        }
    }

    @Override // nu4.c0
    public boolean b(java.lang.String str, java.lang.String str2, java.lang.String event, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        if ((str2 == null || hy4.i.i(str2)) ? false : true) {
            return false;
        }
        if (!this.f324380d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "dispatchEvent jsContext not init url: " + str2 + ", event: " + event);
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event, "urlExposed")) {
            ((ku5.t0) ku5.t0.f394148d).h(new ds1.c(new ds1.f(this, str2)), "MicroMsg.GameWebPrefetcherJsEngineInterceptor");
            return true;
        }
        if (str3 == null) {
            str3 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
        od.l lVar = fs1.j.f347826f;
        if (lVar != null) {
            lVar.f426051c.a(new od.d(event, jSONObject));
        }
        return true;
    }
}
