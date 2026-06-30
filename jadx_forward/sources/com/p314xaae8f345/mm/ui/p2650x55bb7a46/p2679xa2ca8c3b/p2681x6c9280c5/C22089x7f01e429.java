package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/d0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView */
/* loaded from: classes9.dex */
public final class C22089x7f01e429 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.d0> {

    /* renamed from: f, reason: collision with root package name */
    public em.w f286169f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22089x7f01e429(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e28, (android.view.ViewGroup) this, false);
        this.f286169f = new em.w(inflate);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.Long l17;
        z01.d0 d0Var = (z01.d0) pVar2;
        if (d0Var == null) {
            return;
        }
        java.lang.CharSequence charSequence = d0Var.f550519d;
        if (charSequence != null) {
            em.w wVar = this.f286169f;
            if (wVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (wVar.f336414f == null) {
                wVar.f336414f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) wVar.f336409a.findViewById(com.p314xaae8f345.mm.R.id.v0m);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = wVar.f336414f;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            ((ke0.e) xVar).getClass();
            c22632xdab56332.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        }
        java.lang.CharSequence charSequence2 = d0Var.f550521f;
        if (charSequence2 != null) {
            java.lang.String string = getContext().getString(d0Var.f550520e.f550510d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            em.w wVar2 = this.f286169f;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (wVar2.f336411c == null) {
                wVar2.f336411c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) wVar2.f336409a.findViewById(com.p314xaae8f345.mm.R.id.v0t);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = wVar2.f336411c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = getContext();
            if (!r26.n0.N(string)) {
                charSequence2 = string + ' ' + ((java.lang.Object) charSequence2);
            }
            ((ke0.e) xVar2).getClass();
            c22632xdab563322.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, charSequence2));
        }
        java.lang.Long l18 = d0Var.f550522g;
        if (l18 != null) {
            long longValue = l18.longValue();
            android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance();
            int i17 = calendar.get(1);
            int i18 = calendar.get(2) + 1;
            int i19 = calendar.get(5);
            java.lang.String format = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(calendar.get(11))}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String format2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(calendar.get(12))}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            java.lang.String string2 = i17 != calendar2.get(1) ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p7_, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), format, format2) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p79, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), format, format2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            em.w wVar3 = this.f286169f;
            if (wVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (wVar3.f336415g == null) {
                wVar3.f336415g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) wVar3.f336409a.findViewById(com.p314xaae8f345.mm.R.id.v0u);
            }
            wVar3.f336415g.setText(string2);
        }
        android.view.View.OnLongClickListener onLongClickListener = d0Var.f550527o;
        if (onLongClickListener != null) {
            setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnClickListener onClickListener = d0Var.f550524i;
        if (onClickListener != null) {
            em.w wVar4 = this.f286169f;
            if (wVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            wVar4.a().setOnClickListener(onClickListener);
            setOnClickListener(onClickListener);
        }
        em.w wVar5 = this.f286169f;
        if (wVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.FrameLayout c17 = wVar5.c();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d0Var.f550525m != null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, c17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(c17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View.OnClickListener onClickListener2 = d0Var.f550525m;
        if (onClickListener2 != null) {
            em.w wVar6 = this.f286169f;
            if (wVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            wVar6.c().setOnClickListener(onClickListener2);
        }
        em.w wVar7 = this.f286169f;
        if (wVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.FrameLayout b17 = wVar7.b();
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(d0Var.f550526n != null);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(b17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(b17, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, b17)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(b17, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(b17, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingScheduleMsgMvvmView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;Lcom/tencent/mm/modelchatting/ScheduleMsgViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View.OnClickListener onClickListener3 = d0Var.f550526n;
        if (onClickListener3 != null) {
            em.w wVar8 = this.f286169f;
            if (wVar8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            wVar8.b().setOnClickListener(onClickListener3);
        }
        android.widget.FrameLayout[] frameLayoutArr = new android.widget.FrameLayout[4];
        em.w wVar9 = this.f286169f;
        if (wVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        frameLayoutArr[0] = wVar9.c();
        em.w wVar10 = this.f286169f;
        if (wVar10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        frameLayoutArr[1] = wVar10.b();
        em.w wVar11 = this.f286169f;
        if (wVar11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        frameLayoutArr[2] = wVar11.a();
        frameLayoutArr[3] = this;
        for (android.widget.FrameLayout frameLayout : kz5.c0.i(frameLayoutArr)) {
            em.w wVar12 = this.f286169f;
            if (wVar12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout, wVar12.c())) {
                str = "reminder_again_btn";
            } else {
                em.w wVar13 = this.f286169f;
                if (wVar13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout, wVar13.b())) {
                    str = "modify_reminder_time_btn";
                } else {
                    em.w wVar14 = this.f286169f;
                    if (wVar14 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout, wVar14.a())) {
                        str = "learn_more_btn";
                    } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout, this)) {
                        return;
                    } else {
                        str = "other_areas_btn";
                    }
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
            dy1.a.i(frameLayout, str);
            dy1.a.l(frameLayout, 8, 35684);
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str2 = pj5.u.f436940a;
            if (str2 == null) {
                str2 = "";
            }
            lVarArr[0] = new jz5.l("reminder_sessionid", str2);
            z01.d0 m48328xa0ab20ce = m48328xa0ab20ce();
            lVarArr[1] = new jz5.l("msgsvrid", java.lang.Long.valueOf((m48328xa0ab20ce == null || (l17 = m48328xa0ab20ce.f550523h) == null) ? 0L : l17.longValue()));
            dy1.a.k(frameLayout, kz5.c1.k(lVarArr));
        }
    }

    public /* synthetic */ C22089x7f01e429(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22089x7f01e429(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
