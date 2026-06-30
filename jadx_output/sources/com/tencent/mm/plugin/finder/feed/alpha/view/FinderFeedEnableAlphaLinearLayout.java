package com.tencent.mm.plugin.finder.feed.alpha.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/alpha/view/FinderFeedEnableAlphaLinearLayout;", "Landroid/widget/LinearLayout;", "Lrc2/g;", "", "clickable", "Ljz5/f0;", "setAlphaClickable", "", "getEnableAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedEnableAlphaLinearLayout extends android.widget.LinearLayout implements rc2.g {

    /* renamed from: d, reason: collision with root package name */
    public boolean f106308d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106309e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f106310f;

    /* renamed from: g, reason: collision with root package name */
    public float f106311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedEnableAlphaLinearLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f106308d = true;
        this.f106309e = true;
        this.f106310f = true;
        this.f106311g = 1.0f;
        b(attrs, 0);
    }

    @Override // rc2.g
    public void a(float f17) {
        setAlpha(f17);
        this.f106311g = f17;
    }

    public final void b(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f318747a, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f106309e = obtainStyledAttributes.getBoolean(0, true);
        this.f106310f = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // rc2.g
    /* renamed from: e, reason: from getter */
    public boolean getF106309e() {
        return this.f106309e;
    }

    @Override // rc2.g
    /* renamed from: getEnableAlpha, reason: from getter */
    public float getF106311g() {
        return this.f106311g;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f106308d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // rc2.g
    /* renamed from: s, reason: from getter */
    public boolean getF106310f() {
        return this.f106310f;
    }

    @Override // rc2.g
    public void setAlphaClickable(boolean z17) {
        this.f106308d = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedEnableAlphaLinearLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f106308d = true;
        this.f106309e = true;
        this.f106310f = true;
        this.f106311g = 1.0f;
        b(attrs, i17);
    }
}
