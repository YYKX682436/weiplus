package bp;

/* loaded from: classes13.dex */
public abstract class b extends android.graphics.BitmapFactory {

    /* renamed from: a, reason: collision with root package name */
    public static bp.a f104562a;

    /* renamed from: decodeResource */
    public static android.graphics.Bitmap m10969xb866ec1c(android.content.res.Resources resources, int i17, android.graphics.BitmapFactory.Options options) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        bp.a aVar = f104562a;
        java.io.InputStream inputStream = null;
        android.graphics.Bitmap bitmap3 = null;
        java.io.InputStream inputStream2 = null;
        if (aVar != null) {
            if (((j65.r) aVar).f379505a.g(resources, i17)) {
                bitmap2 = m95.a.a(resources, i17, options != null ? options.inDensity / 160.0f : 0.0f);
            } else {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
        try {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            java.io.InputStream openRawResource = resources.openRawResource(i17, typedValue);
            try {
                try {
                    bitmap3 = android.graphics.BitmapFactory.decodeResourceStream(resources, typedValue, openRawResource, null, options);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream = openRawResource;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused2) {
            }
            if (bitmap3 == null) {
                try {
                    bitmap3 = android.graphics.BitmapFactory.decodeStream(openRawResource);
                } catch (java.lang.Exception unused3) {
                    bitmap = bitmap3;
                    inputStream2 = openRawResource;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    bitmap3 = bitmap;
                    if (bitmap3 == null) {
                    }
                    return bitmap3;
                }
            }
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (java.io.IOException unused5) {
                }
            }
        } catch (java.lang.Exception unused6) {
            bitmap = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        if (bitmap3 == null || options == null) {
            return bitmap3;
        }
        throw new java.lang.IllegalArgumentException("Problem decoding into existing bitmap");
    }
}
