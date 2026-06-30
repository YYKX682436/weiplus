package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0002\u0011B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/PlaybackTimelineToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ljx0/g0;", "seekBarChangeListener", "Ljz5/f0;", "setOnSeekBarChangeListener", "", "getPercent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "jx0/f0", "jx0/h0", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PlaybackTimelineToolbar extends androidx.constraintlayout.widget.ConstraintLayout {
    public final android.widget.ProgressBar A;
    public final com.tencent.mm.ui.widget.imageview.WeImageView B;
    public final com.tencent.mm.ui.widget.imageview.WeImageView C;
    public final com.tencent.mm.ui.widget.imageview.WeImageView D;
    public float E;
    public boolean F;
    public boolean G;
    public final int H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f69443J;
    public final jx0.i0 K;
    public final n3.q L;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f69444v;

    /* renamed from: w, reason: collision with root package name */
    public jx0.g0 f69445w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f69446x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f69447y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f69448z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaybackTimelineToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final boolean A(android.view.View view, android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        android.graphics.Rect rect = this.f69444v;
        view.getHitRect(rect);
        return x17 >= ((float) rect.left) && x17 <= ((float) rect.right) && y17 >= ((float) rect.top) && y17 <= ((float) rect.bottom);
    }

    public final void B(boolean z17) {
        float f17 = z17 ? 1.0f : 0.0f;
        this.f69448z.animate().scaleX(f17).scaleY(f17).alpha(z17 ? 1.0f : 0.0f).setInterpolator(new android.view.animation.OvershootInterpolator()).setDuration(300L).start();
        float f18 = z17 ? 1.5f : 1.0f;
        this.f69447y.animate().scaleX(f18).scaleY(f18).setInterpolator(new android.view.animation.OvershootInterpolator()).setDuration(300L).start();
    }

    public final void C(float f17) {
        this.G = true;
        this.f69446x.setTranslationX((-(r0.getWidth() / 2.0f)) + (this.f69447y.getWidth() / 2.0f) + f17);
        int i17 = (int) f17;
        if (i17 < 0) {
            i17 = 0;
        }
        android.widget.ProgressBar progressBar = this.A;
        int max = progressBar.getMax();
        if (i17 > max) {
            i17 = max;
        }
        progressBar.setProgress(i17);
    }

    public final float getPercent() {
        android.widget.ProgressBar progressBar = this.A;
        return progressBar.getProgress() / progressBar.getMax();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int b17 = this.K.b();
        boolean z17 = false;
        if (!((b17 & 1) != 0)) {
            if (!((b17 & 4) != 0) || (!A(this.B, ev6) && !A(this.C, ev6) && !A(this.D, ev6))) {
                z17 = true;
            }
        }
        this.f69443J = z17;
        if (z17) {
            this.L.a(ev6);
        }
        return this.f69443J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r1 != 3) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r6, r0)
            boolean r0 = r5.f69443J
            if (r0 == 0) goto L6e
            jx0.i0 r0 = r5.K
            int r1 = r0.b()
            r2 = 2
            r1 = r1 & r2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r4
        L18:
            if (r1 == 0) goto L6e
            int r1 = r6.getAction()
            if (r1 == 0) goto L57
            if (r1 == r3) goto L46
            if (r1 == r2) goto L28
            r2 = 3
            if (r1 == r2) goto L46
            goto L69
        L28:
            float r1 = r6.getX()
            float r2 = r5.I
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = r5.H
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L69
            boolean r1 = r5.F
            if (r1 != 0) goto L69
            float r1 = r5.getPercent()
            r0.e(r1)
            goto L69
        L46:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.E = r1
            r5.I = r1
            float r1 = r5.getPercent()
            r0.a(r1)
            r5.B(r4)
            goto L69
        L57:
            float r0 = r6.getX()
            r5.I = r0
            android.widget.ProgressBar r0 = r5.A
            int r0 = r0.getProgress()
            float r0 = (float) r0
            r5.E = r0
            r5.B(r3)
        L69:
            n3.q r0 = r5.L
            r0.a(r6)
        L6e:
            boolean r6 = r5.f69443J
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnSeekBarChangeListener(jx0.g0 seekBarChangeListener) {
        kotlin.jvm.internal.o.g(seekBarChangeListener, "seekBarChangeListener");
        this.f69445w = seekBarChangeListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackTimelineToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69444v = new android.graphics.Rect();
        this.E = -1.0f;
        this.H = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.I = -1.0f;
        this.K = new jx0.i0(this);
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dgi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qbt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f69446x = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qbs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f69447y = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qbu);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f69448z = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qbq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.A = (android.widget.ProgressBar) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.q4z);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.B = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484456q51);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.C = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f484455q50);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.D = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        post(new jx0.e0(this));
        n3.q qVar = new n3.q(context, new jx0.f0(this));
        n3.o oVar = qVar.f334389a;
        ((n3.p) oVar).f334382a.setIsLongpressEnabled(false);
        ((n3.p) oVar).f334382a.setOnDoubleTapListener(null);
        this.L = qVar;
    }
}
