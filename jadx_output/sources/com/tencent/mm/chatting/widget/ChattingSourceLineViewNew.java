package com.tencent.mm.chatting.widget;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/chatting/widget/ChattingSourceLineViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "La11/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingSourceLineViewNew extends com.tencent.mm.mvvm.MvvmView<a11.b> {

    /* renamed from: f, reason: collision with root package name */
    public em.y f64742f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingSourceLineViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e2_, (android.view.ViewGroup) this, false);
        this.f64742f = new em.y(inflate);
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        android.graphics.drawable.Drawable mutate;
        android.graphics.drawable.Drawable mutate2;
        a11.b bVar = (a11.b) pVar2;
        if (bVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(this, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (bVar.f503g != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(this, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yz5.l lVar = bVar.f503g;
            if (lVar != null) {
                em.y yVar = this.f64742f;
                if (yVar == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                com.tencent.mm.ui.widget.imageview.WeImageView a17 = yVar.a();
                kotlin.jvm.internal.o.f(a17, "getSourceIv(...)");
                em.y yVar2 = this.f64742f;
                if (yVar2 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                com.tencent.mm.ui.widget.MMTextView b17 = yVar2.b();
                kotlin.jvm.internal.o.f(b17, "getSourceTv(...)");
                lVar.invoke(new a11.c(this, a17, b17));
            }
            em.y yVar3 = this.f64742f;
            if (yVar3 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            if (yVar3.a().getIconColor() != 0) {
                em.y yVar4 = this.f64742f;
                if (yVar4 != null) {
                    yVar4.a().setEnableColorFilter(true);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
            }
            em.y yVar5 = this.f64742f;
            if (yVar5 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            yVar5.a().setEnableColorFilter(false);
            em.y yVar6 = this.f64742f;
            if (yVar6 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.graphics.drawable.Drawable drawable = yVar6.a().getDrawable();
            if (drawable != null && (mutate2 = drawable.mutate()) != null) {
                mutate2.clearColorFilter();
            }
            em.y yVar7 = this.f64742f;
            if (yVar7 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.graphics.drawable.Drawable drawable2 = yVar7.a().getDrawable();
            if (drawable2 == null || (mutate = drawable2.mutate()) == null) {
                return;
            }
            mutate.setAlpha(255);
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!bVar.f500d && r26.n0.N(bVar.f501e)) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(this, arrayList8.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(this, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        em.y yVar8 = this.f64742f;
        if (yVar8 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView a18 = yVar8.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar.f500d);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(a18, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(a18, arrayList10.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a18.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(a18, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a18, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, a18)) == null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(a18, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue6 = ((java.lang.Integer) arrayList11.get(0)).intValue();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Integer.valueOf(intValue6));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(a18, arrayList12.toArray(), "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a18.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(a18, "com/tencent/mm/chatting/widget/ChattingSourceLineViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;Lcom/tencent/mm/modelchatting/basiswidget/SourceLineViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a18, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.y yVar9 = this.f64742f;
        if (yVar9 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        yVar9.b().setText(bVar.f501e);
        em.y yVar10 = this.f64742f;
        if (yVar10 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        com.tencent.mm.ui.widget.MMTextView b18 = yVar10.b();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(bVar.f502f);
        java.lang.Integer num = valueOf2.intValue() != 0 ? valueOf2 : null;
        b18.setTextColor(num != null ? num.intValue() : getContext().getColor(com.tencent.mm.R.color.adg));
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void f() {
        android.graphics.drawable.Drawable mutate;
        android.graphics.drawable.Drawable mutate2;
        em.y yVar = this.f64742f;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        android.graphics.drawable.Drawable drawable = yVar.a().getDrawable();
        if (drawable != null && (mutate2 = drawable.mutate()) != null) {
            mutate2.clearColorFilter();
        }
        em.y yVar2 = this.f64742f;
        if (yVar2 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        android.graphics.drawable.Drawable drawable2 = yVar2.a().getDrawable();
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            mutate.setAlpha(255);
        }
        em.y yVar3 = this.f64742f;
        if (yVar3 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        yVar3.a().setImageDrawable(null);
        em.y yVar4 = this.f64742f;
        if (yVar4 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        yVar4.a().setIconColor(0);
        em.y yVar5 = this.f64742f;
        if (yVar5 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        yVar5.a().setIconAlpha(1.0f);
        em.y yVar6 = this.f64742f;
        if (yVar6 != null) {
            yVar6.a().setEnableColorFilter(false);
        } else {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
    }

    public /* synthetic */ ChattingSourceLineViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingSourceLineViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
