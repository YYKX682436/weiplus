package com.tencent.mm.feature.ecs.product.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsIconRichTextLabelView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/feature/ecs/product/view/EcsIconLabelView;", "d", "Lcom/tencent/mm/feature/ecs/product/view/EcsIconLabelView;", "getIconView", "()Lcom/tencent/mm/feature/ecs/product/view/EcsIconLabelView;", "iconView", "Landroid/view/View;", "e", "Landroid/view/View;", "getPaddingView", "()Landroid/view/View;", "paddingView", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "f", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "getTextLabelView", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "textLabelView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsIconRichTextLabelView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsIconLabelView iconView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.view.View paddingView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView textLabelView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsIconRichTextLabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsIconLabelView getIconView() {
        return this.iconView;
    }

    public final android.view.View getPaddingView() {
        return this.paddingView;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView getTextLabelView() {
        return this.textLabelView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsIconRichTextLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.feature.ecs.product.view.EcsIconLabelView ecsIconLabelView = new com.tencent.mm.feature.ecs.product.view.EcsIconLabelView(context, null, 0, 6, null);
        this.iconView = ecsIconLabelView;
        android.view.View view = new android.view.View(context);
        this.paddingView = view;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView ecsRichTextButtonView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView(context, null, 0, 6, null);
        this.textLabelView = ecsRichTextButtonView;
        setOrientation(0);
        ecsIconLabelView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(ecsIconLabelView);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(view);
        ecsRichTextButtonView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        addView(ecsRichTextButtonView);
    }
}
