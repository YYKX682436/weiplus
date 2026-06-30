package com.tencent.mm.feature.ecs.product.finder_feed.v3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006'"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductInfoView;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "Ll20/o0;", "d", "Ll20/o0;", "getCallback", "()Ll20/o0;", "setCallback", "(Ll20/o0;)V", "callback", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "getTvTitle", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "tvTitle", "Landroid/widget/LinearLayout;", "getLlWeStore", "()Landroid/widget/LinearLayout;", "llWeStore", "Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "getLabelBox", "()Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "labelBox", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "getBtBuy", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "btBuy", "getTvPrice", "tvPrice", "getPriceDescBox", "priceDescBox", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedProductInfoView extends android.widget.FrameLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public l20.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvTitle = getTvTitle();
        boolean[] zArr = data.C;
        bw5.a9 a9Var = zArr[2] ? data.f32068e : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var, "getProductTitle(...)");
        tvTitle.a(a9Var);
        com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView labelBox = getLabelBox();
        bw5.o9 o9Var = zArr[3] ? data.f32069f : new bw5.o9();
        kotlin.jvm.internal.o.f(o9Var, "getProductTag(...)");
        labelBox.a(o9Var);
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvPrice = getTvPrice();
        bw5.a9 a9Var2 = zArr[4] ? data.f32070g : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var2, "getPrice(...)");
        tvPrice.a(a9Var2);
        com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView priceDescBox = getPriceDescBox();
        bw5.o9 o9Var2 = zArr[5] ? data.f32071h : new bw5.o9();
        kotlin.jvm.internal.o.f(o9Var2, "getPriceDescTag(...)");
        priceDescBox.a(o9Var2);
        com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView btBuy = getBtBuy();
        bw5.d9 d9Var = zArr[6] ? data.f32072i : new bw5.d9();
        kotlin.jvm.internal.o.f(d9Var, "getBuyButton(...)");
        btBuy.a(d9Var);
        for (android.view.View view : kz5.c0.i(getTvTitle(), getTvPrice(), this)) {
            n20.m mVar = new n20.m(this, data);
            kotlin.jvm.internal.o.g(view, "<this>");
            view.setOnClickListener(new b30.y(mVar));
        }
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView getBtBuy() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.slf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView) findViewById;
    }

    public final l20.o0 getCallback() {
        return this.callback;
    }

    @Override // k20.h
    public /* bridge */ /* synthetic */ java.lang.String getEcsReportDataForFinder() {
        return "";
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView getLabelBox() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u8g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById;
    }

    public final android.widget.LinearLayout getLlWeStore() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.uby);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.LinearLayout) findViewById;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView getPriceDescBox() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.uti);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvPrice() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.okn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvTitle() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.okp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById;
    }

    public final void setCallback(l20.o0 o0Var) {
        this.callback = o0Var;
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
    }

    @Override // k20.h
    public /* bridge */ /* synthetic */ void setNaviHeight(int i17) {
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductInfoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.e4a, this);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(getTvTitle(), "feeds_spu_card");
        aVar.Ai(getTvTitle(), new n20.j(this));
        aVar.Tj(getTvTitle(), 8, 12, false);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(getTvPrice(), "feeds_spu_card");
        aVar2.Ai(getTvPrice(), new n20.k(this));
        aVar2.Tj(getTvPrice(), 8, 12, false);
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(getBtBuy(), "feeds_spu_card");
        aVar3.Ai(getBtBuy(), new n20.l(this));
        aVar3.Tj(getBtBuy(), 8, 12, false);
    }
}
