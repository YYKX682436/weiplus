package co5;

/* loaded from: classes11.dex */
public final class l0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co5.m0 f125395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f125396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f125397c;

    public l0(co5.m0 m0Var, long j17, android.content.Context context) {
        this.f125395a = m0Var;
        this.f125396b = j17;
        this.f125397c = context;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            c0Var.f391645d = true;
        }
        boolean z17 = c0Var.f391645d;
        co5.m0 m0Var = this.f125395a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "callback is " + m0Var.f125401a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r rVar = m0Var.f125401a;
            if (rVar != null) {
                rVar.f0(this.f125396b, true);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.r rVar2 = m0Var.f125401a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "requestAsync it microPhone");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new co5.k0(this.f125397c, rVar2, this.f125396b, c0Var, null), 3, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "after request microphone (isAuthorized=" + c0Var.f391645d + ')');
    }
}
