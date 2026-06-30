package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class u9 {
    public static boolean a(android.content.Context context, com.tencent.mm.plugin.appbrand.t9 t9Var, int i17, boolean z17) {
        java.lang.String str;
        if (context == null || t9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "add fail, invalid argument");
            return false;
        }
        java.lang.String[] strArr = t9Var.f88973b;
        if (strArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "no such user");
            return false;
        }
        android.graphics.Bitmap d17 = d(strArr);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "bitmap do not exist, delay get.");
            return true;
        }
        android.content.Intent c17 = c(context, t9Var, i17, e(context, d17, i17), true);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "add fail, intent is null");
            return false;
        }
        java.lang.String str2 = null;
        if (((android.content.Intent) c17.getParcelableExtra("android.intent.extra.shortcut.INTENT")) != null) {
            ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = t9Var.f88975d;
            sb6.append(str3);
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            java.lang.String g17 = wo.w0.g(true);
            ((zd0.e) hVar).getClass();
            java.lang.String h17 = xp1.c.h(sb7, g17);
            if (h17 != null) {
                ae0.h hVar2 = (ae0.h) i95.n0.c(ae0.h.class);
                byte[] bytes = h17.getBytes();
                ((zd0.e) hVar2).getClass();
                str = xp1.c.o(bytes);
            } else {
                str = null;
            }
            ae0.h hVar3 = (ae0.h) i95.n0.c(ae0.h.class);
            java.lang.String c18 = wo.w0.c();
            ((zd0.e) hVar3).getClass();
            java.lang.String h18 = xp1.c.h(str3 + i17, c18);
            if (h17 != null) {
                ae0.h hVar4 = (ae0.h) i95.n0.c(ae0.h.class);
                byte[] bytes2 = h18.getBytes();
                ((zd0.e) hVar4).getClass();
                str2 = xp1.c.o(bytes2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "appId: %s, shortcutId: %s", str3, str);
        } else {
            str = null;
        }
        try {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.c.a(context, c17, str2, str, z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "add shortcut %s", t9Var.f88976e);
            return true;
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandShortcutManager", e17.toString());
            return false;
        }
    }

    public static void b(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str) {
        android.graphics.RectF rectF;
        if (context == null || bitmap == null || bitmap.isRecycled() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float g17 = i65.a.g(context);
        float f17 = g17 * 4.0f;
        float f18 = g17 * 2.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(g17 * 6.0f);
        paint.setFakeBoldText(true);
        paint.setAntiAlias(true);
        float measureText = paint.measureText(str);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f19 = fontMetrics.bottom - fontMetrics.top;
        paint.setColor(android.graphics.Color.parseColor("#459AE9"));
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            float f27 = width;
            float f28 = height;
            rectF = new android.graphics.RectF((f27 - measureText) - (f17 * 2.0f), (f28 - f19) - (2.0f * f18), f27, f28);
        } else {
            float f29 = height;
            rectF = new android.graphics.RectF(0.0f, (f29 - f19) - (f18 * 2.0f), measureText + (2.0f * f17), f29);
        }
        canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint);
        paint.setColor(-1);
        canvas.drawText(str, rectF.left + f17, (rectF.top + f18) - fontMetrics.ascent, paint);
    }

    public static android.content.Intent c(android.content.Context context, com.tencent.mm.plugin.appbrand.t9 t9Var, int i17, android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str;
        if (t9Var == null || context == null || (str = t9Var.f88976e) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "buildIntent, wrong parameters");
            return null;
        }
        if (bitmap == null && z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "no bmp");
            return null;
        }
        java.lang.String str2 = t9Var.f88974c;
        if (!android.text.TextUtils.isEmpty(str2)) {
            str = str2;
        }
        android.content.Intent wi6 = com.tencent.mm.plugin.appbrand.p9.f86331a.wi(context.getPackageName(), i17, t9Var.f88976e, t9Var.f88974c, t9Var.f88973b, t9Var.f88975d, t9Var.f88972a, 1);
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.INTENT", wi6);
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        return intent;
    }

    public static android.graphics.Bitmap d(java.lang.String[] strArr) {
        android.graphics.Bitmap bitmap;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                bitmap = null;
                break;
            }
            java.lang.String str = strArr[i17];
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "getAvatarBitmap :url:%s", str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (bitmap = l01.d0.f314761a.f(str, null)) != null && !bitmap.isRecycled()) {
                break;
            }
            i17++;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "use default Icon");
        android.graphics.Bitmap decodeResource = bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.miniprogram_default_avatar, null);
        if (decodeResource.isRecycled()) {
            return null;
        }
        return decodeResource;
    }

    public static android.graphics.Bitmap e(android.content.Context context, android.graphics.Bitmap bitmap, int i17) {
        android.graphics.Bitmap bitmap2 = null;
        if (context != null && bitmap != null && !bitmap.isRecycled()) {
            int g17 = (int) (i65.a.g(context) * 48.0f);
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, g17, g17, true);
            if (createScaledBitmap != null) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Boolean.TRUE);
                arrayList.add(config);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(createScaledBitmap, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/AppBrandShortcutManager", "getFinalBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                bitmap2 = createScaledBitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                yj0.a.e(createScaledBitmap, bitmap2, "com/tencent/mm/plugin/appbrand/AppBrandShortcutManager", "getFinalBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "bitmap recycle %s", createScaledBitmap);
                createScaledBitmap.recycle();
            }
            if (i17 == 2) {
                b(context, bitmap2, i65.a.r(context, com.tencent.mm.R.string.f490294qz));
            } else if (i17 == 1) {
                b(context, bitmap2, i65.a.r(context, com.tencent.mm.R.string.f490295r0));
            }
        }
        return bitmap2;
    }

    public static boolean f(android.content.Context context, com.tencent.mm.plugin.appbrand.t9 t9Var, int i17) {
        if (context == null || t9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or config is null.");
            return false;
        }
        java.lang.String[] strArr = t9Var.f88973b;
        if (strArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "no such user");
            return false;
        }
        android.content.Intent c17 = c(context, t9Var, i17, e(context, d(strArr), i17), false);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
            return false;
        }
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.c.i(context, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", t9Var.f88976e);
        return true;
    }
}
