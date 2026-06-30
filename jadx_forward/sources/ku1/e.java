package ku1;

/* loaded from: classes15.dex */
public class e extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393605b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f393606c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f393607d;

    @Override // ku1.m
    public void c() {
        this.f393605b = b(com.p314xaae8f345.mm.R.id.f564299ng);
        this.f393606c = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.f564300nh);
        this.f393607d = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.bbj);
        this.f393606c.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        android.view.View view = this.f393605b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393605b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a;
        tt1.j jVar = b0Var.E;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b0Var.f176469e;
        android.view.View view = this.f393605b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(jVar.s0().F)) {
            this.f393606c.setVisibility(8);
        } else {
            this.f393606c.setVisibility(0);
            this.f393606c.setText(jVar.s0().F);
            if (jVar.i() || (jVar.B() && jVar.d())) {
                this.f393606c.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            } else if (jVar.B() && jVar.o()) {
                this.f393606c.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560311gy));
                this.f393605b.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else {
                this.f393606c.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            }
        }
        android.view.View findViewById = this.f393605b.findViewById(com.p314xaae8f345.mm.R.id.f565116bc0);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176470f.f()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393607d.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av6));
        this.f393607d.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        int dimensionPixelOffset = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        android.widget.Button button = (android.widget.Button) this.f393605b.findViewById(com.p314xaae8f345.mm.R.id.bbh);
        android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), dimensionPixelOffset);
        android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), dimensionPixelOffset);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
        stateListDrawable.addState(new int[0], l17);
        button.setBackgroundDrawable(stateListDrawable);
        button.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{lu1.a0.d(jVar.s0().f470088p), abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)}));
        button.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        android.view.View findViewById2 = this.f393605b.findViewById(com.p314xaae8f345.mm.R.id.f567457jk1);
        android.view.View findViewById3 = this.f393605b.findViewById(com.p314xaae8f345.mm.R.id.b_q);
        if (jVar.s0().U == 1) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
