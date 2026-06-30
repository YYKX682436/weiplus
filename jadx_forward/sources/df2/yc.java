package df2;

/* loaded from: classes3.dex */
public final class yc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ad f313389e;

    public yc(android.view.View view, df2.ad adVar) {
        this.f313388d = view;
        this.f313389e = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.ad adVar = this.f313389e;
        android.view.ViewGroup Z6 = adVar.Z6();
        android.view.View view = this.f313388d;
        if (view != null && Z6 != null) {
            adVar.getClass();
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.y;
            int i18 = b17.x;
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int dimension = i18 - (r4Var.Y1(context) ? ((int) Z6.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) * 2 : 0);
            android.view.View findViewById = Z6.findViewById(com.p314xaae8f345.mm.R.id.a4f);
            android.view.View findViewById2 = Z6.findViewById(com.p314xaae8f345.mm.R.id.f566339fl2);
            findViewById2.setOnClickListener(new df2.uc(adVar));
            int[] t17 = pm0.v.t(view);
            int width = t17[0] + view.getWidth();
            int i19 = i17 - t17[1];
            if (i19 < 0) {
                i19 = 0;
            }
            view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
            Z6.setPadding(Z6.getPaddingLeft(), Z6.getPaddingTop(), Z6.getPaddingRight(), i19);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i27 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i28 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                int i29 = dimension - width;
                if (i29 < 0) {
                    i29 = 0;
                }
                android.view.ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
                layoutParams2.setMargins(i27, i28, i29, marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            }
            float width2 = (dimension - width) + (((view.getWidth() / 6) / 2) - (Z6.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) / 2));
            android.view.ViewGroup.LayoutParams layoutParams6 = findViewById.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams7 = layoutParams6 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams6 : null;
            if (layoutParams7 != null) {
                layoutParams7.rightMargin = (int) width2;
                findViewById.setLayoutParams(layoutParams7);
            }
        }
        if2.d0 d0Var = adVar.f311240m;
        if (d0Var != null) {
            d0Var.d(0);
        }
    }
}
