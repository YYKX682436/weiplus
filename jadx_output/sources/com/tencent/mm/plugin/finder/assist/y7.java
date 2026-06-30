package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class y7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f102729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f102731h;

    public y7(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        this.f102727d = appCompatActivity;
        this.f102728e = str;
        this.f102729f = z17;
        this.f102730g = baseFinderFeed;
        this.f102731h = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        androidx.appcompat.app.AppCompatActivity context = this.f102727d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        objArr[0] = nyVar != null ? nyVar.f135382p : null;
        objArr[1] = this.f102728e;
        objArr[2] = 1;
        objArr[3] = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
        g0Var.d(21180, objArr);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_finder_sns_post_within_30s", this.f102729f);
        bundle.putBoolean("need_ban_back_tips", true);
        com.tencent.mm.plugin.finder.assist.n7.f102406a.E(this.f102727d, this.f102730g, bundle, 5, this.f102731h);
        com.tencent.mars.xlog.Log.i("Finder.FinderUIUtil", "[checkShowShareSnsLayout] click share to sns");
    }
}
