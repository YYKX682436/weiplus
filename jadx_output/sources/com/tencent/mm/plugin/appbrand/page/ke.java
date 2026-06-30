package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ke implements db5.k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.page.ke f86840a = new com.tencent.mm.plugin.appbrand.page.ke();

    @Override // db5.k4
    public final void a(android.widget.ImageView imageView, db5.h4 h4Var) {
        try {
            ((com.tencent.mm.feature.avatar.s) ((kv.y) i95.n0.c(kv.y.class))).wi(imageView, h4Var.A);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SupportRecentForwardController", "attachAvatar for username:" + h4Var.A + ", get exception:" + e17);
        }
    }
}
