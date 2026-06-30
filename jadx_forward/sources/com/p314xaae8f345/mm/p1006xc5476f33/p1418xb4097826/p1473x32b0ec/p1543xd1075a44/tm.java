package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class tm implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm f201427d;

    public tm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar) {
        this.f201427d = wmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.f201427d;
        java.lang.String str = wmVar.f201745m;
        java.lang.String str2 = wmVar.f201741f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleLongPress - giftId is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleLongPress - giftId=".concat(str));
            ce2.i e17 = dk2.u7.f315714a.e(str);
            if (e17 == null || e17.z0().isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "handleLongPress - no batch config, showing toast");
                android.view.ViewGroup viewGroup = wmVar.f201739d;
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dja));
                vg2.y1 y1Var = wmVar.f201754v;
                if (y1Var != null) {
                    y1Var.f518159e.dismiss();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleLongPress - showing batch select panel");
                vg2.y1 y1Var2 = wmVar.f201754v;
                if (y1Var2 != null) {
                    android.view.ViewGroup clickArea = wmVar.f201742g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clickArea, "clickArea");
                    r45.kv1 c17 = e17.c1();
                    y1Var2.f518163i = c17;
                    r45.qv1 qv1Var = (r45.qv1) c17.m75936x14adae67(23);
                    java.util.LinkedList m75941xfb821914 = qv1Var != null ? qv1Var.m75941xfb821914(0) : null;
                    int size = m75941xfb821914 != null ? m75941xfb821914.size() : 0;
                    android.widget.PopupWindow popupWindow = y1Var2.f518159e;
                    if (size == 0) {
                        popupWindow.dismiss();
                    } else {
                        java.util.LinkedList linkedList = y1Var2.f518161g;
                        linkedList.clear();
                        if (m75941xfb821914 != null) {
                            linkedList.addAll(m75941xfb821914);
                        }
                        y1Var2.f518162h.m8151xc67946d3(0, linkedList.size());
                        android.view.View view2 = y1Var2.f518158d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        popupWindow.showAtLocation(clickArea, 51, 0, 0);
                        popupWindow.setOnDismissListener(null);
                        y1Var2.f518158d.getViewTreeObserver().addOnPreDrawListener(new vg2.x1(y1Var2, clickArea));
                    }
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
