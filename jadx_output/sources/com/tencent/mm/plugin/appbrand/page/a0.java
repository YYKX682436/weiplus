package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.AppCommentModule f86387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86389f;

    public a0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule, java.lang.String str) {
        this.f86389f = appBrandMenuHeader;
        this.f86387d = appCommentModule;
        this.f86388e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = this.f86387d;
        java.lang.String str = appCommentModule.more_appid;
        java.lang.String str2 = appCommentModule.more_path;
        java.lang.String str3 = appCommentModule.more_query;
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        this.f86389f.b(str, str2, str3);
        com.tencent.mm.plugin.appbrand.report.v0.k(this.f86388e, 2, 1, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
