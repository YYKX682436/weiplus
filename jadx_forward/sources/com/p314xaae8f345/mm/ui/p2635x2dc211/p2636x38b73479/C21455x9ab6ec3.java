package com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/tencent/mm/ui/anim/content/AnimTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "g", "Ljava/lang/String;", "getTText", "()Ljava/lang/String;", "setTText", "(Ljava/lang/String;)V", "tText", "", "h", "I", "getTTextColor", "()I", "setTTextColor", "(I)V", "tTextColor", "i", "getTPaddingLeft", "setTPaddingLeft", "tPaddingLeft", "m", "getTPaddingRight", "setTPaddingRight", "tPaddingRight", "n", "getTBackgroundRes", "setTBackgroundRes", "tBackgroundRes", "", "o", "Z", "getTBackgroundShow", "()Z", "setTBackgroundShow", "(Z)V", "tBackgroundShow", "", "p", "J", "getTDuration", "()J", "setTDuration", "(J)V", "tDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.anim.content.AnimTextView */
/* loaded from: classes5.dex */
public final class C21455x9ab6ec3 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.lang.String tText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int tTextColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int tPaddingLeft;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int tPaddingRight;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int tBackgroundRes;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean tBackgroundShow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long tDuration;

    /* renamed from: q, reason: collision with root package name */
    public boolean f278712q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21455x9ab6ec3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.tText = "";
        this.tBackgroundRes = -1;
    }

    public final void b(boolean z17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getText().toString(), this.tText)) {
            return;
        }
        int width = getWidth();
        setText(this.tText);
        setTextColor(this.tTextColor);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        android.graphics.drawable.Drawable background = getBackground();
        int alpha = background != null ? background.getAlpha() : 0;
        int i17 = this.tPaddingLeft;
        int i18 = this.tPaddingRight;
        int i19 = this.tBackgroundShow ? 255 : 0;
        setPadding(i17, getPaddingTop(), i18, getPaddingBottom());
        getLayoutParams().width = -2;
        setBackgroundResource(this.tBackgroundRes);
        android.graphics.drawable.Drawable background2 = getBackground();
        if (background2 != null) {
            background2.setAlpha(i19);
        }
        if (!z17) {
            setLayoutParams(getLayoutParams());
            return;
        }
        measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getMeasuredWidth();
        this.f278712q = true;
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(this.tDuration);
        animate.setUpdateListener(new qa5.a(width, measuredWidth, this, paddingLeft, i17, paddingRight, i18, alpha, i19));
        animate.setListener(new qa5.b(this));
        animate.start();
    }

    public final int getTBackgroundRes() {
        return this.tBackgroundRes;
    }

    public final boolean getTBackgroundShow() {
        return this.tBackgroundShow;
    }

    public final long getTDuration() {
        return this.tDuration;
    }

    public final int getTPaddingLeft() {
        return this.tPaddingLeft;
    }

    public final int getTPaddingRight() {
        return this.tPaddingRight;
    }

    public final java.lang.String getTText() {
        return this.tText;
    }

    public final int getTTextColor() {
        return this.tTextColor;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f278712q) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f278712q) {
            return true;
        }
        return super.performClick();
    }

    /* renamed from: setTBackgroundRes */
    public final void m78836xcdce7580(int i17) {
        this.tBackgroundRes = i17;
    }

    /* renamed from: setTBackgroundShow */
    public final void m78837xec00ba1d(boolean z17) {
        this.tBackgroundShow = z17;
    }

    /* renamed from: setTDuration */
    public final void m78838x17e22fe6(long j17) {
        this.tDuration = j17;
    }

    /* renamed from: setTPaddingLeft */
    public final void m78839x1daa0426(int i17) {
        this.tPaddingLeft = i17;
    }

    /* renamed from: setTPaddingRight */
    public final void m78840x97ece1dd(int i17) {
        this.tPaddingRight = i17;
    }

    /* renamed from: setTText */
    public final void m78841x53b6207f(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.tText = str;
    }

    /* renamed from: setTTextColor */
    public final void m78842x5b99624(int i17) {
        this.tTextColor = i17;
    }
}
