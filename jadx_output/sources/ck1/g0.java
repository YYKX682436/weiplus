package ck1;

/* loaded from: classes4.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f42327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42328e;

    public g0(ck1.y0 y0Var, ck1.k0 k0Var) {
        this.f42327d = y0Var;
        this.f42328e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck1.y0 y0Var = this.f42327d;
        android.widget.Button button = ((ck1.v0) y0Var).f42391d;
        if (button != null) {
            button.setVisibility(0);
        }
        ck1.k0 k0Var = this.f42328e;
        int height = k0Var.f42338d.getWindow().getDecorView().getHeight();
        android.view.View itemView = y0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        int i17 = pm0.v.s(itemView)[1];
        int measuredHeight = y0Var.itemView.getMeasuredHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "fixManageAreaAtScreenBottom, windowHeight: " + height + ", manageAreaY: " + i17 + ", manageAreaHeight: " + measuredHeight);
        int i18 = height - (i17 + measuredHeight);
        if (i18 > 0) {
            y0Var.itemView.setPadding(0, i18, 0, 0);
        }
        k0Var.f42342h = true;
    }
}
