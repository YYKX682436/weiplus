package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class s1 implements p012xc85e97e9.p087x9da2e250.app.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93004a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.a f93005b;

    /* renamed from: c, reason: collision with root package name */
    public int f93006c;

    public s1(p012xc85e97e9.p087x9da2e250.app.a aVar, boolean z17) {
        this.f93004a = z17;
        this.f93005b = aVar;
    }

    public void a() {
        boolean z17 = this.f93006c > 0;
        p012xc85e97e9.p087x9da2e250.app.a aVar = this.f93005b;
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : aVar.f92782r.m7675x1626d96d()) {
            componentCallbacksC1101xa17d4670.m7573x490a11e0(null);
            if (z17 && componentCallbacksC1101xa17d4670.m7488xbe8d7484()) {
                componentCallbacksC1101xa17d4670.m7590xd7835c61();
            }
        }
        aVar.f92782r.m7634xb663bfc(aVar, this.f93004a, !z17, true);
    }
}
