package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.BitmapDescriptorFactory */
/* loaded from: classes13.dex */
public final class C4393x93ded50c {
    /* renamed from: defaultMarker */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37088x2ec1e1db() {
        return m37089x3281d66("marker.png");
    }

    /* renamed from: fromAsset */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37089x3281d66(java.lang.String str) {
        try {
            java.io.InputStream resourceAsStream = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4393x93ded50c.class.getResourceAsStream("/assets/" + str);
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            return m37090x63040d79(decodeStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: fromBitmap */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37090x63040d79(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e(bitmap);
    }

    /* renamed from: fromFile */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37091xb5c99c46(java.lang.String str) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(str));
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
            return m37090x63040d79(decodeStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: fromPath */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37092xb5ce0aef(java.lang.String str) {
        try {
            return m37090x63040d79(android.graphics.BitmapFactory.decodeFile(str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: fromResource */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37093x5b20f5d8(int i17) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        try {
            android.content.Context m37445x76847179 = com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p537x2eaf9f.C4424xb67884d3.m37445x76847179();
            if (m37445x76847179 == null) {
                com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b(null);
                return null;
            }
            inputStream = m37445x76847179.getResources().openRawResource(i17);
            try {
                com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37090x63040d79 = m37090x63040d79(android.graphics.BitmapFactory.decodeStream(inputStream));
                com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b(inputStream);
                return m37090x63040d79;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b(inputStream);
                return null;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p538x696c9db.IO.m37447xbb07de6b(inputStream);
                throw th6;
            }
        } catch (java.lang.Exception unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }

    /* renamed from: fromView */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37094xb5d0e16f(android.view.View view) {
        try {
            android.content.Context m37445x76847179 = com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p537x2eaf9f.C4424xb67884d3.m37445x76847179();
            if (m37445x76847179 != null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m37445x76847179);
                frameLayout.addView(view);
                frameLayout.destroyDrawingCache();
                return m37090x63040d79(m37095x61a6802a(frameLayout));
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    /* renamed from: getViewBitmap */
    private static android.graphics.Bitmap m37095x61a6802a(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache().copy(android.graphics.Bitmap.Config.ARGB_8888, false);
    }
}
