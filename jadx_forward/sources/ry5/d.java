package ry5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f483280a;

    /* renamed from: b, reason: collision with root package name */
    public static int f483281b;

    /* renamed from: c, reason: collision with root package name */
    public static final zy5.b f483282c = new zy5.b(com.p314xaae8f345.mm.R.id.vow);

    /* renamed from: d, reason: collision with root package name */
    public static final zy5.b f483283d = new zy5.b(com.p314xaae8f345.mm.R.id.vox);

    /* renamed from: e, reason: collision with root package name */
    public static final android.util.LruCache f483284e = new android.util.LruCache(10);

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.LruCache f483285f = new android.util.LruCache(10);

    public static int a() {
        android.app.Activity a17;
        int i17;
        if (f483280a <= 0) {
            mk.b bVar = a.b.c().f81581e;
            java.lang.String string = bVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").getString("sentinel_screen_height", "0") : null;
            if (string != null) {
                f483280a = java.lang.Integer.parseInt(string);
            }
            if (f483280a <= 0 && (a17 = a.b.c().a()) != null) {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    android.view.WindowMetrics currentWindowMetrics = a17.getWindowManager().getCurrentWindowMetrics();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                    i17 = currentWindowMetrics.getBounds().height();
                } else {
                    i17 = a17.getResources().getDisplayMetrics().heightPixels;
                }
                f483280a = i17;
                if (i17 > 0 && bVar != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").putString("sentinel_screen_height", java.lang.String.valueOf(i17));
                }
            }
        }
        return f483280a;
    }

    public static android.graphics.Bitmap b(android.graphics.Bitmap bitmap, int i17, int i18) {
        if (bitmap == null || bitmap.getByteCount() <= 0) {
            return null;
        }
        int j17 = j();
        int a17 = a();
        try {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(a17));
            arrayList.add(java.lang.Integer.valueOf(j17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "d/d", "a", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "d/d", "a", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, i17, i18, (android.graphics.Paint) null);
            return createBitmap;
        } catch (java.lang.Exception e17) {
            xy5.b.a("enricwu", "[combineBitmapToScreen] throw Exception : " + e17.getMessage() + ", screenWidth : " + j17 + ", screenHeight : " + a17);
            return bitmap;
        }
    }

    public static android.graphics.Bitmap c(android.view.View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "d/d", "a", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "d/d", "a", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            view.draw(new android.graphics.Canvas(createBitmap));
            return createBitmap;
        } catch (java.lang.Exception e17) {
            xy5.b.a("enricwu", "[captureViewUseDraw] throw Exception : " + e17.getMessage());
            return null;
        }
    }

    public static android.view.View d(android.app.Activity activity) {
        java.lang.Object b17;
        if (activity == null) {
            return null;
        }
        android.util.LruCache lruCache = f483285f;
        java.lang.Boolean bool = (java.lang.Boolean) lruCache.get(java.lang.Integer.valueOf(activity.hashCode()));
        if (bool == null && a.b.c().f81582f != null) {
            bool = java.lang.Boolean.valueOf(activity instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37);
            lruCache.put(java.lang.Integer.valueOf(activity.hashCode()), bool);
        }
        return ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) && (b17 = xy5.c.b(activity, "getWindow", new java.lang.Class[0], new java.lang.Object[0])) != null && (b17 instanceof android.view.Window)) ? ((android.view.Window) b17).getDecorView() : activity.getWindow().getDecorView()).getRootView();
    }

    public static java.lang.String e(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        android.graphics.Bitmap.CompressFormat format = android.graphics.Bitmap.CompressFormat.JPEG;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                bArr = bitmap.compress(format, 10, byteArrayOutputStream) ? byteArrayOutputStream.toByteArray() : null;
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused) {
                    if (bArr != null && bArr.length != 0) {
                        try {
                            return android.util.Base64.encodeToString(bArr, 2);
                        } catch (java.lang.IllegalArgumentException | java.lang.Exception unused2) {
                            return null;
                        }
                    }
                    return null;
                }
            } catch (java.lang.Exception unused3) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                bArr = null;
                if (bArr != null) {
                    return android.util.Base64.encodeToString(bArr, 2);
                }
                return null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused6) {
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static wy5.e f(android.view.View view, int i17) {
        wy5.e f17;
        wy5.e eVar = null;
        if (view != null && view.isAttachedToWindow() && view.getVisibility() == 0 && view.getAlpha() > 2.0E-9f) {
            android.graphics.Rect rect = new android.graphics.Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return null;
            }
            if (rect.bottom - rect.top > 0 && rect.right - rect.left > 0) {
                eVar = new wy5.e();
                int i18 = rect.left;
                eVar.f532208a = i18;
                int i19 = rect.top;
                eVar.f532209b = i19;
                eVar.f532210c = rect.right - i18;
                eVar.f532211d = rect.bottom - i19;
                mk.d dVar = a.b.c().f81582f;
                if (dVar != null) {
                    ((my1.c) dVar).a(view, eVar.f532212e);
                }
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    if (viewGroup.getChildCount() > 0) {
                        int childCount = viewGroup.getChildCount();
                        for (int i27 = 0; i27 < childCount; i27++) {
                            android.view.View childAt = viewGroup.getChildAt(i27);
                            if (childAt != null && (f17 = f(childAt, i17 + 1)) != null) {
                                eVar.f532213f.add(f17);
                            }
                        }
                    }
                }
            }
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.app.Activity r8, final android.os.Handler r9, final yz5.l r10) {
        /*
            java.lang.String r0 = "handler"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "callBack"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            if (r8 != 0) goto Ld
            return
        Ld:
            android.view.Window r0 = r8.getWindow()
            android.view.View r0 = r0.getDecorView()
            zy5.b r1 = ry5.d.f483283d
            java.lang.Object r0 = r1.a(r0)
            java.lang.String r2 = "FlutterView"
            java.lang.String r3 = "FlutterViewEngine"
            r4 = 0
            if (r0 != 0) goto L3c
            java.lang.Object r0 = xy5.c.c(r8, r3)
            if (r0 != 0) goto L29
            goto L2f
        L29:
            java.lang.Object r0 = xy5.c.c(r0, r2)
            if (r0 != 0) goto L31
        L2f:
            r0 = r4
            goto L3c
        L31:
            android.view.Window r5 = r8.getWindow()
            android.view.View r5 = r5.getDecorView()
            r1.c(r5, r0)
        L3c:
            android.view.Window r5 = r8.getWindow()
            android.view.View r5 = r5.getDecorView()
            zy5.b r6 = ry5.d.f483282c
            java.lang.Object r5 = r6.a(r5)
            if (r5 != 0) goto L95
            android.view.Window r7 = r8.getWindow()
            android.view.View r7 = r7.getDecorView()
            java.lang.Object r7 = r1.a(r7)
            if (r7 != 0) goto L74
            java.lang.Object r3 = xy5.c.c(r8, r3)
            if (r3 != 0) goto L61
            goto L67
        L61:
            java.lang.Object r7 = xy5.c.c(r3, r2)
            if (r7 != 0) goto L69
        L67:
            r7 = r4
            goto L74
        L69:
            android.view.Window r2 = r8.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.c(r2, r7)
        L74:
            if (r7 == 0) goto L95
            java.lang.String r1 = "renderSurface"
            java.lang.Object r1 = xy5.c.a(r7, r1)
            if (r1 != 0) goto L7f
            goto L96
        L7f:
            java.lang.String r2 = "flutterRenderer"
            java.lang.Object r1 = xy5.c.a(r1, r2)
            if (r1 != 0) goto L88
            goto L96
        L88:
            android.view.Window r8 = r8.getWindow()
            android.view.View r8 = r8.getDecorView()
            r6.c(r8, r1)
            r4 = r1
            goto L96
        L95:
            r4 = r5
        L96:
            boolean r8 = r0 instanceof android.view.View
            if (r8 == 0) goto La6
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            ry5.d$$f r1 = new ry5.d$$f
            r1.<init>()
            r8.post(r1)
            goto Lae
        La6:
            ry5.d$$g r8 = new ry5.d$$g
            r8.<init>()
            r9.post(r8)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry5.d.g(android.app.Activity, android.os.Handler, yz5.l):void");
    }

    public static void h(final android.view.View view, final android.view.Window window, final android.os.Handler handler, final java.lang.String msg, final yz5.p callBack, final boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        view.post(new java.lang.Runnable() { // from class: ry5.d$$e
            /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 466
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ry5.RunnableC30168x2e0101.run():void");
            }
        });
    }

    public static void i(java.lang.Object target, android.os.Handler handler, final yz5.p callBack) {
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        if (!(target instanceof android.app.Activity)) {
            if (target instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
                android.content.Context mo7438x76847179 = ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) target).mo7438x76847179();
                if (mo7438x76847179 == null || !(mo7438x76847179 instanceof android.app.Activity) || (window = ((android.app.Activity) mo7438x76847179).getWindow()) == null) {
                    return;
                }
                android.view.View decorView = window.getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                h(decorView, window, handler, target.getClass().getSimpleName(), new yz5.p() { // from class: ry5.d$$c
                    @Override // yz5.p
                    /* renamed from: invoke */
                    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                        yz5.p.this.mo149xb9724478((android.graphics.Bitmap) obj, (java.lang.Integer) obj2);
                        return jz5.f0.f384359a;
                    }
                }, true);
                return;
            }
            if (target instanceof android.view.View) {
                android.view.View view = (android.view.View) target;
                ((my1.c) a.b.c().f81582f).getClass();
                android.content.Context g17 = sz1.a.g(view);
                if (g17 instanceof android.app.Activity) {
                    android.view.Window window2 = ((android.app.Activity) g17).getWindow();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window2);
                    h(view, window2, handler, target.getClass().getSimpleName(), new yz5.p() { // from class: ry5.d$$d
                        @Override // yz5.p
                        /* renamed from: invoke */
                        public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                            yz5.p.this.mo149xb9724478((android.graphics.Bitmap) obj, (java.lang.Integer) obj2);
                            return jz5.f0.f384359a;
                        }
                    }, false);
                    return;
                }
                return;
            }
            return;
        }
        android.app.Activity activity = (android.app.Activity) target;
        android.util.LruCache lruCache = f483284e;
        java.lang.Boolean bool = (java.lang.Boolean) lruCache.get(java.lang.Integer.valueOf(activity.hashCode()));
        if (bool == null && a.b.c().f81582f != null) {
            bool = java.lang.Boolean.valueOf(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950);
            lruCache.put(java.lang.Integer.valueOf(activity.hashCode()), bool);
        }
        if (bool == null || !bool.booleanValue()) {
            android.view.View d17 = d(activity);
            if (d17 != null) {
                android.view.Window window3 = activity.getWindow();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window3, "getWindow(...)");
                h(d17, window3, handler, target.getClass().getSimpleName(), new yz5.p() { // from class: ry5.d$$b
                    @Override // yz5.p
                    /* renamed from: invoke */
                    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                        yz5.p.this.mo149xb9724478((android.graphics.Bitmap) obj, (java.lang.Integer) obj2);
                        return jz5.f0.f384359a;
                    }
                }, true);
                return;
            }
            return;
        }
        try {
            g((android.app.Activity) target, handler, new yz5.l() { // from class: ry5.d$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    yz5.p.this.mo149xb9724478((android.graphics.Bitmap) obj, 0);
                    return jz5.f0.f384359a;
                }
            });
        } catch (java.lang.Exception e17) {
            java.lang.String format = java.lang.String.format("[captureTarget] throw Exception : %s", java.util.Arrays.copyOf(new java.lang.Object[]{e17.getMessage()}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            xy5.b.a("enricwu.SentinelUtils", format);
        }
    }

    public static int j() {
        android.app.Activity a17;
        int i17;
        mk.b bVar = a.b.c().f81581e;
        java.lang.String string = bVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").getString("sentinel_screen_width", "0") : null;
        if (string != null) {
            f483281b = java.lang.Integer.parseInt(string);
        }
        if (f483281b <= 0 && (a17 = a.b.c().a()) != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.view.WindowMetrics currentWindowMetrics = a17.getWindowManager().getCurrentWindowMetrics();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                i17 = currentWindowMetrics.getBounds().width();
            } else {
                i17 = a17.getResources().getDisplayMetrics().widthPixels;
            }
            f483281b = i17;
            if (i17 > 0 && bVar != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_id_amoeba_default").putString("sentinel_screen_width", java.lang.String.valueOf(i17));
            }
        }
        return f483281b;
    }
}
