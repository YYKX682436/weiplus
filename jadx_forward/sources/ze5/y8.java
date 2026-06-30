package ze5;

/* loaded from: classes9.dex */
public abstract class y8 {
    public static final ze5.na a(yz5.p creator, yz5.r binder, yz5.p shown) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binder, "binder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shown, "shown");
        return new ze5.x8(creator, binder, shown);
    }

    public static final void b(java.util.List list, android.widget.LinearLayout viewArea, yb5.d ui6, rd5.d msgData, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder) {
        java.util.Iterator it;
        java.lang.String str;
        int i17;
        ze5.x8 x8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewArea, "viewArea");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.Iterator it6 = list.iterator();
        int i18 = 0;
        int i19 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ze5.na naVar = (ze5.na) next;
            java.lang.String name = naVar.getClass().getName();
            ze5.x8 x8Var2 = (ze5.x8) naVar;
            if (((java.lang.Boolean) x8Var2.f553834c.mo149xb9724478(ui6, msgData)).booleanValue()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                it = it6;
                yj0.a.d(viewArea, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(viewArea, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewArea.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(viewArea, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(viewArea, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view = (android.view.View) q26.h0.h(new n3.r1(viewArea), i19);
                if (view != null) {
                    i17 = com.p314xaae8f345.mm.R.id.uje;
                    str = name;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getTag(com.p314xaae8f345.mm.R.id.uje), str)) {
                        x8Var = x8Var2;
                        android.view.View childAt = viewArea.getChildAt(i19);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        x8Var.f553833b.C(childAt, ui6, msgData, holder);
                        i19++;
                    }
                } else {
                    str = name;
                    i17 = com.p314xaae8f345.mm.R.id.uje;
                }
                x8Var = x8Var2;
                android.view.View view2 = (android.view.View) x8Var.f553832a.mo149xb9724478(ui6, viewArea);
                view2.setTag(i17, str);
                if (view == null) {
                    viewArea.addView(view2);
                } else {
                    viewArea.removeViewAt(i19);
                    viewArea.addView(view2, i19);
                }
                android.view.View childAt2 = viewArea.getChildAt(i19);
                java.util.ArrayList arrayList32 = new java.util.ArrayList();
                arrayList32.add(0);
                java.util.Collections.reverse(arrayList32);
                yj0.a.d(childAt2, arrayList32.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                x8Var.f553833b.C(childAt2, ui6, msgData, holder);
                i19++;
            } else {
                it = it6;
                android.view.View view3 = (android.view.View) q26.h0.h(new n3.r1(viewArea), i19);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view3 != null ? view3.getTag(com.p314xaae8f345.mm.R.id.uje) : null, name) && view3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            it6 = it;
            i18 = i27;
        }
        while (viewArea.getChildCount() > i19) {
            viewArea.removeViewAt(viewArea.getChildCount() - 1);
        }
        if (i19 == 0) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(viewArea, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList5.get(0)).intValue();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(viewArea, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewArea.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(viewArea, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMvvmBaseItemKt", "filling", "(Ljava/util/List;Landroid/widget/LinearLayout;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(viewArea, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
