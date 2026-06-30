package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final /* synthetic */ class AppBrandLocalMediaObjectManager$$a implements bm5.w0 {
    @Override // bm5.w0
    public final java.lang.Object a() {
        java.util.Collection collection = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f76109a;
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        return D + "wxafiles/";
    }
}
