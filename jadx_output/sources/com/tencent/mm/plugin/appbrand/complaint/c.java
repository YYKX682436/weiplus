package com.tencent.mm.plugin.appbrand.complaint;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.complaint.c f77182a = new com.tencent.mm.plugin.appbrand.complaint.c();

    public static final java.lang.String b(com.tencent.mm.plugin.appbrand.page.n7 pageView) {
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, pageView:" + pageView);
        ((com.tencent.mm.plugin.appbrand.complaint.f) ((com.tencent.mm.plugin.appbrand.complaint.s) i95.n0.c(com.tencent.mm.plugin.appbrand.complaint.s.class))).getClass();
        java.lang.String str = com.tencent.mm.plugin.appbrand.complaint.f.f77187f;
        android.graphics.Bitmap bitmap = null;
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, null image cache dir");
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str + '/' + pageView.getAppId() + '_' + java.lang.System.currentTimeMillis() + ".jpeg");
        pageView.r3(null);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        com.tencent.mm.plugin.appbrand.complaint.b bVar = new com.tencent.mm.plugin.appbrand.complaint.b(pageView, o17);
        wa1.a aVar = wa1.b.f444100a;
        com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
        kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
        if (!aVar.c(runtime)) {
            com.tencent.mm.plugin.appbrand.o6 runtime2 = pageView.getRuntime();
            kotlin.jvm.internal.o.f(runtime2, "getRuntime(...)");
            if (!aVar.b(runtime2)) {
                bVar.invoke();
                java.lang.String a17 = com.tencent.mm.plugin.webview.model.n5.a(o17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a17 + ", imagePath:" + o17);
                return a17;
            }
        }
        com.tencent.mm.plugin.appbrand.o6 runtime3 = pageView.getRuntime();
        mi1.v vVar = runtime3.f74821z;
        if (vVar != null) {
            vVar.k();
            mi1.v vVar2 = runtime3.f74821z;
            if (vVar2.f326703b != null) {
                vVar2.c().setVisibility(4);
                com.tencent.mars.xlog.Log.i("AppBrandCapsuleBarManager", "hideCapsuleBar");
            }
        }
        android.view.View findViewById = runtime3.f74810s.getRootView().findViewById(com.tencent.mm.R.id.w_);
        if (findViewById != null) {
            bitmap = com.tencent.mm.plugin.appbrand.page.ie.b(findViewById);
            mi1.v vVar3 = runtime3.f74821z;
            if (vVar3 != null) {
                vVar3.j();
            }
        }
        if (bitmap != null) {
            f77182a.a(bitmap, o17);
        } else {
            bVar.invoke();
        }
        java.lang.String a172 = com.tencent.mm.plugin.webview.model.n5.a(o17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a172 + ", imagePath:" + o17);
        return a172;
    }

    public final void a(android.graphics.Bitmap bitmap, java.lang.String str) {
        android.graphics.Bitmap bitmap2 = null;
        if (bitmap != null) {
            try {
                try {
                    if (!bitmap.isRecycled()) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        bitmap2 = com.tencent.mm.sdk.platformtools.x.S(bitmap, 640, 640, false, true);
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap2, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, save bitmap to file:" + str + ", cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                        ((com.tencent.mm.plugin.appbrand.complaint.f) ((com.tencent.mm.plugin.appbrand.complaint.s) i95.n0.c(com.tencent.mm.plugin.appbrand.complaint.s.class))).Ai(str);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandComplaintHelper", e17, "tryTakeScreenshot, save bitmap to file fail", new java.lang.Object[0]);
                    if (!bitmap.isRecycled()) {
                        bitmap.toString();
                        bitmap.recycle();
                    }
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (!bitmap.isRecycled()) {
                    bitmap.toString();
                    bitmap.recycle();
                }
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.toString();
                    bitmap2.recycle();
                }
                throw th6;
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.toString();
            bitmap.recycle();
        }
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        bitmap2.toString();
        bitmap2.recycle();
    }
}
