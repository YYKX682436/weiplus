package bd4;

/* loaded from: classes4.dex */
public final class z0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc f100954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f100957g;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc c18275x32e752fc, int i17, int i18, int i19) {
        this.f100954d = c18275x32e752fc;
        this.f100955e = i17;
        this.f100956f = i18;
        this.f100957g = i19;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc c18275x32e752fc = this.f100954d;
        c18275x32e752fc.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        c18275x32e752fc.postDelayed(new bd4.y0(c18275x32e752fc, this.f100955e, this.f100956f, this.f100957g), 5L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2");
    }
}
