package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class vd implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md f165050d;

    public vd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md mdVar) {
        this.f165050d = mdVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md mdVar = this.f165050d;
        mdVar.f163138b.o(null);
        g4Var.clear();
        g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24);
        g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.i89);
        g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.hjg);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d1 = mdVar.f163137a;
        if (c11946x584a00d1 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11946x584a00d1.f160177d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = mdVar.f163139c.mo32091x9a3f0ba2().u0();
            boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(mdVar.f163139c.Y1());
            kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d12 = mdVar.f163137a;
            int i17 = c11946x584a00d12.f160179f;
            java.lang.String str = c11946x584a00d12.f160177d;
            boolean k17 = u07.k();
            ((jd0.z1) l2Var).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.c(i17, str, o17, k17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d13 = mdVar.f163137a;
                mdVar.c(c11946x584a00d13.f160179f, c11946x584a00d13.f160177d, false, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet code is not AppBrand Enable,  codeType:%d result:%s", java.lang.Integer.valueOf(mdVar.f163137a.f160179f), mdVar.f163137a.f160177d);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mdVar.f163138b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d14 = mdVar.f163137a;
            mdVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yd ydVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yd(mdVar);
            mdVar.c(c11946x584a00d14.f160179f, c11946x584a00d14.f160177d, true, false);
            k0Var.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) mdVar.f163143g).b(ydVar, c11946x584a00d14.f160179f, c11946x584a00d14.f160177d, 11));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = mdVar.f163139c;
        mdVar.getClass();
        com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = n7Var.mo50354x59eafec1().mo49614x6665a5c5("showSheet_" + java.lang.System.currentTimeMillis());
        if (mo49614x6665a5c5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic failed for allocTempFile");
            return;
        }
        android.graphics.Bitmap R1 = n7Var.R1();
        if (R1 == null || R1.isRecycled() || R1.getWidth() <= 0 || R1.getHeight() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic bitmap not valid");
            return;
        }
        int width = R1.getWidth();
        int height = R1.getHeight();
        android.graphics.Rect rect = mdVar.f163142f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect from left:%d top:%d width:%d height:%d", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
        android.graphics.Rect rect2 = new android.graphics.Rect(java.lang.Math.min(width, java.lang.Math.max(0, rect.left)), java.lang.Math.min(height, java.lang.Math.max(0, rect.top)), java.lang.Math.min(width, java.lang.Math.max(0, rect.right)), java.lang.Math.min(height, java.lang.Math.max(0, rect.bottom)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "constructValidElementRect final left:%d top:%d width:%d height:%d", java.lang.Integer.valueOf(rect2.left), java.lang.Integer.valueOf(rect2.top), java.lang.Integer.valueOf(rect2.width()), java.lang.Integer.valueOf(rect2.height()));
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            bitmap = null;
        } else {
            int i18 = rect2.left;
            int i19 = rect2.top;
            int width2 = rect2.width();
            int height2 = rect2.height();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.rd(mdVar, mo49614x6665a5c5, R1, bitmap));
    }
}
