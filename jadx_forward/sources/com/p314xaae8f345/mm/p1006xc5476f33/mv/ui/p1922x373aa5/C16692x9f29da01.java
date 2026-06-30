package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R#\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricPreludeView;", "Landroid/widget/FrameLayout;", "", "o", "Z", "getEnableAnim", "()Z", "setEnableAnim", "(Z)V", "enableAnim", "", "p", "J", "getPreludeLen", "()J", "setPreludeLen", "(J)V", "preludeLen", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "q", "Ljz5/g;", "getDotDownAnimator", "()Landroid/animation/ValueAnimator;", "dotDownAnimator", "r", "getDotUpAnimator", "dotUpAnimator", "s", "getAlphaAnimator", "alphaAnimator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView */
/* loaded from: classes10.dex */
public final class C16692x9f29da01 extends android.widget.FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final float f233196u = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);

    /* renamed from: v, reason: collision with root package name */
    public static final float f233197v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f233198w;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f233199d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f233200e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f233201f;

    /* renamed from: g, reason: collision with root package name */
    public int f233202g;

    /* renamed from: h, reason: collision with root package name */
    public int f233203h;

    /* renamed from: i, reason: collision with root package name */
    public float f233204i;

    /* renamed from: m, reason: collision with root package name */
    public float f233205m;

    /* renamed from: n, reason: collision with root package name */
    public int f233206n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean enableAnim;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long preludeLen;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dotDownAnimator;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dotUpAnimator;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g alphaAnimator;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f233212t;

    static {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24);
        f233197v = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 21);
        f233198w = "MicroMsg.MusicMvLyricPreludeView";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16692x9f29da01(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f233199d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f233200e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f233201f = paint3;
        this.f233202g = 2;
        this.f233203h = 1;
        float f17 = f233196u;
        this.f233204i = f17;
        this.f233205m = f17;
        this.f233206n = 2;
        this.dotDownAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j2.f233410d);
        this.dotUpAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.k2.f233418d);
        this.alphaAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i2.f233404d);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint2.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint3.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAlphaAnimator */
    public final android.animation.ValueAnimator m67315xc03dbeaf() {
        return (android.animation.ValueAnimator) this.alphaAnimator.mo141623x754a37bb();
    }

    /* renamed from: getDotDownAnimator */
    private final android.animation.ValueAnimator m67316xb2f9f75c() {
        return (android.animation.ValueAnimator) this.dotDownAnimator.mo141623x754a37bb();
    }

    /* renamed from: getDotUpAnimator */
    private final android.animation.ValueAnimator m67317x84fda915() {
        return (android.animation.ValueAnimator) this.dotUpAnimator.mo141623x754a37bb();
    }

    public final float b(int i17) {
        return i17 == this.f233203h ? this.f233205m : i17 == this.f233202g ? this.f233204i : f233196u;
    }

    public final void c() {
        android.animation.ValueAnimator valueAnimator;
        if (this.enableAnim) {
            if (m67316xb2f9f75c().isStarted()) {
                m67316xb2f9f75c().pause();
            }
            if (m67317x84fda915().isStarted()) {
                m67317x84fda915().pause();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f233212t;
            boolean z17 = false;
            if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                z17 = true;
            }
            if (z17 && (valueAnimator = this.f233212t) != null) {
                valueAnimator.pause();
            }
            if (m67315xc03dbeaf().isStarted()) {
                m67315xc03dbeaf().pause();
            }
        }
    }

    public final void d() {
        android.animation.ValueAnimator valueAnimator;
        if (this.enableAnim) {
            if (m67316xb2f9f75c().isPaused()) {
                m67316xb2f9f75c().resume();
            }
            if (m67317x84fda915().isPaused()) {
                m67317x84fda915().resume();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f233212t;
            boolean z17 = false;
            if (valueAnimator2 != null && valueAnimator2.isPaused()) {
                z17 = true;
            }
            if (z17 && (valueAnimator = this.f233212t) != null) {
                valueAnimator.resume();
            }
            if (m67315xc03dbeaf().isPaused()) {
                m67315xc03dbeaf().resume();
            }
        }
    }

    public final void e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f233198w, "startAlphaAnim");
        float f17 = f233196u;
        this.f233205m = f17;
        this.f233204i = f17;
        invalidate();
        if (j17 > 5000) {
            j17 = 3000;
        }
        int i17 = (int) j17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        this.f233212t = ofInt;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofInt);
        ofInt.setDuration(i17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.l2(this));
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m2(i17, this, c0Var3, c0Var2, c0Var));
        ofInt.cancel();
        ofInt.start();
        m67315xc03dbeaf().addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n2(this));
    }

    public final void f(long j17) {
        boolean z17 = this.enableAnim;
        java.lang.String str = f233198w;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        this.enableAnim = true;
        this.f233202g = 2;
        this.f233203h = 1;
        float f17 = f233196u;
        this.f233204i = f17;
        this.f233205m = f17;
        this.f233206n = 2;
        this.f233199d.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        this.f233200e.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        this.f233201f.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        long j18 = this.preludeLen - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startAnim " + hashCode() + "， remaining:" + j18);
        if (j18 <= 5000) {
            if (j18 >= 3000) {
                e(j18);
                return;
            } else {
                this.enableAnim = false;
                return;
            }
        }
        m67316xb2f9f75c().addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o2(j18, this));
        m67317x84fda915().addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p2(j18, this));
        m67316xb2f9f75c().cancel();
        m67316xb2f9f75c().start();
        m67317x84fda915().cancel();
        m67317x84fda915().start();
    }

    public final boolean getEnableAnim() {
        return this.enableAnim;
    }

    public final long getPreludeLen() {
        return this.preludeLen;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.enableAnim) {
            float f17 = f233196u;
            float b17 = b(0);
            android.graphics.Paint paint = this.f233199d;
            float f18 = f233197v;
            canvas.drawCircle((f17 * 0.2f) + f17, f18, b17, paint);
            canvas.drawCircle((4 * f17) + (f17 * 0.2f), f18, b(1), this.f233200e);
            canvas.drawCircle((7 * f17) + (f17 * 0.2f), f18, b(2), this.f233201f);
        }
    }

    /* renamed from: setEnableAnim */
    public final void m67320x8d34e836(boolean z17) {
        this.enableAnim = z17;
    }

    /* renamed from: setPreludeLen */
    public final void m67321x1d4ee7ea(long j17) {
        this.preludeLen = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16692x9f29da01(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f233199d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f233200e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f233201f = paint3;
        this.f233202g = 2;
        this.f233203h = 1;
        float f17 = f233196u;
        this.f233204i = f17;
        this.f233205m = f17;
        this.f233206n = 2;
        this.dotDownAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j2.f233410d);
        this.dotUpAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.k2.f233418d);
        this.alphaAnimator = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i2.f233404d);
        paint.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint2.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        paint3.setColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
    }
}
