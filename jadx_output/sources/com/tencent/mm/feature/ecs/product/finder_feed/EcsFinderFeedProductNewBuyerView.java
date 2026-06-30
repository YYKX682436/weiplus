package com.tencent.mm.feature.ecs.product.finder_feed;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductNewBuyerView;", "Lcom/tencent/mm/ui/widget/LineLinearLayout;", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "h", "Ljz5/g;", "getTvMoreProduct", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "tvMoreProduct", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "i", "getArrowIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "arrowIcon", "Landroid/widget/LinearLayout;", "m", "getLlMoreProduct", "()Landroid/widget/LinearLayout;", "llMoreProduct", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedProductNewBuyerView extends com.tencent.mm.ui.widget.LineLinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView f65896f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f65897g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tvMoreProduct;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g arrowIcon;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g llMoreProduct;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductNewBuyerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getArrowIcon() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.arrowIcon).getValue();
    }

    private final android.widget.LinearLayout getLlMoreProduct() {
        return (android.widget.LinearLayout) ((jz5.n) this.llMoreProduct).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvMoreProduct() {
        return (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) ((jz5.n) this.tvMoreProduct).getValue();
    }

    public final void c(bw5.lf data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = this.f65896f;
        boolean[] zArr = data.f29770g;
        bw5.a9 a9Var = zArr[1] ? data.f29767d : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var, "getLabel(...)");
        ecsRichTextLabelView.a(a9Var);
        android.widget.LinearLayout llMoreProduct = getLlMoreProduct();
        int i17 = zArr[2] ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(llMoreProduct, arrayList.toArray(), "com/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductNewBuyerView", "bindData", "(Lcom/tencent/wechat/aff/proto/FinderFeedEcProductCard$NewBuyerDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        llMoreProduct.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(llMoreProduct, "com/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductNewBuyerView", "bindData", "(Lcom/tencent/wechat/aff/proto/FinderFeedEcProductCard$NewBuyerDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f65897g;
        int i18 = zArr[2] ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductNewBuyerView", "bindData", "(Lcom/tencent/wechat/aff/proto/FinderFeedEcProductCard$NewBuyerDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductNewBuyerView", "bindData", "(Lcom/tencent/wechat/aff/proto/FinderFeedEcProductCard$NewBuyerDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvMoreProduct = getTvMoreProduct();
        bw5.a9 a9Var2 = zArr[2] ? data.f29768e : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var2, "getLabelDesc(...)");
        tvMoreProduct.a(a9Var2);
        android.widget.LinearLayout llMoreProduct2 = getLlMoreProduct();
        l20.h0 h0Var = new l20.h0(this, data);
        kotlin.jvm.internal.o.g(llMoreProduct2, "<this>");
        llMoreProduct2.setOnClickListener(new b30.y(h0Var));
    }

    public /* synthetic */ EcsFinderFeedProductNewBuyerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductNewBuyerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(context, null, 0, 6, null);
        ecsRichTextLabelView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f65896f = ecsRichTextLabelView;
        android.view.View view = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        this.f65897g = view;
        this.tvMoreProduct = jz5.h.b(new l20.j0(context));
        this.arrowIcon = jz5.h.b(new l20.g0(context));
        this.llMoreProduct = jz5.h.b(new l20.i0(context, this));
        setOrientation(1);
        setGravity(16);
        addView(ecsRichTextLabelView);
        addView(view);
        addView(getLlMoreProduct());
    }
}
