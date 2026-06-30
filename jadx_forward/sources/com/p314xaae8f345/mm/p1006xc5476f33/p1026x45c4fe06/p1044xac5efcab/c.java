package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.c f158715a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.c();

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, pageView:" + pageView);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.s.class))).getClass();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.f.f158720f;
        android.graphics.Bitmap bitmap = null;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, null image cache dir");
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str + '/' + pageView.mo48798x74292566() + '_' + java.lang.System.currentTimeMillis() + ".jpeg");
        pageView.r3(null);
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.b(pageView, o17);
        wa1.a aVar = wa1.b.f525633a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = pageView.mo32091x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba2, "getRuntime(...)");
        if (!aVar.c(mo32091x9a3f0ba2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba22 = pageView.mo32091x9a3f0ba2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba22, "getRuntime(...)");
            if (!aVar.b(mo32091x9a3f0ba22)) {
                bVar.mo152xb9724478();
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n5.a(o17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a17 + ", imagePath:" + o17);
                return a17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba23 = pageView.mo32091x9a3f0ba2();
        mi1.v vVar = mo32091x9a3f0ba23.f156354z;
        if (vVar != null) {
            vVar.k();
            mi1.v vVar2 = mo32091x9a3f0ba23.f156354z;
            if (vVar2.f408236b != null) {
                vVar2.c().setVisibility(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandCapsuleBarManager", "hideCapsuleBar");
            }
        }
        android.view.View findViewById = mo32091x9a3f0ba23.f156343s.getRootView().findViewById(com.p314xaae8f345.mm.R.id.w_);
        if (findViewById != null) {
            bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.b(findViewById);
            mi1.v vVar3 = mo32091x9a3f0ba23.f156354z;
            if (vVar3 != null) {
                vVar3.j();
            }
        }
        if (bitmap != null) {
            f158715a.a(bitmap, o17);
        } else {
            bVar.mo152xb9724478();
        }
        java.lang.String a172 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n5.a(o17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, localId:" + a172 + ", imagePath:" + o17);
        return a172;
    }

    public final void a(android.graphics.Bitmap bitmap, java.lang.String str) {
        android.graphics.Bitmap bitmap2 = null;
        if (bitmap != null) {
            try {
                try {
                    if (!bitmap.isRecycled()) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        bitmap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(bitmap, 640, 640, false, true);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap2, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComplaintHelper", "tryTakeScreenshot, save bitmap to file:" + str + ", cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1044xac5efcab.s.class))).Ai(str);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandComplaintHelper", e17, "tryTakeScreenshot, save bitmap to file fail", new java.lang.Object[0]);
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
