package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.um f108836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.um umVar) {
        super(0);
        this.f108835d = s3Var;
        this.f108836e = umVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        ym5.s3 s3Var = this.f108835d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
        }
        com.tencent.mm.plugin.finder.feed.um umVar = this.f108836e;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = umVar.f107157f;
        androidx.recyclerview.widget.f2 adapter = (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) ? null : recyclerView.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        boolean z17 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        in5.w wVar = umVar.f110826o;
        if (z17) {
            if (wVar instanceof so2.s) {
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                ((so2.s) wVar).f410582d = string;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410583e = s3Var.f463517b;
                kotlin.jvm.internal.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f410584f = umVar.f110823i;
            }
            if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(wVar)) ? false : true) {
                wxRecyclerAdapter.Q(wVar, false);
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.i0(((so2.s) wVar).hashCode(), false);
        }
        return jz5.f0.f302826a;
    }
}
