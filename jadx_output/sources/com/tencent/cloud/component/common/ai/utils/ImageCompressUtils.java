package com.tencent.cloud.component.common.ai.utils;

/* loaded from: classes12.dex */
public class ImageCompressUtils {
    public static final int DEFAULT_LEVEL = 1;
    public static final int MINIMUM_LEVEL = 2;
    private byte _hellAccFlag_;

    public static byte[] compressBitmap(android.graphics.Bitmap bitmap, int i17, int i18) {
        int i19;
        int i27;
        int i28 = 88;
        int i29 = i18 == 88 ? 85 : 88;
        if (i18 == 2) {
            i27 = i17;
            i19 = 5;
        } else {
            i19 = 10;
            i28 = i29;
            i27 = 1024;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i28, byteArrayOutputStream);
                while (byteArrayOutputStream.toByteArray().length / 1024 > i27 && i28 > 5) {
                    byteArrayOutputStream.reset();
                    i28 -= i19;
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i28, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.io.IOException e17) {
            e17.getLocalizedMessage();
            return null;
        }
    }

    public static android.graphics.Bitmap createBitMapByUri(android.content.Context context, android.net.Uri uri, int i17, android.graphics.Point point) {
        int i18;
        if (i17 != 2 || point == null) {
            i18 = 2;
        } else {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inDither = true;
            options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            try {
                java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                arrayList.add(null);
                arrayList.add(openInputStream);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "createBitMapByUri", "(Landroid/content/Context;Landroid/net/Uri;ILandroid/graphics/Point;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "createBitMapByUri", "(Landroid/content/Context;Landroid/net/Uri;ILandroid/graphics/Point;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                int i19 = options.outWidth;
                int i27 = options.outHeight;
                int i28 = point.x;
                i18 = java.lang.Math.min(i19 / i28, i27 / i28);
            } catch (java.io.FileNotFoundException e17) {
                e17.getLocalizedMessage();
                i18 = 2;
            }
            if (i18 > 5) {
                i18 = 5;
            }
        }
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        options2.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        if (i17 == 2) {
            options2.inSampleSize = i18;
        }
        java.io.InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options2);
        arrayList2.add(null);
        arrayList2.add(openInputStream2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "createBitMapByUri", "(Landroid/content/Context;Landroid/net/Uri;ILandroid/graphics/Point;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0), (android.graphics.Rect) arrayList2.get(1), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
        yj0.a.e(obj2, decodeStream, "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "createBitMapByUri", "(Landroid/content/Context;Landroid/net/Uri;ILandroid/graphics/Point;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeStream;
    }

    public static byte[] doCompressYuvImage(android.graphics.YuvImage yuvImage, int i17) {
        int width = yuvImage.getWidth();
        int height = yuvImage.getHeight();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                if (i17 == 1) {
                    yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, width, height), 88, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                if (i17 != 2) {
                    byteArrayOutputStream.close();
                    return null;
                }
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, width, height), 88, byteArrayOutputStream);
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
                options.inSampleSize = 2;
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                int size = byteArrayOutputStream.size();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(size));
                arrayList.add(0);
                arrayList.add(byteArray2);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "doCompressYuvImage", "(Landroid/graphics/YuvImage;I)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
                yj0.a.e(obj, decodeByteArray, "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "doCompressYuvImage", "(Landroid/graphics/YuvImage;I)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                byteArrayOutputStream.reset();
                decodeByteArray.compress(android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray3;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static byte[] doCompressYuvImageByQuality(android.graphics.YuvImage yuvImage, int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(100, i17));
        int width = yuvImage.getWidth();
        int height = yuvImage.getHeight();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, width, height), max, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static int getBitmapDegree(java.lang.String str) {
        int attributeInt;
        try {
            attributeInt = new android.media.ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        } catch (java.io.IOException e17) {
            e17.getLocalizedMessage();
        }
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public static java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor query = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        java.lang.String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.String getPath(android.content.Context context, android.net.Uri uri) {
        android.net.Uri uri2 = null;
        if (android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                java.lang.String[] split = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(android.provider.DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    java.lang.String[] split2 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                    java.lang.String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new java.lang.String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(android.net.Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(android.net.Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(android.net.Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static android.graphics.Bitmap rotateBitmapByDegree(android.graphics.Bitmap bitmap, int i17) {
        android.graphics.Bitmap bitmap2;
        if (i17 == 0) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i17);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(bitmap);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "rotateBitmapByDegree", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            bitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, bitmap2, "com/tencent/cloud/component/common/ai/utils/ImageCompressUtils", "rotateBitmapByDegree", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        } catch (java.lang.OutOfMemoryError unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            bitmap2 = bitmap;
        }
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }
}
