package mu1;

/* loaded from: classes15.dex */
public class g extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f412895g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f412896h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f412897i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f412898j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f412899k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f412900l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f412901m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f412902n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f412903o;

    @Override // mu1.a
    public void g() {
        this.f412895g = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.kri);
        this.f412896h = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.krk);
        this.f412897i = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.krj);
        this.f412898j = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.ahi);
        this.f412899k = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.ahk);
        this.f412900l = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.ahj);
        this.f412902n = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bcu);
        this.f412903o = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b89);
    }

    @Override // mu1.a
    public void h() {
        r45.w50 w50Var;
        r45.w50 w50Var2;
        if (this.f412867a.s0().f470093s == null || this.f412867a.s0().f470093s.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
        } else {
            java.util.LinkedList linkedList = this.f412867a.s0().f470093s;
            if (linkedList.size() == 1) {
                w50Var2 = (r45.w50) linkedList.get(0);
                w50Var = null;
            } else {
                r45.w50 w50Var3 = (r45.w50) linkedList.get(0);
                w50Var = (r45.w50) linkedList.get(1);
                w50Var2 = w50Var3;
            }
            if (w50Var2 != null) {
                android.view.View view = this.f412895g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f412896h.setText(w50Var2.f470411d);
                this.f412897i.setText(w50Var2.f470412e);
                if (!android.text.TextUtils.isEmpty(w50Var2.f470416i)) {
                    this.f412896h.setTextColor(lu1.a0.d(w50Var2.f470416i));
                }
                if (!android.text.TextUtils.isEmpty(w50Var2.f470417m)) {
                    this.f412897i.setTextColor(lu1.a0.d(w50Var2.f470417m));
                }
            }
            if (w50Var != null) {
                android.view.View view2 = this.f412898j;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f412899k.setText(w50Var.f470411d);
                this.f412900l.setText(w50Var.f470412e);
                if (!android.text.TextUtils.isEmpty(w50Var.f470416i)) {
                    this.f412899k.setTextColor(lu1.a0.d(w50Var.f470416i));
                }
                if (!android.text.TextUtils.isEmpty(w50Var.f470417m)) {
                    this.f412900l.setTextColor(lu1.a0.d(w50Var.f470417m));
                }
            }
        }
        if (this.f412867a.B() && !this.f412867a.m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        } else if (this.f412867a.i0().f466724q == null || this.f412867a.i0().f466724q.size() < 1) {
            android.view.View view3 = this.f412901m;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b89);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (this.f412901m == null) {
                this.f412901m = ((android.view.ViewStub) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.bbt)).inflate();
            }
            android.view.View findViewById2 = this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.b89);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f412901m;
            tt1.j jVar = this.f412867a;
            android.view.View.OnClickListener onClickListener = this.f412872f;
            java.util.LinkedList linkedList2 = jVar.i0().f466724q;
            if (linkedList2.size() == 1) {
                android.view.View findViewById3 = view4.findViewById(com.p314xaae8f345.mm.R.id.bbx);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.w50 w50Var4 = (r45.w50) linkedList2.get(0);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg_)).setText(w50Var4.f470411d);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg7)).setText(w50Var4.f470412e);
                view4.findViewById(com.p314xaae8f345.mm.R.id.bbx).setOnClickListener(onClickListener);
                if (!android.text.TextUtils.isEmpty(w50Var4.f470416i)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg_)).setTextColor(lu1.a0.d(w50Var4.f470416i));
                }
                if (!android.text.TextUtils.isEmpty(w50Var4.f470417m)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg7)).setTextColor(lu1.a0.d(w50Var4.f470417m));
                }
                android.view.View findViewById4 = view4.findViewById(com.p314xaae8f345.mm.R.id.bby);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (linkedList2.size() >= 2) {
                r45.w50 w50Var5 = (r45.w50) linkedList2.get(0);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg_)).setText(w50Var5.f470411d);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg7)).setText(w50Var5.f470412e);
                if (!android.text.TextUtils.isEmpty(w50Var5.f470416i)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg_)).setTextColor(lu1.a0.d(w50Var5.f470416i));
                }
                if (!android.text.TextUtils.isEmpty(w50Var5.f470417m)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg7)).setTextColor(lu1.a0.d(w50Var5.f470417m));
                }
                r45.w50 w50Var6 = (r45.w50) linkedList2.get(1);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mga)).setText(w50Var6.f470411d);
                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg8)).setText(w50Var6.f470412e);
                if (!android.text.TextUtils.isEmpty(w50Var6.f470416i)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mga)).setTextColor(lu1.a0.d(w50Var6.f470416i));
                }
                if (!android.text.TextUtils.isEmpty(w50Var6.f470417m)) {
                    ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.mg8)).setTextColor(lu1.a0.d(w50Var6.f470417m));
                }
                view4.findViewById(com.p314xaae8f345.mm.R.id.bbx).setOnClickListener(onClickListener);
                view4.findViewById(com.p314xaae8f345.mm.R.id.bby).setOnClickListener(onClickListener);
            }
        }
        if (this.f412867a.F()) {
            android.view.View view5 = this.f412902n;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view6 = this.f412902n;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view6, arrayList9.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) this.f412902n.findViewById(com.p314xaae8f345.mm.R.id.bc6);
            if (android.text.TextUtils.isEmpty(this.f412867a.s0().T)) {
                lu1.g0.e(textView, this.f412867a.i0().f466714d);
            } else {
                textView.setText(this.f412867a.s0().T);
            }
        }
        if (this.f412867a.i0().f466733z == null && this.f412867a.F()) {
            android.view.View view7 = this.f412903o;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view7, arrayList10.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view8 = this.f412903o;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(8);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(view8, arrayList11.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
