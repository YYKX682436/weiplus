package ku1;

/* loaded from: classes15.dex */
public class a extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393595b;

    @Override // ku1.m
    public void c() {
        this.f393595b = b(com.p314xaae8f345.mm.R.id.b7d);
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393595b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        hu1.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176470f;
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).E;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176469e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).U;
        wt1.k kVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).H;
        if (!gVar.i()) {
            if (!gVar.j()) {
                d(8);
                return;
            }
            if (android.text.TextUtils.isEmpty(jVar.s0().V)) {
                android.view.View view = this.f393595b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = this.f393595b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b17 = b(com.p314xaae8f345.mm.R.id.f563873bu);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) b(com.p314xaae8f345.mm.R.id.f563879c1)).setText(jVar.s0().V);
            return;
        }
        android.view.View view3 = this.f393595b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View b18 = b(com.p314xaae8f345.mm.R.id.f563873bu);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(b18, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(b18, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) b(com.p314xaae8f345.mm.R.id.f563872bt);
        android.widget.TextView textView = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.f563874bv);
        android.widget.TextView textView2 = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.f563879c1);
        if (p0Var.f176639d != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String f27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f176639d, true).f2();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, f27, textSize));
        }
        if (p0Var.f176636a == 23) {
            if (!android.text.TextUtils.isEmpty(jVar.s0().V)) {
                textView2.setText(jVar.s0().V);
            } else if (android.text.TextUtils.isEmpty(jVar.s0().f470101y)) {
                textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aul, kVar.d()));
            } else {
                textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aul, jVar.s0().f470101y));
            }
        } else if (jVar.Y() != null && !android.text.TextUtils.isEmpty(jVar.Y().f459113d)) {
            textView2.setText(jVar.Y().f459113d);
        } else if (android.text.TextUtils.isEmpty(jVar.s0().f470101y)) {
            if (jVar.m0()) {
                textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atg, kVar.d()));
            } else {
                textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asm, kVar.d()));
            }
        } else if (jVar.m0()) {
            textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atg, jVar.s0().f470101y));
        } else {
            textView2.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asm, jVar.s0().f470101y));
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, p0Var.f176639d, 0.15f);
        imageView.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
    }
}
