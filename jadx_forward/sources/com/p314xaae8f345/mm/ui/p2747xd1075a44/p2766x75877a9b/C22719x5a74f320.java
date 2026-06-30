package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2766x75877a9b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "", "g", "Z", "isBothSidesMode", "()Z", "setBothSidesMode", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar */
/* loaded from: classes5.dex */
public final class C22719x5a74f320 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 {

    /* renamed from: e, reason: collision with root package name */
    public final int f293981e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f293982f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isBothSidesMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22719x5a74f320(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        this.f293982f.setColor(1308622847);
        this.f293982f.setShader(null);
        canvas.drawLine(getThumbOffset() + 0.0f, getHeight() / 2.0f, getWidth() - getThumbOffset(), getHeight() / 2.0f, this.f293982f);
        if (this.isBothSidesMode) {
            int max = getMax() / 2;
            if (getProgress() > max) {
                float thumbOffset = getThumbOffset() + (getWidth() / 2.0f);
                float height = getHeight() / 2.0f;
                float thumbOffset2 = getThumbOffset() + (getWidth() / 2.0f) + (((getWidth() - (getThumbOffset() * 2)) / getMax()) * (getProgress() - max));
                float height2 = getHeight() / 2.0f;
                android.graphics.Paint paint = this.f293982f;
                paint.reset();
                paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint.setStrokeWidth(this.f293981e);
                this.f293982f.setShader(new android.graphics.LinearGradient(thumbOffset, height, thumbOffset2, height2, new int[]{android.graphics.Color.parseColor("#63E7A0"), android.graphics.Color.parseColor("#2AAE67")}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                canvas.drawLine(thumbOffset, height, thumbOffset2, height2, this.f293982f);
            }
            if (getProgress() < max) {
                float width = ((getWidth() / 2.0f) - (((getWidth() - (getThumbOffset() * 2)) / getMax()) * (max - getProgress()))) - getThumbOffset();
                float height3 = getHeight() / 2.0f;
                float width2 = getWidth() / 2.0f;
                float height4 = getHeight() / 2.0f;
                android.graphics.Paint paint2 = this.f293982f;
                paint2.reset();
                paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint2.setStrokeWidth(this.f293981e);
                this.f293982f.setShader(new android.graphics.LinearGradient(width, height3, width2, height4, new int[]{android.graphics.Color.parseColor("#63E7A0"), android.graphics.Color.parseColor("#2AAE67")}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                canvas.drawLine(width, height3, width2, height4, this.f293982f);
            }
        } else {
            float thumbOffset3 = getThumbOffset() + 0.0f;
            float height5 = getHeight() / 2.0f;
            float thumbOffset4 = getThumbOffset() + ((getWidth() - (getThumbOffset() * 2)) * (getProgress() / getMax()));
            float height6 = getHeight() / 2.0f;
            android.graphics.Paint paint3 = this.f293982f;
            paint3.reset();
            paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            paint3.setStrokeWidth(this.f293981e);
            this.f293982f.setShader(new android.graphics.LinearGradient(thumbOffset3, height5, thumbOffset4, height6, new int[]{android.graphics.Color.parseColor("#63E7A0"), android.graphics.Color.parseColor("#2AAE67")}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            canvas.drawLine(thumbOffset3, height5, thumbOffset4, height6, this.f293982f);
        }
        super.onDraw(canvas);
    }

    /* renamed from: setBothSidesMode */
    public final void m82176xb42985fc(boolean z17) {
        this.isBothSidesMode = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22719x5a74f320(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
        this.f293981e = a17;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(a17);
        this.f293982f = paint;
    }
}
