package u94;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f507374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.e f507376h;

    public d(u94.e eVar, int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f507376h = eVar;
        this.f507372d = i17;
        this.f507373e = str;
        this.f507374f = i18;
        this.f507375g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.e eVar = this.f507376h;
        java.lang.ref.WeakReference weakReference = eVar.f507377a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenAddBrandController", "AddContactSceneLandPageEnd, controllerRef is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        java.lang.ref.WeakReference weakReference2 = eVar.f507377a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.f fVar = (u94.f) weakReference2.get();
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HalfScreenAddBrandController", "AddContactSceneLandPageEnd, controllerRef get is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", java.lang.Integer.valueOf(this.f507372d), this.f507373e);
        int i17 = this.f507374f;
        int i18 = this.f507372d;
        java.lang.String str = this.f507373e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        int i19 = eVar.f507378b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.f.b(fVar, context, i17, i18, str, i19, this.f507375g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
    }
}
