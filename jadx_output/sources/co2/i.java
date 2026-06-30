package co2;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ co2.k f43790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(co2.k kVar, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        super(finderRefreshLayout);
        this.f43790e = kVar;
        kotlin.jvm.internal.o.d(finderRefreshLayout);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public void b() {
        com.tencent.mars.xlog.Log.i(this.f43790e.f43792d, "updateState");
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        android.view.View view;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishLoadMore(reason);
        if (reason.f463523h > 0 || reason.f463516a != 2) {
            return;
        }
        co2.k kVar = this.f43790e;
        com.tencent.mars.xlog.Log.i(kVar.f43792d, "no more loadMore data!");
        on5.c loadMoreFooter = kVar.P6().getLoadMoreFooter();
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (loadMoreFooter == null || (view = loadMoreFooter.getView()) == null) ? null : (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.ilh);
        if (mMProcessBar == null) {
            return;
        }
        mMProcessBar.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        android.view.View view;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishRefresh(reason);
        if (reason.f463523h <= 0) {
            co2.k kVar = this.f43790e;
            com.tencent.mars.xlog.Log.i(kVar.f43792d, "no more refresh data!");
            on5.d refreshHeader = kVar.P6().getRefreshHeader();
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (refreshHeader == null || (view = refreshHeader.getView()) == null) ? null : (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.f486588lr5);
            if (mMProcessBar == null) {
                return;
            }
            mMProcessBar.setVisibility(8);
        }
    }
}
