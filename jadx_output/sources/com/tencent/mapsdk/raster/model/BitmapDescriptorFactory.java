package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class BitmapDescriptorFactory {
    public static com.tencent.mapsdk.raster.model.BitmapDescriptor defaultMarker() {
        return fromAsset("marker.png");
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromAsset(java.lang.String str) {
        try {
            java.io.InputStream resourceAsStream = com.tencent.mapsdk.raster.model.BitmapDescriptorFactory.class.getResourceAsStream("/assets/" + str);
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            return fromBitmap(decodeStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new com.tencent.mapsdk.raster.model.BitmapDescriptor(bitmap);
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromFile(java.lang.String str) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(str));
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
            return fromBitmap(decodeStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromPath(java.lang.String str) {
        try {
            return fromBitmap(android.graphics.BitmapFactory.decodeFile(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromResource(int i17) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        try {
            android.content.Context context = com.tencent.mapsdk.rastercore.core.MapContext.getContext();
            if (context == null) {
                com.tencent.mapsdk.rastercore.tools.IO.safeClose(null);
                return null;
            }
            inputStream = context.getResources().openRawResource(i17);
            try {
                com.tencent.mapsdk.raster.model.BitmapDescriptor fromBitmap = fromBitmap(android.graphics.BitmapFactory.decodeStream(inputStream));
                com.tencent.mapsdk.rastercore.tools.IO.safeClose(inputStream);
                return fromBitmap;
            } catch (java.lang.Exception unused) {
                com.tencent.mapsdk.rastercore.tools.IO.safeClose(inputStream);
                return null;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.tencent.mapsdk.rastercore.tools.IO.safeClose(inputStream);
                throw th6;
            }
        } catch (java.lang.Exception unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }

    public static com.tencent.mapsdk.raster.model.BitmapDescriptor fromView(android.view.View view) {
        try {
            android.content.Context context = com.tencent.mapsdk.rastercore.core.MapContext.getContext();
            if (context != null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
                frameLayout.addView(view);
                frameLayout.destroyDrawingCache();
                return fromBitmap(getViewBitmap(frameLayout));
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    private static android.graphics.Bitmap getViewBitmap(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache().copy(android.graphics.Bitmap.Config.ARGB_8888, false);
    }
}
