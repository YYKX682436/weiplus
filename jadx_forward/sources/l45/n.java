package l45;

/* loaded from: classes10.dex */
public class n implements l45.q {

    /* renamed from: a, reason: collision with root package name */
    public ym5.h f397993a;

    /* renamed from: b, reason: collision with root package name */
    public qk.l9 f397994b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f397995c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f397996d;

    /* renamed from: e, reason: collision with root package name */
    public qk.i6 f397997e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f397998f;

    /* renamed from: o, reason: collision with root package name */
    public l45.o f398007o;

    /* renamed from: p, reason: collision with root package name */
    public l45.p f398008p;

    /* renamed from: r, reason: collision with root package name */
    public cm5.g f398010r;

    /* renamed from: t, reason: collision with root package name */
    public l45.m f398012t;

    /* renamed from: u, reason: collision with root package name */
    public qk.g6 f398013u;

    /* renamed from: v, reason: collision with root package name */
    public qk.g6 f398014v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f398015w;

    /* renamed from: x, reason: collision with root package name */
    public dl.b f398016x;

    /* renamed from: y, reason: collision with root package name */
    public hk0.u0 f398017y;

    /* renamed from: g, reason: collision with root package name */
    public boolean f397999g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f398000h = true;

    /* renamed from: i, reason: collision with root package name */
    public float f398001i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f398002j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f398003k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f398004l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f398005m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f398006n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f398009q = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f398011s = null;

    public n() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f398013u = g6Var;
        this.f398014v = g6Var;
        this.f398015w = false;
        this.f398016x = null;
        this.f398017y = null;
    }

    public static void a(l45.n nVar, boolean z17) {
        if (z17) {
            nVar.getClass();
            nVar.b(c01.s2.f118979v, null);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(nVar.e(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
            loadAnimation.setAnimationListener(new l45.f(nVar));
            nVar.f397993a.mo177318xd03217ea().startAnimation(loadAnimation);
            return;
        }
        if (nVar.f397993a.m177314x1456a638().f445764a != qk.n9.VIDEO_COVER) {
            android.view.View mo177318xd03217ea = nVar.f397993a.mo177318xd03217ea();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.82f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo177318xd03217ea, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo177318xd03217ea.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(mo177318xd03217ea, "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        nVar.b(c01.s2.f118980w, null);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(nVar.e(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        loadAnimation2.setAnimationListener(new l45.g(nVar));
        nVar.f397993a.mo177318xd03217ea().startAnimation(loadAnimation2);
    }

    public final void b(c01.s2 s2Var, xk0.f fVar) {
        l45.p pVar = this.f398008p;
        if (pVar != null) {
            ((aw3.e) pVar).a(s2Var, fVar);
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "checkInitArtist: %s", java.lang.Boolean.valueOf(this.f398015w));
        if (this.f398015w) {
            return;
        }
        this.f398015w = true;
        java.util.Iterator it = this.f397996d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().d(bVar.m())) {
                bVar.t();
                bVar.E(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", bVar.m());
            }
        }
        if (this.f397993a.m177310x5143ab24().f()) {
            this.f397993a.m177310x5143ab24().a();
            this.f397993a.m177310x5143ab24().invalidate();
        }
    }

    public dl.b d(qk.g6 g6Var) {
        this.f397995c.size();
        this.f397995c.containsKey(g6Var);
        return (dl.b) this.f397995c.get(g6Var);
    }

    public android.content.Context e() {
        return this.f397993a.getContext();
    }

    public dl.b f() {
        dl.b bVar = this.f398016x;
        if (bVar != null) {
            return bVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawingPresenter", "[getCurArtist] is null!");
        return dl.b.f316571p;
    }

    public float g() {
        return this.f397993a.m177310x5143ab24().m10937x9c703c60();
    }

    public android.graphics.Bitmap h() {
        android.graphics.Rect rect = new android.graphics.Rect(this.f397993a.m177310x5143ab24().mo10933x81daa99b());
        if (f() instanceof dl.t) {
            dl.t tVar = (dl.t) f();
            tVar.getClass();
            android.graphics.RectF rectF = new android.graphics.RectF(tVar.f316663x);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            tVar.h().invert(matrix);
            matrix.mapRect(rectF);
            rect = new android.graphics.Rect();
            rectF.round(rect);
        }
        android.graphics.Bitmap bitmap = this.f397998f;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f397994b.f445767d, options);
        float height = (options.outHeight * 1.0f) / bitmap.getHeight();
        float width = (options.outWidth * 1.0f) / bitmap.getWidth();
        if (height <= width) {
            height = width;
        }
        if (height == 0.0f) {
            height = 1.0f;
        }
        int i17 = this.f398004l;
        if (i17 > 0 && this.f398003k > 0) {
            height = (i17 * 1.0f) / bitmap.getHeight();
            float width2 = (this.f398003k * 1.0f) / bitmap.getWidth();
            if (height > width2) {
                height = width2;
            }
        }
        float d17 = this.f397993a.m177310x5143ab24().d(this.f397993a.m177310x5143ab24().m10942xfeaf52d0());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postScale(height, height, 0.0f, 0.0f);
        matrix2.postRotate(-d17);
        if (this.f397993a.m177314x1456a638().f445764a == qk.n9.VIDEO_COVER) {
            rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else if (this.f398001i > 0.0f) {
            i(bitmap, rect);
            float width3 = (float) ((rect.width() * 1.0d) / rect.height());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s ratio:%f", rect, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Float.valueOf(width3));
            double d18 = width3;
            float f17 = this.f398001i;
            double d19 = f17;
            if (d18 < d19 - 0.06d || d18 > d19 + 0.06d) {
                if (f17 > width3) {
                    int centerY = rect.centerY();
                    int width4 = (int) ((rect.width() * 1.0f) / this.f398001i);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "clipRect.width() : " + rect.width() + " new height:" + width4);
                    int i18 = width4 / 2;
                    rect.top = centerY - i18;
                    rect.bottom = centerY + i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "top :" + rect.top + " bottom:" + rect.bottom);
                } else {
                    int centerX = rect.centerX();
                    int height2 = (int) (rect.height() * 1.0f * this.f398001i);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "clipRect.height() : " + rect.height() + " new width:" + height2);
                    int i19 = height2 / 2;
                    rect.left = centerX - i19;
                    rect.right = centerX + i19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "left :" + rect.left + " right:" + rect.right + " cropRectRatio:" + this.f398001i);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "ratio clipRect :" + ((rect.width() * 1.0f) / rect.height()));
        } else {
            i(bitmap, rect);
        }
        return l(bitmap, rect, d17, options, matrix2);
    }

    public final android.graphics.Rect i(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", rect, java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        if (rect.left < 0) {
            rect.left = 0;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        if (rect.bottom < 0) {
            rect.bottom = 0;
        }
        if (rect.right < 0) {
            rect.right = 0;
        }
        if (rect.bottom > bitmap.getHeight()) {
            rect.bottom = bitmap.getHeight();
        }
        if (rect.right > bitmap.getWidth()) {
            rect.right = bitmap.getWidth();
        }
        return rect;
    }

    public java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dl.y yVar = (dl.y) d(qk.g6.EMOJI);
        if (yVar != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            um.g gVar = (um.g) yVar.d();
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "getCurrentEmojiList failed, cache is null!");
            } else {
                java.util.ListIterator f17 = gVar.f();
                while (f17.hasPrevious()) {
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = ((xk0.f) f17.previous()).f536484f;
                    if (interfaceC4987x84e327cb != null) {
                        arrayList2.add(interfaceC4987x84e327cb);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public float k() {
        return this.f397993a.m177310x5143ab24().m10941xef60cf64();
    }

    public final android.graphics.Bitmap l(android.graphics.Bitmap bitmap, android.graphics.Rect rect, float f17, android.graphics.BitmapFactory.Options options, android.graphics.Matrix matrix) {
        android.graphics.Bitmap createBitmap;
        try {
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DrawingPresenter", e17, "", new java.lang.Object[0]);
            float f18 = 1920.0f / options.outHeight;
            float f19 = 1920.0f / options.outWidth;
            if (f18 <= f19) {
                f18 = f19;
            }
            matrix.reset();
            matrix.postScale(f18, f18, 0.0f, 0.0f);
            matrix.postRotate(-f17);
            if (bitmap.getWidth() - rect.width() > 9 || bitmap.getHeight() - rect.height() > 9) {
                int i17 = rect.left;
                int i18 = rect.top;
                int width = rect.width();
                int height = rect.height();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(java.lang.Integer.valueOf(i18));
                aVar.c(java.lang.Integer.valueOf(i17));
                aVar.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            } else {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                zj0.a aVar2 = new zj0.a();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                aVar2.c(java.lang.Boolean.TRUE);
                aVar2.c(matrix);
                aVar2.c(java.lang.Integer.valueOf(height2));
                aVar2.c(java.lang.Integer.valueOf(width2));
                aVar2.c(0);
                aVar2.c(0);
                aVar2.c(bitmap);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            }
        }
        if (bitmap.getWidth() - rect.width() <= 9 && bitmap.getHeight() - rect.height() <= 9) {
            int width3 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            zj0.a aVar3 = new zj0.a();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            aVar3.c(java.lang.Boolean.TRUE);
            aVar3.c(matrix);
            aVar3.c(java.lang.Integer.valueOf(height3));
            aVar3.c(java.lang.Integer.valueOf(width3));
            aVar3.c(0);
            aVar3.c(0);
            aVar3.c(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            yj0.a.d(obj3, aVar3.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar3.a(0), ((java.lang.Integer) aVar3.a(1)).intValue(), ((java.lang.Integer) aVar3.a(2)).intValue(), ((java.lang.Integer) aVar3.a(3)).intValue(), ((java.lang.Integer) aVar3.a(4)).intValue(), (android.graphics.Matrix) aVar3.a(5), ((java.lang.Boolean) aVar3.a(6)).booleanValue());
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "getSafeResultBitmap: result bitmap:[w:%d,h:%d], src bitmap:[w:%d,h:%d], clipRect:[w:%d,h:%d, left:%d, top:%d], rotation:%s", java.lang.Integer.valueOf(createBitmap.getWidth()), java.lang.Integer.valueOf(createBitmap.getHeight()), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Float.valueOf(f17));
            return createBitmap;
        }
        int i19 = rect.left;
        int i27 = rect.top;
        int width4 = rect.width();
        int height4 = rect.height();
        zj0.a aVar4 = new zj0.a();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        aVar4.c(java.lang.Boolean.TRUE);
        aVar4.c(matrix);
        aVar4.c(java.lang.Integer.valueOf(height4));
        aVar4.c(java.lang.Integer.valueOf(width4));
        aVar4.c(java.lang.Integer.valueOf(i27));
        aVar4.c(java.lang.Integer.valueOf(i19));
        aVar4.c(bitmap);
        java.lang.Object obj4 = new java.lang.Object();
        yj0.a.d(obj4, aVar4.b(), "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar4.a(0), ((java.lang.Integer) aVar4.a(1)).intValue(), ((java.lang.Integer) aVar4.a(2)).intValue(), ((java.lang.Integer) aVar4.a(3)).intValue(), ((java.lang.Integer) aVar4.a(4)).intValue(), (android.graphics.Matrix) aVar4.a(5), ((java.lang.Boolean) aVar4.a(6)).booleanValue());
        yj0.a.e(obj4, createBitmap, "com/tencent/mm/presenter/DrawingPresenter", "getSafeResultBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FLandroid/graphics/BitmapFactory$Options;Landroid/graphics/Matrix;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "getSafeResultBitmap: result bitmap:[w:%d,h:%d], src bitmap:[w:%d,h:%d], clipRect:[w:%d,h:%d, left:%d, top:%d], rotation:%s", java.lang.Integer.valueOf(createBitmap.getWidth()), java.lang.Integer.valueOf(createBitmap.getHeight()), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Float.valueOf(f17));
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[LOOP:4: B:95:0x0152->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f A[LOOP:3: B:91:0x0149->B:93:0x014f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v11, types: [dl.d0] */
    /* JADX WARN: Type inference failed for: r7v12, types: [dl.t] */
    /* JADX WARN: Type inference failed for: r7v13, types: [dl.z] */
    /* JADX WARN: Type inference failed for: r7v14, types: [dl.f0, dl.y] */
    /* JADX WARN: Type inference failed for: r7v9, types: [dl.y] */
    /* JADX WARN: Type inference failed for: r9v11, types: [dl.b] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(qk.l9 r20) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l45.n.m(qk.l9):void");
    }

    public boolean n() {
        return f().m() != dl.a.CROP_PHOTO && this.f397999g;
    }

    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "onCancelTextEdit: ");
        this.f397993a.mo160423x2f328115(true);
        y(false);
    }

    public void p() {
        java.util.Iterator it = this.f397996d.iterator();
        while (it.hasNext()) {
            ((dl.b) it.next()).w();
        }
        this.f397996d.clear();
        this.f397995c.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "onDestroy: ");
    }

    public void q(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f397996d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (bVar.n()) {
                if (f().m() != bVar.m()) {
                    canvas.save();
                    canvas.clipRect(this.f397993a.m177310x5143ab24().mo10933x81daa99b());
                    bVar.v(canvas);
                    canvas.restore();
                } else {
                    bVar.y(canvas);
                }
            }
        }
    }

    public xk0.f r(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        dl.y yVar = (dl.y) d(qk.g6.EMOJI);
        if (yVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "[addEmojiItem] item:%s", interfaceC4987x84e327cb);
        um.g gVar = (um.g) yVar.d();
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
            return null;
        }
        yVar.S();
        yVar.Q();
        yVar.E(false);
        android.graphics.Rect c17 = yVar.c();
        xk0.f fVar = new xk0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar.A3(true) + "", interfaceC4987x84e327cb, c17, yVar.f316575d);
        fVar.w(true);
        float[] H = yVar.H();
        fVar.g(H[0], H[1], ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), (int) yVar.i());
        fVar.x(H[0], H[1]);
        if (yVar.l() != null) {
            xk0.f fVar2 = new xk0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar.A3(true) + "", interfaceC4987x84e327cb, c17, yVar.f316575d);
            fVar2.w(true);
            fVar2.g(H[0], H[1], ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), (int) yVar.i());
            fVar2.x(H[0], H[1]);
            hk0.z zVar = yVar.l().f363351i;
            hk0.p pVar = hk0.p.f363319d;
            zVar.getClass();
            java.lang.String str = ((hk0.k) zVar.f363382a.getLast()).f363291b;
            hk0.m mVar = (hk0.m) zVar.f363388g.get(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLatestEmojiData >> " + pVar + ", " + str);
            if (mVar != null) {
                mVar.f363307e = fVar2;
                mVar.f363305c = pVar;
                fVar2.f536499x = str;
            }
            fVar.f536499x = str;
        }
        gVar.add(fVar);
        yVar.r();
        yVar.P();
        return fVar;
    }

    public void s(java.lang.String str, int i17, int i18, java.lang.String str2) {
        t(str, i17, i18, str2, false, 0.0f, true, true, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, float f17, boolean z18, boolean z19, int i19) {
        xk0.f fVar;
        xk0.f fVar2;
        xk0.f fVar3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "onFinishTextEdit: ");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DrawingPresenter", "onFinishTextEdit: text empty");
            return;
        }
        y(false);
        this.f397993a.mo160423x2f328115(true);
        dl.b f18 = f();
        if (f18.m() == dl.a.EMOJI_AND_TEXT || f18.m() == dl.a.STICKER) {
            dl.y yVar = (dl.y) f18;
            android.widget.EditText editText = (android.widget.EditText) this.f397993a.mo177319xb073c692().findViewById(com.p314xaae8f345.mm.R.id.o4a);
            if (editText.getTag() == null || !(editText.getTag() instanceof xk0.h)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context e17 = e();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(e17, str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "[addItem] text:%s", i27);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(i27)) {
                    um.g gVar = (um.g) yVar.d();
                    if (gVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                    } else {
                        yVar.S();
                        yVar.Q();
                        yVar.E(false);
                        android.graphics.Rect c17 = yVar.c();
                        xk0.f L = yVar.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar.A3(true) + "", c17, yVar.f316575d, i27, i17, i18, str2);
                        L.w(true);
                        L.f536497v = true;
                        L.f536498w = z19;
                        yVar.U(L, z17, f17, z18, i19);
                        float[] H = yVar.H();
                        L.g(H[0], H[1], ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), (int) yVar.i());
                        L.x(H[0], H[1]);
                        if (yVar.l() != null) {
                            fVar = L;
                            xk0.f L2 = yVar.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar.A3(true) + "", c17, yVar.f316575d, i27, i17, i18, str2);
                            L2.w(true);
                            L2.f536497v = true;
                            L2.f536498w = z19;
                            yVar.U(L2, z17, f17, z18, i19);
                            L2.g(H[0], H[1], ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), (int) yVar.i());
                            L2.x(H[0], H[1]);
                            fVar2 = null;
                            fVar.f536499x = yVar.l().f363351i.h(hk0.p.f363319d, (xk0.p) L2, null);
                        } else {
                            fVar = L;
                            fVar2 = null;
                        }
                        gVar.add(fVar);
                        yVar.r();
                        yVar.P();
                        editText.setTag(fVar2);
                    }
                }
            } else {
                xk0.f fVar4 = (xk0.f) editText.getTag();
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context e18 = e();
                ((ke0.e) xVar2).getClass();
                android.text.SpannableString i28 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(e18, str);
                um.g gVar2 = (um.g) yVar.d();
                if (gVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                } else if (fVar4 instanceof xk0.h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAndTextArtist", "updateTextItem: ");
                    gVar2.b(fVar4.q());
                    fVar4.w(true);
                    fVar4.f536497v = true;
                    fVar4.f536498w = z19;
                    xk0.h hVar = (xk0.h) fVar4;
                    hVar.c(z17);
                    hVar.b(i19);
                    yVar.S();
                    yVar.Q();
                    yVar.E(true);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(i28)) {
                        android.graphics.Rect c18 = yVar.c();
                        xk0.f L3 = yVar.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar2.A3(true) + "", c18, yVar.f316575d, i28, i17, i18, str2);
                        L3.w(true);
                        L3.f536498w = z19;
                        yVar.U(L3, z17, f17, z18, i19);
                        android.graphics.PointF pointF = fVar4.f536488m;
                        L3.g(pointF.x, pointF.y, ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), fVar4.f536489n);
                        yVar.R(L3, fVar4.f536490o);
                        L3.x(yVar.f316574c.width() * 0.5f, yVar.f316574c.height() * 0.5f);
                        if (yVar.l() != null) {
                            fVar3 = L3;
                            xk0.f L4 = yVar.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, yVar.h(), gVar2.A3(true) + "", c18, yVar.f316575d, i28, i17, i18, str2);
                            L4.w(true);
                            L4.f536498w = z19;
                            yVar.U(L4, z17, f17, z18, i19);
                            L4.g(pointF.x, pointF.y, ((l45.n) yVar.f316572a).k() / ((l45.n) yVar.f316572a).g(), fVar4.f536489n);
                            yVar.R(L4, fVar4.f536490o);
                            L4.x(yVar.f316574c.width() * 0.5f, yVar.f316574c.height() * 0.5f);
                            fVar3.f536499x = yVar.l().f363351i.h(hk0.p.f363321f, (xk0.p) L4, fVar4.f536499x);
                        } else {
                            fVar3 = L3;
                        }
                        gVar2.add(fVar3);
                    }
                    yVar.r();
                    yVar.P();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "updateTextItem: not text item");
                }
            }
            fVar2 = null;
            editText.setTag(fVar2);
        } else {
            fVar2 = null;
        }
        b(c01.s2.f118966f, fVar2);
    }

    public void u() {
        if (this.f397993a.m177311xc3ab3d87().f323589z) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "onLaunchTextEdit: ");
        ((android.widget.EditText) this.f397993a.mo177319xb073c692().findViewById(com.p314xaae8f345.mm.R.id.o4a)).setTextColor(dn5.c.D[0]);
        y(true);
        this.f397993a.mo160423x2f328115(false);
    }

    public boolean v(android.view.MotionEvent motionEvent) {
        boolean z17;
        l45.o oVar;
        dl.b bVar;
        dl.a m17 = f().m();
        dl.a aVar = dl.a.CROP_PHOTO;
        if (m17 == aVar || f().m() == dl.a.CROP_VIDEO) {
            z17 = false;
        } else {
            java.util.HashMap hashMap = this.f397995c;
            qk.g6 g6Var = qk.g6.TEXT;
            if (hashMap.containsKey(g6Var)) {
                bVar = (dl.b) this.f397995c.get(g6Var);
            } else {
                java.util.HashMap hashMap2 = this.f397995c;
                qk.g6 g6Var2 = qk.g6.EMOJI;
                if (hashMap2.containsKey(g6Var2)) {
                    bVar = (dl.b) this.f397995c.get(g6Var2);
                } else {
                    java.util.HashMap hashMap3 = this.f397995c;
                    qk.g6 g6Var3 = qk.g6.STICKER;
                    bVar = hashMap3.containsKey(g6Var3) ? (dl.b) this.f397995c.get(g6Var3) : null;
                }
            }
            z17 = bVar != null ? bVar.x(motionEvent) : false;
            if (z17) {
                this.f398016x = bVar;
            }
            motionEvent.getAction();
        }
        if (!z17) {
            dl.b bVar2 = (dl.b) this.f397995c.get(this.f397993a.m177311xc3ab3d87().mo125833x34c1de6());
            if (bVar2 != this.f398016x) {
                this.f398016x = bVar2;
            }
            java.util.Iterator it = this.f397996d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dl.b bVar3 = (dl.b) it.next();
                if (bVar3.m() != dl.a.EMOJI_AND_TEXT && bVar3.m() != dl.a.STICKER && bVar3.x(motionEvent)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17 && (oVar = this.f398007o) != null) {
                android.view.GestureDetector gestureDetector = ((ju3.n1) oVar).f383514a.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$3", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout$loadCurrentPage$3", "onDispatchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            }
        }
        if (f().m() == aVar) {
            dl.t tVar = (dl.t) f();
            if (this.f398002j) {
                if (motionEvent.getAction() == 0) {
                    tVar.F = true;
                } else if (motionEvent.getAction() == 1) {
                    tVar.F = false;
                }
            }
        }
        if (!z17) {
            b(c01.s2.f118977t, null);
        }
        return z17;
    }

    public void w(int i17) {
        dl.b bVar = this.f398016x;
        if (bVar == null || bVar.m() != dl.a.EMOJI_AND_TEXT) {
            return;
        }
        ((dl.y) this.f398016x).M.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "setMinSafeRotate >> " + i17);
    }

    public void x(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "setOutputSize width:%d height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f398003k = i17;
        this.f398004l = i18;
    }

    public final void y(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "setTextEditViewVisible: isShow=[%b]", java.lang.Boolean.valueOf(z17));
        if (z17) {
            b(c01.s2.f118964d, null);
        } else {
            b(c01.s2.f118965e, null);
        }
        if (!z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(e(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            loadAnimation.setAnimationListener(new l45.e(this));
            this.f397993a.mo177319xb073c692().startAnimation(loadAnimation);
            return;
        }
        android.view.View mo177319xb073c692 = this.f397993a.mo177319xb073c692();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177319xb073c692, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177319xb073c692.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177319xb073c692, "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(e(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
        loadAnimation2.setAnimationListener(new l45.d(this));
        this.f397993a.mo177319xb073c692().startAnimation(loadAnimation2);
    }
}
