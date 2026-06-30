package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallAudioWaveView;", "Landroid/view/View;", "", "m", "F", "getWaveWidth", "()F", "setWaveWidth", "(F)V", "waveWidth", "n", "getArcWidth", "setArcWidth", "arcWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rp1/d0", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FloatBallAudioWaveView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f93448d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93449e;

    /* renamed from: f, reason: collision with root package name */
    public final long f93450f;

    /* renamed from: g, reason: collision with root package name */
    public long f93451g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93452h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f93453i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float waveWidth;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float arcWidth;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f93456o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93457p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93458q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioWaveView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.graphics.Canvas canvas, float f17) {
        int i17 = (int) (f17 <= 0.4f ? 637.5f * f17 : (0.6f - f17) * 1274.9999f);
        boolean z17 = this.f93457p;
        android.graphics.Paint paint = this.f93456o;
        if (z17) {
            if (i17 < 0) {
                i17 = 0;
            }
            paint.setAlpha(i17);
            float f18 = this.waveWidth;
            paint.setStrokeWidth((f18 / 3.0f) + (((f18 * 2.0f) / 3.0f) * f17));
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            float width = getWidth() * f17;
            canvas.drawArc(width, (getHeight() / 2.0f) - ((getHeight() / 2.0f) * f17), width + (this.arcWidth * f17), (getHeight() / 2.0f) + ((getHeight() / 2.0f) * f17), -80.0f, 160.0f, false, paint);
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        paint.setAlpha(i17);
        float f19 = this.waveWidth;
        paint.setStrokeWidth((f19 / 3.0f) + (((f19 * 2.0f) / 3.0f) * f17));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        float width2 = getWidth() * (1.0f - f17);
        canvas.drawArc(width2 - (this.arcWidth * f17), (getHeight() / 2.0f) - ((getHeight() / 2.0f) * f17), width2, (getHeight() / 2.0f) + ((getHeight() / 2.0f) * f17), 100.0f, 160.0f, false, paint);
    }

    public final void b(boolean z17, boolean z18) {
        this.f93457p = z18;
        boolean z19 = this.f93452h;
        if (z17 != z19) {
            if (!z19 || z17) {
                java.util.List list = this.f93453i;
                if (z17) {
                    if (z19) {
                        return;
                    }
                    this.f93452h = true;
                    ((java.util.ArrayList) list).add(new rp1.d0(this, true));
                    return;
                }
                this.f93452h = false;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((rp1.d0) it.next()).f398370a.cancel();
                }
                ((java.util.ArrayList) list).clear();
            }
        }
    }

    public final float getArcWidth() {
        return this.arcWidth;
    }

    public final float getWaveWidth() {
        return this.waveWidth;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f93452h = false;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        this.f93456o.setAntiAlias(true);
        if (!this.f93452h) {
            for (int i17 = 1; i17 < 4; i17++) {
                a(canvas, i17 * 0.13f);
            }
        } else {
            java.util.Iterator it = this.f93453i.iterator();
            while (it.hasNext()) {
                ((rp1.d0) it.next()).getClass();
                a(canvas, 0.0f);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        int min = (int) (java.lang.Math.min(i17, i18) / 2.0f);
        if (min < this.f93448d) {
            this.f93448d = min;
        }
    }

    public final void setArcWidth(float f17) {
        this.arcWidth = f17;
    }

    public final void setWaveWidth(float f17) {
        this.waveWidth = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallAudioWaveView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        i65.a.a(getContext(), 4.0f);
        this.f93448d = i65.a.a(getContext(), 14.0f);
        this.f93449e = 800;
        this.f93450f = 3000L;
        this.f93451g = 3000L;
        this.f93453i = new java.util.ArrayList();
        this.waveWidth = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.arcWidth = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f93456o = paint;
        this.f93457p = true;
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
    }
}
