package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.b3 f92969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.b f92970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f92971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.q2 f92972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92974i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f92977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92978p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f92979q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f92980r;

    public o2(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, x.b bVar, java.lang.Object obj, p012xc85e97e9.p087x9da2e250.app.q2 q2Var, java.util.ArrayList arrayList, android.view.View view, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702, boolean z17, java.util.ArrayList arrayList2, java.lang.Object obj2, android.graphics.Rect rect) {
        this.f92969d = b3Var;
        this.f92970e = bVar;
        this.f92971f = obj;
        this.f92972g = q2Var;
        this.f92973h = arrayList;
        this.f92974i = view;
        this.f92975m = componentCallbacksC1101xa17d4670;
        this.f92976n = componentCallbacksC1101xa17d46702;
        this.f92977o = z17;
        this.f92978p = arrayList2;
        this.f92979q = obj2;
        this.f92980r = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var = this.f92969d;
        x.b bVar = this.f92970e;
        java.lang.Object obj = this.f92971f;
        p012xc85e97e9.p087x9da2e250.app.q2 q2Var = this.f92972g;
        x.b d17 = p012xc85e97e9.p087x9da2e250.app.r2.d(b3Var, bVar, obj, q2Var);
        java.util.ArrayList arrayList = this.f92973h;
        if (d17 != null) {
            arrayList.addAll(d17.values());
            arrayList.add(this.f92974i);
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92976n;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f92975m;
        boolean z17 = this.f92977o;
        p012xc85e97e9.p087x9da2e250.app.r2.c(componentCallbacksC1101xa17d46702, componentCallbacksC1101xa17d4670, z17, d17, false);
        if (obj != null) {
            b3Var.w(obj, this.f92978p, arrayList);
            android.view.View h17 = p012xc85e97e9.p087x9da2e250.app.r2.h(d17, q2Var, this.f92979q, z17);
            if (h17 != null) {
                b3Var.i(h17, this.f92980r);
            }
        }
    }
}
