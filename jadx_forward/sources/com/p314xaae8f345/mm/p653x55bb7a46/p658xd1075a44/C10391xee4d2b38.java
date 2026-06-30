package com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/chatting/widget/ChattingExpandOptView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatting.widget.ChattingExpandOptView */
/* loaded from: classes9.dex */
public final class C10391xee4d2b38 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.l> {

    /* renamed from: f, reason: collision with root package name */
    public em.j f146274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10391xee4d2b38(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0t, (android.view.ViewGroup) this, false);
        this.f146274f = new em.j(inflate);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.l lVar = (z01.l) pVar2;
        if (lVar == null) {
            return;
        }
        setOnClickListener(lVar.f550625i);
        int color = getContext().getColor((!lVar.f550624h || com.p314xaae8f345.mm.ui.bk.C()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.adg : com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(lVar.f550624h ? com.p314xaae8f345.mm.R.C30861xcebc809e.czm : com.p314xaae8f345.mm.R.C30861xcebc809e.czl);
        em.j jVar = this.f146274f;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (jVar.f335980e == null) {
            jVar.f335980e = (android.widget.TextView) jVar.f335976a.findViewById(com.p314xaae8f345.mm.R.id.unb);
        }
        jVar.f335980e.setTextColor(color);
        if (lVar.f550622f) {
            em.j jVar2 = this.f146274f;
            if (jVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            jVar2.a().setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        } else {
            em.j jVar3 = this.f146274f;
            if (jVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            jVar3.a().setTextColor(color);
        }
        em.j jVar4 = this.f146274f;
        if (jVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (jVar4.f335978c == null) {
            jVar4.f335978c = (android.widget.LinearLayout) jVar4.f335976a.findViewById(com.p314xaae8f345.mm.R.id.una);
        }
        jVar4.f335978c.setBackground(drawable);
        em.j jVar5 = this.f146274f;
        if (jVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (jVar5.f335980e == null) {
            jVar5.f335980e = (android.widget.TextView) jVar5.f335976a.findViewById(com.p314xaae8f345.mm.R.id.unb);
        }
        jVar5.f335980e.setText(getContext().getString(lVar.f550620d ? com.p314xaae8f345.mm.R.C30867xcad56011.f575347p64 : com.p314xaae8f345.mm.R.C30867xcad56011.f575348p65));
        em.j jVar6 = this.f146274f;
        if (jVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        jVar6.a().setText(java.lang.String.valueOf(lVar.f550621e));
        em.j jVar7 = this.f146274f;
        if (jVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.TextView a17 = jVar7.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(lVar.f550621e != 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, a17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.j jVar8 = this.f146274f;
        if (jVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (jVar8.f335977b == null) {
            jVar8.f335977b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) jVar8.f335976a.findViewById(com.p314xaae8f345.mm.R.id.t9q);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = jVar8.f335977b;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(lVar.f550623g);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(c22699x3dcdb352, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(c22699x3dcdb352, arrayList6.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, c22699x3dcdb352)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(c22699x3dcdb352, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(c22699x3dcdb352, arrayList8.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (lVar.f550622f) {
            em.j jVar9 = this.f146274f;
            if (jVar9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            com.p314xaae8f345.mm.ui.bk.r0(jVar9.a().getPaint(), 1.0f);
        } else {
            em.j jVar10 = this.f146274f;
            if (jVar10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            android.widget.TextView a18 = jVar10.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getCountTv(...)");
            com.p314xaae8f345.mm.ui.fk.c(a18);
        }
        em.j jVar11 = this.f146274f;
        if (jVar11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (jVar11.f335979d == null) {
            jVar11.f335979d = (android.widget.LinearLayout) jVar11.f335976a.findViewById(com.p314xaae8f345.mm.R.id.f568809o43);
        }
        android.widget.LinearLayout linearLayout = jVar11.f335979d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getTextContainer(...)");
        int h17 = lVar.f550623g ? 0 : i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = h17;
    }
}
