package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.p2 f92900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3.h f92902f;

    public j2(p012xc85e97e9.p087x9da2e250.app.p2 p2Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, j3.h hVar) {
        this.f92900d = p2Var;
        this.f92901e = componentCallbacksC1101xa17d4670;
        this.f92902f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        j3.h hVar = this.f92902f;
        p012xc85e97e9.p087x9da2e250.app.d1 d1Var = (p012xc85e97e9.p087x9da2e250.app.d1) this.f92900d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92901e;
        d1Var.getClass();
        synchronized (hVar) {
            z17 = hVar.f378866a;
        }
        if (z17) {
            return;
        }
        d1Var.f92834a.m7711x134df12f(componentCallbacksC1101xa17d4670, hVar);
    }
}
