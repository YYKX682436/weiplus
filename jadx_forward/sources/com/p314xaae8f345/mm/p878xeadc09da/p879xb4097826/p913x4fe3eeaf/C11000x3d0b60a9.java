package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/RoundFrameLayout;", "Landroid/widget/FrameLayout;", "", "backgroundColor", "Ljz5/f0;", nd1.s0.f72974x24728b, "borderColor", "setBorderColor", "strokeWidth", "setBorderStrokeWidth", "getCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.RoundFrameLayout */
/* loaded from: classes13.dex */
public final class C11000x3d0b60a9 extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f151221i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f151222d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f151223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f151224f;

    /* renamed from: g, reason: collision with root package name */
    public int f151225g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f151226h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11000x3d0b60a9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        int i17;
        android.content.res.ColorStateList colorStateList = this.f151222d;
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(-65536);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(colorStateList, "valueOf(...)");
        }
        this.f151222d = colorStateList;
        android.content.res.ColorStateList colorStateList2 = this.f151223e;
        if (colorStateList2 == null) {
            colorStateList2 = android.content.res.ColorStateList.valueOf(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(colorStateList2, "valueOf(...)");
        }
        this.f151223e = colorStateList2;
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[]{-16842910}, new int[0]};
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int i18 = 0;
        while (true) {
            i17 = this.f151224f;
            if (i18 >= 4) {
                break;
            }
            int[] iArr2 = iArr[i18];
            int colorForState = colorStateList.getColorForState(iArr2, 0);
            int colorForState2 = colorStateList2.getColorForState(iArr2, 0);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            if (i17 == 0) {
                i17 = getHeight() >> 1;
            }
            gradientDrawable.setCornerRadius(i17);
            gradientDrawable.setColor(colorForState);
            gradientDrawable.setStroke(this.f151225g, colorForState2);
            stateListDrawable.addState(iArr2, gradientDrawable);
            i18++;
        }
        setBackground(stateListDrawable);
        if (i17 <= 0 || !this.f151226h) {
            setClipToOutline(false);
        } else {
            setOutlineProvider(new dy0.l(this));
            setClipToOutline(true);
        }
    }

    /* renamed from: getCornerRadius, reason: from getter */
    public final int getF151224f() {
        return this.f151224f;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f151222d = android.content.res.ColorStateList.valueOf(i17);
        a();
        requestLayout();
    }

    /* renamed from: setBorderColor */
    public final void m47419x9b5140d5(int i17) {
        this.f151223e = android.content.res.ColorStateList.valueOf(i17);
        a();
        requestLayout();
    }

    /* renamed from: setBorderStrokeWidth */
    public final void m47420x794e9e60(int i17) {
        this.f151225g = i17;
        a();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11000x3d0b60a9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f339355i, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        android.content.res.ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(3);
        this.f151222d = colorStateList == null ? android.content.res.ColorStateList.valueOf(0) : colorStateList;
        android.content.res.ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(4);
        this.f151223e = colorStateList2 == null ? android.content.res.ColorStateList.valueOf(0) : colorStateList2;
        this.f151224f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f151225g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f151226h = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        post(new dy0.k(this));
    }
}
