package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f265422a = new java.util.HashMap();

    public static android.graphics.Bitmap a(java.lang.String str) {
        android.graphics.Bitmap decodeByteArray;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.HashMap hashMap = f265422a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(str);
        if (weakReference != null && weakReference.get() != null && !((android.graphics.Bitmap) weakReference.get()).isRecycled()) {
            return (android.graphics.Bitmap) weakReference.get();
        }
        byte[] decode = android.util.Base64.decode(str, 0);
        if (decode == null) {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3)), "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        int min = java.lang.Math.min(i17, i18);
        options.inJustDecodeBounds = false;
        if (min > 96) {
            options.inSampleSize = java.lang.Math.max((int) ((min * 1.0f) / 96.0f), 1);
            int length2 = decode.length;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(options);
            arrayList2.add(java.lang.Integer.valueOf(length2));
            arrayList2.add(0);
            arrayList2.add(decode);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(3));
            yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                return null;
            }
            i17 = decodeByteArray.getWidth();
            i18 = decodeByteArray.getHeight();
            min = java.lang.Math.min(i17, i18);
        } else {
            int length3 = decode.length;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(options);
            arrayList3.add(java.lang.Integer.valueOf(length3));
            arrayList3.add(0);
            arrayList3.add(decode);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue(), ((java.lang.Integer) arrayList3.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList3.get(3));
            yj0.a.e(obj3, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                return null;
            }
        }
        int i19 = min / 2;
        int max = java.lang.Math.max((i17 / 2) - i19, 0);
        int max2 = java.lang.Math.max((i18 / 2) - i19, 0);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(min));
        arrayList4.add(java.lang.Integer.valueOf(min));
        arrayList4.add(java.lang.Integer.valueOf(max2));
        arrayList4.add(java.lang.Integer.valueOf(max));
        arrayList4.add(decodeByteArray);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue(), ((java.lang.Integer) arrayList4.get(2)).intValue(), ((java.lang.Integer) arrayList4.get(3)).intValue(), ((java.lang.Integer) arrayList4.get(4)).intValue());
        yj0.a.e(obj4, createBitmap, "com/tencent/mm/plugin/webview/ui/tools/RemoteUtil", "getBitmapFromBase64DataString", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        if (createBitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, 96, 96, false);
        if (createBitmap != createScaledBitmap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.RemoteUtil", "bitmap recycle %s", createBitmap.toString());
            createBitmap.recycle();
        }
        if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
            hashMap.put(str, new java.lang.ref.WeakReference(createScaledBitmap));
        }
        return createScaledBitmap;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, int i17, java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr == null || objArr.length == 0) {
            return;
        }
        try {
            for (java.lang.Object obj : objArr) {
                arrayList.add(java.lang.String.valueOf(obj));
            }
            v0Var.hj(i17, arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebView.RemoteUtil", "kvReport, ex = " + e17.getMessage());
        }
    }

    public static int c(java.lang.String str, int i17) {
        return (int) d(str, java.lang.Long.valueOf(i17).longValue());
    }

    public static long d(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return j17;
        }
        if (str.startsWith("#") && str.length() == 4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
            sb6.insert(2, str.charAt(1));
            sb6.insert(4, str.charAt(2));
            sb6.insert(6, str.charAt(3));
            str = sb6.toString();
        }
        try {
            return android.graphics.Color.parseColor(str) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.RemoteUtil", "Failed to parse color: %s", str);
            return j17;
        }
    }

    public static boolean e(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, java.lang.Runnable runnable) {
        if (z0Var == null) {
            if (runnable != null) {
                runnable.run();
            }
            return true;
        }
        android.os.Bundle bundle2 = new android.os.Bundle(3);
        bundle2.putBundle("open_ui_with_webview_ui_extras", bundle);
        bundle2.putString("open_ui_with_webview_ui_plugin_name", str);
        bundle2.putString("open_ui_with_webview_ui_plugin_entry", str2);
        try {
            z0Var.i(101, bundle2);
            return true;
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebView.RemoteUtil", e17, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", str, str2);
            return false;
        } catch (java.lang.Exception e18) {
            if (runnable != null) {
                runnable.run();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebView.RemoteUtil", e18, "startUIWithWebViewUI, exp, pluginName %s, pluginEntry %s", str, str2);
            return false;
        }
    }
}
