package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.n0 f92924d;

    public m0(p012xc85e97e9.p087x9da2e250.app.n0 n0Var) {
        this.f92924d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        p012xc85e97e9.p087x9da2e250.app.n0 n0Var = this.f92924d;
        if (n0Var.f92943b.m7434x34514fb6() != null) {
            n0Var.f92943b.m7559xc727b62a(null);
            p012xc85e97e9.p087x9da2e250.app.p2 p2Var = n0Var.f92944c;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = n0Var.f92943b;
            j3.h hVar = n0Var.f92945d;
            p012xc85e97e9.p087x9da2e250.app.d1 d1Var = (p012xc85e97e9.p087x9da2e250.app.d1) p2Var;
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
}
