package com.tencent.mm.feature.ecs.product.finder_feed;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductBulkBuyerView;", "Lcom/tencent/mm/ui/widget/LineLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedProductBulkBuyerView extends com.tencent.mm.ui.widget.LineLinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f65853f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView f65854g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f65855h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView f65856i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductBulkBuyerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ EcsFinderFeedProductBulkBuyerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductBulkBuyerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.h(context, com.tencent.mm.R.dimen.f479704cz), i65.a.h(context, com.tencent.mm.R.dimen.f479704cz));
        layoutParams.setMarginEnd(i65.a.h(context, com.tencent.mm.R.dimen.f479738dv));
        imageView.setLayoutParams(layoutParams);
        this.f65853f = imageView;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(context, null, 0, 6, null);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f65854g = ecsRichTextLabelView;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(imageView);
        linearLayout.addView(ecsRichTextLabelView);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f65855h = linearLayout2;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView2 = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(context, null, 0, 6, null);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f65856i = ecsRichTextLabelView2;
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(context);
        linearLayout3.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.addView(linearLayout2);
        linearLayout3.addView(ecsRichTextLabelView2);
        setOrientation(1);
        setGravity(8388611);
        addView(linearLayout);
        android.view.View view = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        addView(view, layoutParams2);
        addView(linearLayout3);
    }
}
