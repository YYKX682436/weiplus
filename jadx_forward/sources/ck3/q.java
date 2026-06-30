package ck3;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ck3.q f124046a = new ck3.q();

    public final android.graphics.Bitmap a(ak3.c pageAdapter, android.graphics.Point ballPos, android.graphics.Bitmap bitmap, boolean z17, float f17, kk3.d dVar, boolean z18, boolean z19) {
        android.graphics.Bitmap mo2158x12501425;
        android.graphics.Bitmap bitmap2;
        ck3.a0 a0Var;
        android.view.View mo2159xc2a54588;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballPos, "ballPos");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, ballPos(x:%d, y:%d), lastSwipePosX:%f", java.lang.Integer.valueOf(ballPos.x), java.lang.Integer.valueOf(ballPos.y), java.lang.Float.valueOf(f17));
        if (!z19) {
            if (pageAdapter.mo2161x8c409d27() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page mask view is null");
                if (dVar != null) {
                    kk3.d.f(dVar, 0, 1, null);
                }
                return null;
            }
            if (pageAdapter.mo2159xc2a54588() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page content view is null");
                if (dVar != null) {
                    kk3.d.f(dVar, 0, 1, null);
                }
                return null;
            }
        }
        if (pageAdapter.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page root view is null");
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
            }
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z19);
        ak3.i iVar = (ak3.i) pageAdapter;
        objArr[1] = java.lang.Boolean.valueOf(iVar.f87121m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "isItemAnim: %s, itemBitmap == null: %s", objArr);
        if (!z19 || iVar.f87121m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation use bitmap");
            mo2158x12501425 = pageAdapter.mo2158x12501425();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation use itemBitmap");
            android.graphics.Rect b17 = b(pageAdapter);
            android.graphics.Bitmap bitmap3 = iVar.f87121m;
            if (bitmap3 != null && b17 != null) {
                int width = b17.width();
                bitmap3 = android.graphics.Bitmap.createScaledBitmap(bitmap3, width, (bitmap3.getHeight() * width) / bitmap3.getWidth(), true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap3, "createScaledBitmap(...)");
            }
            mo2158x12501425 = bitmap3;
        }
        if (mo2158x12501425 == null || mo2158x12501425.isRecycled() || mo2158x12501425.getWidth() == 0 || mo2158x12501425.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation, page get bitmap is null");
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
            }
            return null;
        }
        android.graphics.Bitmap bitmap4 = z17 ? mo2158x12501425 : bitmap;
        if (!z19 || iVar.f87121m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation use defaultRect");
            bitmap2 = bitmap4;
            a0Var = new ck3.a0(pageAdapter.mo2157x19263085(), mo2158x12501425, null, 0, 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doMaskAnimation use itemRect");
            android.app.Activity mo2157x19263085 = pageAdapter.mo2157x19263085();
            android.graphics.Rect b18 = b(pageAdapter);
            android.view.ViewGroup a17 = pageAdapter.a();
            java.lang.Integer valueOf = a17 != null ? java.lang.Integer.valueOf(a17.getWidth()) : null;
            android.view.ViewGroup a18 = pageAdapter.a();
            a0Var = new ck3.a0(mo2157x19263085, mo2158x12501425, b18, valueOf, a18 != null ? java.lang.Integer.valueOf(a18.getHeight()) : null);
            bitmap2 = bitmap4;
        }
        a0Var.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        int i17 = ballPos.x;
        int i18 = ballPos.y;
        int i19 = al3.c.f87384a;
        int i27 = al3.c.f87385b / 2;
        a0Var.f123988r = i17;
        a0Var.f123989s = i18;
        a0Var.f123987q = i27;
        a0Var.m15005x4b34b00f((int) f17);
        a0Var.m15006xc6cf6336(new ck3.l(dVar, bitmap2, a0Var));
        android.view.ViewGroup a19 = pageAdapter.a();
        if (a19 != null) {
            a19.addView(a0Var, a19.getChildCount());
        }
        if (z18 && !z19 && (mo2159xc2a54588 = pageAdapter.mo2159xc2a54588()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo2159xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/multitask/adapter/IMultiTaskPageAdapter;Landroid/graphics/Point;Landroid/graphics/Bitmap;ZFLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;ZZ)Landroid/graphics/Bitmap;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo2159xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo2159xc2a54588, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/multitask/adapter/IMultiTaskPageAdapter;Landroid/graphics/Point;Landroid/graphics/Bitmap;ZFLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;ZZ)Landroid/graphics/Bitmap;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai()) {
            a0Var.a(z18 ? 250 : 500, ta5.h.f498412a.a(), z18);
        } else {
            a0Var.a(250, new android.view.animation.LinearInterpolator(), z18);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = a19 != null ? java.lang.Integer.valueOf(a19.getWidth()) : null;
        objArr2[1] = a19 != null ? java.lang.Integer.valueOf(a19.getHeight()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "decorView width: %s, height: %s", objArr2);
        return bitmap2;
    }

    public final android.graphics.Rect b(ak3.c cVar) {
        android.graphics.Rect rect;
        android.view.ViewGroup a17 = cVar.a();
        android.content.Context context = a17 != null ? a17.getContext() : null;
        if (context == null || (rect = ((ak3.i) cVar).f87120i) == null) {
            return null;
        }
        return new android.graphics.Rect(i65.a.b(context, rect.left), i65.a.b(context, rect.top), i65.a.b(context, rect.right), i65.a.b(context, rect.bottom));
    }
}
