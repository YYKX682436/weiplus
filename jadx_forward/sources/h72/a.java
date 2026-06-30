package h72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f360949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.b f360950e;

    public a(h72.b bVar, long j17) {
        this.f360950e = bVar;
        this.f360949d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f360950e.f360951d.f360963o.f361001b) {
            h72.s sVar = this.f360950e.f360951d.f360963o;
            long j17 = this.f360949d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            h72.s sVar2 = this.f360950e.f360951d.f360963o;
            sVar2.f361000a = sVar2.f361014o.a();
            h72.s sVar3 = this.f360950e.f360951d.f360963o;
            sVar3.f361000a.f(sVar3.f361011l);
            h72.s sVar4 = this.f360950e.f360951d.f360963o;
            sVar4.f361000a.w(sVar4.f361012m);
            h72.e eVar = this.f360950e.f360951d;
            eVar.f360963o.f361000a.v(eVar.f360960i);
            h72.e eVar2 = this.f360950e.f360951d;
            h72.s sVar5 = eVar2.f360963o;
            sVar5.f361000a.r(sVar5.f361009j, sVar5.f361010k, eVar2.f360961m, eVar2.f360962n);
            this.f360950e.f360951d.f360963o.f361000a.mo127749x764d819b(true);
            h72.s sVar6 = this.f360950e.f360951d.f360963o;
            sVar6.f361000a.k(sVar6.f361004e);
            h72.s sVar7 = this.f360950e.f360951d.f360963o;
            sVar7.f361000a.u(sVar7.f361016q);
            h72.s sVar8 = this.f360950e.f360951d.f360963o;
            sVar8.f361003d = h72.q.INITIALIZED;
            sVar8.j("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
