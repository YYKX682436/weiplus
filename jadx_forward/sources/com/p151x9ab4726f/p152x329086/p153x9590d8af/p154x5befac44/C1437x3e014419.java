package com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44;

/* renamed from: com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder */
/* loaded from: classes12.dex */
public class C1437x3e014419 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1435x8963c289 {

    /* renamed from: ASSET_PREFIX */
    private static final java.lang.String f4425xa8fce6e1 = "file:///android_asset/";

    /* renamed from: FILE_PREFIX */
    private static final java.lang.String f4426x9213d2b5 = "file://";

    /* renamed from: RESOURCE_PREFIX */
    private static final java.lang.String f4427x903e3e3 = "android.resource://";

    /* renamed from: _hellAccFlag_ */
    private byte f4428x7f11beae;

    /* renamed from: bitmapConfig */
    private final android.graphics.Bitmap.Config f4429xcfe98151;

    public C1437x3e014419() {
        this(null);
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1435x8963c289
    /* renamed from: decode */
    public android.graphics.Bitmap mo15469xb06291ee(android.content.Context context, android.net.Uri uri) {
        java.io.InputStream openInputStream;
        android.graphics.Bitmap bitmap;
        int i17;
        java.lang.String uri2 = uri.toString();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = this.f4429xcfe98151;
        if (uri2.startsWith(f4427x903e3e3)) {
            java.lang.String authority = uri.getAuthority();
            android.content.res.Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i17 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && android.text.TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(pathSegments.get(0), 0);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                i17 = 0;
            }
            android.content.res.Resources resources2 = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(resources2);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        } else {
            java.io.InputStream inputStream = null;
            if (uri2.startsWith(f4425xa8fce6e1)) {
                java.io.InputStream open = context.getAssets().open(uri2.substring(22));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options);
                arrayList2.add(null);
                arrayList2.add(open);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
                yj0.a.e(obj2, bitmap, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            } else if (uri2.startsWith(f4426x9213d2b5)) {
                java.lang.String substring = uri2.substring(7);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(options);
                arrayList3.add(substring);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj3, arrayList3.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList3.get(0), (android.graphics.BitmapFactory.Options) arrayList3.get(1));
                yj0.a.e(obj3, bitmap, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            } else {
                try {
                    openInputStream = context.getContentResolver().openInputStream(uri);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(options);
                    arrayList4.add(null);
                    arrayList4.add(openInputStream);
                    java.lang.Object obj4 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(obj4, arrayList4.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList4.get(0), (android.graphics.Rect) arrayList4.get(1), (android.graphics.BitmapFactory.Options) arrayList4.get(2));
                    yj0.a.e(obj4, decodeStream, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    bitmap = decodeStream;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new java.lang.RuntimeException("Skia image region decoder returned null bitmap - image format may not be supported");
    }

    public C1437x3e014419(android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap.Config m15597x9613fabc = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15597x9613fabc();
        if (config != null) {
            this.f4429xcfe98151 = config;
        } else if (m15597x9613fabc != null) {
            this.f4429xcfe98151 = m15597x9613fabc;
        } else {
            this.f4429xcfe98151 = android.graphics.Bitmap.Config.RGB_565;
        }
    }
}
