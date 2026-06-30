package yn1;

/* loaded from: classes9.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f545250d = r2Var;
        this.f545251e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.MigrationPlatformImpl", "[connectToDeviceAsync] coroutine cancelled");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545250d.f545343a;
        if (gVar != null) {
            gVar.C(this.f545251e, false);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }
}
