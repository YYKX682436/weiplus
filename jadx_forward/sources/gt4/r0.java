package gt4;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f357045d;

    public r0(gt4.s0 s0Var) {
        this.f357045d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update maxBottomSheetHeight to ");
        gt4.s0 s0Var = this.f357045d;
        android.view.View view = s0Var.f357068e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        sb6.append(view.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", sb6.toString());
        android.view.View view2 = s0Var.f357068e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        s0Var.M = view2.getHeight();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = s0Var.f357069f;
        if (c2690x46972046 != null) {
            c2690x46972046.C(s0Var.M);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("behavior");
            throw null;
        }
    }
}
