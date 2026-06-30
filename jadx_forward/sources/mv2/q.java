package mv2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.q f413151a = new mv2.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f413152b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static long f413153c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f413154d;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new mv2.o());
        arrayList.add(new mv2.p());
        f413154d = arrayList;
    }

    public static final void b(mv2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.util.ArrayList arrayList) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        qVar.getClass();
        for (r45.mb4 mb4Var : c14994x9b99c079.m59264x7efe73ec()) {
            arrayList.add(mb4Var.m75945x2fec8307(0));
            arrayList.add(mb4Var.m75945x2fec8307(1));
            arrayList.add(mb4Var.m75945x2fec8307(16));
            arrayList.add(mb4Var.m75945x2fec8307(25));
            r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
            if (h70Var != null && (linkedList2 = h70Var.f457430d) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r45.ho6) it.next()).f457866d);
                }
            }
        }
        java.util.Iterator<T> it6 = c14994x9b99c079.m59214x2de915fd().iterator();
        while (it6.hasNext()) {
            for (r45.mb4 mb4Var2 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()).m59264x7efe73ec()) {
                arrayList.add(mb4Var2.m75945x2fec8307(0));
                arrayList.add(mb4Var2.m75945x2fec8307(1));
                arrayList.add(mb4Var2.m75945x2fec8307(16));
                arrayList.add(mb4Var2.m75945x2fec8307(25));
                r45.h70 h70Var2 = (r45.h70) mb4Var2.m75936x14adae67(21);
                if (h70Var2 != null && (linkedList = h70Var2.f457430d) != null) {
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(((r45.ho6) it7.next()).f457866d);
                    }
                }
            }
        }
    }

    public static final void c(mv2.q qVar, java.lang.String str, java.util.ArrayList arrayList) {
        qVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            byte[] c17 = ot5.e.c(str);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
            obtain.unmarshall(c17, 0, c17.length);
            obtain.setDataPosition(0);
            android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
            intent.setExtrasClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1.f36239x681a0c0c.getClass().getClassLoader());
            arrayList.add(intent.getStringExtra("VIDEO_COVER_URL"));
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("postMediaList");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            arrayList.addAll(stringArrayListExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostFileManager", java.lang.String.valueOf(e17));
        }
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, r45.c07 c07Var) {
        if (d(str2) && c07Var == null) {
            return str2;
        }
        android.graphics.Point k17 = k(str, 2);
        int i17 = k17.x;
        int i18 = k17.y;
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
        android.graphics.Bitmap S = J2 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(J2, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b()), i18, i17, true, true) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "_genImageThumbFile, file %s rotate %d. originThumbWidth:%s, originThumbHeight:%s", str, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b()), java.lang.Integer.valueOf(k17.x), java.lang.Integer.valueOf(k17.y));
        if (S != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "_genImageThumbFile, file %s cropThumbWidth:%s, cropThumbHeight:%s", str, java.lang.Integer.valueOf(S.getWidth()), java.lang.Integer.valueOf(S.getHeight()));
            if (c07Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "thumbRect:[" + c07Var.m75939xb282bd08(0) + ", " + c07Var.m75939xb282bd08(1) + ", " + c07Var.m75939xb282bd08(2) + ", " + c07Var.m75939xb282bd08(3) + "], bitmap:[" + S.getWidth() + ", " + S.getHeight() + ']');
                int width = S.getWidth();
                float f17 = (float) width;
                int m75939xb282bd08 = (int) ((((float) (c07Var.m75939xb282bd08(1) - c07Var.m75939xb282bd08(3))) / ((float) (c07Var.m75939xb282bd08(2) - c07Var.m75939xb282bd08(0)))) * f17);
                android.graphics.Bitmap.Config config = S.getConfig();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(m75939xb282bd08));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "_genImageThumbFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/ViewRect;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "_genImageThumbFile", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/ViewRect;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                float m75939xb282bd082 = f17 / (c07Var.m75939xb282bd08(2) - c07Var.m75939xb282bd08(0));
                float m75939xb282bd083 = m75939xb282bd08 / (c07Var.m75939xb282bd08(1) - c07Var.m75939xb282bd08(3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "widthRatio:" + m75939xb282bd082 + ", heightRatio:" + m75939xb282bd083);
                int m75939xb282bd084 = (int) (((float) c07Var.m75939xb282bd08(0)) * m75939xb282bd082);
                int m75939xb282bd085 = (int) (((float) c07Var.m75939xb282bd08(3)) * m75939xb282bd083);
                android.graphics.Rect rect = new android.graphics.Rect(m75939xb282bd084, m75939xb282bd085, width + m75939xb282bd084, m75939xb282bd08 + m75939xb282bd085);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genImageThumbFile crop by rect, newThumbRect:" + rect);
                canvas.drawBitmap(S, new android.graphics.Rect(rect.left, rect.top, rect.right, rect.bottom), new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 70, android.graphics.Bitmap.CompressFormat.JPEG, str2, false);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(S, 70, android.graphics.Bitmap.CompressFormat.JPEG, str2, false);
            }
        }
        return str2;
    }

    public final boolean d(java.lang.String thumbFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFile, "thumbFile");
        if (!com.p314xaae8f345.mm.vfs.w6.j(thumbFile)) {
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(thumbFile, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public final java.lang.String e(java.lang.String originFilePath, r45.c07 c07Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originFilePath, "originFilePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183679o);
        sb6.append("image_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(originFilePath.getBytes()));
        sb6.append('_');
        sb6.append(com.p314xaae8f345.mm.vfs.w6.l(originFilePath));
        sb6.append("_thumb");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genImageThumbFileTmp " + originFilePath + ", " + sb7 + ", " + c07Var);
        a(originFilePath, sb7, c07Var);
        return sb7;
    }

    public final java.lang.String f(java.lang.String videoPath, int i17, int i18, android.graphics.Rect rect, java.lang.String dstPath) {
        android.graphics.Bitmap D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstPath, "dstPath");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dstPath) ? l(videoPath, java.lang.String.valueOf(java.lang.System.currentTimeMillis())) : dstPath;
        java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(videoPath, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile savepath:" + l17 + ", input:" + i19);
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        android.graphics.Bitmap p17 = ai3.d.p(videoPath);
        if (p17 != null) {
            android.graphics.Bitmap.Config config = p17.getConfig();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "genVideoThumbFile", "(Ljava/lang/String;IILandroid/graphics/Rect;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/upload/FinderPostFileManager", "genVideoThumbFile", "(Ljava/lang/String;IILandroid/graphics/Rect;Ljava/lang/String;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            if (rect != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile crop by rect");
                canvas.drawBitmap(p17, new android.graphics.Rect(rect.left, rect.bottom, rect.right, rect.top), new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile no rect");
                canvas.drawBitmap(p17, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new android.graphics.Paint());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile cropThumb.width:" + createBitmap.getWidth() + " cropThumb.height:" + createBitmap.getHeight());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, l17, false);
        } else {
            if (d(l17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFile file exist");
                return l17;
            }
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(i19, true) != null) {
                android.graphics.Point k17 = f413151a.k(i19, 4);
                int mo10218x9787f6ed = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(i19);
                int i27 = k17.x;
                int i28 = k17.y;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i19)) {
                    D = null;
                } else {
                    D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(i19, 1, -1);
                    if (D == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostFileManager", "create remux thumb bmp error, target path %s", i19);
                    } else {
                        D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(D, i28, i27, true, true);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genVideoThumbFile file:");
                sb6.append(i19);
                sb6.append(" rotate:");
                sb6.append(mo10218x9787f6ed);
                sb6.append(" thumbSize.x:");
                sb6.append(k17.x);
                sb6.append(" thumbSize.y:");
                sb6.append(k17.y);
                sb6.append(" thumb.width:");
                sb6.append(D != null ? java.lang.Integer.valueOf(D.getWidth()) : null);
                sb6.append(" thumb.height:");
                sb6.append(D != null ? java.lang.Integer.valueOf(D.getHeight()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", sb6.toString());
                if (D != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(D, 70, android.graphics.Bitmap.CompressFormat.JPEG, l17, false);
                }
            }
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostFileManager", "genVideoThumbFile failed.");
        }
        return l17;
    }

    public final java.lang.String g(java.lang.String input, int i17, int i18, android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        return h(input, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.i(input), i17, i18, rect);
    }

    public final java.lang.String h(java.lang.String input, java.lang.String dstPath, int i17, int i18, android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstPath, "dstPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileForPost input:" + input + ", targetWidth:" + i17 + ", targetHeight:" + i18 + ", thumbRect:" + rect + ", dstPath:" + dstPath);
        return f(input, i17, i18, rect, dstPath);
    }

    public final java.lang.String i(java.lang.String input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        android.graphics.Point k17 = k(input, 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp input:" + input + ", targetWidth:" + k17.x + ", targetHeight:" + k17.y);
        return f(input, k17.x, k17.y, null, "");
    }

    public final java.lang.String j(java.lang.String input, r45.c07 thumbRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbRect, "thumbRect");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L2().f152737t;
        int m75939xb282bd08 = (int) (((thumbRect.m75939xb282bd08(1) - thumbRect.m75939xb282bd08(3)) / (thumbRect.m75939xb282bd08(2) - thumbRect.m75939xb282bd08(0))) * i17);
        android.graphics.Rect rect = new android.graphics.Rect(thumbRect.m75939xb282bd08(0), thumbRect.m75939xb282bd08(1), thumbRect.m75939xb282bd08(2), thumbRect.m75939xb282bd08(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp input:" + input + ", targetWidth:" + i17 + ", targetHeight:" + m75939xb282bd08 + ", thumbRect:" + rect);
        return f(input, i17, m75939xb282bd08, rect, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r5 != 7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point k(java.lang.String r4, int r5) {
        /*
            r3 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 != 0) goto La1
            r0 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r0) goto L50
            r0 = 4
            if (r5 == r0) goto L18
            r0 = 6
            if (r5 == r0) goto L18
            r0 = 7
            if (r5 == r0) goto L50
            goto La1
        L18:
            com.tencent.mm.plugin.sight.base.b r4 = hc2.l.e(r4)
            if (r4 == 0) goto La1
            int r5 = r4.f243917c
            int r0 = r4.f243918d
            int r5 = java.lang.Math.min(r5, r0)
            int r0 = java.lang.Math.min(r5, r1)
            int r1 = r4.f243917c
            if (r5 != r1) goto L3f
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f243917c
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f243918d
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r0, r4)
            goto L4f
        L3f:
            android.graphics.Point r5 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r4.f243918d
            float r2 = (float) r2
            float r1 = r1 / r2
            int r4 = r4.f243917c
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = (int) r1
            r5.<init>(r4, r0)
        L4f:
            return r5
        L50:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r0 = 1
            r5.inJustDecodeBounds = r0
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r4, r5)
            com.tencent.mm.compatible.util.Exif r4 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(r4)
            int r4 = r4.m43592x7a249f0b()
            int r4 = r4 % 180
            if (r4 == 0) goto L6f
            int r4 = r5.outHeight
            int r0 = r5.outWidth
            r5.outHeight = r0
            r5.outWidth = r4
        L6f:
            int r4 = r5.outWidth
            int r0 = r5.outHeight
            int r4 = java.lang.Math.min(r4, r0)
            int r0 = java.lang.Math.min(r4, r1)
            int r1 = r5.outWidth
            if (r4 != r1) goto L90
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outWidth
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outHeight
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r0, r5)
            goto La0
        L90:
            android.graphics.Point r4 = new android.graphics.Point
            float r1 = (float) r0
            float r1 = r1 * r2
            int r2 = r5.outHeight
            float r2 = (float) r2
            float r1 = r1 / r2
            int r5 = r5.outWidth
            float r5 = (float) r5
            float r1 = r1 * r5
            int r5 = (int) r1
            r4.<init>(r5, r0)
        La0:
            return r4
        La1:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r1, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.q.k(java.lang.String, int):android.graphics.Point");
    }

    public final java.lang.String l(java.lang.String originFilePath, java.lang.String suffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originFilePath, "originFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183679o);
        sb6.append("video_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(originFilePath.getBytes()));
        sb6.append('_');
        sb6.append(suffix);
        sb6.append("_thumb");
        return sb6.toString();
    }

    public final void m(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        synchronized (f413152b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack markPostFileToDelete ".concat(path));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.util.Set stringSet = L.getStringSet("MARK_DEL_FILES", new java.util.HashSet());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
            stringSet.add(path);
            L.putStringSet("MARK_DEL_FILES", stringSet);
        }
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPost draft");
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p);
        if (draftItem.f66239xf8be237e == 2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t07 = draftItem.t0();
        java.util.LinkedList<r45.mb4> m59263x143e8851 = t07.m59263x143e8851();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = t07.getFeedObject().m76802x2dd01666();
        p(m59263x143e8851, m76802x2dd01666 != null ? m76802x2dd01666.m76980xaa7f977e() : null);
        t07.m59395xdb523460(t07.m59264x7efe73ec());
        if (t07.m59314x4d5c4d55()) {
            t07.m59395xdb523460(t07.m59264x7efe73ec());
        }
        cu2.o.f303963a.b(draftItem);
    }

    public final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPost");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p);
        if (finderObj.m59317xe8cd5cb1()) {
            return;
        }
        java.util.LinkedList<r45.mb4> m59263x143e8851 = finderObj.m59263x143e8851();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderObj.getFeedObject().m76802x2dd01666();
        p(m59263x143e8851, m76802x2dd01666 != null ? m76802x2dd01666.m76980xaa7f977e() : null);
        finderObj.m59395xdb523460(finderObj.m59264x7efe73ec());
        if (finderObj.m59314x4d5c4d55()) {
            finderObj.m59395xdb523460(finderObj.m59264x7efe73ec());
        }
        cu2.u.f303974a.l(finderObj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    public final void p(java.util.List list, r45.q23 q23Var) {
        java.util.Iterator it;
        boolean z17;
        int i17;
        boolean z18;
        java.lang.String str;
        boolean z19;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        ?? r27;
        ?? r37;
        java.util.LinkedList<java.lang.String> linkedList;
        android.net.Uri d17;
        java.util.LinkedList<r45.ho6> linkedList2;
        java.lang.Object obj;
        int i19 = 48;
        java.lang.String str4 = " to ";
        ?? r102 = 0;
        if (list.size() == 1 && ((r45.h70) ((r45.mb4) list.get(0)).m75936x14adae67(21)) != null) {
            r45.h70 h70Var = (r45.h70) ((r45.mb4) list.get(0)).m75936x14adae67(21);
            if (h70Var == null || (linkedList2 = h70Var.f457430d) == null) {
                r27 = 0;
            } else {
                for (r45.ho6 ho6Var : linkedList2) {
                    boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(ho6Var.f457866d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] path:" + ho6Var.f457866d + " fileExist:" + j18 + " originMediaUrl:" + ((r45.mb4) list.get(r102)).m75945x2fec8307(i19));
                    if (j18) {
                        java.lang.String path = ho6Var.f457866d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                        if (!r26.i0.y(path, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, r102)) {
                            java.lang.String e17 = e9Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(ho6Var.f457866d) + ho6Var.hashCode());
                            java.lang.String str5 = ho6Var.f457866d;
                            android.net.Uri c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v6.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str5, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                            if (c17 == null) {
                                c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v6.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str5);
                            }
                            if (c17 != null) {
                                str5 = c17.toString();
                            }
                            com.p314xaae8f345.mm.vfs.w6.c(str5, e17);
                            boolean j19 = com.p314xaae8f345.mm.vfs.w6.j(e17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy track path from " + ho6Var.f457866d + " to " + e17 + " real:" + com.p314xaae8f345.mm.vfs.w6.i(e17, r102) + " result:" + j19);
                            if (j19) {
                                if (ho6Var.f457878s == 1) {
                                    bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                                    java.lang.String str6 = ho6Var.f457866d;
                                    ((b92.u2) vVar).getClass();
                                    dw3.c0.f325715a.A(str6);
                                }
                                java.util.LinkedList trackLabelInfoList = h70Var.f457441r;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackLabelInfoList, "trackLabelInfoList");
                                java.util.Iterator it6 = trackLabelInfoList.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj = it6.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.j70) obj).f459153d, ho6Var.f457866d)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                r45.j70 j70Var = (r45.j70) obj;
                                if (j70Var != null) {
                                    j70Var.f459153d = e17;
                                }
                                ho6Var.f457866d = e17;
                                ((r45.mb4) list.get(0)).set(48, str5);
                            }
                        }
                    }
                    i19 = 48;
                    r102 = 0;
                }
                r27 = r102;
            }
            java.lang.String m75945x2fec8307 = ((r45.mb4) list.get(r27)).m75945x2fec8307(1);
            if (!com.p314xaae8f345.mm.vfs.w6.j(m75945x2fec8307) || m75945x2fec8307 == null) {
                r37 = r27;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                if (!r26.i0.y(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, r27)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()));
                    sb6.append(m75945x2fec8307.hashCode());
                    java.lang.String e18 = e9Var2.e(sb6.toString());
                    android.net.Uri d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v6.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75945x2fec8307);
                    java.lang.String uri = d18 != null ? d18.toString() : m75945x2fec8307;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "let(...)");
                    com.p314xaae8f345.mm.vfs.w6.c(uri, e18);
                    boolean j27 = com.p314xaae8f345.mm.vfs.w6.j(e18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy thumb from " + m75945x2fec8307 + " to " + e18 + " real:" + com.p314xaae8f345.mm.vfs.w6.i(e18, false) + " result:" + j27);
                    if (j27) {
                        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                        dw3.c0.f325715a.A(m75945x2fec8307);
                        r37 = 0;
                        ((r45.mb4) list.get(0)).set(1, e18);
                    }
                }
                r37 = 0;
            }
            java.lang.String m75945x2fec83072 = ((r45.mb4) list.get(r37)).m75945x2fec8307(25);
            if (com.p314xaae8f345.mm.vfs.w6.j(m75945x2fec83072) && m75945x2fec83072 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                if (!r26.i0.y(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, r37)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83072.getBytes()));
                    sb7.append(m75945x2fec83072.hashCode());
                    java.lang.String e19 = e9Var3.e(sb7.toString());
                    com.p314xaae8f345.mm.vfs.w6.c((android.os.Build.VERSION.SDK_INT < 30 || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v6.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75945x2fec83072)) == null) ? m75945x2fec83072 : d17.toString(), e19);
                    boolean j28 = com.p314xaae8f345.mm.vfs.w6.j(e19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy fullThumbPath from " + m75945x2fec83072 + " to " + e19 + " real:" + com.p314xaae8f345.mm.vfs.w6.i(e19, false) + " result:" + j28);
                    if (j28) {
                        ((r45.mb4) list.get(0)).set(25, e19);
                    }
                }
            }
            r45.iy5 iy5Var = q23Var != null ? q23Var.f465125n : null;
            if (iy5Var == null || (linkedList = iy5Var.f458945d) == null || linkedList.size() <= 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            java.lang.String str7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p + "templateScy/";
            com.p314xaae8f345.mm.vfs.w6.u(str7);
            java.lang.Object first = linkedList.getFirst();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
            java.util.List f07 = r26.n0.f0((java.lang.CharSequence) first, new java.lang.String[]{"/"}, false, 0, 6, null);
            if (f07.size() > 2) {
                java.lang.String str8 = str7 + ((java.lang.String) f07.get(f07.size() - 2));
                com.p314xaae8f345.mm.vfs.w6.u(str8);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                for (java.lang.String str9 : linkedList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str9);
                    java.lang.String str10 = str8 + '/' + ((java.lang.String) kz5.n0.i0(r26.n0.f0(str9, new java.lang.String[]{"/"}, false, 0, 6, null)));
                    if (com.p314xaae8f345.mm.vfs.w6.j(str10)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy template frame, dest exist");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForVLog] copy template frame from " + str9 + " to:" + str10 + " result:" + com.p314xaae8f345.mm.vfs.w6.d(str9, str10, false));
                    }
                    linkedList3.add(str10);
                }
                linkedList.clear();
                linkedList.addAll(linkedList3);
                return;
            }
            return;
        }
        long a17 = (int) (c01.id.a() / 1000);
        java.util.Iterator it7 = list.iterator();
        int i27 = 0;
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.mb4 mb4Var = (r45.mb4) next;
            boolean j29 = com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(0));
            boolean j37 = com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(1));
            boolean j38 = com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(16));
            boolean j39 = com.p314xaae8f345.mm.vfs.w6.j(mb4Var.m75945x2fec8307(25));
            java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(0));
            mv2.q qVar = f413151a;
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(0);
            boolean y17 = m75945x2fec83073 != null ? r26.i0.y(m75945x2fec83073, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, false) : false;
            java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(1);
            if (m75945x2fec83074 != null) {
                it = it7;
                z17 = r26.i0.y(m75945x2fec83074, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, false);
            } else {
                it = it7;
                z17 = false;
            }
            java.lang.String m75945x2fec83075 = mb4Var.m75945x2fec8307(16);
            if (m75945x2fec83075 != null) {
                i17 = i28;
                z18 = r26.i0.y(m75945x2fec83075, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, false);
            } else {
                i17 = i28;
                z18 = false;
            }
            java.lang.String m75945x2fec83076 = mb4Var.m75945x2fec8307(25);
            if (m75945x2fec83076 != null) {
                str = str4;
                z19 = r26.i0.y(m75945x2fec83076, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p, false);
            } else {
                str = str4;
                z19 = false;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[moveFileToPostForNormal] mediaId: ");
            sb8.append(a18);
            sb8.append(", fileExist:");
            sb8.append(j29);
            sb8.append(", thumbExist:");
            sb8.append(j37);
            sb8.append(", before url: ");
            sb8.append(mb4Var.m75945x2fec8307(0));
            sb8.append(", ");
            boolean z27 = z19;
            sb8.append(mb4Var.m75945x2fec8307(1));
            sb8.append(", ");
            sb8.append(mb4Var.m75945x2fec8307(16));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", sb8.toString());
            if (j29 || j37) {
                int m75939xb282bd08 = mb4Var.m75939xb282bd08(2);
                boolean z28 = z18;
                if (m75939xb282bd08 != 2) {
                    if (m75939xb282bd08 == 4) {
                        if (j29 && j37 && !z17) {
                            java.lang.String m75945x2fec83077 = mb4Var.m75945x2fec8307(0);
                            if (m75945x2fec83077 == null) {
                                m75945x2fec83077 = "";
                            }
                            java.lang.String m75945x2fec83078 = mb4Var.m75945x2fec8307(1);
                            if (m75945x2fec83078 == null) {
                                m75945x2fec83078 = "";
                            }
                            java.lang.String i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.i(m75945x2fec83077);
                            j17 = a17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyVideoThumbFileToPost, videoFilePath:" + m75945x2fec83077 + ", thumbOriginPath:" + m75945x2fec83078 + ", thumbPostPath:" + i29);
                            if (qVar.d(m75945x2fec83078)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost exist, copy");
                                com.p314xaae8f345.mm.vfs.w6.c(m75945x2fec83078, i29);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost not exist, generate");
                                android.graphics.Point k17 = qVar.k(m75945x2fec83077, 4);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "genVideoThumbFileTmp videoFilePath:" + m75945x2fec83077 + ", targetWidth:" + k17.x + ", targetHeight:" + k17.y);
                                qVar.f(m75945x2fec83077, k17.x, k17.y, null, i29);
                            }
                            boolean j47 = com.p314xaae8f345.mm.vfs.w6.j(i29);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] Video thumb to " + i29 + " result:" + j47);
                            if (j47) {
                                mb4Var.set(1, i29);
                            }
                        } else {
                            j17 = a17;
                        }
                        if (j29 && !y17) {
                            java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.h(new mn2.g4(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.R, "xV99", 0, 0, null, false, null, 248, null), java.lang.String.valueOf(j17));
                            long d19 = com.p314xaae8f345.mm.vfs.w6.d(mb4Var.m75945x2fec8307(0), h17, false);
                            boolean j48 = com.p314xaae8f345.mm.vfs.w6.j(h17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] Video from " + mb4Var.m75945x2fec8307(0) + " targetPath" + h17 + " result:" + j48);
                            if (j48) {
                                mb4Var.set(48, mb4Var.m75945x2fec8307(0));
                                mb4Var.set(0, h17);
                                java.lang.String m75945x2fec83079 = mb4Var.m75945x2fec8307(0);
                                mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((m75945x2fec83079 != null ? m75945x2fec83079 : "").getBytes()));
                                mb4Var.set(46, hc2.l.k(mb4Var.m75945x2fec8307(1)));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copy Video failed, copyRet:" + d19);
                            }
                        }
                        if (!j38 || z28) {
                            str3 = ", ";
                            str4 = str;
                            i18 = 16;
                        } else {
                            str3 = ", ";
                            i18 = 16;
                            java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.f(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), java.lang.String.valueOf(j17));
                            com.p314xaae8f345.mm.vfs.w6.c(mb4Var.m75945x2fec8307(16), f17);
                            mb4Var.set(16, f17);
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[moveFileToPostForNormal] Cover from ");
                            sb9.append(mb4Var.m75945x2fec8307(16));
                            str4 = str;
                            sb9.append(str4);
                            sb9.append(f17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", sb9.toString());
                        }
                        if (j39 && !z27) {
                            java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.f(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), java.lang.String.valueOf(j17));
                            com.p314xaae8f345.mm.vfs.w6.c(mb4Var.m75945x2fec8307(25), f18);
                            mb4Var.set(25, f18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] fullThumb from " + mb4Var.m75945x2fec8307(i18) + str4 + f18);
                        }
                        str2 = str3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.m75945x2fec8307(9) + ", url: " + mb4Var.m75945x2fec8307(0) + str2 + mb4Var.m75945x2fec8307(1) + str2 + mb4Var.m75945x2fec8307(16));
                    } else if (m75939xb282bd08 != 7) {
                        j17 = a17;
                        str2 = ", ";
                        str4 = str;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.m75945x2fec8307(9) + ", url: " + mb4Var.m75945x2fec8307(0) + str2 + mb4Var.m75945x2fec8307(1) + str2 + mb4Var.m75945x2fec8307(16));
                    }
                }
                j17 = a17;
                str2 = ", ";
                java.lang.String str11 = str;
                if (j29 && j37 && !z17) {
                    java.lang.String m75945x2fec830710 = mb4Var.m75945x2fec8307(0);
                    if (m75945x2fec830710 == null) {
                        m75945x2fec830710 = "";
                    }
                    java.lang.String m75945x2fec830711 = mb4Var.m75945x2fec8307(1);
                    java.lang.String str12 = m75945x2fec830711 == null ? "" : m75945x2fec830711;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p);
                    sb10.append("image_");
                    sb10.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec830710.getBytes()));
                    sb10.append('_');
                    str = str11;
                    sb10.append(com.p314xaae8f345.mm.vfs.w6.l(m75945x2fec830710));
                    sb10.append("_thumb");
                    java.lang.String sb11 = sb10.toString();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost, imagePath:" + m75945x2fec830710 + ", thumbOriginPath:" + str12 + ", thumbPostPath:" + sb11);
                    if (qVar.d(str12)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost exist, copy");
                        com.p314xaae8f345.mm.vfs.w6.c(str12, sb11);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copyImageThumbFromTmpToPost not exist, generate");
                        qVar.a(m75945x2fec830710, sb11, null);
                    }
                    boolean j49 = com.p314xaae8f345.mm.vfs.w6.j(sb11);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "[moveFileToPostForNormal] copy thumb to " + sb11 + " result:" + j49);
                    if (j49) {
                        mb4Var.set(1, sb11);
                    }
                } else {
                    str = str11;
                }
                if (j29 && !y17) {
                    java.lang.String d27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.d(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, null, 12, null), java.lang.String.valueOf(j17));
                    long d28 = com.p314xaae8f345.mm.vfs.w6.d(mb4Var.m75945x2fec8307(0), d27, false);
                    boolean j57 = com.p314xaae8f345.mm.vfs.w6.j(d27);
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[moveFileToPostForNormal] Image from ");
                    sb12.append(mb4Var.m75945x2fec8307(0));
                    str4 = str;
                    sb12.append(str4);
                    sb12.append(d27);
                    sb12.append(" result:");
                    sb12.append(j57);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", sb12.toString());
                    if (j57) {
                        mb4Var.set(48, mb4Var.m75945x2fec8307(0));
                        mb4Var.set(0, d27);
                        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(0)));
                        mb4Var.set(46, hc2.l.k(mb4Var.m75945x2fec8307(1)));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "copy Image failed, copyRet:" + d28);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.m75945x2fec8307(9) + ", url: " + mb4Var.m75945x2fec8307(0) + str2 + mb4Var.m75945x2fec8307(1) + str2 + mb4Var.m75945x2fec8307(16));
                }
                str4 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "moveFileToPostForNormal, after mediaId: " + mb4Var.m75945x2fec8307(9) + ", url: " + mb4Var.m75945x2fec8307(0) + str2 + mb4Var.m75945x2fec8307(1) + str2 + mb4Var.m75945x2fec8307(16));
            } else {
                j17 = a17;
                str4 = str;
            }
            it7 = it;
            i27 = i17;
            a17 = j17;
        }
    }
}
