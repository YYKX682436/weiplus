package ac2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f3048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCountDownTextView f3049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ac2.t tVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView) {
        super(1);
        this.f3047d = tVar;
        this.f3048e = baseFinderFeed;
        this.f3049f = finderCountDownTextView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f3047d;
        java.lang.String str = tVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishCapsule(");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f3048e;
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        sb6.append(')');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        baseFinderFeed.y1(true);
        this.f3049f.setCountDownFinishCallback(null);
        tVar.D = null;
        tVar.E0();
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = tVar.L;
        if (finderCountDownTextView != null) {
            finderCountDownTextView.setKeepFinish(true);
        }
        return jz5.f0.f302826a;
    }
}
