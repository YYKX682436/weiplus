package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class RealSetFillStyleActionPatternArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg> CREATOR = new b91.l();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77084f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        char c17;
        android.graphics.BitmapShader bitmapShader;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f77083e)) {
            return false;
        }
        e91.b bVar = iVar.f470712b;
        android.graphics.BitmapShader bitmapShader2 = null;
        android.graphics.Bitmap a17 = ((zg1.d) iVar.f470716f).a(iVar, this.f77083e, null, null);
        if (a17 != null && !a17.isRecycled()) {
            java.lang.String str = this.f77084f;
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
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
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

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77083e = parcel.readString();
        this.f77084f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg realSetFillStyleActionPatternArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg) obj;
        return java.util.Objects.equals(this.f77083e, realSetFillStyleActionPatternArg.f77083e) && java.util.Objects.equals(this.f77084f, realSetFillStyleActionPatternArg.f77084f);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77083e, this.f77084f);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeString(this.f77083e);
        parcel.writeString(this.f77084f);
    }
}
