package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class vd implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f83517d;

    public vd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f83517d = mdVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.appbrand.jsapi.md mdVar = this.f83517d;
        mdVar.f81605b.o(null);
        g4Var.clear();
        g4Var.a(1, com.tencent.mm.R.string.f492836i24);
        g4Var.a(2, com.tencent.mm.R.string.i89);
        g4Var.a(3, com.tencent.mm.R.string.hjg);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult = mdVar.f81604a;
        if (jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult != null && !com.tencent.mm.sdk.platformtools.t8.K0(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult.f78644d)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = mdVar.f81606c.getRuntime().u0();
            boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(mdVar.f81606c.Y1());
            kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
            com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2 = mdVar.f81604a;
            int i17 = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78646f;
            java.lang.String str = jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult2.f78644d;
            boolean k17 = u07.k();
            ((jd0.z1) l2Var).getClass();
            if (!com.tencent.mm.plugin.scanner.z0.c(i17, str, o17, k17)) {
                com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3 = mdVar.f81604a;
                mdVar.c(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3.f78646f, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult3.f78644d, false, false);
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet code is not AppBrand Enable,  codeType:%d result:%s", java.lang.Integer.valueOf(mdVar.f81604a.f78646f), mdVar.f81604a.f78644d);
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = mdVar.f81605b;
            com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4 = mdVar.f81604a;
            mdVar.getClass();
            com.tencent.mm.plugin.appbrand.jsapi.yd ydVar = new com.tencent.mm.plugin.appbrand.jsapi.yd(mdVar);
            mdVar.c(jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4.f78646f, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4.f78644d, true, false);
            k0Var.o(((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) mdVar.f81610g).b(ydVar, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4.f78646f, jsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult4.f78644d, 11));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = mdVar.f81606c;
        mdVar.getClass();
        com.tencent.mm.vfs.r6 allocTempFile = n7Var.getFileSystem().allocTempFile("showSheet_" + java.lang.System.currentTimeMillis());
        if (allocTempFile == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic failed for allocTempFile");
            return;
        }
        android.graphics.Bitmap R1 = n7Var.R1();
        if (R1 == null || R1.isRecycled() || R1.getWidth() <= 0 || R1.getHeight() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic bitmap not valid");
            return;
        }
        int width = R1.getWidth();
        int height = R1.getHeight();
        android.graphics.Rect rect = mdVar.f81609f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect from left:%d top:%d width:%d height:%d", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
        android.graphics.Rect rect2 = new android.graphics.Rect(java.lang.Math.min(width, java.lang.Math.max(0, rect.left)), java.lang.Math.min(height, java.lang.Math.max(0, rect.top)), java.lang.Math.min(width, java.lang.Math.max(0, rect.right)), java.lang.Math.min(height, java.lang.Math.max(0, rect.bottom)));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect final left:%d top:%d width:%d height:%d", java.lang.Integer.valueOf(rect2.left), java.lang.Integer.valueOf(rect2.top), java.lang.Integer.valueOf(rect2.width()), java.lang.Integer.valueOf(rect2.height()));
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            bitmap = null;
        } else {
            int i18 = rect2.left;
            int i19 = rect2.top;
            int width2 = rect2.width();
            int height2 = rect2.height();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(width2));
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(R1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper", "processRecognizeQRCodeLogic", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/appbrand/jsapi/JsApiShowImageOperateSheet$BottomSheetLogicHelper", "processRecognizeQRCodeLogic", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        }
        p95.a.a(new com.tencent.mm.plugin.appbrand.jsapi.rd(mdVar, allocTempFile, R1, bitmap));
    }
}
