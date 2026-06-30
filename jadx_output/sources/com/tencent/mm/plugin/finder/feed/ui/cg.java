package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class cg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.dg f109754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f109755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(com.tencent.mm.plugin.finder.feed.ui.dg dgVar, ym5.s3 s3Var) {
        super(0);
        this.f109754d = dgVar;
        this.f109755e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f109754d.f106424g;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.ui.lg ? (com.tencent.mm.plugin.finder.feed.ui.lg) i0Var : null;
        if (lgVar != null) {
            ym5.s3 reason = this.f109755e;
            kotlin.jvm.internal.o.g(reason, "reason");
            lgVar.o().setEnableRefresh(reason.f463521f);
            if (!reason.f463521f) {
                com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = lgVar.o().getStickTopLoadingLayout();
                if (stickTopLoadingLayout != null) {
                    stickTopLoadingLayout.setVisibility(8);
                }
                lgVar.o().setStickTopLoadingLayout(null);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = lgVar.getRecyclerView();
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.ui.hg(recyclerView));
        }
        return jz5.f0.f302826a;
    }
}
