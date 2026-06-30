package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tv implements com.tencent.mapsdk.internal.om {

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f52253c;

    /* renamed from: d, reason: collision with root package name */
    private final float f52254d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f52255e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f52256f;

    public tv(android.content.Context context, java.lang.String str) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f52253c = applicationContext;
        this.f52254d = com.tencent.mapsdk.internal.hs.a(applicationContext);
        this.f52255e = str;
    }

    private android.graphics.Bitmap b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.io.InputStream b17 = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mz.a(this.f52253c, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(this.f52255e) + str);
        if (b17 == null) {
            b17 = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mz.a(this.f52253c, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b(this.f52255e) + str);
        }
        if (b17 == null) {
            b17 = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mz.a(this.f52253c, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).e() + str);
        }
        if (b17 == null && this.f52256f != null) {
            b17 = com.tencent.mapsdk.internal.kt.a(new java.io.File(this.f52256f, str));
        }
        if (b17 == null) {
            if (com.tencent.mapsdk.internal.mw.a() != null) {
                b17 = com.tencent.mapsdk.internal.mw.b(this.f52253c, com.tencent.mapsdk.internal.mw.a() + str);
            } else if (com.tencent.mapsdk.internal.mw.b() != null) {
                b17 = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mw.b() + str);
            }
        }
        if (b17 == null) {
            b17 = com.tencent.mapsdk.internal.mw.a(this.f52253c, str);
        }
        if (b17 == null) {
            b17 = com.tencent.mapsdk.internal.mw.b(this.f52253c, str);
        }
        if (b17 == null) {
            return null;
        }
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(b17);
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) b17);
        return decodeStream;
    }

    @Override // com.tencent.mapsdk.internal.om
    public final java.lang.String a() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.om
    public final void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("../")) {
            str = str.replaceAll("\\.\\./", "");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f52256f = str;
    }

    @Override // com.tencent.mapsdk.internal.om
    public final void a(java.lang.String str, com.tencent.mapsdk.engine.jni.models.IconImageInfo iconImageInfo) {
        android.graphics.Bitmap a17 = com.tencent.mapsdk.internal.hl.f49771b.a(str);
        if (a17 == null) {
            a17 = com.tencent.mapsdk.internal.hl.f49771b.a(str);
        }
        iconImageInfo.bitmap = a17;
        if (!str.endsWith(com.tencent.mapsdk.internal.ep.f49374s) && !str.contains("@2x")) {
            if (!str.endsWith("@3x.png") && !str.contains("@3x")) {
                iconImageInfo.scale = this.f52254d;
            } else {
                iconImageInfo.scale = 3.0f;
            }
        } else {
            iconImageInfo.scale = 2.0f;
        }
        if (this.f52253c != null && a17 == null) {
            try {
                if (str.startsWith("poi_icon") || str.startsWith(com.tencent.mapsdk.internal.ep.f49373r)) {
                    a17 = b(com.tencent.mapsdk.internal.hr.b(str) + com.tencent.mapsdk.internal.ep.f49374s);
                }
                if (a17 != null) {
                    iconImageInfo.bitmap = a17;
                    iconImageInfo.scale = 2.0f;
                    return;
                }
                iconImageInfo.bitmap = b(str);
                if (!str.equals(com.tencent.mapsdk.internal.om.f50593a) && !str.equals(com.tencent.mapsdk.internal.om.f50594b)) {
                    iconImageInfo.scale = 1.0f;
                    return;
                }
                iconImageInfo.scale = this.f52254d;
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
    }
}
