package ku1;

/* loaded from: classes15.dex */
public class c extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393597b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f393598c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f393599d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f393600e;

    /* renamed from: f, reason: collision with root package name */
    public hu1.g f393601f;

    @Override // ku1.m
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        this.f393600e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176469e;
        this.f393601f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176470f;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393597b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        if (this.f393597b == null) {
            android.view.View inflate = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.b7f)).inflate();
            this.f393597b = inflate;
            inflate.findViewById(com.p314xaae8f345.mm.R.id.b76).setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        this.f393599d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).E;
        hu1.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176470f;
        this.f393601f = gVar;
        boolean m17 = gVar.m();
        boolean z17 = ((hu1.a) this.f393601f).f366606f;
        if (!m17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
            android.view.View view = this.f393597b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f393597b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + m17 + " acceptViewEnabled:" + z17);
        android.widget.Button button = (android.widget.Button) this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.b76);
        android.view.View findViewById = this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.b7e);
        findViewById.setBackgroundDrawable(null);
        findViewById.setOnClickListener(null);
        int dimensionPixelSize = this.f393600e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561723qw);
        if (z17) {
            if (!android.text.TextUtils.isEmpty(this.f393599d.s0().D)) {
                button.setText(this.f393599d.s0().D);
            }
            if (this.f393599d.o()) {
                button.setTextColor(lu1.a0.d(this.f393599d.s0().f470088p));
                android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(this.f393600e, lu1.a0.d(this.f393599d.s0().f470088p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(this.f393600e, lu1.a0.d(this.f393599d.s0().f470088p), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
                stateListDrawable.addState(new int[0], l17);
                int[] iArr = {this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), lu1.a0.d(this.f393599d.s0().f470088p)};
                int[][] iArr2 = {new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]};
                button.setBackgroundDrawable(stateListDrawable);
                button.setTextColor(new android.content.res.ColorStateList(iArr2, iArr));
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f393597b.getLayoutParams();
                layoutParams.topMargin = this.f393600e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561703qb);
                this.f393597b.setLayoutParams(layoutParams);
                android.view.View findViewById2 = this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.d1o);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                wt1.k kVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).H;
                this.f393597b.setBackgroundColor(this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                android.widget.CheckBox checkBox = (android.widget.CheckBox) this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.b9z);
                kVar.b();
                if (kVar.b().f537978v) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
                    checkBox.setVisibility(0);
                    r45.g43 g43Var = this.f393599d.s0().P;
                    if (g43Var == null || android.text.TextUtils.isEmpty(g43Var.f456400d)) {
                        checkBox.setText(kVar.b().f461376d);
                    } else {
                        checkBox.setText(g43Var.f456400d);
                    }
                    checkBox.setChecked(kVar.b().f537979w);
                    checkBox.setOnClickListener(new ku1.b(this, kVar));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
                    checkBox.setVisibility(8);
                }
            } else if (this.f393599d.d() || this.f393599d.i() || this.f393599d.X()) {
                android.graphics.drawable.ShapeDrawable n18 = lu1.a0.n(this.f393600e, lu1.a0.d(this.f393599d.s0().f470088p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n19 = lu1.a0.n(this.f393600e, lu1.a0.e(this.f393599d.s0().f470088p, 175), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, n19);
                stateListDrawable2.addState(new int[0], n18);
                button.setBackgroundDrawable(stateListDrawable2);
                button.setTextColor(this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams2.width = -1;
                button.setLayoutParams(layoutParams2);
            } else {
                android.graphics.drawable.ShapeDrawable n27 = lu1.a0.n(this.f393600e, lu1.a0.d(this.f393599d.s0().f470088p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n28 = lu1.a0.n(this.f393600e, lu1.a0.e(this.f393599d.s0().f470088p, 175), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable3 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, n28);
                stateListDrawable3.addState(new int[0], n27);
                button.setBackgroundDrawable(stateListDrawable3);
                button.setTextColor(this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
            }
        } else {
            this.f393597b.setEnabled(false);
            findViewById.setEnabled(false);
            button.setEnabled(false);
            button.setText(this.f393599d.o() ? this.f393599d.s0().D : ((hu1.a) this.f393601f).s());
            if (this.f393599d.o()) {
                button.setTextColor(lu1.a0.e(this.f393599d.s0().f470088p, 125));
                button.setBackgroundDrawable(lu1.a0.l(this.f393600e, lu1.a0.e(this.f393599d.s0().f470088p, 125), dimensionPixelSize));
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f393597b.getLayoutParams();
                layoutParams3.topMargin = this.f393600e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561704qc);
                this.f393597b.setLayoutParams(layoutParams3);
                android.view.View findViewById3 = this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.d1o);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f393599d.d() || this.f393599d.i() || this.f393599d.X()) {
                button.setTextColor(this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f393600e;
                button.setBackgroundDrawable(lu1.a0.m(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560310gx)));
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams4.width = -1;
                button.setLayoutParams(layoutParams4);
            } else {
                button.setTextColor(this.f393600e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f393600e;
                button.setBackgroundDrawable(lu1.a0.m(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560310gx)));
            }
        }
        if (this.f393599d.d() || this.f393599d.i()) {
            return;
        }
        if (this.f393599d.s0().Q == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f393599d.s0().Q.f466907d)) {
            android.widget.TextView textView = this.f393598c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f393598c == null) {
            this.f393598c = (android.widget.TextView) this.f393597b.findViewById(com.p314xaae8f345.mm.R.id.b7c);
        }
        this.f393598c.setText(this.f393599d.s0().Q.f466907d);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f393599d.s0().Q.f466908e)) {
            this.f393598c.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
            this.f393598c.setTextColor(lu1.a0.d(this.f393599d.s0().f470088p));
        }
        this.f393598c.setVisibility(0);
    }
}
