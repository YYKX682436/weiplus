package n44;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f416605a;

    /* renamed from: b, reason: collision with root package name */
    public final i64.z f416606b;

    /* renamed from: c, reason: collision with root package name */
    public final y54.b f416607c;

    /* renamed from: f, reason: collision with root package name */
    public int f416610f;

    /* renamed from: h, reason: collision with root package name */
    public n44.u f416612h;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f416608d = jz5.h.b(new n44.y(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f416609e = jz5.h.b(new n44.x(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f416611g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f416613i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f416614j = new java.util.LinkedList();

    public z(android.widget.FrameLayout frameLayout, i64.z zVar, y54.b bVar) {
        this.f416605a = frameLayout;
        this.f416606b = zVar;
        this.f416607c = bVar;
    }

    public final void a(int i17, int i18, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        i64.z zVar = this.f416606b;
        java.util.LinkedList f17 = zVar != null ? zVar.f() : null;
        if (f17 == null || f17.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
            return;
        }
        int size = f17.size();
        for (int i19 = 0; i19 < size; i19++) {
            java.lang.Object obj = f17.get(i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            y54.c cVar = new y54.c(0, 0, 0, 0, 15, null);
            n44.a0 a0Var = n44.m0.f416515s;
            r45.lj4 lj4Var = ((r45.jj4) obj).f459398p;
            a0Var.a(lj4Var.f461053d, lj4Var.f461054e, i17, i18, true, cVar);
            linkedList.add(cVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doExposureCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        java.util.HashMap hashMap = this.f416611g;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if ((num == null) || (num != null && num.intValue() == 0)) {
            hashMap.put(java.lang.Integer.valueOf(i17), 1);
        } else {
            hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(num.intValue() + 1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doExposureCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
    }

    public final android.view.ViewGroup c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentViewGroup", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        n44.u uVar = this.f416612h;
        android.view.View e17 = uVar != null ? uVar.e(this.f416610f) : null;
        android.view.ViewGroup viewGroup = e17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) e17 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentViewGroup", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return viewGroup;
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageControlView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3) ((jz5.n) this.f416609e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageControlView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return c21508xc28dbdd3;
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewPager", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e) ((jz5.n) this.f416608d).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewPager", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return c21520x5bb48e5e;
    }
}
