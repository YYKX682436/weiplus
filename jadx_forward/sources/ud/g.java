package ud;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f508100a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f508101b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f508102c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.a f508103d;

    /* renamed from: e, reason: collision with root package name */
    public final ud.d f508104e;

    public g(android.content.Context androidContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(androidContext, "androidContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        this.f508100a = androidContext;
        this.f508101b = jsRuntime;
        this.f508103d = new com.p314xaae8f345.p485x5dc4f1ad.a();
        this.f508104e = new ud.d(new ud.e(this));
    }

    public final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        d(this.f508103d);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad h17 = this.f508103d.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        synchronized (this) {
            if (!(this.f508102c == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            this.f508102c = h17;
        }
        e(h17, android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        return h17;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrush", "destroy");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) this.f508101b.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f508104e);
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        wd.g.f526217a.a(this.f508102c, runtime, true);
    }

    public void d(com.p314xaae8f345.p485x5dc4f1ad.a builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        builder.f130132a = this.f508100a;
        float f17 = ik1.w.f();
        f06.v[] vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
        builder.f130135d.b(builder, vVarArr[0], java.lang.Float.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar = this.f508101b;
        builder.f130134c = new ud.f((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("JsRuntime don't support JsThread addon".toString());
        }
        builder.f130133b = new ud.a(f0Var);
        yg.f0 imageHandler = builder.f130139h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageHandler, "$this$imageHandler");
        imageHandler.f543588a = true;
        imageHandler.f543590c = new wd.f(14883);
        imageHandler.f543591d = null;
        java.lang.String D = lp0.b.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "DATAROOT_SDCARD_PATH(...)");
        builder.f130148q.b(builder, vVarArr[8], D);
    }

    public void e(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad magicbrush, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicbrush, "magicbrush");
    }
}
