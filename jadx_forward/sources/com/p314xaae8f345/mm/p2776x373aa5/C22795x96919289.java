package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.PhotoEditText */
/* loaded from: classes5.dex */
public class C22795x96919289 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22666xcf3be4c3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f294907d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Xfermode f294908e;

    /* renamed from: f, reason: collision with root package name */
    public int f294909f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f294910g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f294911h;

    public C22795x96919289(android.content.Context context) {
        super(context);
        this.f294907d = new android.graphics.Paint(1);
        this.f294911h = false;
        this.f294910g = new android.widget.TextView(context);
        b();
    }

    private void b() {
        new android.widget.TextView(getContext()).setTextSize(getTextSize());
        this.f294908e = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        android.widget.TextView textView = this.f294910g;
        android.text.TextPaint paint = textView.getPaint();
        paint.setStrokeWidth(ym5.x.a(getContext(), 4.0f));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        if (getCurrentTextColor() == -1 || getCurrentTextColor() == -16777216) {
            textView.setTextColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560146c8));
        } else {
            textView.setTextColor(com.p314xaae8f345.mm.ui.bk.n0(getCurrentTextColor(), -16777216, 0.5f));
        }
        textView.setGravity(getGravity());
        textView.setBreakStrategy(getBreakStrategy());
        textView.setTextSize(0, getTextSize());
    }

    public void c(android.graphics.Canvas canvas) {
        if (this.f294909f != 0) {
            canvas.saveLayerAlpha(null, (int) (getAlpha() * 255.0f), 31);
            int i17 = this.f294909f;
            android.graphics.Paint paint = this.f294907d;
            paint.setColor(i17);
            paint.setAntiAlias(true);
            android.graphics.Rect rect = new android.graphics.Rect();
            getLineBounds(0, rect);
            if (getLineCount() == 1) {
                rect.right = (int) (rect.left + getLayout().getLineWidth(0));
            } else {
                float f17 = 0.0f;
                for (int i18 = 0; i18 < getLineCount(); i18++) {
                    float lineWidth = getLayout().getLineWidth(i18);
                    if (f17 < lineWidth) {
                        f17 = lineWidth;
                    }
                }
                rect.right = (int) (rect.left + f17);
                rect.bottom = rect.top + getLayout().getLineBottom(getLineCount() - 1);
            }
            rect.left = (int) (rect.left - 18.0f);
            rect.right = (int) (rect.right + 18.0f);
            if (getLineCount() != 1) {
                paint.setXfermode(null);
                paint.setColor(this.f294909f);
                canvas.drawRoundRect(new android.graphics.RectF(rect), 12.0f, 12.0f, paint);
                if (getLayout().getLineWidth(getLineCount() - 1) < getLayout().getLineWidth(getLineCount() - 2)) {
                    paint.setXfermode(this.f294908e);
                    android.graphics.RectF rectF = new android.graphics.RectF();
                    rectF.left = rect.left + 36.0f + getLayout().getLineWidth(getLineCount() - 1);
                    rectF.top = rect.bottom - getLineHeight();
                    rectF.right = rect.right + 18.0f;
                    rectF.bottom = rect.bottom + 18.0f;
                    canvas.drawRoundRect(rectF, 12.0f, 12.0f, paint);
                    paint.setXfermode(this.f294908e);
                    canvas.drawRect(new android.graphics.Rect((int) (rectF.left - (getTextSize() / 2.0f)), (int) (rectF.bottom - (getTextSize() / 2.0f)), (int) rectF.left, (int) rectF.bottom), paint);
                    canvas.drawRect(new android.graphics.Rect((int) (rect.right - (getTextSize() / 2.0f)), (int) ((rect.top + getLayout().getLineBottom(getLineCount() - 2)) - (getTextSize() / 2.0f)), rect.right, rect.top + getLayout().getLineBottom(getLineCount() - 2) + 3), paint);
                    paint.setXfermode(null);
                    float textSize = rectF.left - getTextSize();
                    int i19 = rect.left;
                    if (textSize < i19) {
                        textSize = i19;
                    }
                    canvas.drawRoundRect(new android.graphics.RectF(new android.graphics.Rect((int) textSize, (int) (rect.bottom - (getTextSize() / 2.0f)), (int) rectF.left, rect.bottom)), 12.0f, 12.0f, paint);
                    canvas.drawRoundRect(new android.graphics.RectF(new android.graphics.Rect((int) (rect.right - getTextSize()), (int) ((rect.bottom - getLineHeight()) - getTextSize()), rect.right, rect.bottom - getLineHeight())), 12.0f, 12.0f, paint);
                }
            } else if (!android.text.TextUtils.isEmpty(getText())) {
                paint.setXfermode(null);
                canvas.drawRoundRect(new android.graphics.RectF(rect), 12.0f, 12.0f, paint);
            }
            canvas.restore();
        }
    }

    /* renamed from: getTextBgColor */
    public int m82624x9b8ff2fb() {
        return this.f294909f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (getLayout() == null) {
            super.onDraw(canvas);
            return;
        }
        c(canvas);
        if (this.f294911h) {
            android.widget.TextView textView = this.f294910g;
            textView.draw(canvas);
            textView.getPaint().getStyle().name();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.layout(i17, i18, i19, i27);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            java.lang.CharSequence text = textView.getText();
            if (text == null || !text.equals(getText())) {
                textView.setText(getText());
                postInvalidate();
            }
            textView.measure(i17, i18);
        }
    }

    /* renamed from: setEnableStoke */
    public void m82625x1a689683(boolean z17) {
        this.f294911h = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i17) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setMaxWidth(i17);
        }
        super.setMaxWidth(i17);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setPadding(i17, i18, i19, i27);
        }
        super.setPadding(i17, i18, i19, i27);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setSingleLine(z17);
        }
        super.setSingleLine(z17);
    }

    /* renamed from: setTextBackground */
    public void mo82626x630fd73d(int i17) {
        this.f294909f = i17;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            if (i17 == -1 || i17 == -16777216) {
                textView.setTextColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560146c8));
            } else {
                textView.setTextColor(com.p314xaae8f345.mm.ui.bk.n0(i17, -16777216, 0.5f));
            }
        }
        super.setTextColor(i17);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f17) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setTextSize(f17);
        }
        super.setTextSize(f17);
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface, int i17) {
        android.widget.TextView textView = this.f294910g;
        if (textView != null) {
            textView.setTypeface(typeface, i17);
        }
        super.setTypeface(typeface, i17);
    }

    public C22795x96919289(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294907d = new android.graphics.Paint(1);
        this.f294911h = false;
        this.f294910g = new android.widget.TextView(context, attributeSet);
        b();
    }
}
