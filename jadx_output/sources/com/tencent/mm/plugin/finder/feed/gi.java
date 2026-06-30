package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class gi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f106847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f106848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(az2.f fVar, cd2.c cVar, com.tencent.mm.plugin.finder.feed.li liVar) {
        super(1);
        this.f106847d = fVar;
        this.f106848e = cVar;
        this.f106849f = liVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f106847d.b();
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", "del mention network error!: " + this.f106848e.i());
        com.tencent.mm.ui.MMActivity mMActivity = this.f106849f.f107297g;
        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.eri), 0).show();
        return jz5.f0.f302826a;
    }
}
