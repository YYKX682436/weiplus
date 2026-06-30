package com.davemorrissey.labs.subscaleview.decoder;

/* loaded from: classes12.dex */
public class SkiaImageDecoder implements com.davemorrissey.labs.subscaleview.decoder.ImageDecoder {
    private static final java.lang.String ASSET_PREFIX = "file:///android_asset/";
    private static final java.lang.String FILE_PREFIX = "file://";
    private static final java.lang.String RESOURCE_PREFIX = "android.resource://";
    private byte _hellAccFlag_;
    private final android.graphics.Bitmap.Config bitmapConfig;

    public SkiaImageDecoder() {
        this(null);
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    public android.graphics.Bitmap decode(android.content.Context context, android.net.Uri uri) {
        java.io.InputStream openInputStream;
        android.graphics.Bitmap bitmap;
        int i17;
        java.lang.String uri2 = uri.toString();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = this.bitmapConfig;
        if (uri2.startsWith(RESOURCE_PREFIX)) {
            java.lang.String authority = uri.getAuthority();
            android.content.res.Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i17 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && android.text.TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i17 = com.tencent.mm.sdk.platformtools.t8.P(pathSegments.get(0), 0);
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                i17 = 0;
            }
            android.content.res.Resources resources2 = context.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(resources2);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/davemorrissey/labs/subscaleview/decoder/SkiaImageDecoder", "decode", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        } else {
            java.io.InputStream inputStream = null;
            if (uri2.startsWith(ASSET_PREFIX)) {
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
            } else if (uri2.startsWith(FILE_PREFIX)) {
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

    public SkiaImageDecoder(android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap.Config preferredBitmapConfig = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = android.graphics.Bitmap.Config.RGB_565;
        }
    }
}
