package bk4;

/* loaded from: classes11.dex */
public final class z0 extends al5.w {

    /* renamed from: t, reason: collision with root package name */
    public static final bk4.w0 f103165t = new bk4.w0(null);

    /* renamed from: u, reason: collision with root package name */
    public static final android.util.LruCache f103166u;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f103167f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f103168g;

    /* renamed from: h, reason: collision with root package name */
    public final mj4.h f103169h;

    /* renamed from: i, reason: collision with root package name */
    public final bi4.c f103170i;

    /* renamed from: m, reason: collision with root package name */
    public final bi4.d f103171m;

    /* renamed from: n, reason: collision with root package name */
    public final bi4.b f103172n;

    /* renamed from: o, reason: collision with root package name */
    public final int f103173o;

    /* renamed from: p, reason: collision with root package name */
    public final int f103174p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f103175q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f103176r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f103177s;

    static {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);
        f103166u = new bk4.v0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(android.view.View view, android.graphics.drawable.Drawable drawable, java.lang.String str, int i17, mj4.h hVar, bi4.c cVar, bi4.d iconType, bi4.b iconColor, int i18, int i19) {
        super(drawable, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        this.f103167f = drawable;
        this.f103168g = str;
        this.f103169h = hVar;
        this.f103170i = cVar;
        this.f103171m = iconType;
        this.f103172n = iconColor;
        this.f103173o = i18;
        this.f103174p = i19;
        this.f103177s = "MicroMsg.TextStatus.TSIconSpan3@" + hashCode();
        bi4.j0 x0Var = view instanceof bi4.j0 ? (bi4.j0) view : ((view instanceof android.widget.TextView) || (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659)) ? new bk4.x0(view) : null;
        if (x0Var != null) {
            android.view.View mo10619xfb86a31b = x0Var.mo10619xfb86a31b();
            java.lang.Object tag = mo10619xfb86a31b != null ? mo10619xfb86a31b.getTag(com.p314xaae8f345.mm.R.id.nwm) : null;
            java.util.Set set = p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(tag) ? (java.util.Set) tag : null;
            set = set == null ? new java.util.HashSet() : set;
            set.add(str);
            android.view.View mo10619xfb86a31b2 = x0Var.mo10619xfb86a31b();
            if (mo10619xfb86a31b2 != null) {
                mo10619xfb86a31b2.setTag(com.p314xaae8f345.mm.R.id.nwm, set);
            }
        }
        this.f103176r = new java.lang.ref.WeakReference(x0Var);
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i17, android.graphics.Bitmap bitmap2, int i18, int i19, int i27, int i28) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        android.graphics.Bitmap c17 = c(bitmap2, i18, i18);
        android.graphics.Bitmap c18 = c(bitmap, i17, i17);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i28));
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "combineBitmap", "(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "combineBitmap", "(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Bitmap c19 = c(createBitmap, i27, i28);
        android.graphics.Canvas canvas = new android.graphics.Canvas(c19);
        canvas.drawBitmap(c18, 0.0f, 0.0f, (android.graphics.Paint) null);
        canvas.drawBitmap(c17, i19, 0.0f, (android.graphics.Paint) null);
        canvas.save();
        canvas.restore();
        return c19;
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap bitmap, int i17) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "makeTintBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "makeTintBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap, int i17, int i18) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i17 / width, i18 / height);
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "zoomImg", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV3", "zoomImg", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17 + this.f103174p, i19, i27, i28, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:3:0x0003, B:7:0x000c, B:12:0x0018, B:15:0x0023, B:18:0x003b, B:21:0x0040, B:27:0x004e, B:29:0x0058, B:32:0x0082, B:34:0x00a8, B:35:0x00ad, B:37:0x0064, B:41:0x0071, B:43:0x0077, B:45:0x007b, B:51:0x002b, B:53:0x0033), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:3:0x0003, B:7:0x000c, B:12:0x0018, B:15:0x0023, B:18:0x003b, B:21:0x0040, B:27:0x004e, B:29:0x0058, B:32:0x0082, B:34:0x00a8, B:35:0x00ad, B:37:0x0064, B:41:0x0071, B:43:0x0077, B:45:0x007b, B:51:0x002b, B:53:0x0033), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:3:0x0003, B:7:0x000c, B:12:0x0018, B:15:0x0023, B:18:0x003b, B:21:0x0040, B:27:0x004e, B:29:0x0058, B:32:0x0082, B:34:0x00a8, B:35:0x00ad, B:37:0x0064, B:41:0x0071, B:43:0x0077, B:45:0x007b, B:51:0x002b, B:53:0x0033), top: B:2:0x0003 }] */
    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable getDrawable() {
        /*
            r18 = this;
            r7 = r18
            r8 = 0
            boolean r0 = r7.f103175q     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto Lc3
            java.lang.String r0 = r7.f103168g
            r1 = 1
            if (r0 == 0) goto L15
            boolean r2 = r26.n0.N(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = r8
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 != 0) goto Lc3
            bk4.f0 r9 = bk4.f0.f102998a     // Catch: java.lang.Throwable -> Lb9
            pj4.o1 r3 = r9.j(r0)     // Catch: java.lang.Throwable -> Lb9
            mj4.h r0 = r7.f103169h
            r2 = 0
            if (r3 == 0) goto L29
            pj4.g0 r4 = bk4.g0.h(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r4 != 0) goto L39
        L29:
            if (r0 == 0) goto L38
            pj4.o0 r4 = xe0.j0.a(r0, r8, r1, r2)     // Catch: java.lang.Throwable -> Lb9
            java.util.LinkedList r4 = r4.f436752m     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto L38
            pj4.g0 r4 = bk4.g0.f(r4)     // Catch: java.lang.Throwable -> Lb9
            goto L39
        L38:
            r4 = r2
        L39:
            if (r4 == 0) goto L3d
            java.lang.String r2 = r4.f436579d     // Catch: java.lang.Throwable -> Lb9
        L3d:
            r10 = r2
            if (r10 == 0) goto L49
            boolean r2 = r26.n0.N(r10)     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L47
            goto L49
        L47:
            r2 = r8
            goto L4a
        L49:
            r2 = r1
        L4a:
            if (r2 != 0) goto Lc3
            if (r3 == 0) goto Lc3
            bk4.f r2 = bk4.i.a()     // Catch: java.lang.Throwable -> Lb9
            boolean r2 = r2.G()     // Catch: java.lang.Throwable -> Lb9
            if (r2 != 0) goto L62
            bk4.f r2 = bk4.i.a()     // Catch: java.lang.Throwable -> Lb9
            boolean r2 = r2.y()     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L81
        L62:
            if (r0 == 0) goto L6e
            mj4.k r0 = (mj4.k) r0     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r0.z()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L6e
            r0 = r1
            goto L6f
        L6e:
            r0 = r8
        L6f:
            if (r0 == 0) goto L81
            bi4.c r0 = r7.f103170i     // Catch: java.lang.Throwable -> Lb9
            bi4.c r2 = bi4.c.SNS_TIMELINE_NICK     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r2) goto L81
            bi4.c r2 = bi4.c.PATMSG_NO_BG     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r2) goto L81
            bi4.c r2 = bi4.c.PATMSG_WITH_BG     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r2) goto L81
            r6 = r1
            goto L82
        L81:
            r6 = r8
        L82:
            bk4.w0 r11 = bk4.z0.f103165t     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r12 = r7.f103168g     // Catch: java.lang.Throwable -> Lb9
            bi4.d r13 = r7.f103171m     // Catch: java.lang.Throwable -> Lb9
            bi4.b r14 = r7.f103172n     // Catch: java.lang.Throwable -> Lb9
            boolean r15 = bk4.g0.j(r4)     // Catch: java.lang.Throwable -> Lb9
            int r0 = r7.f103173o     // Catch: java.lang.Throwable -> Lb9
            r16 = r0
            r17 = r6
            java.lang.String r5 = r11.a(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "key"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)     // Catch: java.lang.Throwable -> Lb9
            android.util.LruCache r0 = bk4.z0.f103166u     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Lb9
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lad
            r7.f103167f = r0     // Catch: java.lang.Throwable -> Lb9
            r7.f103175q = r1     // Catch: java.lang.Throwable -> Lb9
            goto Lc3
        Lad:
            bk4.y0 r0 = new bk4.y0     // Catch: java.lang.Throwable -> Lb9
            r1 = r0
            r2 = r18
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb9
            r9.a0(r10, r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lc3
        Lb9:
            r0 = move-exception
            java.lang.String r1 = "getDrawable err"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = r7.f103177s
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r1, r2)
        Lc3:
            android.graphics.drawable.Drawable r0 = r7.f103167f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.z0.getDrawable():android.graphics.drawable.Drawable");
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + this.f103174p;
    }

    @Override // al5.w
    /* renamed from: onClick */
    public void mo2318xaf6b9ae9(android.view.View view) {
        bi4.c cVar;
        mj4.h hVar = this.f103169h;
        if (hVar == null || (cVar = this.f103170i) == null || cVar != bi4.c.SNS_FEED) {
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.h(), "2021")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", kVar.o());
            j45.l.j(view != null ? view.getContext() : null, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }
}
