package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 f206399d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var) {
        this.f206399d = b0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f206399d.f204850h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        jz5.f0 f0Var;
        r45.l95 l95Var;
        r45.e95 e95Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var = this.f206399d;
            java.lang.Object obj = b0Var.f204850h.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.ro2 ro2Var = (r45.ro2) obj;
            r45.v96 v96Var = (r45.v96) ro2Var.m75936x14adae67(0);
            if (v96Var == null || (l95Var = v96Var.f469542d) == null || (e95Var = l95Var.f460774d) == null) {
                f0Var = null;
            } else {
                java.lang.String m75945x2fec8307 = ro2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder).f206393d.setText(e95Var.f454698e);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
                    java.lang.String m75945x2fec83072 = ro2Var.m75945x2fec8307(1);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = e95Var.f454698e;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83072);
                    xVar.f206393d.setText(l4Var.c(m75945x2fec83072, ""));
                }
                java.lang.String m75945x2fec83073 = ro2Var.m75945x2fec8307(2);
                if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder).f206396g.setText(e95Var.f454708r);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x xVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
                    java.lang.String m75945x2fec83074 = ro2Var.m75945x2fec8307(1);
                    if (m75945x2fec83074 == null) {
                        m75945x2fec83074 = e95Var.f454708r;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83074);
                    xVar2.f206396g.setText(l4Var2.c(m75945x2fec83074, ""));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x xVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder;
                xVar3.f206394e.setText(e95Var.f454712v);
                android.view.View view = xVar3.f206395f;
                int i18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e95Var.f454712v) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar3.f206396g.getText().toString())) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.y(b0Var, e95Var));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x xVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x) holder;
                xVar4.f206393d.setVisibility(8);
                xVar4.f206394e.setVisibility(8);
                xVar4.f206396g.setVisibility(8);
                android.view.View view2 = xVar4.f206395f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f206399d.f204846d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b6q, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.x(inflate);
    }
}
