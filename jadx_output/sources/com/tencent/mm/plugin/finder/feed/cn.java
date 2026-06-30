package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class cn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hn f106484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(com.tencent.mm.plugin.finder.feed.hn hnVar) {
        super(1);
        this.f106484d = hnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f106484d;
        if (hnVar.f106941p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            sb6.append(", errMsg ");
            sb6.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiManageUIContract", sb6.toString());
            com.tencent.mm.plugin.finder.feed.rn rnVar = hnVar.f106934f;
            if (rnVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8x);
            s3Var.f463517b = -1;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = rnVar.f108930f;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.Q(s3Var);
        }
        return jz5.f0.f302826a;
    }
}
