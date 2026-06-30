package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingBizShareMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingBizShareMvvmView */
/* loaded from: classes9.dex */
public final class C22074x3f74ba17 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.h> {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286150f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22074x3f74ba17(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 u17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).u(context);
        this.f286150f = u17;
        return u17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        c11.d dVar;
        z01.h hVar = (z01.h) pVar2;
        if (hVar == null) {
            return;
        }
        c11.e eVar = new c11.e();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f550572d);
        r35.h0 h0Var = r35.h0.f450653d;
        if (ot0.f.f(valueOf != null ? valueOf.intValue() : 0)) {
            h0Var = r35.h0.f450654e;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String str = hVar.f550573e;
        ((ke0.e) xVar).getClass();
        eVar.f119361d = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
        if (hVar.f550576h <= 0 || hVar.f550577i <= 0) {
            eVar.f119364g = c11.d.f119359f;
        } else {
            double a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.a(h0Var.ordinal(), hVar.f550576h, hVar.f550577i);
            if (a17 == 1.3333333333333333d) {
                dVar = c11.d.f119358e;
            } else {
                if (a17 == 0.75d) {
                    dVar = c11.d.f119357d;
                } else {
                    dVar = a17 == 1.0d ? c11.d.f119359f : c11.d.f119359f;
                }
            }
            eVar.f119364g = dVar;
        }
        java.lang.String str2 = hVar.f550575g;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.b(str2);
        java.lang.String str3 = hVar.f550575g;
        if (str3 == null) {
            str3 = java.lang.String.valueOf(hashCode());
        }
        c11.b bVar = new c11.b(str3);
        java.lang.String str4 = hVar.f550575g;
        bVar.f119344b = str4 != null ? str4 : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "<set-?>");
        bVar.f119347e = b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (h0Var == r35.h0.f450654e) {
            int i17 = hVar.f550578m;
            if (i17 > 0) {
                java.lang.String d17 = ot0.g0.d(i17);
                i95.m c17 = i95.n0.c(q31.r.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                r31.m wi6 = ((q31.t) ((q31.r) c17)).wi();
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 c18 = ((ko.a) wi6).c(context2);
                a11.a aVar = new a11.a();
                aVar.f82028d = d17;
                aVar.f82032h = a84.d0.a(40);
                aVar.f82030f = a84.d0.a(8);
                aVar.f82031g = a84.d0.a(8);
                aVar.f82029e = a84.d0.a(12);
                c18.m48330xfcfee142(aVar);
                arrayList.add(c18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            addView(imageView);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            int f17 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(f17, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = f17;
                imageView.setLayoutParams(layoutParams);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_width", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            int f18 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dimenResId", "com.tencent.mm.plugin.sns.ad.dsl.DSLUtilsKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            if (imageView.getLayoutParams() == null) {
                c44.a.o();
                imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, f18));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.height = f18;
                imageView.setLayoutParams(layoutParams2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_height", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSrc", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bxo);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSrc", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayout_gravity", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 17;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.gravity = 17;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayout_gravity", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ImageView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            arrayList.add(imageView);
        }
        eVar.f119365h = new c11.c(b17, bVar, arrayList);
        a11.b bVar2 = new a11.b();
        bVar2.f82036g = new af5.v(this, hVar);
        eVar.f119367m = bVar2;
        android.view.View.OnClickListener onClickListener = hVar.f550579n;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286150f;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(eVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
    }

    public /* synthetic */ C22074x3f74ba17(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22074x3f74ba17(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
