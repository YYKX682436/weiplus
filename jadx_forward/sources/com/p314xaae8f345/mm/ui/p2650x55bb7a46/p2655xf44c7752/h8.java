package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class h8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282524e;

    public h8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, android.view.View view) {
        this.f282524e = viewOnClickListenerC21748xb3d38e6b;
        this.f282523d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        this.f282523d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282524e;
        if (viewOnClickListenerC21748xb3d38e6b.isFinishing() || viewOnClickListenerC21748xb3d38e6b.isDestroyed() || viewOnClickListenerC21748xb3d38e6b.V1) {
            return;
        }
        int B = i65.a.B(viewOnClickListenerC21748xb3d38e6b);
        int k17 = i65.a.k(viewOnClickListenerC21748xb3d38e6b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "handleHorizontalUI width = %d, height = %d", java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(k17));
        if ((B <= k17 && viewOnClickListenerC21748xb3d38e6b.y8(viewOnClickListenerC21748xb3d38e6b)) || (fp.h.c(24) && viewOnClickListenerC21748xb3d38e6b.isInMultiWindowMode())) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.W6(viewOnClickListenerC21748xb3d38e6b);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = viewOnClickListenerC21748xb3d38e6b.f282138e3;
        if (q3Var != null) {
            q3Var.f282829e = false;
            android.util.SparseArray sparseArray = q3Var.f282825a;
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                sparseArray.keyAt(i18);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.valueAt(i18)).g();
            }
            return;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(viewOnClickListenerC21748xb3d38e6b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "%d handleHorizontalUI image gallery ui isNavigationBarTint %b navBarHeight %d", java.lang.Integer.valueOf(viewOnClickListenerC21748xb3d38e6b.hashCode()), java.lang.Boolean.valueOf(viewOnClickListenerC21748xb3d38e6b.f282189s), java.lang.Integer.valueOf(c17));
        android.view.View view = viewOnClickListenerC21748xb3d38e6b.W3;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, c17, 0);
            viewOnClickListenerC21748xb3d38e6b.W3.setLayoutParams(layoutParams);
        }
        int f17 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int f18 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        int f19 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int f27 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        int f28 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        viewOnClickListenerC21748xb3d38e6b.V7();
        int id6 = viewOnClickListenerC21748xb3d38e6b.O1.getId();
        int f29 = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int max = java.lang.Math.max(c17 - (f17 * 3), 0);
        int i19 = f17 * 2;
        i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        boolean H = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.H();
        if (H) {
            f29 = 0;
            i17 = 12;
        } else {
            i17 = 15;
        }
        viewOnClickListenerC21748xb3d38e6b.f282183q.setPadding(f28, i19, f28, i19);
        viewOnClickListenerC21748xb3d38e6b.f282139e4.setPadding(f28, f17, f28, f17);
        viewOnClickListenerC21748xb3d38e6b.B = f19;
        viewOnClickListenerC21748xb3d38e6b.C = max + f27;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.M.getLayoutParams();
        layoutParams2.removeRule(3);
        if (H) {
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.addRule(12);
        } else {
            layoutParams2.setMargins(0, f18, 0, f18);
            layoutParams2.addRule(15);
        }
        viewOnClickListenerC21748xb3d38e6b.M.setLayoutParams(layoutParams2);
        viewOnClickListenerC21748xb3d38e6b.V7();
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.O1.getLayoutParams();
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.removeRule(3);
        layoutParams3.addRule(2, com.p314xaae8f345.mm.R.id.d2y);
        viewOnClickListenerC21748xb3d38e6b.V7();
        viewOnClickListenerC21748xb3d38e6b.O1.setLayoutParams(layoutParams3);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.T.getLayoutParams();
        layoutParams4.removeRule(3);
        layoutParams4.setMargins(f19, f18, 0, f29);
        layoutParams4.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.T.setLayoutParams(layoutParams4);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.P.getLayoutParams();
        layoutParams5.removeRule(3);
        layoutParams5.setMargins(0, f18, 0, f29);
        layoutParams5.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.P.setLayoutParams(layoutParams5);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.X.getLayoutParams();
        if (H) {
            if (java.lang.Math.round(viewOnClickListenerC21748xb3d38e6b.X.getTextSize()) == 0) {
                viewOnClickListenerC21748xb3d38e6b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
            }
            layoutParams6.setMargins(0, 0, 0, 0);
            layoutParams6.removeRule(3);
            layoutParams6.addRule(12);
            viewOnClickListenerC21748xb3d38e6b.X.setPadding(0, 0, 0, 0);
        } else {
            layoutParams6.setMargins(0, i19, f27, 0);
        }
        viewOnClickListenerC21748xb3d38e6b.X.setLayoutParams(layoutParams6);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.Q.getLayoutParams();
        layoutParams7.removeRule(3);
        layoutParams7.setMargins(0, f18, 0, f29);
        layoutParams7.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.Q.setLayoutParams(layoutParams7);
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.S.getLayoutParams();
        layoutParams8.removeRule(3);
        layoutParams8.setMargins(0, f18, 0, f29);
        layoutParams8.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.S.setLayoutParams(layoutParams8);
        android.widget.RelativeLayout.LayoutParams layoutParams9 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.U.getLayoutParams();
        layoutParams9.removeRule(3);
        layoutParams9.setMargins(0, f18, 0, f29);
        layoutParams9.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.U.setLayoutParams(layoutParams9);
        viewOnClickListenerC21748xb3d38e6b.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.U1.getLayoutParams();
        layoutParams10.height = i65.a.h(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        layoutParams10.bottomMargin = 0;
        viewOnClickListenerC21748xb3d38e6b.U7();
        viewOnClickListenerC21748xb3d38e6b.U1.setLayoutParams(layoutParams10);
        viewOnClickListenerC21748xb3d38e6b.X7();
        android.widget.RelativeLayout.LayoutParams layoutParams11 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.f282143f4.getLayoutParams();
        layoutParams11.addRule(3, id6);
        layoutParams11.setMargins(0, f18, 0, f29);
        layoutParams11.removeRule(i17);
        viewOnClickListenerC21748xb3d38e6b.X7();
        viewOnClickListenerC21748xb3d38e6b.f282143f4.setLayoutParams(layoutParams11);
        viewOnClickListenerC21748xb3d38e6b.S7();
        android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.f282179p0.getLayoutParams();
        layoutParams12.removeRule(3);
        layoutParams12.setMargins(0, f18, f19, f29);
        layoutParams12.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.S7();
        viewOnClickListenerC21748xb3d38e6b.f282179p0.setLayoutParams(layoutParams12);
        viewOnClickListenerC21748xb3d38e6b.O7();
        android.widget.RelativeLayout.LayoutParams layoutParams13 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.f282162l1.f282991a.getLayoutParams();
        layoutParams13.removeRule(3);
        layoutParams13.setMargins(0, f18, f19, f29);
        layoutParams13.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.O7();
        viewOnClickListenerC21748xb3d38e6b.f282162l1.f282991a.setLayoutParams(layoutParams13);
        android.widget.RelativeLayout.LayoutParams layoutParams14 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.f282210y0.getLayoutParams();
        layoutParams14.removeRule(3);
        layoutParams14.setMargins(0, f18, f19, f29);
        layoutParams14.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.f282210y0.setLayoutParams(layoutParams14);
        viewOnClickListenerC21748xb3d38e6b.P7();
        android.widget.RelativeLayout.LayoutParams layoutParams15 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.A1.getLayoutParams();
        layoutParams15.removeRule(3);
        layoutParams15.setMargins(0, f18, f19, f29);
        layoutParams15.addRule(i17);
        viewOnClickListenerC21748xb3d38e6b.P7();
        viewOnClickListenerC21748xb3d38e6b.A1.setLayoutParams(layoutParams15);
        if (viewOnClickListenerC21748xb3d38e6b.f282215z1 == null) {
            viewOnClickListenerC21748xb3d38e6b.f282215z1 = viewOnClickListenerC21748xb3d38e6b.findViewById(com.p314xaae8f345.mm.R.id.tze);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams16 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.f282215z1.getLayoutParams();
        layoutParams16.removeRule(3);
        layoutParams16.setMargins(0, f18, f19, f29);
        layoutParams16.addRule(i17);
        layoutParams16.addRule(20);
        viewOnClickListenerC21748xb3d38e6b.T7();
        viewOnClickListenerC21748xb3d38e6b.f282215z1.setLayoutParams(layoutParams16);
        viewOnClickListenerC21748xb3d38e6b.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams17 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.R1.getLayoutParams();
        layoutParams17.height = i65.a.f(viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.R.C30860x5b28f31.aki);
        viewOnClickListenerC21748xb3d38e6b.U7();
        viewOnClickListenerC21748xb3d38e6b.R1.setLayoutParams(layoutParams17);
        viewOnClickListenerC21748xb3d38e6b.U7();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750 = viewOnClickListenerC21748xb3d38e6b.L1;
        if (c19737x80a67750 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) c19737x80a67750).m75803x4f05f8(false);
        }
        viewOnClickListenerC21748xb3d38e6b.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams18 = (android.widget.RelativeLayout.LayoutParams) viewOnClickListenerC21748xb3d38e6b.L1.getLayoutParams();
        if (H) {
            layoutParams18.addRule(2, id6);
            viewOnClickListenerC21748xb3d38e6b.U7();
            viewOnClickListenerC21748xb3d38e6b.L1.setPadding(0, 0, 0, 0);
        } else {
            layoutParams18.addRule(1, com.p314xaae8f345.mm.R.id.f569078oy5);
            layoutParams18.addRule(0, com.p314xaae8f345.mm.R.id.ozx);
            layoutParams18.setMargins(0, f18, 0, f18);
            layoutParams18.addRule(1, com.p314xaae8f345.mm.R.id.p1o);
            if (viewOnClickListenerC21748xb3d38e6b.Q.getVisibility() == 0) {
                layoutParams18.addRule(1, com.p314xaae8f345.mm.R.id.p1r);
            }
            if (viewOnClickListenerC21748xb3d38e6b.U.getVisibility() == 0) {
                layoutParams18.addRule(1, com.p314xaae8f345.mm.R.id.p1q);
            }
        }
        viewOnClickListenerC21748xb3d38e6b.U7();
        viewOnClickListenerC21748xb3d38e6b.L1.setLayoutParams(layoutParams18);
        if (viewOnClickListenerC21748xb3d38e6b.G) {
            viewOnClickListenerC21748xb3d38e6b.G = false;
        }
    }
}
