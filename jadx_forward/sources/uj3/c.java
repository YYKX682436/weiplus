package uj3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f509775a;

    /* renamed from: b, reason: collision with root package name */
    public int f509776b;

    /* renamed from: c, reason: collision with root package name */
    public int f509777c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p1 f509778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f509779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f509780f;

    /* renamed from: g, reason: collision with root package name */
    public int f509781g;

    /* renamed from: h, reason: collision with root package name */
    public int f509782h;

    /* renamed from: i, reason: collision with root package name */
    public final qj3.h f509783i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f509784j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f509785k;

    public c(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509776b = -1;
        this.f509777c = -1;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f509775a = frameLayout;
        qj3.h hVar = new qj3.h(context, statusManager, kVar);
        this.f509783i = hVar;
        hVar.m160249x18ba59ff(false);
        frameLayout.addView(hVar);
        frameLayout.setVisibility(8);
    }

    public final void a(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        qj3.g m160244xafdb561a;
        ym5.w2 w2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        qj3.h hVar = this.f509783i;
        float height = (hVar != null ? hVar.getHeight() : 0) - ((hVar == null || (m160244xafdb561a = hVar.m160244xafdb561a()) == null || (w2Var = m160244xafdb561a.f445415m) == null) ? 0 : w2Var.getHeight());
        if (hVar != null) {
            qj3.g gVar = hVar.f445428o;
            ym5.w2 w2Var2 = gVar.f445415m;
            int width = w2Var2 != null ? w2Var2.getWidth() : 0;
            ym5.w2 w2Var3 = gVar.f445415m;
            int height2 = w2Var3 != null ? w2Var3.getHeight() : 0;
            if (width <= 0 || height2 <= 0) {
                bitmap = null;
            } else {
                if (hVar.f445430q == null || hVar.f445431r != width || hVar.f445432s != height2) {
                    hVar.f445431r = width;
                    hVar.f445432s = height2;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(height2));
                    arrayList.add(java.lang.Integer.valueOf(width));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/editor/MultiTalkScreenEditContainerPlugin", "drawBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/editor/MultiTalkScreenEditContainerPlugin", "drawBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    hVar.f445430q = createBitmap;
                }
                android.graphics.Bitmap bitmap2 = hVar.f445430q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmap2);
                canvas2.drawPaint(new android.graphics.Paint());
                canvas2.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
                canvas2.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                ym5.w2 w2Var4 = gVar.f445415m;
                if (w2Var4 != null) {
                    w2Var4.draw(canvas2);
                }
                bitmap = hVar.f445430q;
            }
            if (bitmap != null) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postTranslate(0.0f, height / 2);
                canvas.drawBitmap(bitmap, matrix, paint);
            }
        }
    }

    public final void b(ct0.b config, yz5.a aVar) {
        bn5.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        qj3.h hVar = this.f509783i;
        if (hVar != null) {
            hVar.f445424h.e();
            qj3.g gVar2 = hVar.f445428o;
            gVar2.getClass();
            if (gVar2.f445420r) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                android.graphics.Rect rect = config.f303751o;
                objArr[0] = rect != null ? rect.toShortString() : null;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MultiTalkEditPhotoContainerPlugin", "config is %s", objArr);
            } else {
                gVar2.a(false, config);
            }
            ym5.w2 w2Var = gVar2.f445415m;
            if (w2Var == null || (gVar = (bn5.g) w2Var.m177310x5143ab24()) == null) {
                return;
            }
            gVar.f104474e.reset();
            gVar.a();
            gVar.invalidate();
            gVar.G = aVar;
            gVar.H = true;
        }
    }

    public final void c(float f17, int i17, int i18, boolean z17, boolean z18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38 = (int) (this.f509776b * f17);
        int i39 = (int) (this.f509777c * f17);
        if (z17) {
            android.widget.FrameLayout frameLayout = this.f509775a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
            if (i38 <= frameLayout.getMeasuredWidth()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                i37 = (frameLayout.getMeasuredWidth() - i38) / 2;
            } else if (i17 > 0) {
                i37 = 0;
            } else {
                int i47 = i17 + i38;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                if (i47 < frameLayout.getMeasuredWidth()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                    i37 = frameLayout.getMeasuredWidth() - i38;
                } else {
                    i37 = i17;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
            if (i39 <= frameLayout.getMeasuredHeight()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                i18 = (frameLayout.getMeasuredHeight() - i39) / 2;
            } else if (i18 > 0) {
                i27 = 0;
                i19 = i37;
            } else {
                int i48 = i18 + i39;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                if (i48 < frameLayout.getMeasuredHeight()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                    i18 = frameLayout.getMeasuredHeight() - i39;
                }
            }
            i27 = i18;
            i19 = i37;
        } else {
            i19 = i17;
            i27 = i18;
        }
        if (z18) {
            com.p314xaae8f345.p3210x3857dc.p1 p1Var = this.f509778d;
            int i49 = i17 - (p1Var != null ? p1Var.f301904a : 0);
            if (i49 < 0) {
                if (java.lang.Math.abs(i49) <= this.f509776b / 4 || (i29 = this.f509781g) >= this.f509782h - 1) {
                    com.p314xaae8f345.p3210x3857dc.r1.f(this.f509779e, this.f509780f, -1, f17, i19, i27);
                    return;
                }
                com.p314xaae8f345.p3210x3857dc.r1.f(this.f509779e, this.f509780f, i29 + 1, f17, i19, i27);
                yz5.l lVar = this.f509784j;
                if (lVar != null) {
                    return;
                }
                return;
            }
            if (java.lang.Math.abs(i49) <= this.f509776b / 4 || (i28 = this.f509781g) <= 0) {
                com.p314xaae8f345.p3210x3857dc.r1.f(this.f509779e, this.f509780f, -1, f17, i19, i27);
                return;
            }
            com.p314xaae8f345.p3210x3857dc.r1.f(this.f509779e, this.f509780f, i28 - 1, f17, i19, i27);
            yz5.l lVar2 = this.f509784j;
            if (lVar2 != null) {
            }
        }
    }
}
