package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AddressView */
/* loaded from: classes13.dex */
public class C21338x1152d899 extends android.view.View implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a0 {
    private static final java.lang.String TAG = "MicroMsg.AddressView";

    /* renamed from: AVATAR_LAYOUT_WIDTH */
    public final int f39261xb26fed77;

    /* renamed from: AVATAR_PADDING */
    public final int f39262x5456bb0b;

    /* renamed from: AVATAR_START_POS */
    public final int f39263x85ebd551;

    /* renamed from: AVATAR_WIDTH */
    public final int f39264x9efd2740;

    /* renamed from: COMMON_PADDING */
    public final int f39265xe782719d;

    /* renamed from: DESCRIPTION_PADDING */
    public final int f39266x989cea8e;

    /* renamed from: DESCRIPTION_TEXT_SIZE */
    public final float f39267x14257730;

    /* renamed from: NAME_RIGHT_PADDING */
    private int f39268x75af1fa;

    /* renamed from: NAME_TEXT_SIZE */
    public final float f39269xe42e831f;

    /* renamed from: TEXT_TOP_PADDING */
    public final int f39270x188aeed5;

    /* renamed from: WEIBO_ICON_SIZE */
    public final int f39271x58505550;

    /* renamed from: avatarDrawable */
    android.graphics.drawable.Drawable f39272x50433d17;

    /* renamed from: context */
    android.content.Context f39273x38b735af;

    /* renamed from: density */
    float f39274x5c8c94e8;

    /* renamed from: description */
    java.lang.String f39275x993583fc;

    /* renamed from: descriptionFontMetrics */
    private android.graphics.Paint.FontMetrics f39276x842bb3d8;

    /* renamed from: descriptionPaint */
    private android.text.TextPaint f39277x1d5ea1c2;

    /* renamed from: destNickName */
    java.lang.CharSequence f39278xb3a1bd50;

    /* renamed from: displayNamePaint */
    private android.text.TextPaint f39279xa85f2df1;

    /* renamed from: drawable */
    android.graphics.drawable.Drawable f39280xcebc809e;

    /* renamed from: fm, reason: collision with root package name */
    private android.graphics.Paint.FontMetrics f278083fm;

    /* renamed from: layout */
    android.text.StaticLayout f39281xbddafb2a;

    /* renamed from: mergeCallback */
    com.p314xaae8f345.mm.ui.l f39282xa6da709d;

    /* renamed from: nameIsSpanned */
    boolean f39283x9ef8f2e;

    /* renamed from: needInvaildate */
    boolean f39284x5e180f17;

    /* renamed from: needMask */
    android.graphics.drawable.BitmapDrawable f39285x3395c8a2;

    /* renamed from: needUpdatePostion */
    boolean f39286x14e12169;

    /* renamed from: nickName */
    java.lang.CharSequence f39287x4281c8e;

    /* renamed from: nickNameCurrentTextColor */
    private int f39288xd8ea2d6b;

    /* renamed from: nickNameHeight */
    int f39289x4cf57755;

    /* renamed from: nickNameTextColor */
    private android.content.res.ColorStateList f39290xea017148;

    /* renamed from: nickNameWidth */
    int f39291x13d4c9d8;

    /* renamed from: nickNamelayout */
    android.text.StaticLayout f39292x8a32f538;

    public C21338x1152d899(android.content.Context context) {
        this(context, null, 0);
    }

    /* renamed from: generateDescriptionPaint */
    private android.text.TextPaint m78346x53e37157() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f39267x14257730);
        textPaint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        return textPaint;
    }

    /* renamed from: generateOnePaint */
    private android.text.TextPaint m78347xdea29e2d() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f39269xe42e831f);
        textPaint.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        return textPaint;
    }

    /* renamed from: getFontMetrics */
    private android.graphics.Paint.FontMetrics m78348x7c6eec3e() {
        if (this.f39279xa85f2df1 == null) {
            this.f39279xa85f2df1 = m78347xdea29e2d();
        }
        if (this.f278083fm == null) {
            this.f278083fm = this.f39279xa85f2df1.getFontMetrics();
        }
        return this.f278083fm;
    }

    /* renamed from: getShowAreaWidth */
    private int m78349x90b0cb06() {
        return (m78358xc74cd6d6() - getPaddingLeft()) - this.f39268x75af1fa;
    }

    /* renamed from: installAccessibilityDelegate */
    private void m78350x89691e18() {
        n3.l1.l(this, new com.p314xaae8f345.mm.ui.k(this));
    }

    /* renamed from: doInvalidate */
    public void m78351x9a302826() {
        invalidate();
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        m78369x64706a6();
        super.drawableStateChanged();
    }

    /* renamed from: fromDPToPix */
    public int m78352x3adea90e(android.content.Context context, int i17) {
        return java.lang.Math.round(m78353x9a59d0b2(context) * i17);
    }

    /* renamed from: getDensity */
    public float m78353x9a59d0b2(android.content.Context context) {
        if (context == null) {
            context = getContext();
        }
        if (this.f39274x5c8c94e8 < 0.0f) {
            this.f39274x5c8c94e8 = context.getResources().getDisplayMetrics().density;
        }
        return this.f39274x5c8c94e8;
    }

    /* renamed from: getDesiredWidth */
    public float m78354x7e5c41c2(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        if (charSequence instanceof android.text.Spanned) {
            return android.text.Layout.getDesiredWidth(charSequence, textPaint);
        }
        if (charSequence == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "source is null, set it empty.");
            charSequence = "";
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: getDrawable */
    public android.graphics.drawable.Drawable m78355x4a96be14() {
        return this.f39272x50433d17;
    }

    /* renamed from: getNickName */
    public java.lang.CharSequence m78356x80025a04() {
        return this.f39287x4281c8e;
    }

    /* renamed from: getNickNameSize */
    public float m78357xa3a50c25() {
        return this.f39269xe42e831f;
    }

    /* renamed from: getTextAreaWidth */
    public int m78358xc74cd6d6() {
        return (getMeasuredWidth() - this.f39261xb26fed77) - this.f39262x5456bb0b;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        super.onDraw(canvas);
        m78367x60705d12();
        android.graphics.drawable.Drawable drawable = this.f39272x50433d17;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f39285x3395c8a2;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
        if (this.f39283x9ef8f2e) {
            canvas.save();
            canvas.translate(this.f39261xb26fed77 + this.f39262x5456bb0b, (getHeight() - this.f39289x4cf57755) / 2);
            this.f39292x8a32f538.draw(canvas);
            canvas.restore();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f39275x993583fc)) {
            java.lang.CharSequence charSequence = this.f39278xb3a1bd50;
            if (charSequence != null) {
                int length = charSequence.length();
                float f17 = this.f39261xb26fed77 + this.f39262x5456bb0b;
                float height = getHeight();
                android.graphics.Paint.FontMetrics fontMetrics = this.f278083fm;
                float f18 = fontMetrics.bottom;
                float f19 = fontMetrics.top;
                canvas.drawText(charSequence, 0, length, f17, ((height - (f18 - f19)) / 2.0f) - f19, this.f39279xa85f2df1);
                return;
            }
            return;
        }
        java.lang.CharSequence charSequence2 = this.f39278xb3a1bd50;
        if (charSequence2 != null) {
            int length2 = charSequence2.length();
            float f27 = this.f39261xb26fed77 + this.f39262x5456bb0b;
            float height2 = getHeight();
            android.graphics.Paint.FontMetrics fontMetrics2 = this.f278083fm;
            float f28 = fontMetrics2.bottom;
            float f29 = fontMetrics2.top;
            canvas.drawText(charSequence2, 0, length2, f27, this.f39270x188aeed5 + (((height2 - (f28 - f29)) / 2.0f) - (f29 / 3.0f)), this.f39279xa85f2df1);
            int width = getWidth();
            float measureText = this.f39277x1d5ea1c2.measureText(this.f39275x993583fc);
            java.lang.String str2 = this.f39275x993583fc;
            if (measureText > width - this.f39266x989cea8e) {
                int i17 = 1;
                while (i17 < this.f39275x993583fc.length()) {
                    java.lang.String substring = this.f39275x993583fc.substring(0, i17);
                    if (this.f39277x1d5ea1c2.measureText(substring) >= width - this.f39266x989cea8e) {
                        str = str2 + "...";
                        break;
                    }
                    i17++;
                    str2 = substring;
                }
            }
            str = str2;
            int length3 = str.length();
            float f37 = this.f39261xb26fed77 + this.f39262x5456bb0b;
            float height3 = getHeight();
            android.graphics.Paint.FontMetrics fontMetrics3 = this.f39276x842bb3d8;
            canvas.drawText(str, 0, length3, f37, this.f39270x188aeed5 + (((height3 - (fontMetrics3.bottom - fontMetrics3.top)) / 2.0f) - ((int) (r5 * 1.7d))), (android.graphics.Paint) this.f39277x1d5ea1c2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = this.f39287x4281c8e;
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence contentDescription = getContentDescription();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = this.f39287x4281c8e;
        }
        accessibilityEvent.getText().add(contentDescription);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a0
    /* renamed from: onScrollStateChanged */
    public void mo75389x4d79408f(boolean z17) {
        if (z17) {
            m78366x62dbef81();
        } else {
            m78359xc2adb5ec();
        }
    }

    /* renamed from: resumeAvatarLoad */
    public void m78359xc2adb5ec() {
        android.graphics.drawable.Drawable drawable = this.f39272x50433d17;
        if (drawable != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.x) drawable;
            if (xVar.f272431g) {
                xVar.f272431g = false;
                if (xVar.f272432h) {
                    xVar.f272432h = false;
                    xVar.invalidateSelf();
                }
            }
        }
    }

    /* renamed from: setDescription */
    public void m78360x9713e3a(java.lang.String str) {
        this.f39275x993583fc = str;
        if (this.f39277x1d5ea1c2 == null) {
            android.text.TextPaint m78346x53e37157 = m78346x53e37157();
            this.f39277x1d5ea1c2 = m78346x53e37157;
            this.f39276x842bb3d8 = m78346x53e37157.getFontMetrics();
        }
    }

    /* renamed from: setImageDrawable */
    public void m78361x706225d7(android.graphics.drawable.Drawable drawable) {
        this.f39272x50433d17 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* renamed from: setMaskBitmap */
    public void m78362x8a98093d(android.graphics.Bitmap bitmap) {
        this.f39285x3395c8a2 = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
    }

    /* renamed from: setMergeCallback */
    public void m78363xf710935b(com.p314xaae8f345.mm.ui.l lVar) {
        if (lVar != null) {
            this.f39284x5e180f17 = true;
        }
    }

    /* renamed from: setName */
    public void m78364x764daa0d(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2 = this.f39287x4281c8e;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            this.f39284x5e180f17 = true;
        }
        this.f39287x4281c8e = charSequence;
        this.f39283x9ef8f2e = charSequence instanceof android.text.Spanned;
        m78348x7c6eec3e();
    }

    /* renamed from: setNickNameTextColor */
    public void m78365x18cc0506(android.content.res.ColorStateList colorStateList) {
        this.f39290xea017148 = colorStateList;
    }

    /* renamed from: stopAvatarLoad */
    public void m78366x62dbef81() {
        android.graphics.drawable.Drawable drawable = this.f39272x50433d17;
        if (drawable != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.x) drawable).f272431g = true;
        }
    }

    /* renamed from: updatePosition */
    public void m78367x60705d12() {
        if (this.f39286x14e12169) {
            this.f39291x13d4c9d8 = (m78358xc74cd6d6() - getPaddingLeft()) - this.f39268x75af1fa;
            int m78354x7e5c41c2 = (int) m78354x7e5c41c2(this.f39287x4281c8e, this.f39279xa85f2df1);
            int i17 = this.f39291x13d4c9d8;
            if (m78354x7e5c41c2 > i17) {
                this.f39278xb3a1bd50 = android.text.TextUtils.ellipsize(this.f39287x4281c8e, this.f39279xa85f2df1, i17, android.text.TextUtils.TruncateAt.END);
            } else {
                java.lang.CharSequence charSequence = this.f39287x4281c8e;
                this.f39278xb3a1bd50 = charSequence;
                this.f39291x13d4c9d8 = (int) m78354x7e5c41c2(charSequence, this.f39279xa85f2df1);
            }
            if (this.f39287x4281c8e instanceof android.text.Spanned) {
                android.text.StaticLayout staticLayout = new android.text.StaticLayout(this.f39278xb3a1bd50, this.f39279xa85f2df1, getWidth(), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                this.f39292x8a32f538 = staticLayout;
                this.f39289x4cf57755 = staticLayout.getHeight();
            } else {
                this.f39292x8a32f538 = null;
                android.graphics.Paint.FontMetrics m78348x7c6eec3e = m78348x7c6eec3e();
                this.f39289x4cf57755 = ((int) java.lang.Math.ceil(m78348x7c6eec3e.descent - m78348x7c6eec3e.top)) + 2;
            }
            this.f39286x14e12169 = false;
        }
    }

    /* renamed from: updatePositionFlag */
    public void m78368xc818f79e() {
        this.f39286x14e12169 = true;
        if (this.f39284x5e180f17) {
            invalidate();
            this.f39284x5e180f17 = false;
        }
    }

    /* renamed from: updateTextColors */
    public void m78369x64706a6() {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.f39290xea017148;
        if (colorStateList == null || (colorForState = colorStateList.getColorForState(getDrawableState(), 0)) == this.f39288xd8ea2d6b) {
            return;
        }
        this.f39288xd8ea2d6b = colorForState;
        if (this.f39279xa85f2df1 == null) {
            this.f39279xa85f2df1 = m78347xdea29e2d();
        }
        this.f39279xa85f2df1.setColor(this.f39288xd8ea2d6b);
    }

    public C21338x1152d899(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21338x1152d899(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f39280xcebc809e = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563634bn4);
        this.f39286x14e12169 = true;
        this.f39261xb26fed77 = 0;
        this.f39264x9efd2740 = 0;
        this.f39269xe42e831f = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        this.f39267x14257730 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        this.f39271x58505550 = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561455j1);
        this.f39263x85ebd551 = 0;
        this.f39262x5456bb0b = 0;
        this.f39265xe782719d = 0;
        this.f39266x989cea8e = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561403hj) * 2;
        this.f39270x188aeed5 = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f39268x75af1fa = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561094d);
        if (this.f39279xa85f2df1 == null) {
            this.f39279xa85f2df1 = m78347xdea29e2d();
        }
    }
}
