package x64;

/* loaded from: classes4.dex */
public final class o implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f533848a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f533849b;

    public o(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f533848a = weakReference;
        this.f533849b = z17;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("result_key_action")) : null;
        boolean z17 = this.f533849b;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, z17 ? 3 : 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, z17 ? 4 : 9);
        }
        if (valueOf != null && valueOf.intValue() == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "show confirm page");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, z17 ? 10 : 11);
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "in confirm page, user cancel");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, z17 ? 12 : 13);
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            java.lang.ref.WeakReference weakReference = this.f533848a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725) context : null;
            if (activityC17748xd9e17725 != null) {
                activityC17748xd9e17725.finish();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17747xd7fb98e8 activityC17747xd7fb98e8 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17747xd7fb98e8 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17747xd7fb98e8) context : null;
            if (activityC17747xd7fb98e8 != null) {
                activityC17747xd7fb98e8.finish();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "ad startConversation result action: %s", valueOf);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
    }
}
