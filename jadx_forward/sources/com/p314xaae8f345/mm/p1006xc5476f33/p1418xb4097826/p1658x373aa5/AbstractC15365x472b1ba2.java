package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/HorizontalLivePreviewLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "bgView", "e", "Landroid/widget/FrameLayout;", "getIconLayout", "()Landroid/widget/FrameLayout;", "iconLayout", "Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "f", "Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "getLiveRecommendView", "()Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "liveRecommendView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.HorizontalLivePreviewLayout */
/* loaded from: classes2.dex */
public abstract class AbstractC15365x472b1ba2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.View bgView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.widget.FrameLayout iconLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 liveRecommendView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15365x472b1ba2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51(context2);
        this.liveRecommendView = c15288x851f5d51;
        setId(com.p314xaae8f345.mm.R.id.f566209tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        int dimension2 = (int) c22699x3dcdb352.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80045xd3c52534);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
        c22699x3dcdb352.setPadding(dimension2, dimension2, dimension2, dimension2);
        c22699x3dcdb352.setScaleX(-1.0f);
        c22699x3dcdb352.setRotation(90.0f);
        frameLayout.addView(c22699x3dcdb352, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        c15288x851f5d51.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
        addView(c15288x851f5d51, layoutParams2);
    }

    public final android.view.View getBgView() {
        return this.bgView;
    }

    public final android.widget.FrameLayout getIconLayout() {
        return this.iconLayout;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 getLiveRecommendView() {
        return this.liveRecommendView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15365x472b1ba2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51(context2);
        this.liveRecommendView = c15288x851f5d51;
        setId(com.p314xaae8f345.mm.R.id.f566209tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        int dimension2 = (int) c22699x3dcdb352.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80045xd3c52534);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
        c22699x3dcdb352.setPadding(dimension2, dimension2, dimension2, dimension2);
        c22699x3dcdb352.setScaleX(-1.0f);
        c22699x3dcdb352.setRotation(90.0f);
        frameLayout.addView(c22699x3dcdb352, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        c15288x851f5d51.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
        addView(c15288x851f5d51, layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15365x472b1ba2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(-16777216);
        this.bgView = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.iconLayout = frameLayout;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51(context2);
        this.liveRecommendView = c15288x851f5d51;
        setId(com.p314xaae8f345.mm.R.id.f566209tj1);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        float f17 = dimension / 2.0f;
        frameLayout.setPivotX(f17);
        frameLayout.setPivotY(f17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        int dimension2 = (int) c22699x3dcdb352.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80045xd3c52534);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
        c22699x3dcdb352.setPadding(dimension2, dimension2, dimension2, dimension2);
        c22699x3dcdb352.setScaleX(-1.0f);
        c22699x3dcdb352.setRotation(90.0f);
        frameLayout.addView(c22699x3dcdb352, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int dimension3 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.setMarginEnd(dimension3);
        layoutParams.bottomMargin = dimension3;
        layoutParams.gravity = 8388661;
        addView(frameLayout, layoutParams);
        c15288x851f5d51.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
        addView(c15288x851f5d51, layoutParams2);
    }
}
