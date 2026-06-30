package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory */
/* loaded from: classes13.dex */
public final class C26011x93ded50c {

    /* renamed from: HUE_AZURE */
    public static final float f49350x18eba448 = 210.0f;

    /* renamed from: HUE_BLUE */
    public static final float f49351x42de8f61 = 240.0f;

    /* renamed from: HUE_CYAN */
    public static final float f49352x42df322a = 180.0f;

    /* renamed from: HUE_GREEN */
    public static final float f49353x193c50bc = 120.0f;

    /* renamed from: HUE_MAGENTA */
    public static final float f49354xdbea4c22 = 300.0f;

    /* renamed from: HUE_ORANGE */
    public static final float f49355x1bf2db75 = 30.0f;

    /* renamed from: HUE_RED */
    public static final float f49356x75c5588a = 0.0f;

    /* renamed from: HUE_ROSE */
    public static final float f49357x42e5e056 = 330.0f;

    /* renamed from: HUE_VIOLET */
    public static final float f49358x276c49c6 = 270.0f;

    /* renamed from: HUE_YELLOW */
    public static final float f49359x2c5119bb = 60.0f;

    /* renamed from: sTencentMapContextList */
    private static final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8> f49361xd83383e3 = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: sAttachIndex */
    private static final java.util.concurrent.atomic.AtomicInteger f49360xaa335f1a = new java.util.concurrent.atomic.AtomicInteger(0);

    private C26011x93ded50c() {
    }

    /* renamed from: attachMapContext */
    public static void m99325x14ea20d8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8> list = f49361xd83383e3;
        if (list.contains(interfaceC25963x17625b8)) {
            return;
        }
        list.add(interfaceC25963x17625b8);
        f49360xaa335f1a.incrementAndGet();
    }

    /* renamed from: createBitmapFromBitmap */
    private static android.graphics.Bitmap m99326xa872d924(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (bitmap.isRecycled()) {
                return null;
            }
            return bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: createBitmapFromBitmaps */
    private static android.graphics.Bitmap[] m99327x65e84bcf(android.graphics.Bitmap... bitmapArr) {
        int length = bitmapArr.length;
        android.graphics.Bitmap[] bitmapArr2 = new android.graphics.Bitmap[length];
        for (int i17 = 0; i17 < length; i17++) {
            try {
                bitmapArr2[i17] = m99326xa872d924(bitmapArr[i17]);
            } catch (java.lang.Throwable unused) {
            }
        }
        return bitmapArr2;
    }

    /* renamed from: defaultMarker */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99328x2ec1e1db() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99330x2ec1e1db(m99347xcc9dbcf);
        }
        return null;
    }

    /* renamed from: detachMapContext */
    public static void m99332x75c480a6(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        if (f49361xd83383e3.remove(interfaceC25963x17625b8)) {
            f49360xaa335f1a.decrementAndGet();
        }
    }

    /* renamed from: fromAsset */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99334x3281d66(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99333x3281d66(m99347xcc9dbcf, str);
        }
        return null;
    }

    /* renamed from: fromBitmap */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99335x63040d79(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99336x63040d79(m99347xcc9dbcf, bitmap);
        }
        return null;
    }

    /* renamed from: fromBitmaps */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99338xfd7da21a(android.graphics.Bitmap... bitmapArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99337xfd7da21a(m99347xcc9dbcf, bitmapArr);
        }
        return null;
    }

    /* renamed from: fromFile */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99340xb5c99c46(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99339xb5c99c46(m99347xcc9dbcf, str);
        }
        return null;
    }

    /* renamed from: fromPath */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99342xb5ce0aef(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99341xb5ce0aef(m99347xcc9dbcf, str);
        }
        return null;
    }

    /* renamed from: fromResource */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99343x5b20f5d8(int i17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99344x5b20f5d8(m99347xcc9dbcf, i17);
        }
        return null;
    }

    /* renamed from: fromView */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99345xb5d0e16f(android.view.View view) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99346xb5d0e16f(m99347xcc9dbcf, view);
        }
        return null;
    }

    /* renamed from: getActiveMapContext */
    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf() {
        int i17 = f49360xaa335f1a.get();
        if (i17 <= 0) {
            return null;
        }
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8> list = f49361xd83383e3;
        if (i17 <= list.size()) {
            return list.get(i17 - 1);
        }
        return null;
    }

    /* renamed from: defaultMarker */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99329x2ec1e1db(float f17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 m99347xcc9dbcf = m99347xcc9dbcf();
        if (m99347xcc9dbcf != null) {
            return m99331x2ec1e1db(m99347xcc9dbcf, f17);
        }
        return null;
    }

    /* renamed from: fromAsset */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99333x3281d66(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, java.lang.String str) {
        return interfaceC25963x17625b8.mo36628x18d39f1a(str, 2);
    }

    /* renamed from: fromBitmap */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99336x63040d79(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return interfaceC25963x17625b8.mo36626x18d39f1a(m99326xa872d924(bitmap), 7);
    }

    /* renamed from: fromBitmaps */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99337xfd7da21a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.graphics.Bitmap... bitmapArr) {
        if (interfaceC25963x17625b8 == null || bitmapArr == null) {
            return null;
        }
        return interfaceC25963x17625b8.mo36629x18d39f1a(m99327x65e84bcf(bitmapArr), 10);
    }

    /* renamed from: fromFile */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99339xb5c99c46(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, java.lang.String str) {
        return interfaceC25963x17625b8.mo36628x18d39f1a(str, 3);
    }

    /* renamed from: fromPath */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99341xb5ce0aef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, java.lang.String str) {
        return interfaceC25963x17625b8.mo36628x18d39f1a(str, 4);
    }

    /* renamed from: fromResource */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99344x5b20f5d8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, int i17) {
        return interfaceC25963x17625b8.mo36625x18d39f1a(i17, 1);
    }

    /* renamed from: fromView */
    public static synchronized com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99346xb5d0e16f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.view.View view) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.class) {
            if (view == null) {
                return null;
            }
            try {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.buildDrawingCache();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99336x63040d79 = m99336x63040d79(interfaceC25963x17625b8, view.getDrawingCache());
                view.destroyDrawingCache();
                return m99336x63040d79;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: defaultMarker */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99330x2ec1e1db(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        return interfaceC25963x17625b8.mo36624x18d39f1a(5);
    }

    /* renamed from: defaultMarker */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99331x2ec1e1db(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, float f17) {
        return interfaceC25963x17625b8.mo36623x18d39f1a(f17, 6);
    }
}
