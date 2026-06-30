package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        super(1);
        this.f102854d = context;
        this.f102855e = baseFinderFeed;
        this.f102856f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ec2.d e27;
        java.lang.String txt = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(txt, "txt");
        com.tencent.mm.plugin.finder.convert.c5 c5Var = com.tencent.mm.plugin.finder.convert.q6.f104325i;
        if (!c5Var.k()) {
            android.content.Context context = this.f102854d;
            kotlin.jvm.internal.o.g(context, "context");
            boolean z17 = context instanceof com.tencent.mm.ui.MMFragmentActivity;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i17 = nyVar != null ? nyVar.f135380n : 0;
            android.content.Intent intent = new android.content.Intent();
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            java.lang.String str = this.f102856f;
            java.lang.String a17 = c5Var.a(str, 156, i17 + 10000, currentTimeMillis);
            com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "click linkLayout, url:" + str + ", urlWithReportParams:" + a17);
            intent.putExtra("rawUrl", a17);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102855e;
                e27.a(new ec2.a(19, baseFinderFeed.getItemId(), baseFinderFeed.w()));
            }
        }
        return jz5.f0.f302826a;
    }
}
