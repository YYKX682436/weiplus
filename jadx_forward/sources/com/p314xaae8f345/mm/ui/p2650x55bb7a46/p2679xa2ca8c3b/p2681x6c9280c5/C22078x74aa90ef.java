package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/n;", "Lem/m;", "f", "Lem/m;", "getHolder", "()Lem/m;", "setHolder", "(Lem/m;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderFeedMvvmView */
/* loaded from: classes9.dex */
public final class C22078x74aa90ef extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.n> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.m holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22078x74aa90ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0w, (android.view.ViewGroup) this, false);
        m80089x101324ae(new em.m(inflate));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        android.graphics.drawable.Drawable e17;
        z01.n nVar = (z01.n) pVar2;
        if (nVar == null) {
            return;
        }
        em.m m80088x1cddf0a2 = m80088x1cddf0a2();
        android.widget.ImageView imageView = (android.widget.ImageView) m80088x1cddf0a2.b().findViewById(com.p314xaae8f345.mm.R.id.bnk);
        android.widget.TextView textView = (android.widget.TextView) m80088x1cddf0a2.b().findViewById(com.p314xaae8f345.mm.R.id.bnp);
        android.widget.ImageView imageView2 = (android.widget.ImageView) m80088x1cddf0a2.b().findViewById(com.p314xaae8f345.mm.R.id.bne);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d a17 = m80088x1cddf0a2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getChattingClickArea(...)");
        android.util.Size size = nVar.f550648e;
        a17.setOnClickListener(nVar.M);
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        a17.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d a18 = m80088x1cddf0a2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getChattingClickArea(...)");
        java.lang.String str2 = nVar.f550649f;
        if (str2 == null) {
            str2 = "";
        }
        a18.setContentDescription(str2);
        android.widget.ImageView imageView3 = m80088x1cddf0a2.f336115g;
        android.view.View view = m80088x1cddf0a2.f336109a;
        if (imageView3 == null) {
            m80088x1cddf0a2.f336115g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565206bo1);
        }
        android.widget.ImageView imageView4 = m80088x1cddf0a2.f336115g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView4, "getChattingItemFinderThumb(...)");
        android.util.Size size2 = nVar.f550652i;
        int i17 = nVar.f550653m;
        java.lang.String str3 = nVar.f550650g;
        java.lang.String str4 = nVar.f550651h;
        if (str3 != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            str = "";
            ya2.l.f542035a.h(str3, imageView4, mn2.f1.D);
        } else {
            str = "";
        }
        if (str4 != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l.f542035a.h(str4, null, mn2.f1.B);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView4.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = size2.getWidth();
            layoutParams3.height = size2.getHeight();
            imageView4.setLayoutParams(layoutParams3);
            imageView4.setVisibility(i17);
            if (imageView4 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) {
                ((com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) imageView4).m82623x81e824af(com.p314xaae8f345.mm.R.C30861xcebc809e.c0j);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d a19 = m80088x1cddf0a2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getChattingClickArea(...)");
        android.util.Size size3 = nVar.f550648e;
        a19.setOnClickListener(nVar.M);
        android.view.ViewGroup.LayoutParams layoutParams4 = a19.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams4.width = size3.getWidth();
        layoutParams4.height = size3.getHeight();
        a19.setLayoutParams(layoutParams4);
        if (m80088x1cddf0a2.f336117i == null) {
            m80088x1cddf0a2.f336117i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bni);
        }
        android.widget.TextView textView2 = m80088x1cddf0a2.f336117i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "getChattingItemFinderDesc(...)");
        java.lang.CharSequence charSequence = nVar.f550654n;
        int i18 = nVar.f550655o;
        if (charSequence == null) {
            charSequence = str;
        }
        textView2.setText(charSequence);
        textView2.setVisibility(i18);
        if (m80088x1cddf0a2.f336114f == null) {
            m80088x1cddf0a2.f336114f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565205bo0);
        }
        android.widget.TextView textView3 = m80088x1cddf0a2.f336114f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView3, "getChattingItemFinderText(...)");
        java.lang.CharSequence charSequence2 = nVar.f550656p;
        int i19 = nVar.f550657q;
        if (charSequence2 == null) {
            charSequence2 = str;
        }
        textView3.setText(charSequence2);
        textView3.setVisibility(i19);
        if (m80088x1cddf0a2.f336111c == null) {
            m80088x1cddf0a2.f336111c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bno);
        }
        android.widget.ImageView imageView5 = m80088x1cddf0a2.f336111c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView5, "getChattingItemFinderMediaType(...)");
        imageView5.setVisibility(nVar.f550658r);
        if (m80088x1cddf0a2.f336120l == null) {
            m80088x1cddf0a2.f336120l = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) view.findViewById(com.p314xaae8f345.mm.R.id.bnn);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = m80088x1cddf0a2.f336120l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18393x3e165bd9, "getChattingItemFinderImageIndicator(...)");
        int i27 = nVar.f550660t;
        int i28 = nVar.f550661u;
        int i29 = nVar.f550659s;
        int i37 = nVar.f550662v;
        c18393x3e165bd9.f252184e = i29;
        c18393x3e165bd9.f252188i = i28;
        c18393x3e165bd9.f252187h = i27;
        c18393x3e165bd9.setVisibility(i37);
        if (m80088x1cddf0a2.f336112d == null) {
            m80088x1cddf0a2.f336112d = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.qz_);
        }
        android.widget.LinearLayout linearLayout = m80088x1cddf0a2.f336112d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getLayoutCoverImageCounter(...)");
        java.lang.CharSequence charSequence3 = nVar.f550664x;
        int i38 = nVar.f550663w;
        android.widget.TextView textView4 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pth);
        if (textView4 != null) {
            textView4.setText(charSequence3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i38));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(linearLayout, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout b17 = m80088x1cddf0a2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getLlCoverBottomMask(...)");
        int i39 = nVar.f550665y;
        int i47 = nVar.f550666z;
        int i48 = nVar.A;
        ho.b.b(b17, i39, i47);
        b17.setVisibility(i48);
        if (imageView != null && (e17 = com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79664x14f92eb, i65.a.d(imageView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an))) != null) {
            imageView.setImageDrawable(e17);
        }
        if (textView != null) {
            java.lang.CharSequence charSequence4 = nVar.B;
            boolean z17 = nVar.C;
            textView.setText(charSequence4);
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = textView != null ? textView.getLayoutParams() : null;
        if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(0);
            textView.setLayoutParams(layoutParams5);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.fsk);
        if (findViewById != null) {
            int i49 = nVar.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i49));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (m80088x1cddf0a2.f336118j == null) {
            m80088x1cddf0a2.f336118j = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.r1f);
        }
        android.widget.TextView textView5 = m80088x1cddf0a2.f336118j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView5, "getTvFooterTitle(...)");
        java.lang.CharSequence charSequence5 = nVar.E;
        int i57 = nVar.F;
        if (charSequence5 == null) {
            charSequence5 = str;
        }
        textView5.setText(charSequence5);
        textView5.setVisibility(i57);
        if (m80088x1cddf0a2.f336116h == null) {
            m80088x1cddf0a2.f336116h = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.qzc);
        }
        android.widget.LinearLayout linearLayout2 = m80088x1cddf0a2.f336116h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout2, "getLlFooterContainer(...)");
        int i58 = nVar.G;
        int i59 = nVar.H;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), i58, linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setVisibility(i59);
        if (m80088x1cddf0a2.f336121m == null) {
            m80088x1cddf0a2.f336121m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566933qz5);
        }
        android.widget.ImageView imageView6 = m80088x1cddf0a2.f336121m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView6, "getIvFooterAvatar(...)");
        java.lang.String str5 = nVar.I;
        android.util.Size size4 = nVar.f550646J;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a27 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str5 == null) {
            str5 = str;
        }
        a27.c(lVar.e(str5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView6, g1Var.h(mn2.f1.f411495p));
        android.view.ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams7 = (android.widget.LinearLayout.LayoutParams) layoutParams6;
        layoutParams7.width = size4.getWidth();
        layoutParams7.height = size4.getHeight();
        imageView6.setLayoutParams(layoutParams7);
        if (m80088x1cddf0a2.f336113e == null) {
            m80088x1cddf0a2.f336113e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.r1e);
        }
        android.widget.TextView textView6 = m80088x1cddf0a2.f336113e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView6, "getTvFooterNickName(...)");
        java.lang.CharSequence charSequence6 = nVar.K;
        int i66 = nVar.L;
        textView6.setText(charSequence6);
        textView6.setTextSize(0, i66);
        setOnClickListener(nVar.M);
        setOnLongClickListener(null);
        setOnTouchListener(null);
    }

    /* renamed from: getHolder */
    public final em.m m80088x1cddf0a2() {
        em.m mVar = this.holder;
        if (mVar != null) {
            return mVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: setHolder */
    public final void m80089x101324ae(em.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<set-?>");
        this.holder = mVar;
    }

    public /* synthetic */ C22078x74aa90ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22078x74aa90ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
