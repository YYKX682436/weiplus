package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class fi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f106743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd2.c f106744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f106746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(az2.f fVar, cd2.c cVar, com.tencent.mm.plugin.finder.feed.li liVar, int i17) {
        super(1);
        this.f106743d = fVar;
        this.f106744e = cVar;
        this.f106745f = liVar;
        this.f106746g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.e11 it = (r45.e11) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f106743d.b();
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", "mentionId: " + this.f106744e.i());
        com.tencent.mm.plugin.finder.feed.li liVar = this.f106745f;
        java.util.ArrayList arrayList = liVar.f107294d.f109191p;
        int i17 = this.f106746g;
        arrayList.remove(i17);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = liVar.f107299i;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRemoved(i17);
        }
        com.tencent.mm.ui.MMActivity mMActivity = liVar.f107297g;
        db5.t7.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.erj), 0).show();
        return jz5.f0.f302826a;
    }
}
