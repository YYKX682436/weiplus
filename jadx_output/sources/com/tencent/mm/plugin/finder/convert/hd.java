package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f103575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103577g;

    public hd(android.view.View view, java.util.Map map, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f103574d = view;
        this.f103575e = map;
        this.f103576f = baseFinderFeed;
        this.f103577g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.Html5Info html5_info;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRead$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", this.f103574d, this.f103575e, 25496);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) g92.b.f269769e.k2().d().getCustom(27);
        java.lang.String url = (finderJumpInfo == null || (html5_info = finderJumpInfo.getHtml5_info()) == null) ? null : html5_info.getUrl();
        r45.dm2 object_extend = this.f103576f.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(25) : null;
        if (url != null && string != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String substring = url.substring(0, r26.n0.L(url, "=", 0, false, 6, null) + 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String e17 = hc2.x0.e(substring.concat(string), 2, false, null, 6, null);
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "rawUrl=".concat(e17));
            intent.putExtra("rawUrl", e17);
            j45.l.j(this.f103577g.f293121e, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRead$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
