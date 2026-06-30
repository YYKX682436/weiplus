package wv1;

/* loaded from: classes12.dex */
public abstract class e extends wv1.a {
    @Override // wv1.a
    public void l(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        wv1.o oVar = (wv1.o) k3Var;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            o(oVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wv1.d(this, oVar));
        }
    }

    public java.lang.String m() {
        return "";
    }

    @Override // wv1.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(wv1.o oVar, int i17, wv1.a aVar) {
        boolean containsKey;
        oVar.f531493e.setTag(this);
        oVar.f531501p.setTag(this);
        n11.a b17 = n11.a.b();
        java.lang.String m17 = m();
        android.content.Context b18 = b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
        o11.g gVar = (o11.g) r2Var.get(4);
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f423618i = 1;
            fVar.f423631v = true;
            fVar.f423620k = i65.a.B(b18) / 4;
            fVar.f423619j = i65.a.B(b18) / 4;
            fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.a0y;
            gVar = fVar.a();
            r2Var.put(4, gVar);
        }
        b17.h(m17, oVar.f531493e, gVar);
        android.view.View view = oVar.f531497i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.f531498m.setVisibility(8);
        oVar.f531495g.setVisibility(8);
        oVar.f531496h.setVisibility(8);
        android.view.View view2 = oVar.f531501p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.CheckBox checkBox = oVar.f531500o;
        checkBox.setVisibility(0);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            o(oVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new wv1.d(this, oVar));
        }
        xv1.b a17 = a();
        long f17 = f();
        java.util.Map map = a17.f538921b;
        if (map == null) {
            containsKey = false;
        } else {
            containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(f17));
        }
        android.widget.ImageView imageView = oVar.f531499n;
        if (containsKey) {
            imageView.setVisibility(8);
            checkBox.setChecked(true);
        } else {
            imageView.setVisibility(0);
            checkBox.setChecked(false);
        }
        if (i()) {
            android.view.View view3 = oVar.f531492d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view4 = oVar.f531492d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.6f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void o(wv1.o oVar) {
        int i17 = this.f531466e;
        if (i17 == 0) {
            oVar.f531502q.setVisibility(8);
            oVar.f531494f.setVisibility(8);
            android.widget.CheckBox checkBox = oVar.f531500o;
            checkBox.setVisibility(0);
            android.view.View view = oVar.f531501p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setChecked(false);
            oVar.f531503r.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            oVar.f531502q.setVisibility(0);
            oVar.f531494f.setVisibility(8);
            oVar.f531500o.setVisibility(8);
            android.view.View view2 = oVar.f531501p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f531503r.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            oVar.f531502q.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = oVar.f531494f;
            c22626x3e1b8dda.setVisibility(0);
            oVar.f531500o.setVisibility(8);
            android.view.View view3 = oVar.f531501p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f531503r.setVisibility(8);
            long j17 = this.f531465d;
            if (j17 > 0) {
                int i18 = (int) ((((float) this.f531464c) / ((float) j17)) * 100.0f);
                if (i18 == -1 || i18 >= 100) {
                    c22626x3e1b8dda.m81381x3ae760af(100);
                    return;
                } else {
                    c22626x3e1b8dda.m81381x3ae760af(i18);
                    return;
                }
            }
            return;
        }
        if (i17 == 3) {
            oVar.f531502q.setVisibility(8);
            oVar.f531494f.setVisibility(8);
            oVar.f531500o.setVisibility(0);
            android.view.View view4 = oVar.f531501p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f531503r.setVisibility(8);
            return;
        }
        if (i17 == 4) {
            oVar.f531502q.setVisibility(8);
            oVar.f531494f.setVisibility(8);
            oVar.f531500o.setVisibility(8);
            android.view.View view5 = oVar.f531501p;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f531503r.setVisibility(0);
            return;
        }
        if (i17 != 5) {
            return;
        }
        oVar.f531502q.setVisibility(8);
        oVar.f531494f.setVisibility(8);
        oVar.f531500o.setVisibility(8);
        android.view.View view6 = oVar.f531501p;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGrid", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar.f531503r.setVisibility(0);
    }
}
