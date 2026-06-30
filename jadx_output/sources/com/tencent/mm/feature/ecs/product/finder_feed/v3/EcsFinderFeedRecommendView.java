package com.tencent.mm.feature.ecs.product.finder_feed.v3;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedRecommendView;", "Landroid/widget/LinearLayout;", "Ll20/p0;", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "e", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "getTv", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "tv", "f", "getSubTv", "subTv", "Ll20/o0;", "h", "Ll20/o0;", "getCallback", "()Ll20/o0;", "setCallback", "(Ll20/o0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedRecommendView extends android.widget.LinearLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f65928d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView subTv;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f65931g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public l20.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedRecommendView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        kotlin.jvm.internal.o.g(data, "data");
        b30.z zVar = b30.z.f17588a;
        zVar.a(this);
        android.widget.LinearLayout linearLayout = this.f65928d;
        linearLayout.removeAllViews();
        zVar.a(linearLayout);
        java.util.LinkedList linkedList = data.f().f30662f;
        if (!(linkedList == null || linkedList.isEmpty())) {
            zVar.c(linearLayout);
            java.util.LinkedList linkedList2 = data.f().f30662f;
            kotlin.jvm.internal.o.f(linkedList2, "getMainReasonImgs(...)");
            int i17 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                bw5.c7 c7Var = (bw5.c7) obj;
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479714d7), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479714d7));
                if (i17 > 0) {
                    layoutParams.setMarginStart(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479646bl));
                }
                imageView.setLayoutParams(layoutParams);
                int i19 = c7Var.f25957h;
                float h17 = i19 != 1 ? i19 != 3 ? 0.0f : i65.a.h(getContext(), com.tencent.mm.R.dimen.f479714d7) / 2 : i65.a.b(getContext(), c7Var.f25958i);
                java.lang.String b17 = c7Var.b();
                kotlin.jvm.internal.o.f(b17, "getImgUrl(...)");
                q00.f fVar = new q00.f();
                bw5.c7 c7Var2 = new bw5.c7();
                c7Var2.d(b17);
                fVar.f359251a = c7Var2;
                fVar.f359252b = imageView;
                fVar.f359255e = h17;
                fVar.a();
                linearLayout.addView(imageView);
                i17 = i18;
            }
        }
        if (data.f().f30663g[1]) {
            zVar.c(this);
            com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = this.tv;
            bw5.nf f17 = data.f();
            bw5.a9 a9Var = f17.f30663g[1] ? f17.f30660d : new bw5.a9();
            kotlin.jvm.internal.o.f(a9Var, "getMainReason(...)");
            ecsRichTextLabelView.a(a9Var);
        }
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView2 = this.subTv;
        zVar.a(ecsRichTextLabelView2);
        bw5.nf f18 = data.f();
        java.util.LinkedList linkedList3 = (f18.f30663g[2] ? f18.f30661e : new bw5.a9()).f25087d;
        if (!(linkedList3 == null || linkedList3.isEmpty())) {
            zVar.c(ecsRichTextLabelView2);
            bw5.nf f19 = data.f();
            bw5.a9 a9Var2 = f19.f30663g[2] ? f19.f30661e : new bw5.a9();
            kotlin.jvm.internal.o.f(a9Var2, "getSecondaryReason(...)");
            ecsRichTextLabelView2.a(a9Var2);
        }
        for (android.view.View view : kz5.c0.i(this.f65931g, ecsRichTextLabelView2, this)) {
            n20.s sVar = new n20.s(this, data);
            kotlin.jvm.internal.o.g(view, "<this>");
            view.setOnClickListener(new b30.y(sVar));
        }
    }

    public final l20.o0 getCallback() {
        return this.callback;
    }

    @Override // k20.h
    public /* bridge */ /* synthetic */ java.lang.String getEcsReportDataForFinder() {
        return "";
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getSubTv() {
        return this.subTv;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTv() {
        return this.tv;
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
    public EcsFinderFeedRecommendView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f65928d = linearLayout;
        android.util.AttributeSet attributeSet2 = null;
        int i18 = 0;
        int i19 = 6;
        kotlin.jvm.internal.i iVar = null;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(context, attributeSet2, i18, i19, iVar);
        this.tv = ecsRichTextLabelView;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView2 = new com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView(context, attributeSet2, i18, i19, iVar);
        this.subTv = ecsRichTextLabelView2;
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f65931g = linearLayout2;
        setOrientation(1);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i65.a.h(context, com.tencent.mm.R.dimen.f479738dv));
        linearLayout.setLayoutParams(marginLayoutParams);
        ecsRichTextLabelView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(ecsRichTextLabelView);
        addView(linearLayout2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.topMargin = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        ecsRichTextLabelView2.setLayoutParams(marginLayoutParams2);
        addView(ecsRichTextLabelView2);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(linearLayout2, "feeds_spu_card");
        aVar.Ai(linearLayout2, new n20.q(this));
        aVar.Tj(linearLayout2, 8, 12, false);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(ecsRichTextLabelView2, "feeds_spu_card");
        aVar2.Ai(ecsRichTextLabelView2, new n20.r(this));
        aVar2.Tj(ecsRichTextLabelView2, 8, 12, false);
    }
}
