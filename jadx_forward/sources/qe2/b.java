package qe2;

/* loaded from: classes10.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 S1;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f443566d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f443567e;

    public b(android.content.Context context, java.util.List items, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f443566d = context;
        this.f443567e = items;
        this.S1 = panel;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f443567e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ya2.b2 b17;
        qe2.f holder = (qe2.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        qe2.c cell = (qe2.c) this.f443567e.get(i17);
        android.content.Context context = this.f443566d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cell, "cell");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 panel = this.S1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(cell.f443570c, null, 2, null), holder.f443578d, yo0.i.f545627o.a());
        java.lang.String str = cell.f443569b;
        android.widget.TextView textView = holder.f443579e;
        textView.setText(str);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = cell.f443572e;
        if (c19780xceb4c4dc == null) {
            java.lang.String str2 = cell.f443568a;
            c19780xceb4c4dc = (!(str2.length() > 0) || (b17 = ya2.h.f542017a.b(str2)) == null) ? null : b17.f69300x731cac1b;
        }
        java.lang.String m76029xad9975ba = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76029xad9975ba() : null;
        boolean z17 = m76029xad9975ba == null || m76029xad9975ba.length() == 0;
        android.widget.ImageView imageView = holder.f443582h;
        if (z17) {
            android.view.View view = holder.f443581g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
        } else {
            android.view.View view2 = holder.f443581g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f443580f.setText(c19780xceb4c4dc != null ? c19780xceb4c4dc.m76029xad9975ba() : null);
            int m76027x1cbb0791 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0;
            if (m76027x1cbb0791 > 0) {
                imageView.setVisibility(0);
                java.lang.String m76028x11716638 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76028x11716638() : null;
                if (!(m76028x11716638 == null || m76028x11716638.length() == 0)) {
                    vo0.d e17 = g1Var.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19780xceb4c4dc);
                    e17.c(new mn2.q3(c19780xceb4c4dc.m76028x11716638(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.B));
                } else if (m76027x1cbb0791 == 1 || m76027x1cbb0791 == 2) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79912xe883d012);
                } else {
                    imageView.setVisibility(8);
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z18 = cell.f443573f;
        android.view.View view3 = holder.f443583i;
        if (z18) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setOnClickListener(null);
        } else {
            boolean z19 = cell.f443571d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f443585n;
            android.widget.TextView textView2 = holder.f443584m;
            if (z19) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563251a34);
                c22699x3dcdb352.setVisibility(8);
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4));
                view3.setOnClickListener(null);
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563250a33);
                c22699x3dcdb352.setVisibility(0);
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575245oq5));
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                view3.setOnClickListener(new qe2.d(context, cell));
            }
        }
        holder.f3639x46306858.setOnClickListener(new qe2.e(panel, context, cell));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9t, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new qe2.f(inflate);
    }
}
