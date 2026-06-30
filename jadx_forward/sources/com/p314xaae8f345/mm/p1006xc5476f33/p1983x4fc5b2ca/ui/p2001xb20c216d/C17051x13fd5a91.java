package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/RoundCornerAudioWaveView;", "Landroid/view/View;", "", "color", "Ljz5/f0;", "setColor", "", "isShow", "setShow", "count", "setWaveCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.RoundCornerAudioWaveView */
/* loaded from: classes5.dex */
public final class C17051x13fd5a91 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final float f237608d;

    /* renamed from: e, reason: collision with root package name */
    public final int f237609e;

    /* renamed from: f, reason: collision with root package name */
    public final float f237610f;

    /* renamed from: g, reason: collision with root package name */
    public final int f237611g;

    /* renamed from: h, reason: collision with root package name */
    public final float f237612h;

    /* renamed from: i, reason: collision with root package name */
    public float f237613i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f237614m;

    /* renamed from: n, reason: collision with root package name */
    public int f237615n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237616o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.RectF[] f237617p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f237618q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17051x13fd5a91(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f237608d = f18;
        this.f237609e = a17;
        this.f237610f = 2.0f * f17;
        this.f237611g = a17;
        this.f237612h = f18;
        this.f237613i = f17 * 9.0f;
        int i17 = this.f237615n;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            rectFArr[i18] = new android.graphics.RectF();
        }
        this.f237617p = rectFArr;
        this.f237618q = new float[this.f237615n];
        a();
    }

    public final void a() {
        m68267xb63ff354(20);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f237614m = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f237614m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        paint2.setColor(-3355444);
        android.graphics.Paint paint3 = this.f237614m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint3);
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.RectF[] rectFArr = this.f237617p;
        int length = rectFArr.length;
        float f17 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            android.graphics.RectF rectF = rectFArr[i17];
            int i19 = i18 + 1;
            float height = rectF.height();
            int i27 = this.f237609e;
            if (height <= i27) {
                this.f237618q[i18] = (float) (this.f237613i * java.lang.Math.random());
            } else {
                float[] fArr = this.f237618q;
                if (height >= fArr[i18]) {
                    fArr[i18] = i27;
                }
            }
            float min = height <= this.f237618q[i18] ? java.lang.Math.min(height + this.f237610f, this.f237613i) : java.lang.Math.max(height - this.f237611g, i27);
            float f18 = this.f237612h;
            float f19 = this.f237613i;
            float f27 = 2;
            float f28 = min / f27;
            float f29 = f17 + f18;
            float f37 = this.f237608d;
            rectF.set(f17 + f18, (f19 / f27) - f28, f29 + f37, (f19 / f27) + f28);
            f17 = rectF.right;
            android.graphics.Paint paint = this.f237614m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
            canvas.drawRoundRect(rectF, f37 / f27, f37 / f27, paint);
            i17++;
            i18 = i19;
        }
        if (this.f237616o) {
            postInvalidateDelayed(33L);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f237613i = i18;
    }

    /* renamed from: setColor */
    public final void m68265x52d2f021(int i17) {
        android.graphics.Paint paint = this.f237614m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
        paint.setColor(i17);
    }

    /* renamed from: setShow */
    public final void m68266x76500a7f(boolean z17) {
        this.f237616o = z17;
    }

    /* renamed from: setWaveCount */
    public final void m68267xb63ff354(int i17) {
        this.f237615n = i17;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            rectFArr[i18] = new android.graphics.RectF();
        }
        this.f237617p = rectFArr;
        this.f237618q = new float[this.f237615n];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17051x13fd5a91(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        float f17 = a17;
        float f18 = 1.5f * f17;
        this.f237608d = f18;
        this.f237609e = a17;
        this.f237610f = 2.0f * f17;
        this.f237611g = a17;
        this.f237612h = f18;
        this.f237613i = f17 * 9.0f;
        int i18 = this.f237615n;
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            rectFArr[i19] = new android.graphics.RectF();
        }
        this.f237617p = rectFArr;
        this.f237618q = new float[this.f237615n];
        a();
    }
}
