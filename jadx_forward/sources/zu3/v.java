package zu3;

/* loaded from: classes10.dex */
public class v extends android.view.View implements zu3.n, cw3.s {
    public final float[] A;
    public final float[] B;
    public final android.graphics.Matrix C;
    public final cw3.a D;
    public zu3.f E;
    public final bw3.e F;
    public java.lang.CharSequence G;
    public float H;
    public zu3.e I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f557366J;
    public int K;
    public android.graphics.Paint L;
    public android.graphics.Paint M;
    public android.graphics.Rect N;
    public final android.graphics.Rect P;
    public boolean Q;
    public zu3.t R;
    public android.graphics.Matrix S;
    public float T;
    public float U;
    public boolean V;
    public final int W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f557367d;

    /* renamed from: e, reason: collision with root package name */
    public long f557368e;

    /* renamed from: f, reason: collision with root package name */
    public long f557369f;

    /* renamed from: g, reason: collision with root package name */
    public long f557370g;

    /* renamed from: h, reason: collision with root package name */
    public int f557371h;

    /* renamed from: i, reason: collision with root package name */
    public int f557372i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f557373m;

    /* renamed from: n, reason: collision with root package name */
    public final long f557374n;

    /* renamed from: o, reason: collision with root package name */
    public final long f557375o;

    /* renamed from: p, reason: collision with root package name */
    public final long f557376p;

    /* renamed from: q, reason: collision with root package name */
    public final int f557377q;

    /* renamed from: r, reason: collision with root package name */
    public final float f557378r;

    /* renamed from: s, reason: collision with root package name */
    public final float f557379s;

    /* renamed from: t, reason: collision with root package name */
    public final int f557380t;

    /* renamed from: u, reason: collision with root package name */
    public final float f557381u;

    /* renamed from: v, reason: collision with root package name */
    public final float f557382v;

    /* renamed from: w, reason: collision with root package name */
    public final float f557383w;

    /* renamed from: x, reason: collision with root package name */
    public final int f557384x;

    /* renamed from: y, reason: collision with root package name */
    public final int f557385y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF[] f557386z;

    public v(android.content.Context context) {
        super(context);
        this.f557367d = new java.util.ArrayList();
        this.f557373m = "MicroMsg.LyricsItemView";
        this.f557374n = 50L;
        this.f557375o = 200L;
        this.f557376p = 3000L;
        this.f557377q = 11;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f557378r = f18;
        this.f557379s = 9.0f * f17;
        this.f557380t = a17;
        this.f557381u = f18;
        this.f557382v = 12.0f * f17;
        this.f557383w = f17 * 2.0f;
        this.f557384x = a17;
        this.f557385y = com.p314xaae8f345.mm.ui.zk.a(context, 32);
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[11];
        for (int i17 = 0; i17 < 11; i17++) {
            rectFArr[i17] = new android.graphics.RectF();
        }
        this.f557386z = rectFArr;
        this.A = new float[this.f557377q];
        this.B = new float[9];
        this.C = new android.graphics.Matrix();
        bw3.e eVar = new bw3.e();
        this.F = eVar;
        this.H = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561874v2);
        this.I = zu3.e.f557333i;
        this.f557366J = new java.util.ArrayList();
        this.L = new android.graphics.Paint();
        this.M = new android.graphics.Paint();
        this.N = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.P = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.Q = true;
        eVar.f106461r = 0.5f;
        eVar.f106460q = 3.0f;
        this.M.setColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        android.content.res.Resources resources = getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.D = new cw3.a(resources);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.W = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f557369f = java.lang.System.currentTimeMillis();
    }

    public final void c() {
        java.util.Iterator it = this.f557367d.iterator();
        while (it.hasNext()) {
            r45.ge4 ge4Var = (r45.ge4) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ge4Var.f456700d)) {
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwi, (android.view.ViewGroup) new android.widget.LinearLayout(getContext()), false);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.not);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                pm0.v.c(textView);
                textView.setText(ge4Var.f456700d);
                android.graphics.Rect rect = lt3.n.f402795c;
                textView.setMaxHeight(rect.height());
                int i17 = rect.left;
                int i18 = this.f557385y;
                textView.setMaxWidth(i18 >= i17 ? rect.width() - ((i18 - rect.left) * 2) : rect.width());
                inflate.measure(0, 0);
                inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
                int width = (inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > rect.width()) ? rect.width() : inflate.getMeasuredWidth();
                int height = (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > rect.height()) ? rect.height() : inflate.getMeasuredHeight();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557373m, "it.lyrics=" + ge4Var.f456700d + " lyricsText.maxWidth=" + textView.getMaxWidth() + " lyricsText.maxHeight=" + textView.getMaxHeight() + " parent.measuredWidth=" + inflate.getMeasuredWidth() + " parent.measuredHeight=" + inflate.getMeasuredHeight());
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/item/LyricsItemView", "createLyricsBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/item/LyricsItemView", "createLyricsBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                inflate.draw(new android.graphics.Canvas(createBitmap));
                this.I = zu3.e.f557333i;
                this.f557366J.add(createBitmap);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r3) > r19.f557374n) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            java.util.ArrayList r2 = r0.f557367d
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lb2
            long r3 = r0.f557370g
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            android.graphics.RectF[] r6 = r0.f557386z
            if (r5 == 0) goto L2b
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            long r3 = r0.f557374n
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L29
            goto L2b
        L29:
            r3 = 0
            goto L92
        L2b:
            long r3 = java.lang.System.currentTimeMillis()
            r0.f557370g = r3
            int r3 = r6.length
            r4 = 0
            r5 = 0
            r8 = 0
        L35:
            if (r5 >= r3) goto L29
            r9 = r6[r5]
            int r10 = r8 + 1
            float r11 = r9.height()
            int r12 = r0.f557380t
            float r13 = (float) r12
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            float r14 = r0.f557379s
            float[] r15 = r0.A
            if (r13 > 0) goto L57
            r16 = r8
            double r7 = (double) r14
            double r17 = java.lang.Math.random()
            double r7 = r7 * r17
            float r7 = (float) r7
            r15[r16] = r7
            goto L62
        L57:
            r16 = r8
            r7 = r15[r16]
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 < 0) goto L62
            float r7 = (float) r12
            r15[r16] = r7
        L62:
            r7 = r15[r16]
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 > 0) goto L70
            float r7 = r0.f557383w
            float r11 = r11 + r7
            float r7 = java.lang.Math.min(r11, r14)
            goto L79
        L70:
            int r7 = r0.f557384x
            float r7 = (float) r7
            float r11 = r11 - r7
            float r7 = (float) r12
            float r7 = java.lang.Math.max(r11, r7)
        L79:
            float r8 = r0.f557381u
            float r11 = r4 + r8
            r12 = 2
            float r12 = (float) r12
            float r15 = r14 / r12
            float r7 = r7 / r12
            float r15 = r15 - r7
            float r4 = r4 + r8
            float r8 = r0.f557378r
            float r4 = r4 + r8
            float r14 = r14 / r12
            float r14 = r14 + r7
            r9.set(r11, r15, r4, r14)
            float r4 = r9.right
            int r5 = r5 + 1
            r8 = r10
            goto L35
        L92:
            java.lang.Object r2 = r2.get(r3)
            r45.ge4 r2 = (r45.ge4) r2
            long r4 = r2.f456701e
            r0.k(r4)
            android.graphics.Paint r2 = r0.M
            int r4 = r0.f557372i
            r2.setAlpha(r4)
            int r2 = r6.length
            r7 = r3
        La6:
            if (r7 >= r2) goto Lb2
            r3 = r6[r7]
            android.graphics.Paint r4 = r0.M
            r1.drawRect(r3, r4)
            int r7 = r7 + 1
            goto La6
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.v.d(android.graphics.Canvas):void");
    }

    public void f() {
        int i17 = this.K;
        java.util.ArrayList arrayList = this.f557367d;
        if (i17 < arrayList.size()) {
            long j17 = ((r45.ge4) arrayList.get(this.K)).f456701e;
            r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(arrayList, this.K + 1);
            long j18 = ge4Var != null ? ge4Var.f456701e : ((r45.ge4) arrayList.get(this.K)).f456701e + this.f557376p;
            long j19 = this.f557368e;
            long j27 = j19 - j17;
            long j28 = this.f557375o;
            if (0 <= j27 && j27 <= j28) {
                this.f557371h = (int) ((255 * ((float) (j19 - j17))) / ((float) j28));
                return;
            }
            long j29 = j18 - j19;
            if (0 <= j29 && j29 <= j28) {
                this.f557371h = (int) (255 * (((float) (j18 - j19)) / ((float) j28)));
            } else {
                if (j19 - j17 <= j28 || j18 - j19 <= j28) {
                    return;
                }
                this.f557371h = 255;
            }
        }
    }

    @Override // zu3.n
    public zu3.a g() {
        if (this.f557366J.isEmpty()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(this.F.f106450g);
        return new zu3.t(this.f557367d, matrix);
    }

    @Override // android.view.View
    public final int getAlpha() {
        return this.f557371h;
    }

    /* renamed from: getBitmapList */
    public final java.util.ArrayList<android.graphics.Bitmap> m179542x86539e63() {
        return this.f557366J;
    }

    @Override // cw3.s
    /* renamed from: getContentBoundary */
    public float[] mo122946xf6c2c98d() {
        return (float[]) this.F.f106457n.clone();
    }

    /* renamed from: getCurIndex */
    public final int m179543x9be85be8() {
        return this.K;
    }

    /* renamed from: getDisplayRect */
    public final android.graphics.Rect m179544x4003fc90() {
        return this.P;
    }

    @Override // cw3.s
    /* renamed from: getDrawRect */
    public android.graphics.RectF mo122947x4a8ff6be() {
        float[] fArr = this.F.f106457n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    /* renamed from: getDuration */
    public final long m179545x51e8b0a() {
        return this.f557368e;
    }

    @Override // cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.R;
    }

    /* renamed from: getFrameDrawable */
    public final cw3.a m179546xf2338d75() {
        return this.D;
    }

    /* renamed from: getLAST_INTERVAL */
    public final long m179547x150b90b8() {
        return this.f557376p;
    }

    /* renamed from: getLYRICS_VERTICAL_OFFSET */
    public final float m179548xbad86207() {
        return this.f557382v;
    }

    /* renamed from: getLyricsItem */
    public final zu3.t m179549xb5b0751d() {
        return this.R;
    }

    /* renamed from: getLyricsList */
    public final java.util.ArrayList<r45.ge4> m179550xb5b1aaa8() {
        return this.f557367d;
    }

    /* renamed from: getNeedInvalidate */
    public final boolean m179551x51a41f67() {
        return this.Q;
    }

    /* renamed from: getPaint */
    public final android.graphics.Paint m179552x74f59ea8() {
        return this.L;
    }

    /* renamed from: getSafeArea */
    public android.graphics.Rect m179553xe4fab330() {
        android.graphics.Rect rect = this.F.f106451h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    /* renamed from: getSourceDataType */
    public final zu3.e m179554x7f55c35() {
        return this.I;
    }

    /* renamed from: getStartTime */
    public final long m179555x8082fb99() {
        return this.f557369f;
    }

    /* renamed from: getTRANS_TIME */
    public final long m179556x2eca39fa() {
        return this.f557375o;
    }

    /* renamed from: getText */
    public final java.lang.CharSequence m179557xfb85ada3() {
        return this.G;
    }

    /* renamed from: getTextSize */
    public final float m179558x40077844() {
        return this.H;
    }

    /* renamed from: getTouchDownX */
    public final float m179559x8d9107ed() {
        return this.T;
    }

    /* renamed from: getTouchDownY */
    public final float m179560x8d9107ee() {
        return this.U;
    }

    /* renamed from: getTouchMoved */
    public final boolean m179561x8e0fd6aa() {
        return this.V;
    }

    /* renamed from: getTouchSlop */
    public final int m179562x151bf723() {
        return this.W;
    }

    /* renamed from: getTouchTracker */
    public final bw3.e m179563xbfb64d6f() {
        return this.F;
    }

    @Override // cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305701g;
    }

    /* renamed from: getValidRect */
    public final android.graphics.Rect m179564xbd40714a() {
        return this.N;
    }

    /* renamed from: getViewMatrix */
    public final android.graphics.Matrix m179565x73fb26bc() {
        return this.S;
    }

    /* renamed from: getWaveAlpha */
    public final int m179566x59ce932f() {
        return this.f557372i;
    }

    /* renamed from: getWavePaint */
    public final android.graphics.Paint m179567x5a9cda2f() {
        return this.M;
    }

    /* renamed from: getWaveTime */
    public final long m179568x9fd572dc() {
        return this.f557370g;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayRect, "displayRect");
        this.P.set(displayRect);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeRect, "safeRect");
        bw3.e eVar = this.F;
        eVar.f106451h = safeRect;
        eVar.f106452i = i65.a.b(getContext(), 54);
    }

    public void k(long j17) {
        if (this.f557372i < 255) {
            long j18 = this.f557368e;
            long j19 = j18 - j17;
            boolean z17 = false;
            long j27 = this.f557375o;
            if (0 <= j19 && j19 <= j27) {
                z17 = true;
            }
            if (z17) {
                this.f557372i = (int) ((255 * ((float) (j18 - j17))) / ((float) j27));
            } else if (j18 - j17 > j27) {
                this.f557372i = 255;
            }
        }
    }

    public void m() {
        java.util.ArrayList arrayList = this.f557367d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f557368e = java.lang.System.currentTimeMillis() - this.f557369f;
        r45.ge4 ge4Var = (r45.ge4) kz5.n0.a0(arrayList, this.K + 1);
        if (this.f557368e >= (ge4Var != null ? ge4Var.f456701e : ((r45.ge4) arrayList.get(this.K)).f456701e + this.f557376p)) {
            int i17 = this.K + 1;
            this.K = i17;
            if (i17 >= arrayList.size()) {
                this.K = 0;
                this.f557369f = java.lang.System.currentTimeMillis();
                this.f557368e = 0L;
            }
        }
    }

    public final void n(java.util.List lyricsInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfo, "lyricsInfo");
        q(lyricsInfo);
        c();
        int i17 = 0;
        int i18 = 0;
        for (android.graphics.Bitmap bitmap : this.f557366J) {
            if (bitmap.getWidth() > i17) {
                i17 = bitmap.getWidth();
            }
            if (bitmap.getHeight() > i18) {
                i18 = bitmap.getHeight();
            }
        }
        if (i17 == 0 || i18 == 0) {
            return;
        }
        bw3.e eVar = this.F;
        eVar.f106459p = i17;
        eVar.f106458o = i18;
        this.D.setBounds(0, 0, i17, i18);
        float f17 = i17;
        float f18 = i18;
        eVar.getClass();
        eVar.f106455l = new float[]{0.0f, 0.0f, f17, 0.0f, 0.0f, f18, f17, f18};
        float height = (this.P.height() - com.p314xaae8f345.mm.ui.zk.a(getContext(), com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3)) - i18;
        lt3.n nVar = lt3.n.f402793a;
        int i19 = lt3.n.f402795c.left;
        int i27 = this.f557385y;
        eVar.f106450g.setTranslate(i27 >= i19 ? i27 : i19, height);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        android.graphics.Matrix matrix = this.S;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(this.F.f106450g);
        }
        if (isActivated()) {
            this.D.draw(canvas);
        }
        d(canvas);
        m();
        if ((!this.f557366J.isEmpty()) && this.K < this.f557366J.size()) {
            f();
            this.L.setAlpha(this.f557371h);
            canvas.drawBitmap((android.graphics.Bitmap) this.f557366J.get(this.K), 0.0f, this.f557382v, this.L);
        }
        canvas.restore();
        if (this.Q) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.graphics.Matrix matrix = this.C;
        bw3.e eVar = this.F;
        matrix.set(eVar.f106450g);
        float[] fArr = this.B;
        matrix.getValues(fArr);
        float f17 = fArr[2];
        boolean a17 = eVar.a(event);
        eVar.f106450g.getValues(fArr);
        float f18 = fArr[5];
        eVar.f106450g.set(matrix);
        eVar.f106450g.setTranslate(f17, f18);
        if (a17) {
            zu3.f fVar = this.E;
            if (fVar != null) {
                fVar.a(this, event);
            }
            bringToFront();
            postInvalidate();
        }
        if (a17) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.T = event.getX();
                this.U = event.getY();
                this.V = false;
            } else if (actionMasked == 1) {
                if (!this.V) {
                    performClick();
                }
                bw3.b bVar = new bw3.b();
                android.graphics.Rect rect = this.N;
                bVar.f106435c = eVar.f106461r;
                bVar.f106436d = eVar.f106460q;
                bVar.f106434b = new float[]{eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
                bVar.f106433a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
                bVar.a(eVar.f106450g, new zu3.u(this));
            } else if (actionMasked == 2) {
                float max = java.lang.Math.max(java.lang.Math.abs(event.getX() - this.T), java.lang.Math.abs(event.getY() - this.U));
                if (!this.V) {
                    this.V = max > ((float) this.W);
                }
            }
        }
        return a17;
    }

    public av3.a p(android.graphics.Matrix matrix) {
        if (this.f557366J.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : this.f557367d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ge4 ge4Var = (r45.ge4) obj;
            if (i17 < this.f557366J.size()) {
                java.lang.Object obj2 = this.f557366J.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                arrayList.add(new av3.g(ge4Var, (android.graphics.Bitmap) obj2));
            }
            i17 = i18;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.F.f106450g);
        return new av3.h(arrayList, matrix2);
    }

    public final void q(java.util.List list) {
        java.util.ArrayList arrayList = this.f557367d;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.ge4) obj).f456700d)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    /* renamed from: setAlpha */
    public final void m179569x52b5721c(int i17) {
        this.f557371h = i17;
    }

    /* renamed from: setBitmapList */
    public final void m179570xb477ec6f(java.util.ArrayList<android.graphics.Bitmap> arrayList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<set-?>");
        this.f557366J = arrayList;
    }

    /* renamed from: setCurIndex */
    public final void m179571x96a0bcf4(int i17) {
        this.K = i17;
    }

    /* renamed from: setDuration */
    public final void m179572xffd6ec16(long j17) {
        this.f557368e = j17;
    }

    /* renamed from: setLyricsItem */
    public final void m179573xe3d4c329(zu3.t tVar) {
        this.R = tVar;
    }

    /* renamed from: setNeedInvalidate */
    public final void m179574x199a8773(boolean z17) {
        this.Q = z17;
    }

    /* renamed from: setPaint */
    public final void m179575x5383b91c(android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<set-?>");
        this.L = paint;
    }

    /* renamed from: setSourceDataType */
    public final void m179576xcfebc441(zu3.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.I = eVar;
    }

    /* renamed from: setStartTime */
    public final void m179577xdcd6bc0d(long j17) {
        this.f557369f = j17;
    }

    /* renamed from: setStateResolve */
    public final void m179578xe2f7cd9d(zu3.f stateResolve) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateResolve, "stateResolve");
        this.E = stateResolve;
    }

    /* renamed from: setText */
    public final void m179579x765074af(java.lang.CharSequence charSequence) {
        this.G = charSequence;
    }

    /* renamed from: setTextSize */
    public final void m179580x3abfd950(float f17) {
        this.H = f17;
    }

    /* renamed from: setTouchDownX */
    public final void m179581xbbb555f9(float f17) {
        this.T = f17;
    }

    /* renamed from: setTouchDownY */
    public final void m179582xbbb555fa(float f17) {
        this.U = f17;
    }

    /* renamed from: setTouchMoved */
    public final void m179583xbc3424b6(boolean z17) {
        this.V = z17;
    }

    @Override // cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.N.set(validRect);
    }

    /* renamed from: setValidRect */
    public final void m179584x199431be(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "<set-?>");
        this.N = rect;
    }

    /* renamed from: setViewMatrix */
    public final void m179585xa21f74c8(android.graphics.Matrix matrix) {
        this.S = matrix;
        if (matrix != null) {
            bw3.e eVar = this.F;
            eVar.getClass();
            eVar.f106450g = matrix;
            android.graphics.Canvas canvas = new android.graphics.Canvas();
            canvas.save();
            if (this.S != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.D.draw(canvas);
            }
        }
    }

    /* renamed from: setWaveAlpha */
    public final void m179586xb62253a3(int i17) {
        this.f557372i = i17;
    }

    /* renamed from: setWavePaint */
    public final void m179587xb6f09aa3(android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "<set-?>");
        this.M = paint;
    }

    /* renamed from: setWaveTime */
    public final void m179588x9a8dd3e8(long j17) {
        this.f557370g = j17;
    }
}
