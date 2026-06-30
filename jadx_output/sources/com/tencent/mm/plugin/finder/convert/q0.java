package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class q0 extends com.tencent.mm.plugin.finder.convert.n0 {

    /* renamed from: s, reason: collision with root package name */
    public final cw2.z9 f104299s;

    /* renamed from: t, reason: collision with root package name */
    public final int f104300t;

    /* renamed from: u, reason: collision with root package name */
    public final int f104301u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.en2 f104302v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f104303w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(cw2.z9 videoCore, com.tencent.mm.plugin.finder.feed.k8 contract, int i17, com.tencent.mm.plugin.finder.convert.i0 i0Var, int i18, r45.en2 en2Var, java.lang.String vmKey) {
        super(contract, false, i0Var, i18, en2Var, vmKey, 0, 66, null);
        kotlin.jvm.internal.o.g(videoCore, "videoCore");
        kotlin.jvm.internal.o.g(contract, "contract");
        kotlin.jvm.internal.o.g(vmKey, "vmKey");
        this.f104299s = videoCore;
        this.f104300t = i17;
        this.f104301u = i18;
        this.f104302v = en2Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488784e60;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r8.getInteger(2) == 1) goto L31;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r8, in5.c r9, int r10, int r11, boolean r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.q0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ffc);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        this.f104303w = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) p17;
        com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = (com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout) holder.p(com.tencent.mm.R.id.tbm);
        finderLiveCardMediaLayout.setScene(mn0.d0.C);
        finderLiveCardMediaLayout.setPlayerItemScene(24);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.g99);
        if (weImageView != null) {
            weImageView.setFocusable(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    public void q(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18) {
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (baseFinderFeed == null || (finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) holder.p(com.tencent.mm.R.id.f484869fs3)) == null) {
            return;
        }
        java.util.LinkedList<r45.mb4> mediaList = baseFinderFeed.getFeedObject().getMediaList();
        r45.mb4 first = mediaList.getFirst();
        for (r45.mb4 mb4Var : mediaList) {
            r45.mb4 mb4Var2 = first;
            if ((mb4Var2.getFloat(5) * 1.0f) / mb4Var2.getFloat(4) < (mb4Var.getFloat(5) * 1.0f) / mb4Var.getFloat(4)) {
                first = mb4Var;
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "calculateMediaLayoutParams res:[" + mb4Var.getFloat(4) + " x " + mb4Var.getFloat(5));
        }
        finderBaseMediaBanner.getMediaView().getLayoutParams().width = i17;
        finderBaseMediaBanner.getMediaView().getLayoutParams().height = i18;
        android.view.ViewGroup.LayoutParams layoutParams = finderBaseMediaBanner.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = 17;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        android.view.ViewGroup.LayoutParams layoutParams3 = finderVideoLayout != null ? finderVideoLayout.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.topMargin = 0;
            layoutParams4.bottomMargin = 0;
            layoutParams4.gravity = 17;
        }
        finderBaseMediaBanner.requestLayout();
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    public com.tencent.mm.plugin.finder.view.qr u() {
        return com.tencent.mm.plugin.finder.view.qr.f132910i;
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(in5.s0 holder, so2.h1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.view.y yVar = new com.tencent.mm.plugin.finder.view.y();
        yVar.f133368d = this.f104299s;
        yVar.f133366b = this.f104300t;
        finderMediaLayout.a(item, yVar);
    }
}
