package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoSeekTimeView;", "Landroid/widget/LinearLayout;", "", "color", "Ljz5/f0;", "setTextColor", "setHintTextColor", "sec", "setSumTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoSeekTimeView */
/* loaded from: classes2.dex */
public final class C15197x65e4c61f extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f212260d;

    /* renamed from: e, reason: collision with root package name */
    public int f212261e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f212262f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f212263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15197x65e4c61f(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212260d = Integer.MIN_VALUE;
        this.f212261e = Integer.MIN_VALUE;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f212262f = textView;
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f212263g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        b(attrs, 0);
    }

    public final java.lang.String a(int i17) {
        long j17 = i17;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public final void b(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b92.w2.f100086j, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f212260d = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        this.f212261e = obtainStyledAttributes.getColor(0, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            float f17 = dimensionPixelSize;
            this.f212262f.setTextSize(0, f17);
            this.f212263g.setTextSize(0, f17);
        }
        int i18 = this.f212260d;
        if (i18 != Integer.MIN_VALUE) {
            m61519x1c5c5ff4(i18);
        }
        int i19 = this.f212261e;
        if (i19 != Integer.MIN_VALUE) {
            m61517x40e6fa2d(i19);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: setCurrentTime */
    public final void m61516x9411da24(int i17) {
        this.f212262f.setText(a(i17));
    }

    /* renamed from: setHintTextColor */
    public final void m61517x40e6fa2d(int i17) {
        this.f212263g.setTextColor(i17);
    }

    /* renamed from: setSumTime */
    public final void m61518x4279f0f6(int i17) {
        this.f212263g.setText(" / ".concat(a(i17)));
    }

    /* renamed from: setTextColor */
    public final void m61519x1c5c5ff4(int i17) {
        this.f212262f.setTextColor(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15197x65e4c61f(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212260d = Integer.MIN_VALUE;
        this.f212261e = Integer.MIN_VALUE;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f212262f = textView;
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f212263g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        b(attrs, i17);
    }
}
