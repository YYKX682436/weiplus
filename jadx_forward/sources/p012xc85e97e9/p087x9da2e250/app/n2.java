package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f92948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.b f92949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.b3 f92951i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f92952m;

    public n2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702, boolean z17, x.b bVar, android.view.View view, p012xc85e97e9.p087x9da2e250.app.b3 b3Var, android.graphics.Rect rect) {
        this.f92946d = componentCallbacksC1101xa17d4670;
        this.f92947e = componentCallbacksC1101xa17d46702;
        this.f92948f = z17;
        this.f92949g = bVar;
        this.f92950h = view;
        this.f92951i = b3Var;
        this.f92952m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.r2.c(this.f92946d, this.f92947e, this.f92948f, this.f92949g, false);
        android.view.View view = this.f92950h;
        if (view != null) {
            this.f92951i.i(view, this.f92952m);
        }
    }
}
