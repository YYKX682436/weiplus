package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class j9 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 f200273e;

    public j9(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var) {
        this.f200272d = context;
        this.f200273e = x9Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f200273e.L.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18;
        jz5.f0 f0Var;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f9 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f9) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var = this.f200273e;
        java.lang.Object obj = x9Var.L.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.of1 of1Var = (r45.of1) obj;
        int m75939xb282bd08 = of1Var.m75939xb282bd08(2);
        android.view.View view = holder.f199867i;
        if (m75939xb282bd08 == x9Var.M) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i18 = 0;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h9(this.f200272d, x9Var));
            i19 = 8;
        } else {
            i18 = 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(null);
            holder.f199863e.setText(of1Var.m75945x2fec8307(0));
            java.lang.String g17 = zl2.r4.f555483a.g1(of1Var.m75939xb282bd08(2));
            if (!(g17.length() > 0)) {
                g17 = null;
            }
            android.widget.TextView textView = holder.f199864f;
            if (g17 != null) {
                textView.setVisibility(0);
                textView.setText(g17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                i19 = 8;
                textView.setVisibility(8);
            } else {
                i19 = 8;
            }
            int m75939xb282bd082 = of1Var.m75939xb282bd08(2);
            mn2.g1 g1Var = mn2.g1.f411508a;
            android.widget.ImageView imageView = holder.f199866h;
            if (m75939xb282bd082 == 3) {
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(of1Var.m75945x2fec8307(1), null, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-avatatView>(...)");
                a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(of1Var.m75945x2fec8307(1), null, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-avatatView>(...)");
                l17.c(nVar2, imageView, g1Var.h(mn2.f1.f411494o));
            }
            android.view.View view2 = holder.f199865g;
            int i27 = of1Var.m75939xb282bd08(2) == x9Var.R ? 0 : i19;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f199862d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i9(x9Var, of1Var, this));
        }
        android.view.View view3 = holder.f199868m;
        int i28 = i18;
        int i29 = i17 == mo1894x7e414b06() - 1 ? i19 : i28;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i29));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(i28)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f200272d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqz, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f9(inflate);
    }
}
