package zk3;

/* loaded from: classes5.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555047d;

    public v(zk3.g0 g0Var) {
        this.f555047d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f555047d.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.jv9);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.f232123J;
        marginLayoutParams.topMargin = 0;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.P;
        marginLayoutParams.width = i17;
        marginLayoutParams.height = (int) (i17 * com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Z);
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
