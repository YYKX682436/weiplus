package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedRecommendView;", "Landroid/widget/LinearLayout;", "Ll20/p0;", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "e", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "getTv", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "tv", "f", "getSubTv", "subTv", "Ll20/o0;", "h", "Ll20/o0;", "getCallback", "()Ll20/o0;", "setCallback", "(Ll20/o0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedRecommendView */
/* loaded from: classes9.dex */
public final class C10555x824069c8 extends android.widget.LinearLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f147461d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b tv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b subTv;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f147464g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public l20.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10555x824069c8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        b30.z zVar = b30.z.f99121a;
        zVar.a(this);
        android.widget.LinearLayout linearLayout = this.f147461d;
        linearLayout.removeAllViews();
        zVar.a(linearLayout);
        java.util.LinkedList linkedList = data.f().f112195f;
        if (!(linkedList == null || linkedList.isEmpty())) {
            zVar.c(linearLayout);
            java.util.LinkedList linkedList2 = data.f().f112195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getMainReasonImgs(...)");
            int i17 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                bw5.c7 c7Var = (bw5.c7) obj;
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
                if (i17 > 0) {
                    layoutParams.setMarginStart(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                }
                imageView.setLayoutParams(layoutParams);
                int i19 = c7Var.f107490h;
                float h17 = i19 != 1 ? i19 != 3 ? 0.0f : i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) / 2 : i65.a.b(getContext(), c7Var.f107491i);
                java.lang.String b17 = c7Var.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getImgUrl(...)");
                q00.f fVar = new q00.f();
                bw5.c7 c7Var2 = new bw5.c7();
                c7Var2.d(b17);
                fVar.f440784a = c7Var2;
                fVar.f440785b = imageView;
                fVar.f440788e = h17;
                fVar.a();
                linearLayout.addView(imageView);
                i17 = i18;
            }
        }
        if (data.f().f112196g[1]) {
            zVar.c(this);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b = this.tv;
            bw5.nf f17 = data.f();
            bw5.a9 a9Var = f17.f112196g[1] ? f17.f112193d : new bw5.a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a9Var, "getMainReason(...)");
            c10563x3e05669b.a(a9Var);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b2 = this.subTv;
        zVar.a(c10563x3e05669b2);
        bw5.nf f18 = data.f();
        java.util.LinkedList linkedList3 = (f18.f112196g[2] ? f18.f112194e : new bw5.a9()).f106620d;
        if (!(linkedList3 == null || linkedList3.isEmpty())) {
            zVar.c(c10563x3e05669b2);
            bw5.nf f19 = data.f();
            bw5.a9 a9Var2 = f19.f112196g[2] ? f19.f112194e : new bw5.a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a9Var2, "getSecondaryReason(...)");
            c10563x3e05669b2.a(a9Var2);
        }
        for (android.view.View view : kz5.c0.i(this.f147464g, c10563x3e05669b2, this)) {
            n20.s sVar = new n20.s(this, data);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
            view.setOnClickListener(new b30.y(sVar));
        }
    }

    public final l20.o0 getCallback() {
        return this.callback;
    }

    @Override // k20.h
    /* renamed from: getEcsReportDataForFinder */
    public /* bridge */ /* synthetic */ java.lang.String mo44310x3a31b212() {
        return "";
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b getSubTv() {
        return this.subTv;
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b getTv() {
        return this.tv;
    }

    /* renamed from: setCallback */
    public final void m44390x6c4ebec7(l20.o0 o0Var) {
        this.callback = o0Var;
    }

    @Override // k20.h
    /* renamed from: setFinderCardInfo */
    public void mo44336x6b1fd726(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
    }

    @Override // k20.h
    /* renamed from: setNaviHeight */
    public /* bridge */ /* synthetic */ void mo44337x56b82a6f(int i17) {
    }

    @Override // k20.h
    /* renamed from: setOnFeedBackListener */
    public void mo44338x2375ab7a(k20.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10555x824069c8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f147461d = linearLayout;
        android.util.AttributeSet attributeSet2 = null;
        int i18 = 0;
        int i19 = 6;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b(context, attributeSet2, i18, i19, iVar);
        this.tv = c10563x3e05669b;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b2 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b(context, attributeSet2, i18, i19, iVar);
        this.subTv = c10563x3e05669b2;
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f147464g = linearLayout2;
        setOrientation(1);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        linearLayout.setLayoutParams(marginLayoutParams);
        c10563x3e05669b.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(c10563x3e05669b);
        addView(linearLayout2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.topMargin = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c10563x3e05669b2.setLayoutParams(marginLayoutParams2);
        addView(c10563x3e05669b2);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(linearLayout2, "feeds_spu_card");
        aVar.Ai(linearLayout2, new n20.q(this));
        aVar.Tj(linearLayout2, 8, 12, false);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(c10563x3e05669b2, "feeds_spu_card");
        aVar2.Ai(c10563x3e05669b2, new n20.r(this));
        aVar2.Tj(c10563x3e05669b2, 8, 12, false);
    }
}
