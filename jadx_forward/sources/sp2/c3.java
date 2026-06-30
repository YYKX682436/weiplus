package sp2;

/* loaded from: classes2.dex */
public final class c3 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492529a;

    public c3(sp2.d3 d3Var) {
        this.f492529a = d3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        sp2.d3 d3Var = this.f492529a;
        d3Var.getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (e17 == null || r26.n0.N(e17)) {
            return;
        }
        d3Var.f492549j = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d3Var.f492540a;
        if (!(abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            abstractActivityC21394xb3d2c0cf = null;
        }
        if (abstractActivityC21394xb3d2c0cf != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new sp2.s2(d3Var, abstractActivityC21394xb3d2c0cf, null), 3, null);
        }
    }
}
