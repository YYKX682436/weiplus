package gt4;

/* loaded from: classes14.dex */
public final class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f356999d;

    public l0(gt4.s0 s0Var) {
        this.f356999d = s0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gt4.s0 s0Var = this.f356999d;
        android.widget.LinearLayout linearLayout = s0Var.f357075o;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerView");
            throw null;
        }
        int height = linearLayout.getHeight();
        android.widget.LinearLayout linearLayout2 = s0Var.f357080t;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("buttonLayout");
            throw null;
        }
        int height2 = linearLayout2.getHeight();
        int k17 = i65.a.k(s0Var.f357067d);
        int p17 = com.p314xaae8f345.mm.ui.bk.p(s0Var.f357067d);
        int b17 = i65.a.b(s0Var.f357067d, 56);
        int b18 = ((((k17 + p17) - b17) - height) - height2) - i65.a.b(s0Var.f357067d, 64);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout: ");
        sb6.append(k17);
        sb6.append('+');
        sb6.append(p17);
        sb6.append('-');
        sb6.append(b17);
        sb6.append('-');
        sb6.append(height);
        sb6.append('-');
        sb6.append(height2);
        sb6.append(" max:");
        sb6.append(b18);
        sb6.append(" now:");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s0Var.B;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dayListView");
            throw null;
        }
        sb6.append(c1163xf1deaba4.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc361 = s0Var.f357077q;
        if (c19147x541bc361 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
            throw null;
        }
        c19147x541bc361.m73925xb4b70d51(b18);
        gt4.a1 a1Var = s0Var.f357066J;
        if (a1Var != null) {
            float c17 = (((i65.a.c(s0Var.f357067d, b18) - 56) - 54) - 52) - ((a1Var.f356926n + 17) * ((((java.util.ArrayList) s0Var.E).size() - 2) - ((gt4.j1) kz5.n0.i0(s0Var.E)).f356990b));
            if (c17 > 0.0f) {
                a1Var.f356925m = (int) c17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", "onGlobalLayout last is " + c17);
        }
        android.view.View view = s0Var.f357068e;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }
}
