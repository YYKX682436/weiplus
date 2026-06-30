package com.tencent.mm.mj_publisher.finder.image_composing.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView;", "Lcom/tencent/mm/ui/widget/RoundCornerFrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "f", "Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "getImageView", "()Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "imageView", "Landroid/view/View;", "g", "Landroid/view/View;", "getSelectedView", "()Landroid/view/View;", "selectedView", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getPlusView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "plusView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ImageItemView extends com.tencent.mm.ui.widget.RoundCornerFrameLayout {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView imageView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.view.View selectedView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.ui.widget.imageview.WeImageView plusView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageItemView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context2);
        this.imageView = mMRoundCornerImageView;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        this.plusView = weImageView;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478491c);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        int dimension3 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float dimension4 = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        setRadius(dimension4);
        mMRoundCornerImageView.setRadius((int) dimension4);
        mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i17 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(mMRoundCornerImageView, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        weImageView.setImageResource(com.tencent.mm.R.raw.plus_filled);
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.adi));
        addView(weImageView, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    public final com.tencent.mm.ui.widget.MMRoundCornerImageView getImageView() {
        return this.imageView;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getPlusView() {
        return this.plusView;
    }

    public final android.view.View getSelectedView() {
        return this.selectedView;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View view = this.selectedView;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context2);
        this.imageView = mMRoundCornerImageView;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        this.plusView = weImageView;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478491c);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        int dimension3 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float dimension4 = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        setRadius(dimension4);
        mMRoundCornerImageView.setRadius((int) dimension4);
        mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i17 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(mMRoundCornerImageView, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        weImageView.setImageResource(com.tencent.mm.R.raw.plus_filled);
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.adi));
        addView(weImageView, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context2);
        this.imageView = mMRoundCornerImageView;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
        this.plusView = weImageView;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478491c);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        int dimension3 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float dimension4 = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        setRadius(dimension4);
        mMRoundCornerImageView.setRadius((int) dimension4);
        mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i18 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, i18);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(mMRoundCornerImageView, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        weImageView.setImageResource(com.tencent.mm.R.raw.plus_filled);
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.adi));
        addView(weImageView, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i18, i18);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }
}
