package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bc implements com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102960d;

    public bc(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.f0 f0Var) {
        this.f102957a = qeVar;
        this.f102958b = s0Var;
        this.f102959c = baseFinderFeed;
        this.f102960d = f0Var;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        int commentCount;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f102957a;
        dw2.c0 c0Var = qeVar.f104358f.getS().f223703n;
        if (c0Var != null) {
            dw2.c0.h(c0Var, "openCommentDrawer", false, false, 4, null);
        }
        in5.s0 s0Var = this.f102958b;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed != null ? baseFinderFeed.getFeedObject() : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f102959c;
        if (!(feedObject != null && feedObject.getId() == baseFinderFeed2.getItemId())) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(feedObject != null ? feedObject.getId() : 0L);
            objArr[1] = java.lang.Long.valueOf(baseFinderFeed2.getItemId());
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "close comment feed not match %d %d", objArr);
            return;
        }
        qeVar.L0(baseFinderFeed2, s0Var, "commentClose");
        if (qeVar.f104358f.d0()) {
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.w0().r()).intValue() == 1) {
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(baseFinderFeed2.getItemId());
                if (h17 == null) {
                    h17 = baseFinderFeed2.getFeedObject();
                }
                commentCount = h17.getCommentCount();
            } else {
                commentCount = baseFinderFeed2.getFeedObject().getCommentCount();
            }
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.c6s)).setText(com.tencent.mm.plugin.finder.assist.w2.g(1, commentCount));
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128013x1).getValue()).r()).intValue() == 1) {
            s0Var.o().smoothScrollBy(0, -this.f102960d.f310116d);
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.c7(s0Var);
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = (com.tencent.mm.plugin.finder.viewmodel.component.xc) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.xc.class);
        if (xcVar != null && xcVar.f136443n) {
            xcVar.h7();
            xcVar.f136443n = false;
        }
        if (z17) {
            qeVar.E(s0Var, true);
        }
    }
}
