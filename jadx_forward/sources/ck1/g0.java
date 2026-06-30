package ck1;

/* loaded from: classes4.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f123860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123861e;

    public g0(ck1.y0 y0Var, ck1.k0 k0Var) {
        this.f123860d = y0Var;
        this.f123861e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck1.y0 y0Var = this.f123860d;
        android.widget.Button button = ((ck1.v0) y0Var).f123924d;
        if (button != null) {
            button.setVisibility(0);
        }
        ck1.k0 k0Var = this.f123861e;
        int height = k0Var.f123871d.m78395x3622fee6().getDecorView().getHeight();
        android.view.View itemView = y0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int i17 = pm0.v.s(itemView)[1];
        int measuredHeight = y0Var.f3639x46306858.getMeasuredHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "fixManageAreaAtScreenBottom, windowHeight: " + height + ", manageAreaY: " + i17 + ", manageAreaHeight: " + measuredHeight);
        int i18 = height - (i17 + measuredHeight);
        if (i18 > 0) {
            y0Var.f3639x46306858.setPadding(0, i18, 0, 0);
        }
        k0Var.f123875h = true;
    }
}
