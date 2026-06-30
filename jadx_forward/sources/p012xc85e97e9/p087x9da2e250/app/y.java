package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class y extends p012xc85e97e9.p087x9da2e250.app.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f93046d;

    public y(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f93046d = componentCallbacksC1101xa17d4670;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public android.view.View b(int i17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f93046d;
        android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
        if (view != null) {
            return view.findViewById(i17);
        }
        throw new java.lang.IllegalStateException("Fragment " + componentCallbacksC1101xa17d4670 + " does not have a view");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public boolean c() {
        return this.f93046d.f3462x628b0b2 != null;
    }
}
