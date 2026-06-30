package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "visibility", "Ljz5/f0;", "setVisibility", "", "getDesiredWidth", "h", "I", "getWIDTH_BROADEN", "()I", "WIDTH_BROADEN", "", "i", "Z", "getMeasureWidthGrowthOnly", "()Z", "setMeasureWidthGrowthOnly", "(Z)V", "measureWidthGrowthOnly", "m", "getCacheMeasureWidth", "setCacheMeasureWidth", "(I)V", "cacheMeasureWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView */
/* loaded from: classes3.dex */
public final class C14323xd3329234 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f197489g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int WIDTH_BROADEN;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean measureWidthGrowthOnly;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int cacheMeasureWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14323xd3329234(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197489g = "Finder.FinderLiveGiftTextView";
        this.WIDTH_BROADEN = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2.0f);
    }

    public final int getCacheMeasureWidth() {
        return this.cacheMeasureWidth;
    }

    /* renamed from: getDesiredWidth */
    public final float m57349x7e5c41c2() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        return android.text.Layout.getDesiredWidth(getText().toString(), getPaint()) + this.WIDTH_BROADEN + getPaddingLeft() + getPaddingRight() + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
    }

    public final boolean getMeasureWidthGrowthOnly() {
        return this.measureWidthGrowthOnly;
    }

    public final int getWIDTH_BROADEN() {
        return this.WIDTH_BROADEN;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int measuredWidth = getMeasuredWidth();
        if (this.measureWidthGrowthOnly) {
            int measuredWidth2 = getMeasuredWidth();
            int i19 = this.cacheMeasureWidth;
            if (measuredWidth2 > i19) {
                this.cacheMeasureWidth = getMeasuredWidth();
            } else {
                measuredWidth = i19;
            }
        }
        setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth + this.WIDTH_BROADEN, android.view.View.MeasureSpec.getMode(i17)), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), android.view.View.MeasureSpec.getMode(i18)));
        zl2.r4.f555483a.M2(this.f197489g, "measureWidthGrowthOnly:" + this.measureWidthGrowthOnly + ", measuredWidth:" + getMeasuredWidth() + "-cacheMeasureWidth:" + this.cacheMeasureWidth + ",measuredHeight:" + getMeasuredHeight());
    }

    /* renamed from: setCacheMeasureWidth */
    public final void m57352x6765a768(int i17) {
        this.cacheMeasureWidth = i17;
    }

    /* renamed from: setMeasureWidthGrowthOnly */
    public final void m57353x4a85423d(boolean z17) {
        this.measureWidthGrowthOnly = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        this.cacheMeasureWidth = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14323xd3329234(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197489g = "Finder.FinderLiveGiftTextView";
        this.WIDTH_BROADEN = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14323xd3329234(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197489g = "Finder.FinderLiveGiftTextView";
        this.WIDTH_BROADEN = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2.0f);
    }
}
