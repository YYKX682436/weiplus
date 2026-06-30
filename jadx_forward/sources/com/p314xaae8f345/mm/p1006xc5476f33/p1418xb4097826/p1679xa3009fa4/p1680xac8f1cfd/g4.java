package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 f215996d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var) {
        this.f215996d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        android.view.View view3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var = this.f215996d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = q4Var.f217191d;
        android.widget.CheckBox checkBox = null;
        android.view.View findViewById = (y1Var == null || (view3 = y1Var.f293560f) == null) ? null : view3.findViewById(com.p314xaae8f345.mm.R.id.g4c);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = q4Var.f217191d;
        if (y1Var2 != null && (view2 = y1Var2.f293560f) != null) {
            checkBox = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.g4b);
        }
        if (checkBox != null && checkBox.isChecked()) {
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217189g);
            int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217189g);
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1.a(p17, k17);
            java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.U1.get(a17);
            if ((a17.length() == 0) || str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                cq.k kVar = (cq.k) c17;
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4.f217189g;
                p012xc85e97e9.p093xedfae76a.y m158358x197d1fc6 = q4Var.m158358x197d1fc6();
                if (m158358x197d1fc6 == null) {
                    m158358x197d1fc6 = q4Var.m158354x19263085();
                }
                cq.j1.j(kVar, str2, 1, p17, k17, m158358x197d1fc6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k4(q4Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m4(q4Var));
            } else {
                q4Var.Y6(str);
            }
            az2.f fVar = q4Var.f217192e;
            if (fVar != null) {
                fVar.b();
            }
            az2.f a18 = az2.c.a(az2.f.f97658d, q4Var.m80379x76847179(), q4Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), 500L, null, 8, null);
            q4Var.f217192e = a18;
            a18.a();
        } else {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(q4Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
            if (findViewById != null) {
                findViewById.startAnimation(loadAnimation);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
