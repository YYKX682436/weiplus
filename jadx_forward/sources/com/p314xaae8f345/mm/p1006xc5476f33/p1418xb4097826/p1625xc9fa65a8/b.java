package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f207152d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f207153e;

    /* renamed from: f, reason: collision with root package name */
    public int f207154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b f207155g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 3 : i17;
        this.f207155g = activityC14941x5c78ef2b;
        this.f207152d = i17;
    }

    public static void x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b bVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, boolean z17, int i18, java.lang.Object obj) {
        r45.mu2 mu2Var;
        java.lang.String str;
        bVar.getClass();
        boolean z18 = k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = bVar.f207155g;
        if (z18) {
            if (bVar.mo863xcdaf1228(i17) == 1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c) k3Var).f207173d.setText(activityC14941x5c78ef2b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572850dw3));
                return;
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c) k3Var).f207173d.setText(activityC14941x5c78ef2b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw7));
                return;
            }
        }
        if (bVar.f207152d == 3 && bVar.f207153e && bVar.f207154f != activityC14941x5c78ef2b.f207045i.size()) {
            int i19 = bVar.f207154f + 1;
            java.util.ArrayList arrayList = activityC14941x5c78ef2b.f207045i;
            mu2Var = i17 < i19 ? (r45.mu2) arrayList.get(i17 - 1) : (r45.mu2) arrayList.get(i17 - 2);
        } else {
            mu2Var = (r45.mu2) activityC14941x5c78ef2b.f207045i.get(i17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mu2Var);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        activityC14941x5c78ef2b.getClass();
        java.util.HashMap hashMap = activityC14941x5c78ef2b.f207055v;
        if (!hashMap.containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0();
            e0Var.f207199b = str;
            e0Var.f207198a = i17;
            e0Var.f207200c = 1;
            e0Var.f207201d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0) {
                activityC14941x5c78ef2b.Y6(false);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 v2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.a(activityC14941x5c78ef2b, i17);
        boolean z19 = i17 != 0;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2.B;
        v2Var.k(mu2Var, aVar, null, z19);
        android.view.View findViewById = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gbd);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gak);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        if (((c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76185xde293b4f() : 0) & 4) > 0) {
            android.view.View findViewById3 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.eom);
            if (findViewById3 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById4 = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.eom);
        if (findViewById4 == null) {
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$ContactSearchProfileAdapter", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int i17 = this.f207152d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = this.f207155g;
        if (i17 == 3 && activityC14941x5c78ef2b.f207045i.size() != 0) {
            this.f207154f = 0;
            this.f207153e = false;
            java.util.Iterator it = activityC14941x5c78ef2b.f207045i.iterator();
            while (it.hasNext()) {
                r45.mu2 mu2Var = (r45.mu2) it.next();
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b.E;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemCount isFollow:");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", sb6.toString());
                ya2.g gVar = ya2.h.f542017a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                if (!ya2.g.h(gVar, c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null, null, false, false, 14, null)) {
                    break;
                }
                this.f207153e = true;
                this.f207154f++;
            }
            if (this.f207153e) {
                return this.f207154f == activityC14941x5c78ef2b.f207045i.size() ? activityC14941x5c78ef2b.f207045i.size() : activityC14941x5c78ef2b.f207045i.size() + 2;
            }
        }
        return activityC14941x5c78ef2b.f207045i.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (this.f207152d != 3 || !this.f207153e || this.f207154f == this.f207155g.f207045i.size()) {
            return 3;
        }
        if (i17 == 0) {
            return 1;
        }
        return i17 == this.f207154f + 1 ? 2 : 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        x(this, holder, i17, false, 4, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = this.f207155g;
        if (i17 == 3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14941x5c78ef2b.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x76847179);
            android.view.View inflate = mo55332x76847179.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.av9, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2(inflate, false, false, true, 6, null);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC14941x5c78ef2b.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo55332x768471792);
        android.view.View inflate2 = mo55332x768471792.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c(activityC14941x5c78ef2b, inflate2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(this, holder, i17, false, 4, null);
    }
}
