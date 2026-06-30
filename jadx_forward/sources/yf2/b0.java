package yf2;

/* loaded from: classes3.dex */
public final class b0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.g0 f543193d;

    public b0(yf2.g0 g0Var) {
        this.f543193d = g0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.content.Intent intent;
        android.content.Intent intent2;
        r45.q12 q12Var = (r45.q12) obj;
        yf2.g0 g0Var = this.f543193d;
        if (g0Var.f543232o) {
            yf2.g0.a7(g0Var, null, q12Var, 1, null);
        } else {
            yf2.g0.a7(g0Var, (mm2.y6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) g0Var.m56788xbba4bfc0(mm2.g1.class)).f410611s).mo144003x754a37bb(), null, 2, null);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = g0Var.N6();
            if (((N6 == null || (intent2 = N6.getIntent()) == null) ? 0 : intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) == 4) {
                g0Var.Z6(q12Var, false);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = g0Var.N6();
                if (N62 != null && (intent = N62.getIntent()) != null) {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
                }
            }
            g0Var.f543232o = true;
        }
        return jz5.f0.f384359a;
    }
}
