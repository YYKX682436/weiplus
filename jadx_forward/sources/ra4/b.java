package ra4;

/* loaded from: classes4.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.animation.Animation f475080d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f475081e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f475082f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f475083g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f475084h;

    public b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        new java.util.HashMap();
        this.f475082f = new java.util.HashMap();
        this.f475083g = new java.util.HashSet();
        this.f475084h = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.vj().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.vj().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        this.f475080d = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f475080d = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559291an);
        this.f475081e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f475081e = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559292ao);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1
    public void a(int i17, java.lang.String str, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        if (z17) {
            java.util.HashSet hashSet = this.f475083g;
            boolean contains = hashSet.contains(java.lang.Long.valueOf(j17));
            java.util.Map map = this.f475082f;
            if (contains) {
                java.util.HashMap hashMap = this.f475084h;
                if (hashMap.containsKey(java.lang.Long.valueOf(j17)) ? ((java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(j17))).booleanValue() : false) {
                    ra4.a aVar = (ra4.a) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
            ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j17));
            hashSet.remove(java.lang.Long.valueOf(j17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1
    public void b(int i17, java.lang.String str, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }
}
