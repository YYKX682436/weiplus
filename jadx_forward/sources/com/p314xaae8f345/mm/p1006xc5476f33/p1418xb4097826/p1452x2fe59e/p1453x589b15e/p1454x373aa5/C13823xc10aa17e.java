package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1453x589b15e.p1454x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/alpha/view/FinderFeedEnableAlphaConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrc2/g;", "", "clickable", "Ljz5/f0;", "setAlphaClickable", "", "getEnableAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.alpha.view.FinderFeedEnableAlphaConstraintLayout */
/* loaded from: classes2.dex */
public final class C13823xc10aa17e extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 implements rc2.g {

    /* renamed from: v, reason: collision with root package name */
    public boolean f187837v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f187838w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f187839x;

    /* renamed from: y, reason: collision with root package name */
    public float f187840y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13823xc10aa17e(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f187837v = true;
        this.f187838w = true;
        this.f187839x = true;
        this.f187840y = 1.0f;
        A(attrs, 0);
    }

    public final void A(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f400280a, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f187838w = obtainStyledAttributes.getBoolean(0, true);
        this.f187839x = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // rc2.g
    public void a(float f17) {
        setAlpha(f17);
        this.f187840y = f17;
    }

    @Override // rc2.g
    /* renamed from: e, reason: from getter */
    public boolean getF187838w() {
        return this.f187838w;
    }

    @Override // rc2.g
    /* renamed from: getEnableAlpha, reason: from getter */
    public float getF187840y() {
        return this.f187840y;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f187837v) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // rc2.g
    /* renamed from: s, reason: from getter */
    public boolean getF187839x() {
        return this.f187839x;
    }

    @Override // rc2.g
    /* renamed from: setAlphaClickable */
    public void mo56030x57aaa426(boolean z17) {
        this.f187837v = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13823xc10aa17e(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f187837v = true;
        this.f187838w = true;
        this.f187839x = true;
        this.f187840y = 1.0f;
        A(attrs, i17);
    }
}
