package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg */
/* loaded from: classes13.dex */
public class C11763x6a580426 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11760xd89292d6 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11763x6a580426> f33533x681a0c0c = new b91.l();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158617f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        char c17;
        android.graphics.BitmapShader bitmapShader;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f158616e)) {
            return false;
        }
        e91.b bVar = iVar.f552245b;
        android.graphics.BitmapShader bitmapShader2 = null;
        android.graphics.Bitmap a17 = ((zg1.d) iVar.f552249f).a(iVar, this.f158616e, null, null);
        if (a17 != null && !a17.isRecycled()) {
            java.lang.String str = this.f158617f;
            int c18 = ik1.w.c(a17.getWidth());
            int c19 = ik1.w.c(a17.getHeight());
            str.getClass();
            switch (str.hashCode()) {
                case -934531685:
                    if (str.equals("repeat")) {
                        c17 = 0;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -724648153:
                    if (str.equals("no-repeat")) {
                        c17 = 1;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -436782906:
                    if (str.equals("repeat-x")) {
                        c17 = 2;
                        break;
                    }
                    c17 = 65535;
                    break;
                case -436782905:
                    if (str.equals("repeat-y")) {
                        c17 = 3;
                        break;
                    }
                    c17 = 65535;
                    break;
                default:
                    c17 = 65535;
                    break;
            }
            if (c17 != 0) {
                if (c17 == 1) {
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(c19 + 1));
                    arrayList.add(java.lang.Integer.valueOf(c18 + 1));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    new android.graphics.Canvas(createBitmap).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                    android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
                    bitmapShader = new android.graphics.BitmapShader(createBitmap, tileMode, tileMode);
                } else if (c17 == 2) {
                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(config2);
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(c19 + 1));
                    arrayList2.add(java.lang.Integer.valueOf(c18));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                    yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    new android.graphics.Canvas(createBitmap2).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                    bitmapShader = new android.graphics.BitmapShader(createBitmap2, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                } else if (c17 == 3) {
                    android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(config3);
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(c19));
                    arrayList3.add(java.lang.Integer.valueOf(c18 + 1));
                    java.lang.Object obj3 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                    yj0.a.e(obj3, createBitmap3, "com/tencent/mm/plugin/appbrand/canvas/action/arg/RealSetFillStyleActionPatternArg", "buildShader", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Shader;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    new android.graphics.Canvas(createBitmap3).drawBitmap(a17, new android.graphics.Rect(0, 0, a17.getWidth(), a17.getHeight()), new android.graphics.RectF(0.0f, 0.0f, c18, c19), (android.graphics.Paint) null);
                    bitmapShader = new android.graphics.BitmapShader(createBitmap3, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.REPEAT);
                }
                bitmapShader2 = bitmapShader;
            } else {
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(a17, c18, c19, false);
                android.graphics.Shader.TileMode tileMode2 = android.graphics.Shader.TileMode.REPEAT;
                bitmapShader2 = new android.graphics.BitmapShader(createScaledBitmap, tileMode2, tileMode2);
            }
            bVar.setShader(bitmapShader2);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158616e = parcel.readString();
        this.f158617f = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11760xd89292d6, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11763x6a580426) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11763x6a580426 c11763x6a580426 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11763x6a580426) obj;
        return java.util.Objects.equals(this.f158616e, c11763x6a580426.f158616e) && java.util.Objects.equals(this.f158617f, c11763x6a580426.f158617f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), this.f158616e, this.f158617f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeString(this.f158616e);
        parcel.writeString(this.f158617f);
    }
}
