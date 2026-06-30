package rb2;

/* loaded from: classes2.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475210d;

    public l0(in5.s0 s0Var) {
        this.f475210d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        android.view.ViewParent viewParent;
        android.view.View view;
        android.view.View view2;
        in5.s0 s0Var;
        int i17;
        int i18;
        android.widget.TextView textView2;
        int i19;
        int i27;
        in5.s0 s0Var2 = this.f475210d;
        android.view.View p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.dz_);
        android.view.View p18 = s0Var2.p(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView3 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.kbf);
        android.view.View p19 = s0Var2.p(com.p314xaae8f345.mm.R.id.ehq);
        android.widget.TextView textView4 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.hgh);
        android.widget.TextView textView5 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.f565385c85);
        android.view.View p27 = s0Var2.p(com.p314xaae8f345.mm.R.id.a_z);
        android.widget.TextView textView6 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.f564845aa0);
        android.widget.TextView textView7 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.uxf);
        android.view.View p28 = s0Var2.p(com.p314xaae8f345.mm.R.id.f568093lo4);
        android.view.View p29 = s0Var2.p(com.p314xaae8f345.mm.R.id.f564202kr);
        android.view.View p37 = s0Var2.p(com.p314xaae8f345.mm.R.id.ed9);
        android.view.View p38 = s0Var2.p(com.p314xaae8f345.mm.R.id.c7p);
        android.widget.TextView textView8 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.f567916l23);
        android.widget.TextView textView9 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.ufm);
        android.widget.TextView textView10 = (android.widget.TextView) s0Var2.p(com.p314xaae8f345.mm.R.id.jfu);
        android.view.View p39 = s0Var2.p(com.p314xaae8f345.mm.R.id.ulp);
        if (p27 != null) {
            viewParent = p27.getParent();
            textView = textView9;
        } else {
            textView = textView9;
            viewParent = null;
        }
        android.view.View view3 = (android.view.View) viewParent;
        if (p17.getWidth() > 0) {
            int f17 = i65.a.f(s0Var2.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            int f18 = i65.a.f(s0Var2.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
            view = p17;
            int width = p17.getWidth() - i65.a.f(s0Var2.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            int width2 = p18.getWidth();
            int width3 = (p19 == null || p19.getVisibility() != 0) ? 0 : p19.getWidth();
            int r17 = (p29 == null || p29.getVisibility() != 0 || p37 == null || p37.getVisibility() != 0) ? 0 : hc2.f1.r(textView6, 0) + i65.a.f(s0Var2.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) + p29.getPaddingLeft() + p29.getPaddingRight();
            if (view3 != null && view3.getVisibility() == 0 && p27.getVisibility() == 0) {
                i17 = p27.getWidth() + view3.getPaddingLeft() + view3.getPaddingRight();
                if (textView6 != null && textView6.getVisibility() == 0) {
                    i17 += hc2.f1.r(textView6, f17);
                }
            } else {
                i17 = 0;
            }
            int f19 = i65.a.f(s0Var2.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
            if (i17 < f19) {
                i17 = f19;
            }
            android.view.View view4 = (android.view.View) (p28 != null ? p28.getParent() : null);
            if (view4 == null || view4.getVisibility() != 0 || textView7 == null || textView7.getVisibility() != 0) {
                i18 = 0;
            } else {
                i18 = textView7.getWidth() + view4.getPaddingLeft() + view4.getPaddingRight();
                if (textView6 != null && textView7.getVisibility() == 0) {
                    i18 += hc2.f1.r(textView7, f17);
                }
            }
            int width4 = p38 != null ? p38.getWidth() : 0;
            if (p39 != null) {
                i27 = p39.getWidth();
                textView2 = textView5;
                i19 = f18;
            } else {
                textView2 = textView5;
                i19 = f18;
                i27 = 0;
            }
            int r18 = hc2.f1.r(textView2, i19);
            int r19 = hc2.f1.r(textView4, i19);
            int r27 = hc2.f1.r(textView8, i19);
            int r28 = hc2.f1.r(textView, i19);
            int r29 = hc2.f1.r(textView10, i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            int p47 = hc2.f1.p(textView3);
            view2 = view3;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("minMax ");
            android.content.Context context = s0Var2.f374654e;
            s0Var = s0Var2;
            float f27 = p47 * 2.5f;
            sb6.append(ym5.x.b(context, f27));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
            int i28 = width - ((((((((((((width2 + width3) + r27) + r28) + r29) + r18) + r19) + i17) + r17) + width4) + p47) + i18) + i27);
            int i29 = (int) f27;
            if (i28 < i29) {
                i28 = i29;
            }
            textView3.setMaxWidth(i28);
        } else {
            view = p17;
            view2 = view3;
            s0Var = s0Var2;
        }
        android.view.View view5 = view;
        com.p314xaae8f345.mm.ui.xj xjVar = new com.p314xaae8f345.mm.ui.xj(view5);
        view5.setTouchDelegate(xjVar);
        int b17 = i65.a.b(s0Var.f374654e, 8);
        if (view2 != null) {
            android.view.View view6 = view2;
            view6.post(new rb2.k0(view6, b17, xjVar));
        }
    }
}
