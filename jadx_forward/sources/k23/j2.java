package k23;

/* loaded from: classes12.dex */
public final class j2 extends k23.i1 {
    public int A;
    public final k23.n1 B;
    public final k23.n1 C;
    public android.view.View.OnLayoutChangeListener D;
    public android.view.View E;
    public android.animation.AnimatorSet F;
    public boolean G;

    /* renamed from: n, reason: collision with root package name */
    public k23.k1 f385129n;

    /* renamed from: o, reason: collision with root package name */
    public k23.f0 f385130o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f385131p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f385132q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f385133r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f385134s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f385135t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f385136u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f385137v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f385138w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f385139x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f385140y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f385141z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(android.content.Context context, k23.d0 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f385130o = k23.f0.f385097f;
        this.f385131p = "";
        this.f385133r = jz5.h.b(new k23.t1(context));
        this.f385134s = jz5.h.b(new k23.v1(this));
        this.f385135t = jz5.h.b(new k23.w1(this));
        this.f385136u = jz5.h.b(new k23.x1(this));
        this.f385137v = jz5.h.b(new k23.y1(this));
        this.f385138w = jz5.h.b(new k23.u1(this));
        this.f385139x = jz5.h.b(new k23.z1(this));
        this.f385140y = jz5.h.b(new k23.i2(this));
        this.f385141z = jz5.h.b(new k23.g2(this));
        boolean z17 = params.f385087k == k23.b0.f385053g;
        this.B = new k23.n1(this, "左侧麦克风", 500L);
        this.C = new k23.n1(this, "右侧按钮", 10L);
        m141814x6cea621d().setImageResource(com.p314xaae8f345.mm.R.raw.f80416xa736ab6c);
        m141812x6d616b76().setImageResource(com.p314xaae8f345.mm.R.raw.f80416xa736ab6c);
        m141815xa4d2fcce().setImageResource(com.p314xaae8f345.mm.R.raw.f80612xe98418cc);
        m141816x25712705().setImageResource(com.p314xaae8f345.mm.R.raw.f80612xe98418cc);
        p(this.f385130o, false);
        m141813x10feab6f().setOnTouchListener(new k23.c2(this));
        m141803xca568c10().setOnTouchListener(new k23.d2(this));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode");
            android.view.View m141819xde2e201c = m141819xde2e201c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m141819xde2e201c, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m141819xde2e201c.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m141819xde2e201c, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View m141818x1deebc3 = m141818x1deebc3();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m141818x1deebc3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m141818x1deebc3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m141818x1deebc3, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.vkq)).setImageResource(com.p314xaae8f345.mm.R.raw.f80870xfc086c72);
            m141819xde2e201c().setOnClickListener(new k23.e2(this));
            android.view.View m141817x47971054 = m141817x47971054();
            m141817x47971054 = m141817x47971054 instanceof android.view.View ? m141817x47971054 : null;
            if (m141817x47971054 == null) {
                return;
            }
            android.view.ViewParent parent = m141817x47971054.getParent();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = parent instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) parent : null;
            if (c1073x7e08a787 == null) {
                return;
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar.d(c1073x7e08a787);
            int i17 = (int) (20 * getContext().getResources().getDisplayMetrics().density);
            cVar.i(com.p314xaae8f345.mm.R.id.tyx).f92490l0 = 0;
            cVar.m(com.p314xaae8f345.mm.R.id.tyx, 6, i17);
            cVar.m(com.p314xaae8f345.mm.R.id.tyx, 7, i17);
            cVar.b(c1073x7e08a787);
            c1073x7e08a787.m7179xd020a803(null);
            k23.f2 f2Var = new k23.f2(this, m141817x47971054);
            this.D = f2Var;
            m141817x47971054.addOnLayoutChangeListener(f2Var);
        }
    }

    public static final android.widget.ImageView c(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap, float f17, float f18) {
        android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
        imageView.setImageBitmap(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        imageView.layout((int) f17, (int) f18, (int) (f17 + width), (int) (f18 + height));
        viewGroup.getOverlay().add(imageView);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCancelLimitY */
    public final float m141811xe7f5958e() {
        return ((java.lang.Number) ((jz5.n) this.f385133r).mo141623x754a37bb()).floatValue();
    }

    /* renamed from: getKeyboardIcon */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141812x6d616b76() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385138w).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* renamed from: getLeftCircleBtn */
    private final android.view.View m141813x10feab6f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385134s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getLeftKeyboardIcon */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141814x6cea621d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385135t).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getLeftVoiceIcon */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141815xa4d2fcce() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385136u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMikeIcon */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x25712705() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385137v).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* renamed from: getModeSwitchContainer */
    private final android.view.View m141817x47971054() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385139x).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getSpacerUpload */
    private final android.view.View m141818x1deebc3() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385141z).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getUploadBtnContainer */
    private final android.view.View m141819xde2e201c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385140y).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public static final void h(k23.j2 j2Var) {
        android.view.ViewGroupOverlay overlay;
        j2Var.m141803xca568c10().getWidth();
        int height = j2Var.m141803xca568c10().getHeight();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141812x6d616b76 = j2Var.m141812x6d616b76();
        float left = m141812x6d616b76.getLeft();
        float left2 = j2Var.m141804x8ee3d2b2().getLeft() + j2Var.m141804x8ee3d2b2().getWidth();
        float max = java.lang.Math.max(m141812x6d616b76.getHeight(), j2Var.m141804x8ee3d2b2().getHeight());
        if (left2 <= 0.0f || max <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation: invalid shimmer size (w=" + left2 + ", h=" + max + "), skip");
            return;
        }
        int d17 = i65.a.d(j2Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
        int argb = android.graphics.Color.argb(0, android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17));
        float e17 = left2 > 0.0f ? e06.p.e(left / left2, 0.0f, 1.0f) : 0.0f;
        int i17 = (int) left2;
        int i18 = (int) max;
        android.view.View view = new android.view.View(j2Var.getContext());
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(new k23.b2(argb, d17, e17));
        view.setBackground(paintDrawable);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i19 = (height - i18) / 2;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
        view.layout(0, i19, i17, i18 + i19);
        android.view.View m141803xca568c10 = j2Var.m141803xca568c10();
        android.view.ViewGroup viewGroup = m141803xca568c10 instanceof android.view.ViewGroup ? (android.view.ViewGroup) m141803xca568c10 : null;
        if (viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
            overlay.add(view);
        }
        j2Var.E = view;
        view.setTranslationX(0.0f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, left2);
        ofFloat2.setDuration(1150L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(150L);
        ofFloat3.setStartDelay(1000L);
        ofFloat3.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat4.setDuration(1700L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.play(ofFloat2).with(ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat2);
        animatorSet.addListener(new k23.a2(new p3321xbce91901.jvm.p3324x21ffc6bd.f0(), view, 0.0f, animatorSet, j2Var));
        j2Var.F = animatorSet;
        animatorSet.start();
    }

    /* renamed from: getCurrentMode */
    public final k23.f0 m141820xfda94d86() {
        return this.f385130o;
    }

    /* renamed from: getFloatingButtonBottomHeight */
    public final int m141821x8cbe620() {
        if (this.A == 0) {
            o();
        }
        return this.A;
    }

    @Override // k23.i1
    /* renamed from: getLayoutId */
    public int mo141801x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efc;
    }

    @Override // k23.i1
    /* renamed from: getStartButtonTopToBottomHeightPx */
    public java.lang.Integer mo141805xa625e1cc() {
        android.view.View m141817x47971054 = m141817x47971054();
        android.view.ViewGroup.LayoutParams layoutParams = m141817x47971054.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        return java.lang.Integer.valueOf((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + m141817x47971054.getHeight());
    }

    public final void i(k23.f0 f0Var) {
        java.lang.String string;
        java.lang.String string2;
        j(f0Var);
        int ordinal = f0Var.ordinal();
        if (ordinal == 0) {
            m141814x6cea621d().setVisibility(8);
            m141815xa4d2fcce().setVisibility(0);
            m141816x25712705().setVisibility(8);
            m141812x6d616b76().setVisibility(0);
            if (this.f385132q) {
                if (this.f385131p.length() > 0) {
                    string = this.f385131p;
                    m141804x8ee3d2b2().setText(string);
                    return;
                }
            }
            string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.niw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            m141804x8ee3d2b2().setText(string);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        m141814x6cea621d().setVisibility(0);
        m141815xa4d2fcce().setVisibility(8);
        m141816x25712705().setVisibility(0);
        m141812x6d616b76().setVisibility(8);
        if (this.f385132q) {
            if (this.f385131p.length() > 0) {
                string2 = this.f385131p;
                m141804x8ee3d2b2().setText(string2);
            }
        }
        string2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.niu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        m141804x8ee3d2b2().setText(string2);
    }

    public final void j(k23.f0 f0Var) {
        if (m141802x29c21c7c().f385085i == k23.u2.f385235e) {
            int ordinal = f0Var.ordinal();
            if (ordinal == 0) {
                int d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
                int d18 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
                m141803xca568c10().setBackgroundColor(d17);
                m141804x8ee3d2b2().setTextColor(d18);
                m141812x6d616b76().m82040x7541828(d18);
                return;
            }
            if (ordinal != 1) {
                return;
            }
            int d19 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77736x48893d57);
            int d27 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
            m141803xca568c10().setBackgroundColor(d19);
            m141804x8ee3d2b2().setTextColor(d27);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m141803xca568c10().findViewById(com.p314xaae8f345.mm.R.id.ugo);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80610xddce36b9);
                c22699x3dcdb352.m82040x7541828(d27);
            }
        }
    }

    public final jz5.l k(android.view.View view, android.view.ViewGroup viewGroup) {
        view.getLocationOnScreen(new int[2]);
        viewGroup.getLocationOnScreen(new int[2]);
        return new jz5.l(java.lang.Float.valueOf(r1[0] - r0[0]), java.lang.Float.valueOf(r1[1] - r0[1]));
    }

    public final void l() {
        android.view.ViewGroupOverlay overlay;
        android.animation.AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = null;
        android.view.View view = this.E;
        if (view != null) {
            android.view.View m141803xca568c10 = m141803xca568c10();
            android.view.ViewGroup viewGroup = m141803xca568c10 instanceof android.view.ViewGroup ? (android.view.ViewGroup) m141803xca568c10 : null;
            if (viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
                overlay.remove(view);
            }
        }
        this.E = null;
        this.G = false;
    }

    public final android.graphics.Bitmap m(android.view.View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "snapshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "snapshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        view.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public final void n(k23.f0 mode, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        if (this.f385130o == mode) {
            p(mode, z17);
            this.f385132q = false;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "API切换模式: " + this.f385130o + " -> " + mode + ", animated: " + z17);
        l();
        this.f385130o = mode;
        p(mode, z17);
        this.f385132q = false;
    }

    public final void o() {
        android.view.View m141817x47971054 = m141817x47971054();
        int height = m141817x47971054.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = m141817x47971054.getLayoutParams();
        this.A = (int) ((height + ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r0.bottomMargin : 0)) / getContext().getResources().getDisplayMetrics().density);
    }

    public final void p(k23.f0 f0Var, boolean z17) {
        java.lang.String string;
        if (!z17) {
            i(f0Var);
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        int ordinal = f0Var.ordinal();
        if (ordinal == 0) {
            j(f0Var);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m141814x6cea621d(), (android.util.Property<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(m141815xa4d2fcce(), (android.util.Property<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            ofFloat.addListener(new k23.r1(this));
            m141815xa4d2fcce().setAlpha(0.0f);
            m141815xa4d2fcce().setVisibility(0);
            m141816x25712705().setVisibility(8);
            m141812x6d616b76().setVisibility(0);
            if (this.f385132q) {
                if (this.f385131p.length() > 0) {
                    string = this.f385131p;
                    m141804x8ee3d2b2().setText(string);
                    animatorSet.playTogether(ofFloat, ofFloat2);
                }
            }
            string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.niw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            m141804x8ee3d2b2().setText(string);
            animatorSet.playTogether(ofFloat, ofFloat2);
        } else if (ordinal == 1) {
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(m141815xa4d2fcce(), (android.util.Property<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(m141814x6cea621d(), (android.util.Property<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            ofFloat3.addListener(new k23.s1(this));
            m141814x6cea621d().setAlpha(0.0f);
            m141814x6cea621d().setVisibility(0);
            android.view.View m141817x47971054 = m141817x47971054();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m141817x47971054, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) m141817x47971054;
            jz5.l k17 = k(m141812x6d616b76(), viewGroup);
            float floatValue = ((java.lang.Number) k17.f384366d).floatValue();
            float floatValue2 = ((java.lang.Number) k17.f384367e).floatValue();
            jz5.l k18 = k(m141804x8ee3d2b2(), viewGroup);
            float floatValue3 = ((java.lang.Number) k18.f384366d).floatValue();
            float floatValue4 = ((java.lang.Number) k18.f384367e).floatValue();
            android.graphics.Bitmap r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80416xa736ab6c, m141812x6d616b76().getWidth(), m141812x6d616b76().getHeight(), i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw), 0, 1.0f);
            android.graphics.Bitmap m17 = m(m141804x8ee3d2b2());
            i(k23.f0.f385098g);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new k23.o1(viewGroup, this, viewGroup, r17, floatValue, floatValue2, m17, floatValue3, floatValue4, 200L));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    /* renamed from: setModeSwitchListener */
    public final void m141822xa8713c8d(k23.k1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f385129n = listener;
    }
}
