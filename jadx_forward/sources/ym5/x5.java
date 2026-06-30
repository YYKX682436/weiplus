package ym5;

/* loaded from: classes10.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f545106d;

    public x5(ym5.y5 y5Var) {
        this.f545106d = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.y5 y5Var = this.f545106d;
        boolean z17 = y5Var.mo177319xb073c692().getVisibility() == 0 && (y5Var.mo177319xb073c692().getAnimation() == null || (y5Var.mo177319xb073c692().getAnimation().hasStarted() && y5Var.mo177319xb073c692().getAnimation().hasEnded()));
        if (z17) {
            android.content.Context context = y5Var.getContext();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y5Var.f545114x, "requestEditTextShowVKB: enable=" + z17);
    }
}
