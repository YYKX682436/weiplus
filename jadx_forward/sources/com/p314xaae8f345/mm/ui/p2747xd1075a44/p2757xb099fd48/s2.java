package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes12.dex */
public class s2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2 f293501d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f293502e;

    /* renamed from: f, reason: collision with root package name */
    public int f293503f = -1;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 f293504g;

    public s2(java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 y2Var) {
        this.f293502e = list;
        this.f293504g = y2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f293502e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2 u2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejz, viewGroup, false));
        u2Var.f3639x46306858.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.s2$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2 v2Var;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2 s2Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2.this;
                s2Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2 u2Var2 = u2Var;
                arrayList.add(u2Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", s2Var, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(u2Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", s2Var, array2);
                int m8183xf806b362 = u2Var2.m8183xf806b362();
                if (m8183xf806b362 == -1 || (v2Var = s2Var.f293501d) == null) {
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    v2Var.a(m8183xf806b362, s2Var.f293502e.get(m8183xf806b362));
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = u2Var.f293536e;
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agh));
        return u2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2 u2Var, int i17) {
        u2Var.f293535d.setText(((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2) this.f293502e.get(i17)).f293479b);
        u2Var.f293536e.setRotation(i17 == this.f293503f ? 270.0f : 90.0f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 y2Var = this.f293504g;
        if (y2Var == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Border) {
            u2Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_5);
        } else if (y2Var == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Grey) {
            u2Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d5c);
        } else {
            u2Var.f3639x46306858.setBackground(null);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2 u2Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u2) k3Var;
        if (list.isEmpty()) {
            mo864xe5e2e48d(u2Var, i17);
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.Object obj = pair.first;
            if (obj == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t2.IsExpand) {
                boolean booleanValue = ((java.lang.Boolean) pair.second).booleanValue();
                if (booleanValue) {
                    this.f293503f = i17;
                } else if (this.f293503f == i17) {
                    this.f293503f = -1;
                }
                android.view.ViewPropertyAnimator animate = u2Var.f293536e.animate();
                animate.cancel();
                animate.rotation(booleanValue ? 270.0f : 90.0f);
                animate.setDuration(300L);
                animate.start();
            } else if (obj == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t2.UpdateTitle) {
                u2Var.f293535d.setText((java.lang.String) pair.second);
            } else {
                mo864xe5e2e48d(u2Var, i17);
            }
        }
    }
}
