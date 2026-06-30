package vw;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements rv.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f522175d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f522176e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f522177f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f522178g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f522179h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f522180i = jz5.h.b(vw.e.f522157d);

    public final android.graphics.Bitmap Ai(android.graphics.drawable.Drawable drawable, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "getBitmap(...)");
            return bitmap;
        }
        android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(i17, i18, android.graphics.Bitmap.Config.ARGB_8888, false);
        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H0(m17);
        android.graphics.Bitmap n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n(m17, i19);
        java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "trace(...)");
        return n17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public android.graphics.Bitmap Bi(android.content.Context context, android.graphics.Bitmap bitmap, r01.h0 mpInfo, java.lang.String imageUrl) {
        boolean z17;
        java.lang.String str;
        android.graphics.Bitmap createBitmap;
        android.graphics.Canvas canvas;
        java.lang.String str2;
        android.graphics.Paint paint;
        float f17;
        double width;
        double d17;
        double d18;
        double d19;
        android.graphics.Bitmap bitmap2;
        android.graphics.Bitmap bitmap3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mpInfo, "mpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrl, "imageUrl");
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark null");
            return bitmap;
        }
        if (bitmap.getConfig() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark config null");
            return bitmap;
        }
        if (!mpInfo.f449627b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark not enableWaterMark");
            return bitmap;
        }
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d27 = height;
        if (d27 <= 100.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark originalHeight less than 100 px, originalHeight is " + height);
            return bitmap;
        }
        boolean z18 = this.f522176e.length() == 0;
        java.lang.String str3 = mpInfo.f449626a;
        if (z18 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522176e, str3)) {
            this.f522176e = str3;
        }
        java.lang.String str4 = mpInfo.f449632g;
        boolean m16636xc53c3619 = com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str4);
        java.util.HashMap hashMap = this.f522175d;
        if (m16636xc53c3619) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "parseParamsJson param empty");
        } else if (hashMap.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "parseParamsJson has cache");
        } else {
            try {
                cl0.g gVar = new cl0.g(str4);
                java.util.Iterator mo15076x322df4 = gVar.mo15076x322df4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15076x322df4, "keys(...)");
                while (mo15076x322df4.hasNext()) {
                    java.lang.String str5 = (java.lang.String) mo15076x322df4.next();
                    java.util.Iterator it = mo15076x322df4;
                    hashMap.put(str5, java.lang.Double.valueOf(gVar.a(str5).mo15071x160e9ec7("lightness")));
                    mo15076x322df4 = it;
                }
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "parseParamsJson parseParamsJson failed " + e17);
            }
        }
        if (!hashMap.isEmpty()) {
            java.util.Iterator it6 = hashMap.entrySet().iterator();
            while (it6.hasNext()) {
                if (r26.n0.D(imageUrl, (java.lang.String) ((java.util.Map.Entry) it6.next()).getKey(), false, 2, null)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            return bitmap;
        }
        java.util.HashMap hashMap2 = this.f522177f;
        if (hashMap2.containsKey(wi(imageUrl)) && (bitmap3 = (android.graphics.Bitmap) hashMap2.get(wi(imageUrl))) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark use cache bitmap");
            return bitmap3;
        }
        int parseColor = android.graphics.Color.parseColor("#80FFFFFF");
        java.util.Iterator it7 = hashMap.entrySet().iterator();
        double d28 = 0.0d;
        while (it7.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
            java.lang.String str6 = (java.lang.String) entry.getKey();
            java.util.Iterator it8 = it7;
            double doubleValue = ((java.lang.Number) entry.getValue()).doubleValue();
            int i17 = parseColor;
            if (r26.n0.D(imageUrl, str6, false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "bobkw l1 is " + doubleValue);
                d28 = doubleValue;
            }
            it7 = it8;
            parseColor = i17;
        }
        int parseColor2 = (d28 > 0.0d && d28 > 0.4d) ? (d28 <= 0.4d || d28 >= 0.5d) ? (d28 < 0.5d || d28 >= 0.7d) ? android.graphics.Color.parseColor("#8C000000") : android.graphics.Color.parseColor("#A6000000") : android.graphics.Color.parseColor("#66FFFFFF") : parseColor;
        double max = java.lang.Math.max(width2 * 0.04d, 15.0d);
        double d29 = 0.755d * max;
        double d37 = max / 1.48d;
        double d38 = max * 0.1d;
        double d39 = 1.15d * d29;
        try {
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/brandservice/BizPicWaterMarkService", "writeWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/tencent/mm/modelbiz/BizMpInfo;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            try {
                createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/feature/brandservice/BizPicWaterMarkService", "writeWaterMark", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/tencent/mm/modelbiz/BizMpInfo;Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
                str2 = "· ";
                int i18 = mpInfo.f449631f;
                java.lang.String str7 = mpInfo.f449629d;
                java.lang.String str8 = mpInfo.f449628c;
                if (i18 == 1) {
                    if (str7.length() == 0) {
                        if (!(str8.length() == 0)) {
                            str2 = "· " + str8;
                        }
                    } else {
                        str2 = "· " + str7;
                    }
                } else {
                    if (str8.length() == 0) {
                        if (str7.length() == 0) {
                            str2 = "";
                        } else {
                            str2 = "· " + str7;
                        }
                    } else {
                        str2 = "· " + str8;
                    }
                }
                paint = new android.graphics.Paint();
                paint.setAntiAlias(true);
                paint.setTextSize((float) d37);
                paint.setColor(parseColor2);
                str = new android.graphics.Rect();
                paint.getTextBounds(str2, 0, str2.length(), (android.graphics.Rect) str);
                f17 = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
                width = (width2 - str.width()) - d39;
                d17 = d27 - d39;
                d18 = (paint.getFontMetrics().top + paint.getFontMetrics().descent) / 2.0f;
                d19 = (d17 - d18) + d18;
            } catch (java.lang.OutOfMemoryError e18) {
                e = e18;
            }
        } catch (java.lang.OutOfMemoryError e19) {
            e = e19;
            str = "MicroMsg.BizPicWaterMarkService";
        }
        try {
            if (width >= 0.0d && d19 >= 0.0d) {
                canvas.drawText(str2, (float) width, (float) d19, paint);
                int i19 = mpInfo.f449630e == 1 ? com.p314xaae8f345.mm.R.raw.f78621x651c69f : com.p314xaae8f345.mm.R.raw.f78620xda5ffd15;
                tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
                java.lang.String str9 = mpInfo.f449633h;
                ((ox.g) oVar).getClass();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(str9) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    i19 = com.p314xaae8f345.mm.R.raw.f80849xbe771e78;
                }
                android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i19);
                float f18 = (f17 * 1.15f) + 3.0f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
                try {
                    android.graphics.Bitmap Ai = Ai(drawable, a06.d.b((64.0f * f18) / 20.0f), a06.d.b(f18), parseColor2);
                    double width3 = (((width2 - Ai.getWidth()) - str.width()) - d39) - (2.0d * d38);
                    double height2 = (d17 - (Ai.getHeight() / 2.0f)) + d18;
                    if (width3 >= 0.0d && height2 >= 0.0d) {
                        canvas.drawBitmap(Ai, (float) width3, (float) height2, (android.graphics.Paint) null);
                        if (!hashMap2.containsKey(wi(imageUrl))) {
                            if (hashMap2.size() < 3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark add cache bitmap");
                                bitmap2 = createBitmap;
                                hashMap2.put(wi(imageUrl), bitmap2);
                                Ai.recycle();
                                return bitmap2;
                            }
                        }
                        bitmap2 = createBitmap;
                        Ai.recycle();
                        return bitmap2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark icon x y less than 0");
                    return bitmap;
                } catch (java.lang.OutOfMemoryError e27) {
                    e = e27;
                    str = "MicroMsg.BizPicWaterMarkService";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "writeWaterMark oom " + e);
                    return bitmap;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark nickName x y less than 0");
            return bitmap;
        } catch (java.lang.OutOfMemoryError e28) {
            e = e28;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "writeWaterMark oom " + e);
            return bitmap;
        }
    }

    public final java.lang.String wi(java.lang.String str) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        return kz5.z.a0(digest, "", null, null, 0, null, vw.d.f522141d, 30, null);
    }
}
