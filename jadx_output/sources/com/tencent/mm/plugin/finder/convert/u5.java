package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f104676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104678h;

    public u5(com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var, java.lang.String str, r45.qt2 qt2Var) {
        this.f104674d = q6Var;
        this.f104675e = s0Var;
        this.f104676f = z0Var;
        this.f104677g = str;
        this.f104678h = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.z0 z0Var = this.f104676f;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = z0Var.E;
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f104674d;
        q6Var.getClass();
        in5.s0 s0Var = this.f104675e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        android.content.Intent intent = new android.content.Intent();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        java.lang.String str = this.f104677g;
        java.lang.String a17 = com.tencent.mm.plugin.finder.convert.q6.f104325i.a(str, 156, i17 + 10000, currentTimeMillis);
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "click linkLayout, url:" + str + ", urlWithReportParams:" + a17);
        intent.putExtra("rawUrl", a17);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context2;
        zy2.v9 v9Var = (zy2.v9) zVar.a(appCompatActivity).c(zy2.v9.class);
        long id6 = finderItem.getId();
        com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = (com.tencent.mm.plugin.finder.live.viewmodel.aa) v9Var;
        r45.md5 md5Var = aaVar.f116907e;
        if ((md5Var != null && md5Var.getLong(0) == id6) || aaVar.f116908f) {
            java.lang.String str2 = aaVar.f116906d;
            intent.putExtra("KShareTraceLastGMsgId", str2);
            com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToH5 lastGMsgId:" + str2);
        }
        j45.l.j(context2, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            e27.a(new ec2.a(19, finderItem.getId(), finderItem.getDupFlag()));
        }
        com.tencent.mm.plugin.finder.convert.q6.n(q6Var, this.f104678h, z0Var.E, 2L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshLink$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
