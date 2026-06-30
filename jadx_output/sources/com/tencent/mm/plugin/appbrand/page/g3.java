package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g3 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86634a;

    public g3(com.tencent.mm.plugin.appbrand.page.h3 h3Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86634a = n7Var;
    }

    @Override // db5.r4
    public void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 2) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "split_view_sheet_icon");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 26430);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "split_view_scene_info", this.f86634a.getAppId());
        }
    }
}
