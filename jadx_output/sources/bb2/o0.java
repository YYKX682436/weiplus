package bb2;

/* loaded from: classes2.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f18927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f18929f;

    public o0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, zy2.gc gcVar) {
        this.f18927d = baseFinderFeed;
        this.f18928e = z17;
        this.f18929f = gcVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0 b0Var = hb2.b0.f280025e;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f18927d;
            b0Var.n(baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject().getObjectNonceId(), this.f18928e, this.f18929f);
        }
    }
}
