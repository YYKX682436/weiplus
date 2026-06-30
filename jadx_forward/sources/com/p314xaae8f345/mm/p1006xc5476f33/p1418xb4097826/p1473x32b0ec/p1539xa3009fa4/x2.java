package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class x2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 f199055d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var) {
        this.f199055d = z2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f199055d.f199093g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n2 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var = this.f199055d;
        java.lang.Object obj = z2Var.f199093g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m2) obj;
        holder.f198802f.setText(m2Var.f198769b);
        holder.f198803g.setText(m2Var.f198770c);
        android.view.View view = holder.f198804h;
        int i18 = m2Var.f198771d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f198801e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u2(m2Var, z2Var, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l2 l2Var = m2Var.f198772e;
        if (l2Var != null) {
            holder.f198806m.setText(l2Var.f198745b);
            holder.f198807n.setText(l2Var.f198746c);
            boolean z17 = l2Var.f198747d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = holder.f198808o;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.w2(z2Var, l2Var, this));
            if (m2Var.f198771d) {
                android.view.View view2 = holder.f198805i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view3 = holder.f198805i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.view.View view4 = holder.f198805i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$VisibleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f199055d.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n2(inflate);
    }
}
