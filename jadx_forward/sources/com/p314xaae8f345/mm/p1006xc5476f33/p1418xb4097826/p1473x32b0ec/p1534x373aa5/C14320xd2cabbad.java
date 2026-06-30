package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPanelIndicator;", "Landroid/widget/LinearLayout;", "", "indicatorSize", "Ljz5/f0;", "setIndicatorSize", "choosedIndicator", "setCurrentChoosedIndicator", "e", "I", "getINDICATOR_W", "()I", "INDICATOR_W", "f", "getINDICATOR_H", "INDICATOR_H", "g", "getINDICATOR_MARGIN", "INDICATOR_MARGIN", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getIndicatorList", "()Ljava/util/ArrayList;", "indicatorList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPanelIndicator */
/* loaded from: classes.dex */
public final class C14320xd2cabbad extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197466d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int INDICATOR_W;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int INDICATOR_H;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int INDICATOR_MARGIN;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList indicatorList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14320xd2cabbad(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197466d = "FinderLiveGiftPanelIndicator";
        int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.INDICATOR_W = dimensionPixelOffset;
        this.INDICATOR_H = dimensionPixelOffset;
        this.INDICATOR_MARGIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        this.indicatorList = new java.util.ArrayList();
        setOrientation(0);
    }

    public final int getINDICATOR_H() {
        return this.INDICATOR_H;
    }

    public final int getINDICATOR_MARGIN() {
        return this.INDICATOR_MARGIN;
    }

    public final int getINDICATOR_W() {
        return this.INDICATOR_W;
    }

    /* renamed from: getIndicatorList */
    public final java.util.ArrayList<android.widget.ImageView> m57338xa9d7ff97() {
        return this.indicatorList;
    }

    /* renamed from: setCurrentChoosedIndicator */
    public final void m57339xcd905039(int i17) {
        java.util.ArrayList arrayList = this.indicatorList;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (i18 == i17) {
                ((android.widget.ImageView) arrayList.get(i18)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a4j);
            } else {
                ((android.widget.ImageView) arrayList.get(i18)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563310a81);
            }
        }
    }

    /* renamed from: setIndicatorSize */
    public final void m57340x3cb1956e(int i17) {
        removeAllViews();
        java.util.ArrayList arrayList = this.indicatorList;
        arrayList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197466d, "setIndicatorSize indicatorSize:" + i17);
        if (i17 < 2) {
            return;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.INDICATOR_W, this.INDICATOR_H);
            int i19 = this.INDICATOR_MARGIN;
            layoutParams.setMargins(i19, 0, i19, 0);
            layoutParams.gravity = 16;
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563310a81);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
            arrayList.add(imageView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14320xd2cabbad(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f197466d = "FinderLiveGiftPanelIndicator";
        int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.INDICATOR_W = dimensionPixelOffset;
        this.INDICATOR_H = dimensionPixelOffset;
        this.INDICATOR_MARGIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        this.indicatorList = new java.util.ArrayList();
        setOrientation(0);
    }
}
