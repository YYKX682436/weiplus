package com.p314xaae8f345.mm.p2816xed9644dc.p2817x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/wepicker/view/PickerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "g", "I", "getPTextSelectColor", "()I", "setPTextSelectColor", "(I)V", "pTextSelectColor", "h", "getPTextColor", "setPTextColor", "pTextColor", "", "i", "Z", "getPTextSelectMedium", "()Z", "setPTextSelectMedium", "(Z)V", "pTextSelectMedium", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.wepicker.view.PickerTextView */
/* loaded from: classes3.dex */
public final class C22937xcdd26040 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int pTextSelectColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int pTextColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean pTextSelectMedium;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f295873m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22937xcdd26040(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int getPTextColor() {
        return this.pTextColor;
    }

    public final int getPTextSelectColor() {
        return this.pTextSelectColor;
    }

    public final boolean getPTextSelectMedium() {
        return this.pTextSelectMedium;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.pTextColor == this.pTextSelectColor) {
            super.onDraw(canvas);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(getParent(), "null cannot be cast to non-null type android.view.View");
        float measuredHeight = ((android.view.View) r0).getMeasuredHeight() / 2.0f;
        float measuredHeight2 = measuredHeight - (getMeasuredHeight() / 2.0f);
        float measuredHeight3 = measuredHeight + (getMeasuredHeight() / 2.0f);
        float y17 = getY();
        android.graphics.RectF rectF = this.f295873m;
        if (y17 < measuredHeight2 && getY() + getMeasuredHeight() > measuredHeight2) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth() / 1.0f, measuredHeight2 - getY());
        } else if (getY() >= measuredHeight3 || getY() + getMeasuredHeight() <= measuredHeight3) {
            if (getY() == measuredHeight2) {
                if (getY() + ((float) getMeasuredHeight()) == measuredHeight3) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            rectF.set(0.0f, 0.0f, getMeasuredWidth() / 1.0f, getMeasuredHeight() / 1.0f);
        } else {
            rectF.set(0.0f, measuredHeight3 - getY(), getMeasuredWidth() / 1.0f, getMeasuredHeight() / 1.0f);
        }
        if (this.pTextSelectMedium) {
            getPaint().setStyle(android.graphics.Paint.Style.FILL);
            getPaint().setStrokeWidth(1.0f);
        }
        canvas.save();
        canvas.clipRect(rectF);
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (getY() < measuredHeight2 && getY() + getMeasuredHeight() > measuredHeight2) {
            rectF.set(0.0f, measuredHeight2 - getY(), getMeasuredWidth() / 1.0f, getMeasuredHeight() / 1.0f);
        } else if (getY() >= measuredHeight3 || getY() + getMeasuredHeight() <= measuredHeight3) {
            if (getY() == measuredHeight2) {
                if (getY() + ((float) getMeasuredHeight()) == measuredHeight3) {
                    rectF.set(0.0f, 0.0f, getMeasuredWidth() / 1.0f, getMeasuredHeight() / 1.0f);
                }
            }
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth() / 1.0f, measuredHeight3 - getY());
        }
        canvas.clipRect(rectF);
        java.lang.reflect.Method declaredMethod = android.widget.TextView.class.getDeclaredMethod("getVerticalOffset", java.lang.Boolean.TYPE);
        declaredMethod.setAccessible(true);
        canvas.translate(0.0f, getExtendedPaddingTop() + java.lang.Float.parseFloat(java.lang.String.valueOf(declaredMethod.invoke(this, java.lang.Boolean.FALSE))));
        getPaint().setColor(this.pTextSelectColor);
        if (this.pTextSelectMedium) {
            getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            getPaint().setStrokeWidth(1.25f);
        }
        getLayout().draw(canvas);
        canvas.restore();
    }

    /* renamed from: setPTextColor */
    public final void m83493x3493d1a8(int i17) {
        this.pTextColor = i17;
    }

    /* renamed from: setPTextSelectColor */
    public final void m83494x4cc3e24c(int i17) {
        this.pTextSelectColor = i17;
    }

    /* renamed from: setPTextSelectMedium */
    public final void m83495x5c3839ac(boolean z17) {
        this.pTextSelectMedium = z17;
    }

    public /* synthetic */ C22937xcdd26040(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22937xcdd26040(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.pTextSelectColor = -16777216;
        this.pTextColor = -16777216;
        this.f295873m = new android.graphics.RectF();
    }
}
