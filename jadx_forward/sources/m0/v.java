package m0;

/* loaded from: classes14.dex */
public final class v extends android.view.View {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f404048i = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f404049m = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public m0.f0 f404050d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f404051e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f404052f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f404053g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f404054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setRippleState */
    private final void m146564x42e9367f(boolean z17) {
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.f404053g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l17 = this.f404052f;
        long longValue = currentAnimationTimeMillis - (l17 != null ? l17.longValue() : 0L);
        if (z17 || longValue >= 5) {
            int[] iArr = z17 ? f404048i : f404049m;
            m0.f0 f0Var = this.f404050d;
            if (f0Var != null) {
                f0Var.setState(iArr);
            }
        } else {
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: m0.v$$a
                @Override // java.lang.Runnable
                public final void run() {
                    m0.v.m146565x18f1c831(m0.v.this);
                }
            };
            this.f404053g = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f404052f = java.lang.Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2 */
    public static final void m146565x18f1c831(m0.v this$0) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        m0.f0 f0Var = this$0.f404050d;
        if (f0Var != null) {
            f0Var.setState(f404049m);
        }
        this$0.f404053g = null;
    }

    public final void b(c0.r interaction, boolean z17, long j17, int i17, long j18, float f17, yz5.a onInvalidateRipple) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interaction, "interaction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onInvalidateRipple, "onInvalidateRipple");
        if (this.f404050d == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(z17), this.f404051e)) {
            m0.f0 f0Var = new m0.f0(z17);
            setBackground(f0Var);
            this.f404050d = f0Var;
            this.f404051e = java.lang.Boolean.valueOf(z17);
        }
        m0.f0 f0Var2 = this.f404050d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var2);
        this.f404054h = onInvalidateRipple;
        e(j17, i17, j18, f17);
        if (z17) {
            long j19 = interaction.f118476a;
            f0Var2.setHotspot(d1.e.c(j19), d1.e.d(j19));
        } else {
            f0Var2.setHotspot(f0Var2.getBounds().centerX(), f0Var2.getBounds().centerY());
        }
        m146564x42e9367f(true);
    }

    public final void c() {
        this.f404054h = null;
        java.lang.Runnable runnable = this.f404053g;
        if (runnable != null) {
            removeCallbacks(runnable);
            java.lang.Runnable runnable2 = this.f404053g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable2);
            runnable2.run();
        } else {
            m0.f0 f0Var = this.f404050d;
            if (f0Var != null) {
                f0Var.setState(f404049m);
            }
        }
        m0.f0 f0Var2 = this.f404050d;
        if (f0Var2 == null) {
            return;
        }
        f0Var2.setVisible(false, false);
        unscheduleDrawable(f0Var2);
    }

    public final void d() {
        m146564x42e9367f(false);
    }

    public final void e(long j17, int i17, long j18, float f17) {
        m0.f0 f0Var = this.f404050d;
        if (f0Var == null) {
            return;
        }
        java.lang.Integer num = f0Var.f403997f;
        if (num == null || num.intValue() != i17) {
            f0Var.f403997f = java.lang.Integer.valueOf(i17);
            m0.e0.f403994a.a(f0Var, i17);
        }
        float f18 = android.os.Build.VERSION.SDK_INT < 28 ? 2 * f17 : f17;
        long b17 = e1.y.b(j18, f18 > 1.0f ? 1.0f : f18, 0.0f, 0.0f, 0.0f, 14, null);
        e1.y yVar = f0Var.f403996e;
        if (!(yVar == null ? false : e1.y.c(yVar.f327855a, b17))) {
            f0Var.f403996e = new e1.y(b17);
            f0Var.setColor(android.content.res.ColorStateList.valueOf(e1.a0.h(b17)));
        }
        android.graphics.Rect a17 = e1.t0.a(d1.h.a(d1.e.f307156b, j17));
        setLeft(a17.left);
        setTop(a17.top);
        setRight(a17.right);
        setBottom(a17.bottom);
        f0Var.setBounds(a17);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable who) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        yz5.a aVar = this.f404054h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
