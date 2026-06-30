package com.tencent.mm.plugin.finder.feed.alpha.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/alpha/view/FinderFeedEnableAlphaConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrc2/g;", "", "clickable", "Ljz5/f0;", "setAlphaClickable", "", "getEnableAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedEnableAlphaConstraintLayout extends androidx.constraintlayout.widget.ConstraintLayout implements rc2.g {

    /* renamed from: v, reason: collision with root package name */
    public boolean f106304v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f106305w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f106306x;

    /* renamed from: y, reason: collision with root package name */
    public float f106307y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedEnableAlphaConstraintLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f106304v = true;
        this.f106305w = true;
        this.f106306x = true;
        this.f106307y = 1.0f;
        A(attrs, 0);
    }

    public final void A(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f318747a, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f106305w = obtainStyledAttributes.getBoolean(0, true);
        this.f106306x = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // rc2.g
    public void a(float f17) {
        setAlpha(f17);
        this.f106307y = f17;
    }

    @Override // rc2.g
    /* renamed from: e, reason: from getter */
    public boolean getF106305w() {
        return this.f106305w;
    }

    @Override // rc2.g
    /* renamed from: getEnableAlpha, reason: from getter */
    public float getF106307y() {
        return this.f106307y;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f106304v) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // rc2.g
    /* renamed from: s, reason: from getter */
    public boolean getF106306x() {
        return this.f106306x;
    }

    @Override // rc2.g
    public void setAlphaClickable(boolean z17) {
        this.f106304v = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedEnableAlphaConstraintLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f106304v = true;
        this.f106305w = true;
        this.f106306x = true;
        this.f106307y = 1.0f;
        A(attrs, i17);
    }
}
