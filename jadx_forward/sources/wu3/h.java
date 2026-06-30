package wu3;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5 implements zu3.n, cw3.s {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final android.view.View E;
    public final int F;
    public long G;
    public yz5.l H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final float[] f531281J;
    public final java.lang.Runnable K;

    /* renamed from: n, reason: collision with root package name */
    public zu3.d f531282n;

    /* renamed from: o, reason: collision with root package name */
    public final bw3.e f531283o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f531284p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f531285q;

    /* renamed from: r, reason: collision with root package name */
    public zu3.f f531286r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f531287s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.RectF f531288t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Matrix f531289u;

    /* renamed from: v, reason: collision with root package name */
    public float f531290v;

    /* renamed from: w, reason: collision with root package name */
    public float f531291w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f531292x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f531293y;

    /* renamed from: z, reason: collision with root package name */
    public final int f531294z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f531283o = new bw3.e();
        this.f531284p = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f531285q = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f531287s = new android.graphics.RectF();
        this.f531288t = new android.graphics.RectF();
        this.f531289u = new android.graphics.Matrix();
        i65.a.b(context, 4);
        this.f531294z = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = jz5.h.b(new wu3.e(this));
        this.B = jz5.h.b(new wu3.b(this));
        this.C = jz5.h.b(new wu3.a(this));
        this.D = jz5.h.b(new wu3.d(this, context));
        this.F = i65.a.b(getContext(), 32);
        i65.a.B(context);
        i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
        this.f531281J = new float[2];
        this.K = new wu3.g(this);
        m81942x19adabd7(false);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            m81941x29d4686f().setIsLongpressEnabled(false);
        }
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3i, (android.view.ViewGroup) this, true);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3h, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565080b65);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.E = findViewById;
        m174463x64232c75().setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.k6l));
        setOnTouchListener(this);
    }

    /* renamed from: getCaptionContentLayout */
    private final android.widget.LinearLayout m174460x53313533() {
        return (android.widget.LinearLayout) ((jz5.n) this.C).mo141623x754a37bb();
    }

    /* renamed from: getCaptionLayout */
    private final android.widget.RelativeLayout m174461xd691b8fa() {
        return (android.widget.RelativeLayout) ((jz5.n) this.B).mo141623x754a37bb();
    }

    /* renamed from: getCaptionLoadingLayout */
    private final android.widget.LinearLayout m174462x82f903b6() {
        return (android.widget.LinearLayout) ((jz5.n) this.D).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCaptionView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17050xfb4315a4 m174463x64232c75() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17050xfb4315a4) ((jz5.n) this.A).mo141623x754a37bb();
    }

    @Override // cw3.s
    public boolean a(long j17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        this.G = j17;
        zu3.d dVar = this.f531282n;
        r45.is i17 = dVar != null ? dVar.i(j17) : null;
        java.lang.String h17 = (i17 == null || (gVar = i17.f458830d) == null) ? null : gVar.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        if (android.text.TextUtils.isEmpty(h17)) {
            int i18 = rl.b.f478676a;
            setVisibility(4);
            return false;
        }
        setVisibility(0);
        m174463x64232c75().setAutoSizeTextTypeWithDefaults(0);
        m174463x64232c75().setText("");
        m174463x64232c75().setTextSize(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561387h3));
        m174463x64232c75().setAutoSizeTextTypeWithDefaults(1);
        m174463x64232c75().setVisibility(0);
        m174463x64232c75().setText(h17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        boolean z17 = !i17.f458833g;
        this.I = z17;
        if (z17) {
            int i19 = rl.b.f478676a;
            m174460x53313533().setVisibility(0);
            m174462x82f903b6().setVisibility(4);
        } else {
            m174463x64232c75().setBackgroundDrawable(null);
            int i27 = rl.b.f478676a;
            m174460x53313533().setVisibility(4);
            m174462x82f903b6().setVisibility(0);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipRect(this.f531284p);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // zu3.n
    public zu3.a g() {
        zu3.d dVar = this.f531282n;
        if (dVar == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(m174461xd691b8fa().getScaleX(), m174461xd691b8fa().getScaleY());
        m174461xd691b8fa().getLocationOnScreen(new int[2]);
        matrix.postTranslate(0.0f, r2[1]);
        zu3.d dVar2 = new zu3.d(dVar.f557291a, dVar.f557325g, matrix);
        dVar2.f557328j = dVar.f557328j;
        dVar2.f557326h = dVar.f557326h;
        dVar2.f557327i = dVar.f557327i;
        return dVar2;
    }

    /* renamed from: getClearCaptionListener */
    public final yz5.l m174464x8c8f3723() {
        return this.H;
    }

    @Override // cw3.s
    /* renamed from: getContentBoundary */
    public float[] mo122946xf6c2c98d() {
        return (float[]) this.f531283o.f106457n.clone();
    }

    /* renamed from: getCurrentCaption */
    public final r45.is m174465xb0c3d723() {
        zu3.d dVar = this.f531282n;
        if (dVar == null) {
            return null;
        }
        long j17 = this.G;
        java.util.Iterator it = dVar.f557325g.iterator();
        while (it.hasNext()) {
            r45.is isVar = (r45.is) it.next();
            if (isVar.f458831e <= j17 && isVar.f458832f >= j17) {
                return isVar;
            }
        }
        return null;
    }

    @Override // cw3.s
    /* renamed from: getDrawRect */
    public android.graphics.RectF mo122947x4a8ff6be() {
        return this.f531288t;
    }

    @Override // cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.f531282n;
    }

    /* renamed from: getEnableEdit */
    public final boolean m174466x5f124623() {
        return this.I;
    }

    /* renamed from: getSafeArea */
    public android.graphics.Rect m174467xe4fab330() {
        android.graphics.Rect rect = this.f531283o.f106451h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    /* renamed from: getTouchSlop */
    public final int m174468x151bf723() {
        return this.f531294z;
    }

    /* renamed from: getTouchTracker */
    public final bw3.e m174469xbfb64d6f() {
        return this.f531283o;
    }

    @Override // cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        zu3.e eVar = zu3.e.f557335n;
        zu3.d dVar = this.f531282n;
        return (dVar != null ? dVar.f557291a : null) == eVar ? cw3.j.f305704m : cw3.j.f305703i;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayRect, "displayRect");
        this.f531285q.set(displayRect);
        int width = displayRect.width();
        bw3.e eVar = this.f531283o;
        eVar.f106459p = width;
        this.f531287s.right = displayRect.width();
        measure(0, 0);
        lt3.n nVar = lt3.n.f402793a;
        float measuredHeight = (lt3.n.f402797e.bottom - ((m174461xd691b8fa().getMeasuredHeight() + m174460x53313533().getMeasuredHeight()) / 2.0f)) - this.F;
        int i17 = eVar.f106459p;
        int i18 = eVar.f106458o;
        eVar.getClass();
        eVar.f106455l = new float[]{0.0f, 0.0f, i17, 0.0f, 0.0f, i18, i17, i18};
        this.f531289u.postTranslate(0.0f, measuredHeight);
        k();
        java.lang.String str = "topMargin:" + measuredHeight + " width:" + displayRect.width();
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptionItemView", str, null);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f531283o;
        eVar.f106451h = safeRect;
        eVar.f106452i = i65.a.b(getContext(), i17);
    }

    public final void k() {
        android.graphics.RectF rectF = this.f531288t;
        android.graphics.RectF rectF2 = this.f531287s;
        android.graphics.Matrix matrix = this.f531289u;
        matrix.mapRect(rectF, rectF2);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d17 = fArr2[0];
        double d18 = fArr2[3];
        float sqrt = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
        m174461xd691b8fa().setPivotX(0.0f);
        m174461xd691b8fa().setPivotY(0.0f);
        m174461xd691b8fa().setScaleX(sqrt);
        m174461xd691b8fa().setScaleY(sqrt);
        m174461xd691b8fa().setTranslationX(fArr[2]);
        m174461xd691b8fa().setTranslationY(fArr[5]);
    }

    public final void m() {
        float[] fArr = {this.f531287s.right, m174460x53313533().getBottom()};
        android.graphics.Matrix matrix = this.f531289u;
        matrix.mapPoints(fArr);
        float f17 = (this.f531284p.bottom - this.F) - fArr[1];
        if (f17 < 0.0f) {
            matrix.postTranslate(0.0f, f17);
            android.view.View view = this.E;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        float focusY = detector.getFocusY();
        float scaleFactor = 1 - detector.getScaleFactor();
        android.graphics.Matrix matrix = this.f531289u;
        matrix.postScale(detector.getScaleFactor(), detector.getScaleFactor());
        matrix.postTranslate(this.f531287s.centerX() * scaleFactor, focusY * scaleFactor);
        m();
        k();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        this.f531289u.postTranslate(0.0f, -f18);
        m();
        k();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r2 != 3) goto L24;
     */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.ViewOnTouchListenerC22681xee05ddc5, android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu3.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        return null;
    }

    public final void q(zu3.d captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        this.f531282n = captionItem;
        if (captionItem.f557326h != 0) {
            m174463x64232c75().setTextColor(captionItem.f557326h);
        }
        m174463x64232c75().m68264x630fd73d(captionItem.f557327i);
        if (android.text.TextUtils.isEmpty(captionItem.f557328j)) {
            m174463x64232c75().setTypeface(m174463x64232c75().getTypeface(), 1);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(captionItem.f557328j)) {
            m174463x64232c75().setTypeface(android.graphics.Typeface.createFromFile(captionItem.f557328j));
        } else {
            m174463x64232c75().setTypeface(android.graphics.Typeface.DEFAULT);
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptionItemView", "updateCaptionItem caption:" + captionItem, null);
    }

    /* renamed from: setCaptionItem */
    public final void m174470xfa82e057(zu3.d captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        this.f531282n = captionItem;
        m174461xd691b8fa().measure(0, 0);
        this.f531283o.f106458o = m174461xd691b8fa().getMeasuredHeight();
        this.f531287s.bottom = m174461xd691b8fa().getMeasuredHeight();
        k();
        if (captionItem.f557326h != 0) {
            m174463x64232c75().setTextColor(captionItem.f557326h);
        }
        m174463x64232c75().m68264x630fd73d(captionItem.f557327i);
        if (android.text.TextUtils.isEmpty(captionItem.f557328j)) {
            m174463x64232c75().setTypeface(m174463x64232c75().getTypeface(), 1);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(captionItem.f557328j)) {
            m174463x64232c75().setTypeface(android.graphics.Typeface.createFromFile(captionItem.f557328j));
        } else {
            m174463x64232c75().setTypeface(android.graphics.Typeface.DEFAULT);
        }
        java.lang.String str = "height:" + m174463x64232c75().getMeasuredHeight() + " caption:" + captionItem;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptionItemView", str, null);
    }

    /* renamed from: setClearCaptionListener */
    public final void m174471x6e2662f(yz5.l lVar) {
        this.H = lVar;
    }

    /* renamed from: setEnableEdit */
    public final void m174472x8d36942f(boolean z17) {
        this.I = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    /* renamed from: setStateResolve */
    public final void m174473xe2f7cd9d(zu3.f stateResolve) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateResolve, "stateResolve");
        this.f531286r = stateResolve;
    }

    @Override // cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.f531284p.set(validRect);
        m();
        k();
        android.view.View view = this.E;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i17 = marginLayoutParams.topMargin;
        int i18 = validRect.bottom;
        int i19 = this.F;
        if (i17 != i18 - i19) {
            marginLayoutParams.topMargin = i18 - i19;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
