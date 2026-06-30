package com.tencent.mm.chatting.widget;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/chatting/widget/ChattingExpandOptView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingExpandOptView extends com.tencent.mm.mvvm.MvvmView<z01.l> {

    /* renamed from: f, reason: collision with root package name */
    public em.j f64741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingExpandOptView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0t, (android.view.ViewGroup) this, false);
        this.f64741f = new em.j(inflate);
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        z01.l lVar = (z01.l) pVar2;
        if (lVar == null) {
            return;
        }
        setOnClickListener(lVar.f469092i);
        int color = getContext().getColor((!lVar.f469091h || com.tencent.mm.ui.bk.C()) ? com.tencent.mm.R.color.adg : com.tencent.mm.R.color.abw);
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(lVar.f469091h ? com.tencent.mm.R.drawable.czm : com.tencent.mm.R.drawable.czl);
        em.j jVar = this.f64741f;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (jVar.f254447e == null) {
            jVar.f254447e = (android.widget.TextView) jVar.f254443a.findViewById(com.tencent.mm.R.id.unb);
        }
        jVar.f254447e.setTextColor(color);
        if (lVar.f469089f) {
            em.j jVar2 = this.f64741f;
            if (jVar2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            jVar2.a().setTextColor(getContext().getColor(com.tencent.mm.R.color.abw));
        } else {
            em.j jVar3 = this.f64741f;
            if (jVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            jVar3.a().setTextColor(color);
        }
        em.j jVar4 = this.f64741f;
        if (jVar4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (jVar4.f254445c == null) {
            jVar4.f254445c = (android.widget.LinearLayout) jVar4.f254443a.findViewById(com.tencent.mm.R.id.una);
        }
        jVar4.f254445c.setBackground(drawable);
        em.j jVar5 = this.f64741f;
        if (jVar5 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (jVar5.f254447e == null) {
            jVar5.f254447e = (android.widget.TextView) jVar5.f254443a.findViewById(com.tencent.mm.R.id.unb);
        }
        jVar5.f254447e.setText(getContext().getString(lVar.f469087d ? com.tencent.mm.R.string.f493814p64 : com.tencent.mm.R.string.f493815p65));
        em.j jVar6 = this.f64741f;
        if (jVar6 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        jVar6.a().setText(java.lang.String.valueOf(lVar.f469088e));
        em.j jVar7 = this.f64741f;
        if (jVar7 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.TextView a17 = jVar7.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(lVar.f469088e != 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        em.j jVar8 = this.f64741f;
        if (jVar8 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (jVar8.f254444b == null) {
            jVar8.f254444b = (com.tencent.mm.ui.widget.imageview.WeImageView) jVar8.f254443a.findViewById(com.tencent.mm.R.id.t9q);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = jVar8.f254444b;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(lVar.f469090g);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(weImageView, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(weImageView, arrayList6.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, weImageView)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(weImageView, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(weImageView, arrayList8.toArray(), "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/chatting/widget/ChattingExpandOptView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ExpandOptViewModel;Lcom/tencent/mm/modelchatting/ExpandOptViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (lVar.f469089f) {
            em.j jVar9 = this.f64741f;
            if (jVar9 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.bk.r0(jVar9.a().getPaint(), 1.0f);
        } else {
            em.j jVar10 = this.f64741f;
            if (jVar10 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.TextView a18 = jVar10.a();
            kotlin.jvm.internal.o.f(a18, "getCountTv(...)");
            com.tencent.mm.ui.fk.c(a18);
        }
        em.j jVar11 = this.f64741f;
        if (jVar11 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (jVar11.f254446d == null) {
            jVar11.f254446d = (android.widget.LinearLayout) jVar11.f254443a.findViewById(com.tencent.mm.R.id.f487276o43);
        }
        android.widget.LinearLayout linearLayout = jVar11.f254446d;
        kotlin.jvm.internal.o.f(linearLayout, "getTextContainer(...)");
        int h17 = lVar.f469090g ? 0 : i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = h17;
    }
}
