package ku1;

/* loaded from: classes15.dex */
public class c0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393602b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393602b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f393602b == null) {
            this.f393602b = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.bb7)).inflate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).E;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176469e;
        r45.w50 w50Var = jVar.i0().f466731x;
        android.view.View view = this.f393602b;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bb8);
            textView.setText(w50Var.f470411d);
            textView.setTextColor(lu1.a0.d(jVar.s0().f470088p));
            android.widget.TextView textView2 = (android.widget.TextView) this.f393602b.findViewById(com.p314xaae8f345.mm.R.id.bb6);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f393602b.findViewById(com.p314xaae8f345.mm.R.id.bct);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (jVar.o()) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
                if (android.text.TextUtils.isEmpty(w50Var.f470413f)) {
                    textView2.setVisibility(8);
                    layoutParams.height = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561720qt);
                } else {
                    textView2.setText(w50Var.f470413f);
                    textView2.setVisibility(0);
                    layoutParams.height = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561719qs);
                    layoutParams2.bottomMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                    android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) textView2.getLayoutParams();
                    layoutParams3.topMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                    textView2.setLayoutParams(layoutParams3);
                    textView2.invalidate();
                }
                layoutParams2.height = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561721qu);
                textView.setLayoutParams(layoutParams2);
                textView.invalidate();
                int dimensionPixelSize = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561723qw);
                java.lang.String str = jVar.s0().f470088p;
                android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(abstractActivityC21394xb3d2c0cf, lu1.a0.d(str), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(abstractActivityC21394xb3d2c0cf, lu1.a0.d(str), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
                stateListDrawable.addState(new int[0], l17);
                textView.setBackgroundDrawable(stateListDrawable);
                textView.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0), lu1.a0.d(jVar.s0().f470088p)}));
                linearLayout.setBackgroundDrawable(null);
                textView.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
            } else {
                if (android.text.TextUtils.isEmpty(w50Var.f470413f)) {
                    textView2.setVisibility(8);
                    layoutParams.height = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561732r5);
                } else {
                    textView2.setText(w50Var.f470413f);
                    textView2.setVisibility(0);
                    layoutParams.height = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561731r4);
                }
                linearLayout.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.invalidate();
            this.f393602b.invalidate();
            if (jVar.o()) {
            }
        }
    }
}
