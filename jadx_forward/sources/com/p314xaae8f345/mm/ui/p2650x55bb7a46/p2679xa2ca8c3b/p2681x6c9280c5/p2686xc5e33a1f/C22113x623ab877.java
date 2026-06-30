package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingContactCardTemplateViewNew */
/* loaded from: classes9.dex */
public final class C22113x623ab877 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<c11.a> {

    /* renamed from: f, reason: collision with root package name */
    public em.i f286416f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286417g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22113x623ab877(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0s, (android.view.ViewGroup) this, false);
        em.i iVar = new em.i(inflate);
        this.f286416f = iVar;
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f286417g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (iVar.f335941d == null) {
            iVar.f335941d = (android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.szi);
        }
        android.view.ViewStub viewStub = iVar.f335941d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewStub, "getContactSourceViewStub(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286417g;
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
            return iVar.f335938a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        return iVar.f335938a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        c11.a aVar = (c11.a) pVar2;
        if (aVar == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.f119333d);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            em.i iVar = this.f286416f;
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (iVar.f335940c == null) {
                iVar.f335940c = (com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2) iVar.f335938a.findViewById(com.p314xaae8f345.mm.R.id.f565182sq2);
            }
            iVar.f335940c.setBackgroundResource(intValue);
        }
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f353965c = 2.0f;
        kVar.f353969g = i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        yz5.l lVar = aVar.f119334e;
        if (lVar != null) {
            em.i iVar2 = this.f286416f;
            if (iVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (iVar2.f335939b == null) {
                iVar2.f335939b = (android.widget.ImageView) iVar2.f335938a.findViewById(com.p314xaae8f345.mm.R.id.ca7);
            }
            android.widget.ImageView imageView = iVar2.f335939b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getContactAvatarIv(...)");
            lVar.mo146xb9724478(imageView);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(null)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            em.i iVar3 = this.f286416f;
            if (iVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (iVar3.f335939b == null) {
                iVar3.f335939b = (android.widget.ImageView) iVar3.f335938a.findViewById(com.p314xaae8f345.mm.R.id.ca7);
            }
            android.widget.ImageView imageView2 = iVar3.f335939b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "getContactAvatarIv(...)");
            ((h83.g) n0Var).Ai(imageView2, "", kVar);
        }
        em.i iVar4 = this.f286416f;
        if (iVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (iVar4.f335944g == null) {
            iVar4.f335944g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) iVar4.f335938a.findViewById(com.p314xaae8f345.mm.R.id.sza);
        }
        iVar4.f335944g.setText(aVar.f119335f);
        em.i iVar5 = this.f286416f;
        if (iVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        iVar5.b().setText(aVar.f119339m);
        java.lang.Integer num = aVar.f119340n;
        if (num != null) {
            int intValue2 = num.intValue();
            em.i iVar6 = this.f286416f;
            if (iVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            iVar6.b().setTextColor(intValue2);
        }
        em.i iVar7 = this.f286416f;
        if (iVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 b17 = iVar7.b();
        java.lang.CharSequence charSequence = aVar.f119339m;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, b17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.i iVar8 = this.f286416f;
        if (iVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (iVar8.f335943f == null) {
            iVar8.f335943f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) iVar8.f335938a.findViewById(com.p314xaae8f345.mm.R.id.sxu);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = iVar8.f335943f;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(aVar.f119342p);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(c22699x3dcdb352, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(c22699x3dcdb352, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf3, c22699x3dcdb352)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(c22699x3dcdb352, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue6 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue6));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(c22699x3dcdb352, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.l lVar2 = aVar.f119336g;
        if (lVar2 != null) {
            em.i iVar9 = this.f286416f;
            if (iVar9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a17 = iVar9.a();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(a17, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue7 = ((java.lang.Integer) arrayList9.get(0)).intValue();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(intValue7));
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(a17, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            em.i iVar10 = this.f286416f;
            if (iVar10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a18 = iVar10.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getContactAuthIconIv(...)");
            lVar2.mo146xb9724478(a18);
        } else {
            em.i iVar11 = this.f286416f;
            if (iVar11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            iVar11.a().setImageResource(aVar.f119337h);
            em.i iVar12 = this.f286416f;
            if (iVar12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            iVar12.a().m82040x7541828(aVar.f119338i);
            em.i iVar13 = this.f286416f;
            if (iVar13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a19 = iVar13.a();
            java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(aVar.f119337h != 0);
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(a19, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue8 = ((java.lang.Integer) arrayList11.get(0)).intValue();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Integer.valueOf(intValue8));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(a19, arrayList12.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a19.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(a19, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a19, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ?? r37 = (android.view.View) pm0.v.E(valueOf4, a19);
            if (r37 == 0) {
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(a19, arrayList13.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue9 = ((java.lang.Integer) arrayList13.get(0)).intValue();
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(java.lang.Integer.valueOf(intValue9));
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(a19, arrayList14.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a19.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(a19, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(a19, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                a19 = r37;
            }
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f286417g;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceView");
            throw null;
        }
        a11.b bVar = new a11.b();
        java.lang.String str = aVar.f119341o;
        bVar.f82034e = str != null ? str : "";
        abstractC11172x705e5905.m48330xfcfee142(bVar);
        em.i iVar14 = this.f286416f;
        if (iVar14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (iVar14.f335940c == null) {
            iVar14.f335940c = (com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2) iVar14.f335938a.findViewById(com.p314xaae8f345.mm.R.id.f565182sq2);
        }
        iVar14.f335940c.m82764xec18708e(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
    }

    public /* synthetic */ C22113x623ab877(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22113x623ab877(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
