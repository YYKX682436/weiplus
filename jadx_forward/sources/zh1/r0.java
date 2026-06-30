package zh1;

/* loaded from: classes8.dex */
public final class r0 extends zh1.v {

    /* renamed from: o, reason: collision with root package name */
    public zh1.b0 f554468o;

    /* renamed from: p, reason: collision with root package name */
    public db5.g4 f554469p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f554470q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f554471r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, bi1.g openMaterialScene, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        super(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, launchAppBrandExecutor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        this.f554468o = new zh1.b0(zh1.y0.HIDE, true);
        this.f554470q = jz5.h.b(new zh1.o0(bottomSheet, launchAppBrandExecutor, context, openMaterialCollection));
        this.f554471r = jz5.h.b(zh1.q0.f554466d);
    }

    public static final boolean a(zh1.r0 r0Var, android.view.View view) {
        r0Var.getClass();
        if (!view.isShown()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure view is not shown");
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() >= view.getMeasuredWidth()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure, view is visible but not exposure");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r24) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.r0.b(boolean):void");
    }

    public final void c(boolean z17) {
        java.util.List<android.view.MenuItem> list;
        db5.g4 g4Var = this.f554469p;
        if (g4Var != null && (list = g4Var.f309877d) != null) {
            for (android.view.MenuItem menuItem : list) {
                db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
                if (h4Var != null) {
                    h4Var.f309908s = !z17;
                }
            }
        }
        this.f554481f.f293398i2 = z17;
    }

    public final android.graphics.Bitmap d(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i17 = width / 14;
        int i18 = (i17 * 2) + width;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "wrapIconWithPadding, sideLen: " + width + ", padding: " + i17 + ", newSideLen: " + i18);
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/openmaterial/GridBottomSheetEnhanceLogic", "wrapIconWithPadding", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/openmaterial/GridBottomSheetEnhanceLogic", "wrapIconWithPadding", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        float f17 = i17;
        new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, f17, f17, (android.graphics.Paint) null);
        return createBitmap;
    }

    @Override // zh1.z0
    public void o(zh1.y0 newEnhanceType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newEnhanceType, "newEnhanceType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "enhance, newEnhanceType: " + newEnhanceType + ", curEnhanceState: " + this.f554468o);
        if (this.f554468o.f554396a == newEnhanceType) {
            return;
        }
        int ordinal = newEnhanceType.ordinal();
        android.content.Context context = this.f554480e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f554481f;
        if (ordinal == 0) {
            b(true);
        } else if (ordinal == 1) {
            b(false);
        } else if (ordinal == 2) {
            k0Var.a(new db5.g4(context), null, null);
            k0Var.H = null;
            zh1.p0 p0Var = zh1.p0.f554465a;
            k0Var.f293424y1 = false;
            k0Var.A = p0Var;
            k0Var.f293398i2 = false;
            this.f554468o = new zh1.b0(zh1.y0.HIDE, true);
        }
        if (k0Var.i()) {
            zh1.w.b(k0Var, context);
        }
    }
}
