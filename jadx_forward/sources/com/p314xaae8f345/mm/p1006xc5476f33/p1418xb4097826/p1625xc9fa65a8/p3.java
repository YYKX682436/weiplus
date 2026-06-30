package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class p3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements zy2.fc {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 f207348e;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var, boolean z17) {
        this.f207348e = t3Var;
        this.f207347d = z17;
    }

    public static void x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p3 p3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, boolean z17, int i19, java.lang.Object obj) {
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var = p3Var.f207348e;
        if (i18 != 1) {
            if (i18 == 2) {
                int i27 = i17 - 1;
                r45.mu2 mu2Var = (r45.mu2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) t3Var.f207391e).f207104m.get(i27);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) t3Var.f207391e).c((c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c, i27, 1, null, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n3(i17, t3Var);
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2.B;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2) k3Var).k(mu2Var, n3Var, null, true);
                android.view.View view = k3Var.f3639x46306858;
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ffc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) findViewById;
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c15315xe70278e1, "living_label");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                if (c19782x23db1cfa2 != null && c19782x23db1cfa2.m76177x2220c3f4() == 1) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c15315xe70278e1, 40, 26236);
                    java.lang.Object tag = view.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l[] lVarArr = new jz5.l[5];
                    lVarArr[0] = new jz5.l("feed_id", "");
                    lVarArr[1] = new jz5.l("live_id", "");
                    lVarArr[2] = new jz5.l("comment_scene", "23");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.mu2) tag).m75936x14adae67(0);
                    lVarArr[3] = new jz5.l("finder_username", c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76197x6c03c64c() : null);
                    lVarArr[4] = new jz5.l("session_buffer", " ");
                    ((cy1.a) rVar).gk(c15315xe70278e1, kz5.c1.k(lVarArr));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(c15315xe70278e1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.o3.f207334a);
                    return;
                }
                return;
            }
            if (i18 != 8) {
                if (i18 != 9) {
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchSafetyHintHolder");
                java.lang.String safetyHint = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) p3Var.f207348e.f207391e).f207108q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safetyHint, "safetyHint");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e3) k3Var).f207206e.setText(safetyHint);
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactHeaderHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r2) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) t3Var.f207391e;
        boolean z18 = c14951x18cbc2ca.f207104m.size() > 3 && c14951x18cbc2ca.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m3 m3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m3(t3Var);
        android.widget.TextView textView = r2Var.f207368e;
        if (z18) {
            textView.setVisibility(0);
            android.view.View view2 = r2Var.f207369f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r2Var.f3639x46306858.setOnClickListener(m3Var);
        } else {
            textView.setVisibility(8);
            android.view.View view3 = r2Var.f207369f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder", "onBindView", "(ZLandroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r2Var.f3639x46306858.setOnClickListener(null);
        }
        r2Var.f207370g.setText(r2Var.f207367d);
    }

    @Override // zy2.fc
    /* renamed from: getData */
    public java.util.List mo58957xfb7e5820() {
        return kz5.p0.f395529d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var = this.f207348e;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3.a(t3Var) + (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) t3Var.f207391e).f207108q) ? 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var = this.f207348e;
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3.a(t3Var);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) t3Var.f207391e).f207108q);
        int y17 = y(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t3Var.f207393g, "getItemViewType adapterPosition: " + i17 + "  position:" + y17);
        if (i17 == 0 && z17) {
            return 9;
        }
        if (y17 >= a17) {
            return 1;
        }
        if (y17 == 0) {
            return t3Var.g() ? 8 : 1;
        }
        return 2;
    }

    @Override // zy2.fc
    public java.util.List l() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) this.f207348e.f207391e).f207104m;
    }

    @Override // zy2.fc
    public int n(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207348e.f207393g, "onBindViewHolder position:" + i17);
        x(this, holder, y(i17), mo863xcdaf1228(i17), false, 8, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r2 r2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3 t3Var = this.f207348e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t3Var.f207393g, "onCreateViewHolder viewType: " + i17);
        int i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570566b35;
        boolean z17 = this.f207347d;
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t3Var.f207390d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
            android.view.LayoutInflater layoutInflater = abstractActivityC21394xb3d2c0cf.getLayoutInflater();
            if (!z17) {
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570565b34;
            }
            android.view.View inflate = layoutInflater.inflate(i18, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            java.lang.String string = parent.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r2(inflate, string);
        } else {
            if (i17 == 2) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = t3Var.f207390d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf2);
                android.view.View inflate2 = abstractActivityC21394xb3d2c0cf2.getLayoutInflater().inflate(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.afj : com.p314xaae8f345.mm.R.C30864xbddafb2a.afi, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2(inflate2, false, false, false, 14, null);
            }
            if (i17 != 8) {
                if (i17 != 9) {
                    android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b38, parent, false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yu(inflate3);
                }
                android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aik, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e3(inflate4);
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = t3Var.f207390d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf3);
            android.view.LayoutInflater layoutInflater2 = abstractActivityC21394xb3d2c0cf3.getLayoutInflater();
            if (!z17) {
                i18 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570565b34;
            }
            android.view.View inflate5 = layoutInflater2.inflate(i18, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
            java.lang.String string2 = parent.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r2(inflate5, string2);
        }
        return r2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams;
        boolean z17 = true;
        if (holder.m8185xcdaf1228() != 1 && holder.m8185xcdaf1228() != 8 && holder.m8185xcdaf1228() != 2 && holder.m8185xcdaf1228() != 9) {
            z17 = false;
        }
        layoutParams2.f93474i = z17;
    }

    public final int y(int i17) {
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca) this.f207348e.f207391e).f207108q);
        if (z17 && i17 == 0) {
            return 0;
        }
        return z17 ? i17 - 1 : i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(this, holder, y(i17), mo863xcdaf1228(i17), false, 8, null);
    }
}
