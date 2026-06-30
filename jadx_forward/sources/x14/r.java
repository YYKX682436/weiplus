package x14;

/* loaded from: classes5.dex */
public final class r extends android.graphics.drawable.DrawableWrapper {

    /* renamed from: d, reason: collision with root package name */
    public final float f532992d;

    /* renamed from: e, reason: collision with root package name */
    public final float f532993e;

    /* renamed from: f, reason: collision with root package name */
    public final long f532994f;

    /* renamed from: g, reason: collision with root package name */
    public float f532995g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f532996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.graphics.drawable.Drawable drawable, float f17, float f18, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(drawable);
        j17 = (i17 & 8) != 0 ? 1500L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f532992d = f17;
        this.f532993e = f18;
        this.f532994f = j17;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f532996h == null) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f532992d, this.f532993e);
            ofFloat.setDuration(this.f532994f);
            ofFloat.addUpdateListener(new x14.q(this));
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            this.f532996h = ofFloat;
            ofFloat.start();
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable.getBounds(), "getBounds(...)");
        int save = canvas.save();
        canvas.rotate(this.f532995g, (r1.width() * 0.5f) + r1.left, (r1.height() * 0.5f) + r1.top);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        if (!z17) {
            android.animation.ValueAnimator valueAnimator = this.f532996h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f532996h = null;
        }
        return super.setVisible(z17, z18);
    }
}
