package hq0;

/* loaded from: classes7.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hq0.b0 b0Var) {
        super(0);
        this.f364562d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f364562d.X0();
        hq0.b0 b0Var = this.f364562d;
        b0Var.S(b0Var.f364503x.f375168b);
        hq0.b0 b0Var2 = this.f364562d;
        b0Var2.B = (gq0.v) b0Var2.f364503x.f375171e;
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(this.f364562d.f364503x.f375167a)) {
            qq0.i iVar = (qq0.i) i95.n0.c(qq0.i.class);
            jc3.j0 j0Var = this.f364562d.f364528g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            java.lang.String instanceName = ((rc3.w0) j0Var).f475620e;
            hq0.b0 delegate = this.f364562d;
            qq0.m mVar = (qq0.m) iVar;
            mVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "setDelegate instanceName:".concat(instanceName));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f447434f;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(instanceName, delegate);
            }
        }
        hq0.b0 b0Var3 = this.f364562d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var3.f364504y, "startInitBizTimeoutIfNeeded cacheTime: " + ((java.lang.Object) s26.a.h(b0Var3.R)));
        p3325xe03a0797.p3326xc267989b.r2 r2Var = b0Var3.S;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        b0Var3.S = null;
        long j17 = b0Var3.R;
        if (s26.a.d(j17, 0L) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var3.f364504y, "startInitBizTimeout " + s26.a.e(j17));
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            b0Var3.S = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new hq0.a0(j17, b0Var3, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
