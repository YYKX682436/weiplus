package e04;

/* loaded from: classes12.dex */
public class u2 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3 {

    /* renamed from: c, reason: collision with root package name */
    public final int f327653c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Canvas f327654d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f327655e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f327656f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f327657g;

    /* renamed from: h, reason: collision with root package name */
    public final float f327658h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Matrix f327659i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f327660j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Set f327661k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f327662l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e04.w2 f327663m;

    public u2(e04.w2 w2Var, int i17, java.util.List list, float f17, android.graphics.Bitmap bitmap) {
        int i18;
        int i19;
        int i27;
        this.f327663m = w2Var;
        this.f327653c = i17;
        this.f327660j = list;
        this.f327658h = f17;
        this.f327656f = bitmap;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.eq6 eq6Var = (r45.eq6) it.next();
            int i28 = eq6Var.f455213f;
            boolean z17 = true;
            if (i28 <= 1 || (i18 = eq6Var.f455214g) <= 1 || i28 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE || (i19 = eq6Var.f455211d) < 0 || (i27 = eq6Var.f455212e) < 0 || i19 == Integer.MAX_VALUE || i27 == Integer.MAX_VALUE) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "invalid translation info (%d,%d) %d %d", java.lang.Integer.valueOf(eq6Var.f455211d), java.lang.Integer.valueOf(eq6Var.f455212e), java.lang.Integer.valueOf(eq6Var.f455213f), java.lang.Integer.valueOf(eq6Var.f455214g));
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "remove invalid translation info");
                it.remove();
            }
        }
        for (r45.eq6 eq6Var2 : this.f327660j) {
            int i29 = eq6Var2.f455218n;
            if (i29 > 0) {
                if (!this.f327662l.containsKey(java.lang.Integer.valueOf(i29))) {
                    this.f327662l.put(java.lang.Integer.valueOf(eq6Var2.f455218n), new java.util.ArrayList());
                }
                ((java.util.List) this.f327662l.get(java.lang.Integer.valueOf(eq6Var2.f455218n))).add(eq6Var2);
            } else {
                this.f327661k.add(eq6Var2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        e04.w2 w2Var;
        int[] iArr;
        int width;
        int height;
        android.graphics.Bitmap m17;
        float f17 = this.f327658h;
        android.graphics.Bitmap bitmap = this.f327656f;
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            arrayList.add(bool);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            char c17 = 1;
            yj0.a.e(bitmap, copy, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            this.f327657g = new android.graphics.Matrix();
            float[] fArr = {0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()};
            double d17 = f17;
            float[] fArr2 = {0.0f, (float) (bitmap.getWidth() * java.lang.Math.abs(java.lang.Math.sin(d17))), (float) ((bitmap.getWidth() * java.lang.Math.abs(java.lang.Math.cos(d17))) + (bitmap.getHeight() * java.lang.Math.abs(java.lang.Math.sin(d17)))), (float) (bitmap.getHeight() * java.lang.Math.abs(java.lang.Math.cos(d17)))};
            char c18 = 3;
            int i17 = 2;
            this.f327657g.setPolyToPoly(fArr, 0, fArr2, 0, 2);
            this.f327657g.setRotate(-f17);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f327659i = matrix;
            matrix.setPolyToPoly(fArr2, 0, fArr, 0, 2);
            this.f327659i.setRotate(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "angle %s", java.lang.Float.valueOf(f17));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            android.graphics.Matrix matrix2 = this.f327657g;
            zj0.a aVar = new zj0.a();
            aVar.c(bool);
            aVar.c(matrix2);
            aVar.c(java.lang.Integer.valueOf(height2));
            aVar.c(java.lang.Integer.valueOf(width2));
            aVar.c(0);
            aVar.c(0);
            aVar.c(copy);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            int i18 = 5;
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            this.f327655e = createBitmap;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "originalBitmap %d, %d  rotatedBitmap %d %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(this.f327655e.getWidth()), java.lang.Integer.valueOf(this.f327655e.getHeight()));
            this.f327654d = new android.graphics.Canvas(this.f327655e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "create rotated bitmap cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.util.Iterator it = this.f327660j.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                w2Var = this.f327663m;
                if (!hasNext) {
                    break;
                }
                r45.eq6 eq6Var = (r45.eq6) it.next();
                java.lang.Object[] objArr2 = new java.lang.Object[i18];
                objArr2[0] = java.lang.Integer.valueOf(eq6Var.f455211d);
                objArr2[c17] = java.lang.Integer.valueOf(eq6Var.f455212e);
                objArr2[i17] = java.lang.Integer.valueOf(eq6Var.f455213f);
                objArr2[c18] = java.lang.Integer.valueOf(eq6Var.f455214g);
                objArr2[4] = java.lang.Integer.valueOf(eq6Var.f455216i.length());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s, text.length %s", objArr2);
                android.graphics.Bitmap bitmap2 = this.f327655e;
                w2Var.getClass();
                if (eq6Var.f455211d + eq6Var.f455213f > bitmap2.getWidth()) {
                    eq6Var.f455213f = bitmap2.getWidth() - eq6Var.f455211d;
                }
                if (eq6Var.f455212e + eq6Var.f455214g > bitmap2.getHeight()) {
                    eq6Var.f455214g = bitmap2.getHeight() - eq6Var.f455212e;
                }
                android.graphics.Bitmap bitmap3 = this.f327655e;
                int i19 = eq6Var.f455211d;
                int i27 = eq6Var.f455212e;
                android.graphics.Bitmap a17 = e04.w2.a(w2Var, bitmap3, new android.graphics.Rect(i19, i27, eq6Var.f455213f + i19, eq6Var.f455214g + i27));
                java.lang.Object[] objArr3 = new java.lang.Object[i17];
                objArr3[0] = java.lang.Integer.valueOf(a17.getWidth());
                objArr3[1] = java.lang.Integer.valueOf(a17.getHeight());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", objArr3);
                int[] b17 = e04.w2.b(w2Var, a17);
                int i28 = b17[0];
                android.graphics.Canvas canvas = this.f327654d;
                android.graphics.Paint paint = new android.graphics.Paint();
                int i29 = eq6Var.f455211d;
                int i37 = eq6Var.f455212e;
                java.util.Iterator it6 = it;
                android.graphics.Rect rect = new android.graphics.Rect(i29, i37, eq6Var.f455213f + i29, eq6Var.f455214g + i37);
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                paint.setColor(i28);
                paint.setAntiAlias(true);
                canvas.drawRect(rect, paint);
                if (((java.util.HashSet) this.f327661k).contains(eq6Var)) {
                    e04.w2.d(w2Var, e04.w2.c(w2Var, eq6Var), b17[1], eq6Var, this.f327654d);
                }
                it = it6;
                c18 = 3;
                i18 = 5;
                c17 = 1;
                i17 = 2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation bg cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            java.util.Map map = this.f327662l;
            java.util.Iterator it7 = ((java.util.HashMap) map).keySet().iterator();
            while (it7.hasNext()) {
                int intValue = ((java.lang.Integer) it7.next()).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it8 = ((java.util.List) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(intValue))).iterator();
                while (it8.hasNext()) {
                    arrayList2.add(java.lang.Float.valueOf(e04.w2.c(w2Var, (r45.eq6) it8.next())));
                }
                float floatValue = ((java.lang.Float) java.util.Collections.min(arrayList2)).floatValue();
                int i38 = 0;
                for (java.util.List list = (java.util.List) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(intValue)); i38 < list.size(); list = list) {
                    r45.eq6 eq6Var2 = (r45.eq6) list.get(i38);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s", java.lang.Integer.valueOf(eq6Var2.f455211d), java.lang.Integer.valueOf(eq6Var2.f455212e), java.lang.Integer.valueOf(eq6Var2.f455213f), java.lang.Integer.valueOf(eq6Var2.f455214g));
                    android.graphics.Bitmap bitmap4 = this.f327655e;
                    int i39 = eq6Var2.f455211d;
                    java.util.Map map2 = map;
                    int i47 = eq6Var2.f455212e;
                    android.graphics.Bitmap a18 = e04.w2.a(w2Var, bitmap4, new android.graphics.Rect(i39, i47, eq6Var2.f455213f + i39, eq6Var2.f455214g + i47));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", java.lang.Integer.valueOf(a18.getWidth()), java.lang.Integer.valueOf(a18.getHeight()));
                    e04.w2.d(w2Var, floatValue, e04.w2.b(w2Var, a18)[1], eq6Var2, this.f327654d);
                    i38++;
                    map = map2;
                    it7 = it7;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation text cost %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3));
            android.graphics.Bitmap bitmap5 = this.f327655e;
            int width3 = bitmap5.getWidth();
            int height3 = this.f327655e.getHeight();
            android.graphics.Matrix matrix3 = this.f327659i;
            zj0.a aVar2 = new zj0.a();
            aVar2.c(java.lang.Boolean.TRUE);
            aVar2.c(matrix3);
            aVar2.c(java.lang.Integer.valueOf(height3));
            aVar2.c(java.lang.Integer.valueOf(width3));
            aVar2.c(0);
            aVar2.c(0);
            aVar2.c(bitmap5);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender$RenderTranslationInfoTask", "doInBackground", "([Ljava/lang/Void;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "resultBitmap width %d, height %d", java.lang.Integer.valueOf(createBitmap2.getWidth()), java.lang.Integer.valueOf(createBitmap2.getHeight()));
            iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
            createBitmap2.getPixels(iArr, 0, bitmap.getWidth(), (createBitmap2.getWidth() - bitmap.getWidth()) / 2, (createBitmap2.getHeight() - bitmap.getHeight()) / 2, bitmap.getWidth(), bitmap.getHeight());
            width = bitmap.getWidth();
            height = bitmap.getHeight();
            m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(width, height, android.graphics.Bitmap.Config.ARGB_8888, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", e17, "render translation info error", new java.lang.Object[0]);
        }
        if (m17 != null) {
            if (width == m17.getWidth() && height == m17.getHeight()) {
                m17.setPixels(iArr, 0, width, 0, 0, width, height);
            }
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H0(m17);
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
        return m17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public java.util.concurrent.ExecutorService b() {
        return e04.w2.f327681c;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public void c(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "task session %d, curSession %d", java.lang.Integer.valueOf(this.f327653c), java.lang.Integer.valueOf(this.f327663m.f327682a));
        if (this.f327653c != this.f327663m.f327682a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "ignore this translation result");
        } else if (this.f327663m.f327683b != null) {
            this.f327663m.f327683b.v5(this.f327653c, bitmap);
        }
    }
}
