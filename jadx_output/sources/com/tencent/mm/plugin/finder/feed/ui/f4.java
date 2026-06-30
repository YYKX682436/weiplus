package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class f4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110004e;

    public f4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI, java.lang.String str) {
        this.f110003d = finderGalleryUI;
        this.f110004e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI = this.f110003d;
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            androidx.appcompat.app.AppCompatActivity context = finderGalleryUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else if (menuItem.getItemId() == 1002) {
            intent.putExtra("key_finder_post_router", 3);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            androidx.appcompat.app.AppCompatActivity context2 = finderGalleryUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
        }
        intent.putExtra("key_finder_post_from", 12);
        intent.putExtra("key_finder_post_id", this.f110004e);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context3 = finderGalleryUI.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        i0Var.gk(context3, intent);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.W(p2Var.i(finderGalleryUI.getContext(), 14, false));
    }
}
