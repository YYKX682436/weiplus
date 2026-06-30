package cq4;

/* loaded from: classes10.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d f303017a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d) {
        this.f303017a = c18833x82cf22d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        if (this.f303017a.D) {
            return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(15, 0);
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303017a;
        if (!c18833x82cf22d.D || viewHolder.m8185xcdaf1228() != target.m8185xcdaf1228()) {
            return false;
        }
        int m8183xf806b362 = viewHolder.m8183xf806b362();
        int m8183xf806b3622 = target.m8183xf806b362();
        ((kp4.a) c18833x82cf22d.C.get(m8183xf806b362)).f392612i = m8183xf806b3622;
        ((kp4.a) c18833x82cf22d.C.get(m8183xf806b3622)).f392612i = m8183xf806b362;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8150x87567217(m8183xf806b362, m8183xf806b3622);
        }
        java.util.Collections.swap(c18833x82cf22d.C, m8183xf806b362, m8183xf806b3622);
        cq4.u sortCallback = c18833x82cf22d.getSortCallback();
        if (sortCallback != null) {
            sortCallback.mo122462xc39cb650(m8183xf806b362 - 1, m8183xf806b3622 - 1);
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18833x82cf22d c18833x82cf22d = this.f303017a;
        if (c18833x82cf22d.D) {
            java.util.Objects.toString(k3Var);
            if (k3Var != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c18833x82cf22d.getRecyclerView().getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                int m8183xf806b362 = k3Var.m8183xf806b362();
                int b17 = ((int) c18833x82cf22d.f257680u) - (i65.a.b(c18833x82cf22d.getRecyclerView().getContext(), 56) / 2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(b17));
                arrayList.add(java.lang.Integer.valueOf(m8183xf806b362));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                java.util.Iterator it = c18833x82cf22d.C.iterator();
                while (it.hasNext()) {
                    ((kp4.a) it.next()).f392611h = true;
                }
                kp4.r rVar = c18833x82cf22d.f257669g;
                rVar.m8151xc67946d3(0, rVar.mo1894x7e414b06());
            }
            if (k3Var == null && i17 == 0) {
                cq4.u sortCallback = c18833x82cf22d.getSortCallback();
                if (sortCallback != null) {
                    sortCallback.a();
                }
                c18833x82cf22d.f257673n = true;
                java.util.Iterator it6 = c18833x82cf22d.C.iterator();
                while (it6.hasNext()) {
                    ((kp4.a) it6.next()).f392611h = false;
                }
                c18833x82cf22d.post(new cq4.q(c18833x82cf22d));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
