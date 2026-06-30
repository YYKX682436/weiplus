package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingLargeCoverView */
/* loaded from: classes9.dex */
public final class C22114x956fa607 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.e> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f286418h = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.q f286419f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286420g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22114x956fa607(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570106e21, (android.view.ViewGroup) this, false);
        em.q qVar = new em.q(inflate);
        this.f286419f = qVar;
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f286420g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (qVar.f336245f == null) {
            qVar.f336245f = (android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.v_2);
        }
        android.view.ViewStub viewStub = qVar.f336245f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewStub, "getSourceLineViewStub(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286420g;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        try {
            android.view.ViewParent parent = viewStub.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DSLComponents", "inflateWithView exp=" + e17);
        }
        if (indexOfChild >= 0) {
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(viewStub);
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                if (viewGroup != null) {
                    viewGroup.addView(abstractC11172x705e5905, indexOfChild, layoutParams);
                }
            } else if (viewGroup != null) {
                viewGroup.addView(abstractC11172x705e5905, indexOfChild);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.view.View view = qVar.f336240a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
            return view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.view.View view2 = qVar.f336240a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String str2;
        c11.b bVar;
        java.lang.Number valueOf;
        java.lang.String str3;
        c11.e eVar = (c11.e) pVar2;
        if (eVar == null) {
            return;
        }
        em.q qVar = this.f286419f;
        if (qVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        qVar.a().b(eVar.f119361d);
        em.q qVar2 = this.f286419f;
        if (qVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a17 = qVar2.a();
        java.lang.CharSequence charSequence = eVar.f119361d;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!(charSequence == null || r26.n0.N(charSequence)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, a17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.q qVar3 = this.f286419f;
        if (qVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar3.f336241b == null) {
            qVar3.f336241b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) qVar3.f336240a.findViewById(com.p314xaae8f345.mm.R.id.cut);
        }
        qVar3.f336241b.b(eVar.f119362e);
        em.q qVar4 = this.f286419f;
        if (qVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar4.f336241b == null) {
            qVar4.f336241b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) qVar4.f336240a.findViewById(com.p314xaae8f345.mm.R.id.cut);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = qVar4.f336241b;
        java.lang.String str4 = eVar.f119362e;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(!(str4 == null || r26.n0.N(str4)));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(c22624x85d69039, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(c22624x85d69039, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22624x85d69039.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(c22624x85d69039, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22624x85d69039, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf3, c22624x85d69039)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(c22624x85d69039, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(c22624x85d69039, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22624x85d69039.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(c22624x85d69039, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c22624x85d69039, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.q qVar5 = this.f286419f;
        if (qVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a18 = qVar5.a();
        java.lang.String str5 = eVar.f119362e;
        a18.m84175x8dd5167d(!(str5 == null || r26.n0.N(str5)) ? 1 : 2);
        int i17 = eVar.f119363f;
        if (i17 != 0) {
            setBackgroundResource(i17);
        }
        em.q qVar6 = this.f286419f;
        if (qVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar6.f336246g == null) {
            qVar6.f336246g = (android.widget.ImageView) qVar6.f336240a.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        }
        android.widget.ImageView imageView = qVar6.f336246g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getThumbIv(...)");
        em.q qVar7 = this.f286419f;
        if (qVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar7.f336243d == null) {
            qVar7.f336243d = (android.widget.FrameLayout) qVar7.f336240a.findViewById(com.p314xaae8f345.mm.R.id.veg);
        }
        android.widget.FrameLayout frameLayout = qVar7.f336243d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getThumbMaskContainer(...)");
        frameLayout.removeAllViews();
        c11.c cVar = eVar.f119365h;
        int i18 = kf5.c.f389034a;
        gk0.k kVar = new gk0.k(i18, i18);
        java.lang.String str6 = "";
        if (cVar == null || (str = cVar.f119354a) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (cVar != null && (str3 = cVar.f119354a) != null) {
                str6 = str3;
            }
            ((h83.g) n0Var).Ai(imageView, str6, kVar);
            g(frameLayout, eVar);
            str2 = "getThumbMaskContainer(...)";
        } else if (cVar == null || (bVar = cVar.f119355b) == null) {
            str2 = "getThumbMaskContainer(...)";
            yz5.p pVar3 = eVar.f119366i;
            if (pVar3 != null) {
                pVar3.mo149xb9724478(imageView, new kf5.b(this, frameLayout, eVar));
            }
        } else {
            y01.a c17 = af5.y0.c(bVar);
            java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, c17);
            i95.m c18 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            str2 = "getThumbMaskContainer(...)";
            g75.z x66 = gk0.n0.x6((gk0.n0) c18, wi6, kVar, imageView, null, 8, null);
            x66.l("KeyCdnParams", c17);
            ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai().a(x66, new java.lang.ref.WeakReference(new kf5.a(this, frameLayout, eVar, imageView)));
        }
        em.q qVar8 = this.f286419f;
        if (qVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar8.f336242c == null) {
            qVar8.f336242c = (com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2) qVar8.f336240a.findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2 c22811x324162d2 = qVar8.f336242c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22811x324162d2, "getRootView(...)");
        em.q qVar9 = this.f286419f;
        if (qVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar9.f336246g == null) {
            qVar9.f336246g = (android.widget.ImageView) qVar9.f336240a.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        }
        android.widget.ImageView imageView2 = qVar9.f336246g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "getThumbIv(...)");
        em.q qVar10 = this.f286419f;
        if (qVar10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (qVar10.f336243d == null) {
            qVar10.f336243d = (android.widget.FrameLayout) qVar10.f336240a.findViewById(com.p314xaae8f345.mm.R.id.veg);
        }
        android.widget.FrameLayout frameLayout2 = qVar10.f336243d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout2, str2);
        int ordinal = eVar.f119364g.ordinal();
        c22811x324162d2.m82764xec18708e(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(4.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null));
        int a19 = c22811x324162d2.getLayoutParams().width - c44.b.a(12);
        int ordinal2 = eVar.f119364g.ordinal();
        if (ordinal2 == 0) {
            valueOf = java.lang.Double.valueOf((a19 / 3.0d) * 4.0d);
        } else if (ordinal2 == 1) {
            valueOf = java.lang.Double.valueOf((a19 / 4.0d) * 3.0d);
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            valueOf = java.lang.Integer.valueOf(a19);
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        layoutParams.width = a19;
        layoutParams.height = valueOf.intValue();
        imageView2.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        layoutParams2.width = a19;
        layoutParams2.height = valueOf.intValue();
        frameLayout2.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286420g;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(eVar.f119367m);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
            throw null;
        }
    }

    public final void g(android.widget.FrameLayout frameLayout, c11.e eVar) {
        java.util.List<android.view.View> list;
        frameLayout.removeAllViews();
        c11.c cVar = eVar.f119365h;
        if (cVar == null || (list = cVar.f119356c) == null) {
            return;
        }
        for (android.view.View view : list) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public /* synthetic */ C22114x956fa607(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22114x956fa607(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
