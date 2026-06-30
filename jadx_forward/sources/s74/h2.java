package s74;

/* loaded from: classes4.dex */
public final class h2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f485858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f485860c;

    public h2(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f485858a = weakReference;
        this.f485859b = c17933xe8d1b226;
        this.f485860c = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a
    public final void a(int i17, int i18) {
        int i19 = this.f485860c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485859b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdTagClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$setNormalStyleText$1$1");
        try {
            i64.b1 b1Var = (i64.b1) this.f485858a.get();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdTagClickableHelperInDynamicComponent", "In dynamicView, snsId = " + c17933xe8d1b226.f68891x29d1292e + ", source = " + i19 + ", clickPos = " + i18);
            n74.o0.b(i19, c17933xe8d1b226, i18, b1Var);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdTagClickableHelperInDynamicComponent", th6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTagClickableHelperInDynamicComponent", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$setNormalStyleText$1$1");
    }
}
