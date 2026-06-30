package hu0;

/* loaded from: classes5.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f366577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(hu0.m.f366575d);
    }

    public static void P6(hu0.o oVar, java.lang.String str, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.Window window;
        android.view.View decorView;
        if ((i17 & 1) != 0) {
            str = null;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LoadingUIC", "showError: " + str);
        oVar.O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = oVar.m158354x19263085();
        if (str == null) {
            str = oVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.o_b);
        }
        db5.t7.g(m158354x19263085, str);
        if (aVar == null || (window = oVar.m158354x19263085().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.postDelayed(new hu0.n(aVar), 2500L);
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LoadingUIC", "hideLoading");
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f366577d;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.LoadingUIC", "hideLoading: dismiss failed: " + e17.getMessage());
        }
        this.f366577d = null;
    }

    public final void Q6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LoadingUIC", "showLoading");
        O6();
        try {
            this.f366577d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, 0, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.LoadingUIC", "showLoading: failed to show MMProgressDialog: " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LoadingUIC", "onViewCreated");
    }
}
