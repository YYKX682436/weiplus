package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f92925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.b3 f92926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92930i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92931m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f92932n;

    public m2(java.lang.Object obj, p012xc85e97e9.p087x9da2e250.app.b3 b3Var, android.view.View view, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.lang.Object obj2) {
        this.f92925d = obj;
        this.f92926e = b3Var;
        this.f92927f = view;
        this.f92928g = componentCallbacksC1101xa17d4670;
        this.f92929h = arrayList;
        this.f92930i = arrayList2;
        this.f92931m = arrayList3;
        this.f92932n = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.b3 b3Var = this.f92926e;
        android.view.View view = this.f92927f;
        java.lang.Object obj = this.f92925d;
        if (obj != null) {
            b3Var.n(obj, view);
            this.f92930i.addAll(p012xc85e97e9.p087x9da2e250.app.r2.g(b3Var, obj, this.f92928g, this.f92929h, view));
        }
        java.util.ArrayList arrayList = this.f92931m;
        if (arrayList != null) {
            java.lang.Object obj2 = this.f92932n;
            if (obj2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                b3Var.o(obj2, arrayList, arrayList2);
            }
            arrayList.clear();
            arrayList.add(view);
        }
    }
}
