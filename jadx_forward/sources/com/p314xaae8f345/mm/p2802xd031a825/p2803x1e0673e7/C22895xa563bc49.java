package com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7;

/* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton */
/* loaded from: classes9.dex */
public class C22895xa563bc49 extends android.view.View {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public android.graphics.Paint F;
    public android.graphics.Paint G;
    public final android.graphics.RectF H;
    public final android.graphics.Rect I;

    /* renamed from: J, reason: collision with root package name */
    public android.animation.ObjectAnimator f295356J;
    public android.animation.ValueAnimator K;
    public android.animation.ValueAnimator L;
    public android.animation.AnimatorSet M;
    public android.animation.ObjectAnimator N;
    public android.animation.ValueAnimator P;
    public android.animation.AnimatorSet Q;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f295357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f295358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295359f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f295360g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.res.ColorStateList f295361h;

    /* renamed from: i, reason: collision with root package name */
    public final int f295362i;

    /* renamed from: m, reason: collision with root package name */
    public int f295363m;

    /* renamed from: n, reason: collision with root package name */
    public int f295364n;

    /* renamed from: o, reason: collision with root package name */
    public int f295365o;

    /* renamed from: p, reason: collision with root package name */
    public int f295366p;

    /* renamed from: q, reason: collision with root package name */
    public int f295367q;

    /* renamed from: r, reason: collision with root package name */
    public int f295368r;

    /* renamed from: s, reason: collision with root package name */
    public int f295369s;

    /* renamed from: t, reason: collision with root package name */
    public int f295370t;

    /* renamed from: u, reason: collision with root package name */
    public final int f295371u;

    /* renamed from: v, reason: collision with root package name */
    public final int f295372v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f295373w;

    /* renamed from: x, reason: collision with root package name */
    public float f295374x;

    /* renamed from: y, reason: collision with root package name */
    public float f295375y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f295376z;

    public C22895xa563bc49(android.content.Context context) {
        super(context);
        this.f295358e = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f295359f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3);
        this.f295362i = 17;
        this.f295371u = 300;
        this.f295372v = 300;
        this.f295373w = "";
        this.f295376z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }

    public final void a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f295357d = context;
        this.f295365o = i65.a.b(context, 4);
        this.f295366p = i65.a.b(this.f295357d, 16);
        this.f295367q = i65.a.b(this.f295357d, 64);
        this.f295368r = i65.a.b(this.f295357d, 96);
        this.f295360g = getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f295361h = getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.F = paint;
        paint.setStrokeWidth(4.0f);
        this.F.setStyle(android.graphics.Paint.Style.FILL);
        this.F.setAntiAlias(true);
        this.F.setColor(this.f295358e);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.G = paint2;
        paint2.setTextSize(i65.a.b(this.f295357d, this.f295362i) * i65.a.q(this.f295357d));
        this.G.setColor(this.f295359f);
        this.G.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.G.setAntiAlias(true);
        this.G.setFakeBoldText(true);
    }

    public void b(int i17, int i18, int i19, int i27) {
        if (this.f295376z) {
            this.f295376z = false;
            this.B = i17;
            this.C = i18;
            this.D = i19;
            this.E = i27;
            float translationX = getTranslationX();
            this.f295375y = translationX;
            this.f295374x = translationX - this.f295366p;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i18;
        layoutParams.bottomMargin = i19;
        setLayoutParams(layoutParams);
        this.f295363m = i17;
        this.f295364n = i18;
        this.f295370t = i17;
        if (this.f295356J == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationX", this.f295375y, this.f295374x);
            this.f295356J = ofFloat;
            ofFloat.setDuration(this.f295371u);
            this.f295356J.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        int i28 = this.f295364n;
        this.f295369s = i28;
        android.animation.ValueAnimator valueAnimator = this.L;
        int i29 = this.f295372v;
        if (valueAnimator == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i28, this.f295367q);
            this.L = ofInt;
            ofInt.setDuration(i29);
            this.L.addUpdateListener(new mp5.x(this));
            this.L.addListener(new mp5.y(this));
        }
        int i37 = this.f295363m;
        this.f295370t = i37;
        if (this.K == null) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(i37, this.f295368r);
            this.K = ofInt2;
            ofInt2.setDuration(i29);
            this.K.addUpdateListener(new mp5.z(this));
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.M = animatorSet;
        animatorSet.play(this.L).with(this.f295356J);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        int colorForState = this.f295361h.getColorForState(drawableState, this.f295359f);
        int colorForState2 = this.f295360g.getColorForState(drawableState, this.f295358e);
        this.G.setColor(colorForState);
        this.F.setColor(colorForState2);
        boolean z17 = this.A;
        android.graphics.RectF rectF = this.H;
        if (z17) {
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = this.f295370t;
            rectF.bottom = this.f295369s;
        } else {
            rectF.left = 0.0f;
            int i17 = this.f295364n;
            int i18 = this.f295369s;
            rectF.top = (i17 - i18) / 2;
            rectF.right = this.f295370t;
            rectF.bottom = (i17 + i18) / 2;
        }
        float f17 = rectF.left;
        float f18 = this.f295365o;
        canvas.drawRoundRect(rectF, f18, f18, this.F);
        boolean z18 = this.A;
        android.graphics.Rect rect = this.I;
        if (z18) {
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f295370t;
            rect.bottom = this.f295367q;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f295370t;
            rect.bottom = this.f295364n;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.G.getFontMetricsInt();
        canvas.drawText(this.f295373w, rect.centerX(), (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2, this.G);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public C22895xa563bc49(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f295358e = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f295359f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3);
        this.f295362i = 17;
        this.f295371u = 300;
        this.f295372v = 300;
        this.f295373w = "";
        this.f295376z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }

    public C22895xa563bc49(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f295358e = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f295359f = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3);
        this.f295362i = 17;
        this.f295371u = 300;
        this.f295372v = 300;
        this.f295373w = "";
        this.f295376z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }
}
