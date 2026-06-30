package cw0;

/* loaded from: classes5.dex */
public final class f extends qu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304161a;

    public f(cw0.l0 l0Var) {
        this.f304161a = l0Var;
    }

    @Override // uu0.b
    public void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        cw0.l0 l0Var = this.f304161a;
        yy0.m7 m7Var = (yy0.m7) l0Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.e1(m7Var, null), 3, null);
        if (str == null) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            str = null;
        }
        if (str == null) {
            return;
        }
        l0Var.H7(i17, str, booleanValue);
        l0Var.R7();
        p3325xe03a0797.p3326xc267989b.l.d(l0Var.m158345xefc66565(), null, null, new cw0.e(l0Var, null), 3, null);
    }

    @Override // qu0.c
    public void d(uu0.k recordParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordParam, "recordParam");
        cw0.l0 l0Var = this.f304161a;
        yy0.m7 m7Var = (yy0.m7) l0Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.w1(m7Var, null), 3, null);
        l0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NarrationPanelUIC", "onAudioStartRecord");
        l0Var.R7();
    }
}
