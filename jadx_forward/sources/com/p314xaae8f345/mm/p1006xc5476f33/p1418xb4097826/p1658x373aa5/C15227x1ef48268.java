package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderAuthorAreaLayout;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getFollowBtnMargin", "()I", "followBtnMargin", "", "e", "Z", "isShrinkText", "()Z", "setShrinkText", "(Z)V", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "f", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "feed", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleInt", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout */
/* loaded from: classes2.dex */
public final class C15227x1ef48268 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g followBtnMargin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShrinkText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15227x1ef48268(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.followBtnMargin = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h2.f213737d);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 getFeed() {
        return this.feed;
    }

    /* renamed from: getFollowBtnMargin */
    public final int m61644x2c0a0843() {
        return ((java.lang.Number) this.followBtnMargin.mo141623x754a37bb()).intValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gac);
        if (findViewById.getVisibility() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629 c15219x2dffe629 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629) findViewById(com.p314xaae8f345.mm.R.id.a8p);
            if (c15219x2dffe629.b()) {
                if (!this.isShrinkText) {
                    this.isShrinkText = true;
                    c15219x2dffe629.setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
                    measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    layout(i17, i18, i19, i27);
                    return;
                }
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.che);
                int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 c15221x8467a6e1 = findViewById2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1) findViewById2 : null;
                if (c15221x8467a6e1 != null) {
                    int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1.f212385n;
                    c15221x8467a6e1.b(dimensionPixelOffset, 0L, 0);
                    return;
                }
                return;
            }
            return;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.dzo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629 c15219x2dffe6292 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15219x2dffe629) findViewById(com.p314xaae8f345.mm.R.id.a8p);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.che);
        int right = findViewById3.getRight() + m61644x2c0a0843() + findViewById.getMeasuredWidth();
        if (right > getMeasuredWidth()) {
            if (!this.isShrinkText) {
                this.isShrinkText = true;
                c15219x2dffe6292.setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
                measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                layout(i17, i18, i19, i27);
                return;
            }
            int measuredWidth = right - getMeasuredWidth();
            int width = findViewById.getWidth();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gh ghVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kh.f216500d;
            int intValue = width + ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kh.f216501e).mo141623x754a37bb()).intValue() + measuredWidth;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 c15221x8467a6e12 = findViewById4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15221x8467a6e1) findViewById4 : null;
            if (c15221x8467a6e12 != null) {
                c15221x8467a6e12.b(intValue, 0L, measuredWidth);
            }
            right = getMeasuredWidth();
        }
        findViewById.layout(right - findViewById.getMeasuredWidth(), findViewById.getTop(), right, findViewById.getBottom());
    }

    /* renamed from: setFeed */
    public final void m61645x764a1520(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.feed = abstractC14490x69736cb5;
    }

    /* renamed from: setShrinkText */
    public final void m61646xcba4d8d8(boolean z17) {
        this.isShrinkText = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15227x1ef48268(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.followBtnMargin = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h2.f213737d);
    }
}
