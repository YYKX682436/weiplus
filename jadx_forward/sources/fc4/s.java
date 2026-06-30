package fc4;

/* loaded from: classes4.dex */
public final class s implements al5.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.v f342735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342736b;

    public s(fc4.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15) {
        this.f342735a = vVar;
        this.f342736b = viewOnLongClickListenerC18284x499dee15;
    }

    @Override // al5.v3
    public android.graphics.Rect a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRect", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$2");
        boolean w17 = pc4.d.f434943a.w();
        fc4.v vVar = this.f342735a;
        if (w17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2) vVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ncv);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            if (c19716x17d12db2 != null) {
                c19716x17d12db2.d(false, true);
            }
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 O6 = fc4.v.O6(vVar);
            if (O6 != null) {
                O6.m75681xdabc0b80(false);
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f342736b.getGlobalVisibleRect(rect);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRect", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$2");
        return rect;
    }
}
