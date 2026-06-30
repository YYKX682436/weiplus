package com.p314xaae8f345.mm.ui.p2740x696c9db;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.ui.tools.CropImageNewUI */
/* loaded from: classes15.dex */
public class ActivityC22499xed564269 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f291530t = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f291531d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 f291533f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f291534g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 f291535h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f291536i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f291537m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f291539o;

    /* renamed from: e, reason: collision with root package name */
    public int f291532e = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f291538n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291540p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291541q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291542r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f291543s = 0;

    /* JADX WARN: Removed duplicated region for block: B:40:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 r24) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269.T6(com.tencent.mm.ui.tools.CropImageNewUI):boolean");
    }

    public static void U6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269, com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0, android.view.View view) {
        android.graphics.Bitmap bitmap;
        int width;
        int height;
        android.graphics.Bitmap createBitmap;
        boolean z17 = activityC22499xed564269.f291542r;
        if (c22500x8bcca9d0 == null || view == null || z17) {
            return;
        }
        activityC22499xed564269.f291542r = true;
        android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(c22500x8bcca9d0.m81066xb5882e4f().getWidth(), c22500x8bcca9d0.m81066xb5882e4f().getHeight(), android.graphics.Bitmap.Config.RGB_565, false);
        if (m17 == null) {
            activityC22499xed564269.setResult(-1);
            activityC22499xed564269.finish();
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
        canvas.translate(c22500x8bcca9d0.getScrollX(), c22500x8bcca9d0.getScrollY());
        c22500x8bcca9d0.draw(canvas);
        float[] fArr = new float[9];
        c22500x8bcca9d0.getImageMatrix().getValues(fArr);
        int left = view.getLeft();
        int top = view.getTop();
        int width2 = view.getWidth();
        float f17 = fArr[0];
        if (f17 == 0.0f) {
            f17 = fArr[1];
        }
        java.lang.Math.abs(f17);
        android.graphics.Matrix imageMatrix = c22500x8bcca9d0.getImageMatrix();
        float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, 3);
        float[] fArr3 = new float[9];
        imageMatrix.getValues(fArr3);
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                fArr2[i17][i18] = fArr3[(i17 * 3) + i18];
            }
        }
        float[][] fArr4 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, 3);
        int i19 = 0;
        while (i19 < 3) {
            int i27 = 0;
            while (i27 < 3) {
                fArr4[i19][i27] = i19 == i27 ? 1.0f : 0.0f;
                i27++;
            }
            i19++;
        }
        for (int i28 = 0; i28 < 3; i28++) {
            float f18 = fArr2[i28][i28];
            if (f18 == 0.0f) {
                int i29 = i28 + 1;
                while (true) {
                    if (i29 >= 3) {
                        break;
                    }
                    if (fArr2[i29][i28] == 0.0f) {
                        i29++;
                    } else {
                        for (int i37 = 0; i37 < 3; i37++) {
                            float[] fArr5 = fArr2[i29];
                            float f19 = fArr5[i37];
                            float[] fArr6 = fArr2[i28];
                            fArr5[i37] = fArr6[i37];
                            fArr6[i37] = f19;
                            float[] fArr7 = fArr4[i29];
                            float f27 = fArr7[i37];
                            float[] fArr8 = fArr4[i28];
                            fArr7[i37] = fArr8[i37];
                            fArr8[i37] = f27;
                        }
                    }
                }
                f18 = fArr2[i28][i28];
            }
            for (int i38 = 0; i38 < 3; i38++) {
                float[] fArr9 = fArr2[i28];
                fArr9[i38] = fArr9[i38] / f18;
                float[] fArr10 = fArr4[i28];
                fArr10[i38] = fArr10[i38] / f18;
            }
            for (int i39 = 0; i39 < 3; i39++) {
                if (i39 != i28) {
                    float f28 = fArr2[i39][i28];
                    for (int i47 = 0; i47 < 3; i47++) {
                        float[] fArr11 = fArr2[i39];
                        fArr11[i47] = fArr11[i47] - (fArr2[i28][i47] * f28);
                        float[] fArr12 = fArr4[i39];
                        fArr12[i47] = fArr12[i47] - (fArr4[i28][i47] * f28);
                    }
                }
            }
        }
        try {
            if (activityC22499xed564269.f291543s == 1) {
                int i48 = (int) (width2 * 0.125d);
                bitmap = W6(fArr4, left, top + i48, left + width2, (top + width2) - i48, c22500x8bcca9d0);
            } else {
                bitmap = W6(fArr4, left, top, left + width2, top + width2, c22500x8bcca9d0);
            }
        } catch (java.lang.Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropImageUI", "doCropImage: error");
            activityC22499xed564269.setResult(-1);
            activityC22499xed564269.finish();
            return;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        if (activityC22499xed564269.f291543s != 1 && (width = bitmap.getWidth()) != (height = bitmap.getHeight())) {
            if (width > height) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf((width - height) / 2));
                arrayList.add(bitmap);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf(width));
                arrayList2.add(java.lang.Integer.valueOf((height - width) / 2));
                arrayList2.add(0);
                arrayList2.add(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "doCropImage", "(Lcom/tencent/mm/ui/tools/CropImageView;Landroid/view/View;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            }
            bitmap = createBitmap;
        }
        java.lang.String stringExtra = activityC22499xed564269.getIntent().getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.m());
            sb6.append(kk.k.g((activityC22499xed564269.f291539o + java.lang.System.currentTimeMillis()).getBytes()));
            sb6.append("_crop.jpg");
            stringExtra = sb6.toString();
        }
        if (activityC22499xed564269.Y6(bitmap, stringExtra, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_OutputPath", stringExtra);
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = activityC22499xed564269.f291533f;
            if (c22502x1bc6a5e8 != null) {
                intent.putExtra("CropImage_filterId", c22502x1bc6a5e8.m81078x50de1429());
            }
            activityC22499xed564269.setResult(-1, intent);
        } else {
            activityC22499xed564269.setResult(-1);
        }
        activityC22499xed564269.finish();
    }

    public static void V6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269, boolean z17) {
        java.lang.String stringExtra = activityC22499xed564269.getIntent().getStringExtra("CropImage_OutputPath");
        if (x51.t1.b(stringExtra)) {
            stringExtra = activityC22499xed564269.f291539o;
        } else {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(activityC22499xed564269.f291539o, 0, -1);
            com.p314xaae8f345.mm.vfs.w6.S(stringExtra, N, 0, N.length);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_Compress_Img", z17);
        intent.putExtra("CropImage_OutputPath", stringExtra);
        intent.putExtra("CropImage_rotateCount", activityC22499xed564269.f291535h.m81069x476aeb3e() % 4);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = activityC22499xed564269.f291533f;
        if (c22502x1bc6a5e8 != null) {
            intent.putExtra("CropImage_filterId", c22502x1bc6a5e8.m81078x50de1429());
        }
        intent.putExtra("from_source", activityC22499xed564269.getIntent().getIntExtra("from_source", 0));
        activityC22499xed564269.setResult(-1, intent);
        activityC22499xed564269.finish();
    }

    public static android.graphics.Bitmap W6(float[][] fArr, float f17, float f18, float f19, float f27, com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0) {
        if (c22500x8bcca9d0 == null) {
            return null;
        }
        float[] fArr2 = {f17, f18, 1.0f};
        float[] fArr3 = {f19, f27, 1.0f};
        float[] fArr4 = new float[3];
        int i17 = 0;
        while (true) {
            float f28 = 0.0f;
            if (i17 >= 3) {
                break;
            }
            for (int i18 = 0; i18 < 3; i18++) {
                f28 += fArr[i17][i18] * fArr2[i18];
            }
            fArr4[i17] = f28;
            i17++;
        }
        float[] fArr5 = new float[3];
        for (int i19 = 0; i19 < 3; i19++) {
            float f29 = 0.0f;
            for (int i27 = 0; i27 < 3; i27++) {
                f29 += fArr[i19][i27] * fArr3[i27];
            }
            fArr5[i19] = f29;
        }
        int min = (int) java.lang.Math.min(fArr4[0], fArr5[0]);
        int min2 = (int) java.lang.Math.min(fArr4[1], fArr5[1]);
        if (min < 0) {
            min = 0;
        }
        if (min2 < 0) {
            min2 = 0;
        }
        int abs = (int) java.lang.Math.abs(fArr4[0] - fArr5[0]);
        int abs2 = (int) java.lang.Math.abs(fArr4[1] - fArr5[1]);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int m81069x476aeb3e = c22500x8bcca9d0.m81069x476aeb3e() % 4;
        if (m81069x476aeb3e == 0) {
            matrix.setRotate(0.0f, abs / 2, abs2 / 2);
        } else if (m81069x476aeb3e == 1) {
            matrix.setRotate(90.0f, abs / 2, abs2 / 2);
        } else if (m81069x476aeb3e == 2) {
            matrix.setRotate(180.0f, abs / 2, abs2 / 2);
        } else if (m81069x476aeb3e == 3) {
            matrix.setRotate(270.0f, abs / 2, abs2 / 2);
        }
        android.graphics.Bitmap m81066xb5882e4f = c22500x8bcca9d0.m81066xb5882e4f();
        if (min + abs > m81066xb5882e4f.getWidth()) {
            abs = m81066xb5882e4f.getWidth() - min;
        }
        if (min2 + abs2 > m81066xb5882e4f.getHeight()) {
            abs2 = m81066xb5882e4f.getHeight() - min2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", java.lang.Integer.valueOf(m81066xb5882e4f.getWidth()), java.lang.Integer.valueOf(m81066xb5882e4f.getHeight()), java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min2), java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(abs2));
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(abs2));
        aVar.c(java.lang.Integer.valueOf(abs));
        aVar.c(java.lang.Integer.valueOf(min2));
        aVar.c(java.lang.Integer.valueOf(min));
        aVar.c(m81066xb5882e4f);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/ui/tools/CropImageNewUI", "corpByMaptoOriginalImg", "([[FFFFFLcom/tencent/mm/ui/tools/CropImageView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "corpByMaptoOriginalImg", "([[FFFFFLcom/tencent/mm/ui/tools/CropImageView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public final android.graphics.Bitmap X6(int i17, int i18) {
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(this.f291539o, i18, i17, true);
        if (this.f291538n == 0) {
            return T;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.setRotate(this.f291538n, T.getWidth() / 2, T.getHeight() / 2);
        int width = T.getWidth();
        int height = T.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(T);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/ui/tools/CropImageNewUI", "getCopeBackImg", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/tools/CropImageNewUI", "getCopeBackImg", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        if (T != createBitmap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropImageUI", "recycle bitmap:%s", T.toString());
            T.recycle();
        }
        return createBitmap;
    }

    public final boolean Y6(android.graphics.Bitmap bitmap, java.lang.String str, boolean z17) {
        if (str != null && !str.equals("")) {
            try {
                int i17 = this.f291543s;
                if (i17 == 1) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 30, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                } else if (i17 == 2) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
                }
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CropImageUI", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + e17.toString());
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: activateBroadcast */
    public void mo78476xf16d150e(boolean z17) {
        if (z17) {
            db5.m9.a(z17, new android.content.Intent().putExtra("classname", getClass().getName()).putExtra("main_process", false));
        } else {
            super.mo78476xf16d150e(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a3b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        this.f291534g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cng);
        this.f291536i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cne);
        this.f291537m = findViewById(com.p314xaae8f345.mm.R.id.cn_);
        int intExtra = getIntent().getIntExtra("CropImageMode", 0);
        this.f291531d = intExtra;
        iz5.a.g("the image mode must be set", intExtra != 0);
        this.f291543s = getIntent().getIntExtra("CropImage_from_scene", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("CropImage_Filter", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
        if (booleanExtra) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.u2 u2Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.u2(this);
            com.p314xaae8f345.mm.ui.p2740x696c9db.v2 v2Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.v2(this);
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8) findViewById(com.p314xaae8f345.mm.R.id.cn7);
            this.f291533f = c22502x1bc6a5e8;
            c22502x1bc6a5e8.m81084x908eadad(u2Var);
            this.f291533f.m81085x5cff9cad(v2Var);
        }
        this.f291542r = false;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0) findViewById(com.p314xaae8f345.mm.R.id.cnh);
        this.f291535h = c22500x8bcca9d0;
        c22500x8bcca9d0.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.h2(this));
        this.f291535h.m81073xba21ab2d(new com.p314xaae8f345.mm.ui.p2740x696c9db.m2(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cni)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.z1(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cnj);
        button.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.a2(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cnk);
        button2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.b2(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2740x696c9db.c2(this), true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2740x696c9db.d2(this), true);
        button.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.e2(this, b4Var));
        button2.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.f2(this, b4Var2));
        int i17 = this.f291531d;
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.x1 x1Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.x1(this);
            com.p314xaae8f345.mm.ui.p2740x696c9db.y1 y1Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.y1(this);
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e82 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8) findViewById(com.p314xaae8f345.mm.R.id.cn7);
            this.f291533f = c22502x1bc6a5e82;
            c22502x1bc6a5e82.m81084x908eadad(x1Var);
            this.f291533f.m81085x5cff9cad(y1Var);
            this.f291533f.m81082xc78c7e31(false);
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e83 = this.f291533f;
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d02 = c22502x1bc6a5e83.f291579h;
            if (c22500x8bcca9d02 != null) {
                c22500x8bcca9d02.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d03 = c22502x1bc6a5e83.f291579h;
                c22500x8bcca9d03.setOnTouchListener(c22500x8bcca9d03.C);
            }
            this.f291533f.m81080x15e23e74(0);
            if (this.f291543s == 1) {
                this.f291533f.m81079xdffe2fec(com.p314xaae8f345.mm.R.C30861xcebc809e.bko);
            }
        } else if (i17 == 2) {
            this.f291535h.m81070x2b9fb326(false);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565523cn2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cna);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 == 3) {
            this.f291534g.setVisibility(8);
        } else if (i17 == 5) {
            int intExtra2 = getIntent().getIntExtra("CropImage_CompressType", 1);
            boolean booleanExtra3 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
            if (intExtra2 == 1 || !booleanExtra3) {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.cna);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.cna);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.Button button3 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cnb);
                button3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562604k3);
                button3.setPadding(25, 8, 25, 8);
                button3.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.g2(this));
            }
        }
        int i18 = this.f291531d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.n2 n2Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.n2(this, booleanExtra, booleanExtra2);
        com.p314xaae8f345.mm.ui.fb fbVar = com.p314xaae8f345.mm.ui.fb.GREEN;
        if (i18 == 5) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, n2Var);
        } else if (i18 == 4) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, n2Var);
            android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.cna);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.Button button4 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.cnb);
            button4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572553bm0);
            button4.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.o2(this));
        } else {
            m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572557bm4), n2Var, null, fbVar);
        }
        if (booleanExtra && booleanExtra2) {
            m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572553bm0), n2Var, null, fbVar);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2740x696c9db.p2(this));
        if (this.f291531d == 6) {
            android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.cna);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572557bm4), new com.p314xaae8f345.mm.ui.p2740x696c9db.s2(this), null, fbVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.f291535h.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.t2(this));
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f291535h;
        if (c22500x8bcca9d0 != null) {
            android.graphics.Bitmap bitmap = c22500x8bcca9d0.f291545e;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropImageView", "recycle bitmap:%s", c22500x8bcca9d0.f291545e.toString());
                c22500x8bcca9d0.f291545e.recycle();
            }
            wu5.c cVar = c22500x8bcca9d0.f291559v;
            if (cVar != null) {
                cVar.cancel(false);
                c22500x8bcca9d0.f291559v = null;
            }
            c22500x8bcca9d0.f291560w.mo50302x6b17ad39(null);
            c22500x8bcca9d0.f291561x.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = this.f291533f;
        if (c22502x1bc6a5e8 != null) {
            c22502x1bc6a5e8.f291576e = null;
            android.graphics.Bitmap bitmap2 = c22502x1bc6a5e8.f291580i;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", c22502x1bc6a5e8.f291580i.toString());
                c22502x1bc6a5e8.f291580i.recycle();
            }
            c22502x1bc6a5e8.f291580i = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        setRequestedOrientation(1);
    }
}
