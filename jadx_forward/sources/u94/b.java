package u94;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f507367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.c f507369h;

    public b(u94.c cVar, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str) {
        this.f507369h = cVar;
        this.f507365d = i17;
        this.f507366e = i18;
        this.f507367f = m1Var;
        this.f507368g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.c cVar = this.f507369h;
        java.lang.ref.WeakReference weakReference = cVar.f507370d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenAddBrandController", "AddContactSceneEnd, controllerRef is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        java.lang.ref.WeakReference weakReference2 = cVar.f507370d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.f fVar = (u94.f) weakReference2.get();
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenAddBrandController", "AddContactSceneEnd, controllerRef get is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        android.content.Context context = fVar.f507381c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (u94.f.a(fVar) != null) {
            u94.f.a(fVar).dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            fVar.f507384f = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        }
        if (this.f507365d == 0 && this.f507366e == 0) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f507367f;
            if (m1Var.mo808xfb85f7b0() == 30) {
                str = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
            } else if (m1Var.mo808xfb85f7b0() == 667) {
                str = ((l41.o) ((ab0.s) m1Var)).f397417f;
            }
            int i17 = this.f507365d;
            int i18 = this.f507366e;
            java.lang.String str2 = this.f507368g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
            int i19 = cVar.f507371e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
            u94.f.b(fVar, context, i17, i18, str2, i19, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
        }
        str = "";
        int i172 = this.f507365d;
        int i182 = this.f507366e;
        java.lang.String str22 = this.f507368g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        int i192 = cVar.f507371e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.f.b(fVar, context, i172, i182, str22, i192, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
    }
}
