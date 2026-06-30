package jq4;

/* loaded from: classes5.dex */
public final class f0 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382677d;

    public f0(jq4.z0 z0Var) {
        this.f382677d = z0Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "onAppBackground: ");
        jq4.z0 z0Var = this.f382677d;
        android.view.View view = z0Var.f382769e;
        java.lang.Object systemService = (view == null || (context = view.getContext()) == null) ? null : context.getSystemService("power");
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (!(powerManager != null ? powerManager.isInteractive() : true)) {
            z0Var.l();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "onAppBackground: hideCard");
        if (z0Var.f382782r != 3) {
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new jq4.e0(z0Var, null), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
