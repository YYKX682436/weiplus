package bk4;

/* loaded from: classes11.dex */
public final class u0 extends al5.w {

    /* renamed from: t, reason: collision with root package name */
    public static final int f103108t = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f103109f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f103110g;

    /* renamed from: h, reason: collision with root package name */
    public final mj4.h f103111h;

    /* renamed from: i, reason: collision with root package name */
    public final bi4.c f103112i;

    /* renamed from: m, reason: collision with root package name */
    public final bi4.d f103113m;

    /* renamed from: n, reason: collision with root package name */
    public final bi4.b f103114n;

    /* renamed from: o, reason: collision with root package name */
    public final int f103115o;

    /* renamed from: p, reason: collision with root package name */
    public final int f103116p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f103117q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f103118r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f103119s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View view, android.graphics.drawable.Drawable drawable, java.lang.String str, int i17, mj4.h hVar, bi4.c cVar, bi4.d iconType, bi4.b iconColor, int i18, int i19) {
        super(drawable, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconColor, "iconColor");
        this.f103109f = drawable;
        this.f103110g = str;
        this.f103111h = hVar;
        this.f103112i = cVar;
        this.f103113m = iconType;
        this.f103114n = iconColor;
        this.f103115o = i18;
        this.f103116p = i19;
        this.f103119s = "MicroMsg.TextStatus.TSIconSpan2@" + hashCode();
        a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.view.View view) {
        bi4.j0 s0Var = view instanceof bi4.j0 ? (bi4.j0) view : ((view instanceof android.widget.TextView) || (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659)) ? new bk4.s0(view) : null;
        if (s0Var != null) {
            android.view.View mo10619xfb86a31b = s0Var.mo10619xfb86a31b();
            java.lang.Object tag = mo10619xfb86a31b != null ? mo10619xfb86a31b.getTag(com.p314xaae8f345.mm.R.id.nwm) : null;
            java.util.Set set = p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(tag) ? (java.util.Set) tag : null;
            if (set == null) {
                set = new java.util.HashSet();
            }
            set.add(this.f103110g);
            android.view.View mo10619xfb86a31b2 = s0Var.mo10619xfb86a31b();
            if (mo10619xfb86a31b2 != null) {
                mo10619xfb86a31b2.setTag(com.p314xaae8f345.mm.R.id.nwm, set);
            }
        }
        this.f103118r = new java.lang.ref.WeakReference(s0Var);
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap bitmap, int i17, int i18) {
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
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV2", "zoomImg", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/util/TextStatusIconSpanV2", "zoomImg", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        super.draw(canvas, charSequence, i17, i18, f17 + this.f103116p, i19, i27, i28, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r3.a0(r4, new bk4.t0(r7, r4, r1, r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0001, B:7:0x000a, B:12:0x0016, B:14:0x001f, B:17:0x0039, B:19:0x003d, B:25:0x0049, B:27:0x0025, B:29:0x0029, B:31:0x0031), top: B:2:0x0001 }] */
    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable getDrawable() {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r7.f103117q     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L5c
            java.lang.String r1 = r7.f103110g
            r2 = 1
            if (r1 == 0) goto L13
            boolean r3 = r26.n0.N(r1)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L11
            goto L13
        L11:
            r3 = r0
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 != 0) goto L5c
            bk4.f0 r3 = bk4.f0.f102998a     // Catch: java.lang.Throwable -> L52
            pj4.o1 r1 = r3.j(r1)     // Catch: java.lang.Throwable -> L52
            r4 = 0
            if (r1 == 0) goto L25
            pj4.g0 r5 = bk4.g0.h(r1)     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L37
        L25:
            mj4.h r5 = r7.f103111h     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L36
            pj4.o0 r5 = xe0.j0.a(r5, r0, r2, r4)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedList r5 = r5.f436752m     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L36
            pj4.g0 r5 = bk4.g0.f(r5)     // Catch: java.lang.Throwable -> L52
            goto L37
        L36:
            r5 = r4
        L37:
            if (r5 == 0) goto L3b
            java.lang.String r4 = r5.f436579d     // Catch: java.lang.Throwable -> L52
        L3b:
            if (r4 == 0) goto L45
            boolean r6 = r26.n0.N(r4)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L44
            goto L45
        L44:
            r2 = r0
        L45:
            if (r2 != 0) goto L5c
            if (r1 == 0) goto L5c
            bk4.t0 r2 = new bk4.t0     // Catch: java.lang.Throwable -> L52
            r2.<init>(r7, r4, r1, r5)     // Catch: java.lang.Throwable -> L52
            r3.a0(r4, r2)     // Catch: java.lang.Throwable -> L52
            goto L5c
        L52:
            r1 = move-exception
            java.lang.String r2 = "getDrawable err"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r7.f103119s
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r1, r2, r0)
        L5c:
            android.graphics.drawable.Drawable r0 = r7.f103109f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.u0.getDrawable():android.graphics.drawable.Drawable");
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return super.getSize(paint, charSequence, i17, i18, fontMetricsInt) + this.f103116p;
    }

    @Override // al5.w
    /* renamed from: onClick */
    public void mo2318xaf6b9ae9(android.view.View view) {
        bi4.c cVar;
        mj4.h hVar = this.f103111h;
        if (hVar == null || (cVar = this.f103112i) == null || cVar != bi4.c.SNS_FEED) {
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
