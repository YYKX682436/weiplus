package df5;

/* loaded from: classes5.dex */
public final class g extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final int f313628g;

    /* renamed from: h, reason: collision with root package name */
    public final float f313629h;

    /* renamed from: i, reason: collision with root package name */
    public final int f313630i;

    /* renamed from: m, reason: collision with root package name */
    public final int f313631m;

    /* renamed from: n, reason: collision with root package name */
    public final int f313632n;

    /* renamed from: o, reason: collision with root package name */
    public final float f313633o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f313634p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f313635q;

    /* renamed from: r, reason: collision with root package name */
    public v11.b f313636r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f313637s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f313638t;

    /* renamed from: u, reason: collision with root package name */
    public float f313639u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f313640v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f313628g = i65.a.b(context, 56);
        this.f313629h = (r0 * 2) / 1000.0f;
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
        this.f313630i = color;
        this.f313631m = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
        this.f313632n = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77834x6dc6993d);
        this.f313633o = 0.5f;
        this.f313634p = new android.graphics.Paint(1);
        this.f313635q = new android.graphics.Paint(1);
        this.f313636r = v11.b.f513862d;
        setTextSize(1, i65.a.m(context) * 17.0f);
        setTextColor(color);
        com.p314xaae8f345.mm.ui.fk.a(this);
        setGravity(8388627);
        setMaxLines(1);
        setEllipsize(android.text.TextUtils.TruncateAt.END);
        setHorizontallyScrolling(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        if (r3.f313637s != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r4, v11.b r5) {
        /*
            r3 = this;
            java.lang.String r0 = "label"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            r3.f313636r = r5
            r3.setText(r4)
            int r4 = r5.ordinal()
            r0 = 2
            r1 = 1
            if (r4 == 0) goto L24
            if (r4 == r1) goto L2b
            if (r4 != r0) goto L1e
            int r4 = r3.f313631m
            goto L2d
        L1e:
            jz5.j r4 = new jz5.j
            r4.<init>()
            throw r4
        L24:
            boolean r4 = r3.f313637s
            if (r4 == 0) goto L2b
            int r4 = r3.f313632n
            goto L2d
        L2b:
            int r4 = r3.f313630i
        L2d:
            r3.setTextColor(r4)
            int r4 = r5.ordinal()
            if (r4 == 0) goto L41
            if (r4 == r1) goto L48
            if (r4 != r0) goto L3b
            goto L45
        L3b:
            jz5.j r4 = new jz5.j
            r4.<init>()
            throw r4
        L41:
            boolean r4 = r3.f313637s
            if (r4 == 0) goto L48
        L45:
            float r4 = r3.f313633o
            goto L4a
        L48:
            r4 = 1065353216(0x3f800000, float:1.0)
        L4a:
            r3.setAlpha(r4)
            int r4 = r5.ordinal()
            r2 = 0
            if (r4 == 0) goto L60
            if (r4 == r1) goto L59
            if (r4 == r0) goto L59
            goto L63
        L59:
            r3.setClickable(r2)
            r3.setFocusable(r2)
            goto L63
        L60:
            r3.setClickable(r1)
        L63:
            v11.b r4 = v11.b.f513863e
            if (r5 != r4) goto La6
            boolean r4 = r3.f313640v
            if (r4 != 0) goto La6
            if (r4 == 0) goto L6e
            goto La6
        L6e:
            r3.f313640v = r1
            r3.setVisibility(r2)
            android.animation.ValueAnimator r4 = r3.f313638t
            if (r4 == 0) goto L7a
            r4.cancel()
        L7a:
            r4 = 0
            r3.f313638t = r4
            int r4 = r3.getWidth()
            int r5 = r3.f313628g
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r3.f313629h
            float r4 = r4 / r5
            long r4 = (long) r4
            float[] r0 = new float[r0]
            r0 = {x00aa: FILL_ARRAY_DATA , data: [-1082130432, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setDuration(r4)
            r4 = -1
            r0.setRepeatCount(r4)
            df5.f r4 = new df5.f
            r4.<init>(r3)
            r0.addUpdateListener(r4)
            r3.f313638t = r0
            r0.start()
        La6:
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.g.b(java.lang.String, v11.b):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.graphics.Bitmap, java.lang.Object] */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        if (!this.f313640v) {
            super.onDraw(canvas);
            return;
        }
        android.graphics.Paint paint = this.f313634p;
        android.graphics.Paint paint2 = this.f313635q;
        super.onDraw(canvas);
        int i17 = (int) width;
        int i18 = (int) height;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractButtonView", "drawWaveMask", "(Landroid/graphics/Canvas;FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractButtonView", "drawWaveMask", "(Landroid/graphics/Canvas;FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        try {
            float f17 = (((this.f313628g + width) * this.f313639u) / 2.0f) + (width / 2.0f);
            paint2.setShader(new android.graphics.LinearGradient(f17 - (r4 / 2), 0.0f, f17 + (r4 / 2), 0.0f, new int[]{0, -922746881, 0}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            try {
                canvas2.drawRect(0.0f, 0.0f, width, height, paint2);
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config2);
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractButtonView", "drawWaveMask", "(Landroid/graphics/Canvas;FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
                createBitmap = ((java.lang.Integer) arrayList2.get(1)).intValue();
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(intValue, createBitmap, (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap2, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractButtonView", "drawWaveMask", "(Landroid/graphics/Canvas;FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap2, "createBitmap(...)");
                try {
                    super.onDraw(new android.graphics.Canvas(createBitmap2));
                    paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
                    canvas2.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                    paint.setXfermode(null);
                    createBitmap2.recycle();
                    canvas.drawBitmap((android.graphics.Bitmap) createBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
                    paint2.setShader(null);
                    createBitmap.recycle();
                } catch (java.lang.Throwable th6) {
                    paint.setXfermode(null);
                    createBitmap2.recycle();
                    throw th6;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                createBitmap = createBitmap;
                paint2.setShader(null);
                createBitmap.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    /* renamed from: setPressedState */
    public final void m124324x76ebfb11(boolean z17) {
        if (this.f313637s != z17) {
            this.f313637s = z17;
            if (this.f313636r == v11.b.f513862d) {
                setTextColor(z17 ? this.f313632n : this.f313630i);
                setAlpha(z17 ? this.f313633o : 1.0f);
            }
        }
    }
}
