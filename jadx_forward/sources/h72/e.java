package h72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f360958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f360960i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f360961m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f360962n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h72.s f360963o;

    public e(h72.s sVar, int i17, int i18, int i19, boolean z17, int i27, boolean z18, int i28, int i29) {
        this.f360963o = sVar;
        this.f360955d = i17;
        this.f360956e = i18;
        this.f360957f = i19;
        this.f360958g = z17;
        this.f360959h = i27;
        this.f360960i = z18;
        this.f360961m = i28;
        this.f360962n = i29;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar;
        this.f360963o.j("MicroMsg.FaceVideoRecorder", "hy: initRecorder runnable exec.", new java.lang.Object[0]);
        int i17 = this.f360955d;
        if (i17 == 90 || i17 == 270) {
            this.f360963o.j("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down", new java.lang.Object[0]);
            h72.s sVar2 = this.f360963o;
            sVar2.f361009j = this.f360956e;
            sVar2.f361010k = this.f360957f;
        } else {
            h72.s sVar3 = this.f360963o;
            sVar3.f361009j = this.f360957f;
            sVar3.f361010k = this.f360956e;
        }
        synchronized (this.f360963o.f361001b) {
            sVar = this.f360963o;
            sVar.f361004e = this.f360955d;
            sVar.f361005f = this.f360958g;
            sVar.f361006g = this.f360959h;
        }
        h72.s.a(sVar);
        h72.s.b(this.f360963o);
        h72.s.c(this.f360963o);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.f360963o.j("MicroMsg.FaceVideoRecorder", "hy: not init.", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h72.b(this));
            return;
        }
        synchronized (this.f360963o.f361001b) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            h72.s sVar4 = this.f360963o;
            sVar4.f361000a = sVar4.f361014o.a();
            h72.s sVar5 = this.f360963o;
            sVar5.f361000a.f(sVar5.f361011l);
            h72.s sVar6 = this.f360963o;
            sVar6.f361000a.w(sVar6.f361012m);
            this.f360963o.f361000a.v(this.f360960i);
            h72.s sVar7 = this.f360963o;
            sVar7.f361000a.r(sVar7.f361009j, sVar7.f361010k, this.f360961m, this.f360962n);
            this.f360963o.f361000a.mo127749x764d819b(true);
            h72.s sVar8 = this.f360963o;
            sVar8.f361000a.k(sVar8.f361004e);
            h72.s sVar9 = this.f360963o;
            sVar9.f361000a.u(sVar9.f361016q);
            h72.s sVar10 = this.f360963o;
            sVar10.f361003d = h72.q.INITIALIZED;
            sVar10.j("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
